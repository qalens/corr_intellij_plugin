package com.qalens.corr.ide.autocomplete.providers

import com.intellij.codeInsight.completion.CompletionParameters
import com.intellij.codeInsight.completion.CompletionProvider
import com.intellij.patterns.ElementPattern
import com.intellij.psi.PsiElement

abstract class CompletionProviderBase : CompletionProvider<CompletionParameters>() {
    abstract val elementPattern: ElementPattern<out PsiElement>
}