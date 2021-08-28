package com.qalens.corr.ide.autocomplete

import com.intellij.codeInsight.completion.*
import com.intellij.patterns.ElementPattern
import com.intellij.patterns.PlatformPatterns
import com.intellij.patterns.PlatformPatterns.*
import com.intellij.psi.PsiElement
import com.qalens.corr.ide.autocomplete.providers.*
import com.qalens.corr.lang.core.no_variable_scope_functions
import com.qalens.corr.lang.core.psi.JrnElementTypes
import com.qalens.corr.lang.core.psi.JrnFile
import com.qalens.corr.lang.core.variable_scope_functions

class JourneyCompletionContributor() : CompletionContributor() {
    fun <T:CompletionProviderBase> extend(provider:T){
        extend(CompletionType.BASIC,provider.elementPattern,provider)
    }
    fun black_list(leaf:ElementPattern<out PsiElement>) = and(
        not(
            or(
                psiElement().inside(
                    or(
                        psiElement(JrnElementTypes.EXTRACTABLE_OBJECT),
                        psiElement(JrnElementTypes.EXTRACTABLE_FORM),
                        psiElement(JrnElementTypes.EXTRACTABLE_HEADERS)
                    )
                ),
                psiElement().withParent(
                    or(
                        psiElement(JrnElementTypes.CALCULATION_STEPS),
                        psiElement(JrnElementTypes.BLOCK),
                        psiElement(JrnElementTypes.STUB_DEFINITION),
                        psiElement(JrnElementTypes.REQUEST_TEMPLATE_PART),
                        psiElement(JrnFile::class.java)
                    )
                ),
                psiElement().withAncestor(2,
                    or(
                        psiElement(JrnElementTypes.REQUEST_TEMPLATE_PART)
                    )
                )
            )
        ),
        leaf
    )
    init {
        extend(StepCompletionProvider)
        extend(StubDefinitionProvider)
        extend(RequestMatcherProvider)
        extend(provider(
            psiElement().withParent(
                psiElement().withTreeParent(
                    psiElement(JrnElementTypes.STUB_DEFINITION)).afterSiblingSkipping(
                        psiElement().whitespace(),
                        psiElement(JrnElementTypes.REQUEST_EXTRACTOR)
                            .withLastChildSkipping(
                                psiElement().whitespace(),
                                or(psiElement(JrnElementTypes.HEADERS_STARTING_REST_DATA),psiElement(JrnElementTypes.BODY_STARTING_REST_DATA)))
                )),
            listOf(
                "{ respond with body \"Hello\" }",
                "{ respond with status 404 and body \"Hello\" }"
            )
        ))
        extend(provider(
            or(psiElement()
                .afterLeaf(".")
                .withAncestor(2, or(
                    psiElement(JrnElementTypes.BLOCK),
                    psiElement(JrnElementTypes.CALCULATION_STEPS
                    )
                )),
                psiElement()
                    .afterLeaf(".")
                    .withParent(psiElement(JrnFile::class.java))
            )
            ,
            listOf(
                "push(item)",
                "for",
                "for(item)=>",
                "for(item,index)=>"
            )
        ))

        extend(provider(
            psiElement().withParent(
                psiElement().withTreeParent(
                    psiElement(JrnElementTypes.STUB_DEFINITION)).afterSiblingSkipping(
                    psiElement().whitespace(),
                    psiElement(JrnElementTypes.REQUEST_EXTRACTOR)
                        .withLastChildSkipping(
                            psiElement().whitespace(),
                            psiElement(JrnElementTypes.HEADERS_STARTING_REST_DATA).withLastChildSkipping(
                                psiElement().whitespace(),
                                psiElement(JrnElementTypes.HEADERS_DECLARATION)
                            ))
                )),
            listOf("and body object { \"fields1\":field1 }","and body form { \"fields1\":field1 }")
        ))

        extend(provider(
            psiElement().withParent(
                psiElement().withTreeParent(
                    psiElement(JrnElementTypes.STUB_DEFINITION)).afterSiblingSkipping(
                    psiElement().whitespace(),
                    psiElement(JrnElementTypes.REQUEST_EXTRACTOR)
                        .withLastChildSkipping(
                            psiElement().whitespace(),
                            psiElement(JrnElementTypes.BODY_STARTING_REST_DATA).withLastChildSkipping(
                                psiElement().whitespace(),
                                psiElement(JrnElementTypes.BODY_DECLARATION)
                            ))
                )),
            listOf("and headers { \"header1\":header1 }")
        ))
        extend(provider(
            psiElement().inside(psiElement(JrnElementTypes.ASSIGNMENT_STEP)).afterLeaf("="),
            no_variable_scope_functions()
        ))
        extend(provider(
            black_list(psiElement().afterLeaf(".")),
            variable_scope_functions()
        ))
        extend(provider(black_list(psiElement().afterLeaf("(",",","+","-","%","/","*","==","!=","<%",":","object","body","on")),
            no_variable_scope_functions()
        ))

        extend(AllProvider)

    }
}