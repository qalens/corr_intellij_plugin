package com.qalens.corr.ide

import com.intellij.codeInsight.completion.CompletionParameters
import com.intellij.codeInsight.completion.CompletionProvider
import com.intellij.codeInsight.completion.CompletionResultSet
import com.intellij.codeInsight.lookup.LookupElementBuilder
import com.intellij.patterns.ElementPattern
import com.intellij.patterns.PlatformPatterns
import com.intellij.patterns.PlatformPatterns.psiElement
import com.intellij.psi.PsiElement
import com.intellij.util.ProcessingContext

object JrnCompletionProvider: CompletionProvider<CompletionParameters>() {
    override fun addCompletions(
        parameters: CompletionParameters,
        context: ProcessingContext,
        result: CompletionResultSet
    ) {
        val completion = "listen on 8080 with {\n\n}"
        result.addElement(LookupElementBuilder.create(completion));
    }
//    val elementPattern: ElementPattern<PsiElement>
//        get() = PlatformPatterns.psiElement().withParent(psiElement<RsReferenceElement>())
}