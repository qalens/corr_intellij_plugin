package com.qalens.corr.ide.autocomplete.providers

import com.intellij.codeInsight.completion.CompletionParameters
import com.intellij.codeInsight.completion.CompletionResultSet
import com.intellij.codeInsight.lookup.LookupElementBuilder
import com.intellij.patterns.ElementPattern
import com.intellij.psi.PsiElement
import com.intellij.util.ProcessingContext

fun provider(pattern: ElementPattern<out PsiElement>,completions:List<String>):CompletionProviderBase {
    return object : CompletionProviderBase() {
        override val elementPattern: ElementPattern<out PsiElement>
            get() = pattern


        override fun addCompletions(
            parameters: CompletionParameters,
            context: ProcessingContext,
            result: CompletionResultSet
        ) {
            completions.forEach {
                result.addElement(LookupElementBuilder.create(it))
            }
        }
    }
}