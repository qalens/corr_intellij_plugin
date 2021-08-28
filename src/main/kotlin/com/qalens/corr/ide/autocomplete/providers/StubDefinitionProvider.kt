package com.qalens.corr.ide.autocomplete.providers

import com.intellij.codeInsight.completion.CompletionParameters
import com.intellij.codeInsight.completion.CompletionResultSet
import com.intellij.codeInsight.lookup.LookupElementBuilder
import com.intellij.patterns.ElementPattern
import com.intellij.patterns.PlatformPatterns.or
import com.intellij.patterns.PlatformPatterns.psiElement
import com.intellij.psi.PsiElement
import com.intellij.util.ProcessingContext
import com.qalens.corr.lang.core.psi.JrnElementTypes

object StubDefinitionProvider: CompletionProviderBase() {
    override val elementPattern: ElementPattern<out PsiElement>
        get() = or(psiElement().withParent(psiElement().withTreeParent(
            psiElement(JrnElementTypes.STUB_DEFINITION_BLOCK)
        )),
            psiElement().withAncestor(2, psiElement(JrnElementTypes.STUB_DEFINITION)).withParent(
                psiElement().afterSiblingSkipping(
                    psiElement().whitespaceCommentEmptyOrError(),
                    psiElement(JrnElementTypes.RESPONSE_GENERATOR)
                )
            )
        )

    override fun addCompletions(
        parameters: CompletionParameters,
        context: ProcessingContext,
        result: CompletionResultSet
    ) {
        completions.forEach {
            result.addElement(LookupElementBuilder.create("on $it with url text `/` "))
        }
    }
    val completions = listOf("get","put","post","patch","delete")
}