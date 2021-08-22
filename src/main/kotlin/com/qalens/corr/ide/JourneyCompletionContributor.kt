package com.qalens.corr.ide

import com.intellij.codeInsight.completion.*
import com.intellij.codeInsight.lookup.LookupElementBuilder
import com.intellij.patterns.PlatformPatterns
import com.intellij.patterns.PlatformPatterns.psiElement
import com.intellij.psi.PsiErrorElement
import com.intellij.psi.PsiFile
import com.intellij.util.ProcessingContext
import com.qalens.corr.lang.JrnLanguage
import com.qalens.corr.lang.core.psi.*

class JourneyCompletionContributor() : CompletionContributor() {
    init {
//                extend(CompletionType.BASIC,
//                   JrnCompletionProvider.elementPattern,
//                    JrnCompletionProvider
//        )

//        extend(CompletionType.BASIC,
//            PlatformPatterns.psiElement().withParent(JrnFile::class.java)
//            ,
//            object: CompletionProvider<CompletionParameters>(){
//                override fun addCompletions(
//                    parameters: CompletionParameters,
//                    context: ProcessingContext,
//                    result: CompletionResultSet
//                ) {
//                    val fname=parameters.originalFile.name;
//                    val suggest = fname.substring(0,fname.length-8);
//                    val completion = "`${suggest}`(){\n\n}"
//                    result.addElement(LookupElementBuilder.create(completion));
//                }
//
//            }
//        )
//        extend(CompletionType.BASIC,
//            PlatformPatterns.psiElement().withParent(psiElement(JrnElementTypes.ROOT_FN))
//            ,
//            object: CompletionProvider<CompletionParameters>(){
//                override fun addCompletions(
//                    parameters: CompletionParameters,
//                    context: ProcessingContext,
//                    result: CompletionResultSet
//                ) {
//                    val completion = "listen on 8080 with {\n\n}"
//                    result.addElement(LookupElementBuilder.create(completion));
//                }
//
//            }
//        )
    }
}