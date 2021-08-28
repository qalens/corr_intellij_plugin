package com.qalens.corr.ide.autocomplete.providers

import com.intellij.codeInsight.completion.CompletionParameters
import com.intellij.codeInsight.completion.CompletionResultSet
import com.intellij.codeInsight.lookup.LookupElementBuilder
import com.intellij.patterns.ElementPattern
import com.intellij.patterns.PlatformPatterns.psiElement
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiWhiteSpace
import com.intellij.util.ProcessingContext
import com.qalens.corr.lang.core.psi.JrnElementTypes

object AllProvider: CompletionProviderBase() {
    override val elementPattern: ElementPattern<out PsiElement>
        get() = psiElement()

    override fun addCompletions(
        parameters: CompletionParameters,
        context: ProcessingContext,
        result: CompletionResultSet
    ) {
        println("Hello")
    }

}