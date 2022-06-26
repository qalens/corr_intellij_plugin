package com.qalens.corr.ide.autocomplete.providers

import com.intellij.codeInsight.completion.CompletionParameters
import com.intellij.codeInsight.completion.CompletionResultSet
import com.intellij.codeInsight.lookup.LookupElementBuilder
import com.intellij.patterns.ElementPattern
import com.intellij.patterns.PlatformPatterns.psiElement
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiWhiteSpace
import com.intellij.util.ProcessingContext
import com.qalens.corr.lang.core.jrn.psi.JrnElementTypes
import com.qalens.corr.lang.core.jrn.psi.JrnRequestExtractor

object RequestMatcherProvider: CompletionProviderBase() {
    override val elementPattern: ElementPattern<out PsiElement>
        get() = psiElement().withParent(psiElement().withParent(psiElement(JrnElementTypes.STUB_DEFINITION)).afterSiblingSkipping(
            psiElement(PsiWhiteSpace::class.java), psiElement(JrnElementTypes.REQUEST_MATCHER)))

    override fun addCompletions(
        parameters: CompletionParameters,
        context: ProcessingContext,
        result: CompletionResultSet
    ) {
            result.addElement(LookupElementBuilder.create("{ respond with body \"Hello\" }"))
            result.addElement(LookupElementBuilder.create("{ respond with status 404 and body \"Hello\" }"))
            result.addElement(LookupElementBuilder.create("matching request body object {\"filed1\":field1} "))
            result.addElement(LookupElementBuilder.create("matching request headers {\"header1\":header1} "))
    }
}