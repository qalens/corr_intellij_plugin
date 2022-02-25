package com.qalens.corr.ide.autocomplete.providers

import com.intellij.codeInsight.completion.CompletionParameters
import com.intellij.codeInsight.completion.CompletionResultSet
import com.intellij.codeInsight.lookup.LookupElementBuilder
import com.intellij.patterns.ElementPattern
import com.intellij.patterns.PlatformPatterns.or
import com.intellij.patterns.PlatformPatterns.not
import com.intellij.patterns.PlatformPatterns.psiElement
import com.intellij.psi.PsiElement
import com.intellij.util.ProcessingContext
import com.qalens.corr.lang.core.psi.JrnElementTypes

object StepCompletionProvider: CompletionProviderBase() {
    override val elementPattern: ElementPattern<out PsiElement>
        get() = psiElement()
            .afterLeaf(not(psiElement().withText(".")))
            .withParent(or(psiElement(JrnElementTypes.BLOCK),psiElement(JrnElementTypes.CALCULATION_STEPS)))

    override fun addCompletions(
        parameters: CompletionParameters,
        context: ProcessingContext,
        result: CompletionResultSet
    ) {
        completions.forEach({
            result.addElement(LookupElementBuilder.create(it))
        })
    }
    val request_with_body = "request {\n" +
            "        url:\"\",\n" +
            "        body:object \"\"\n" +
            "    }"
    val request_without_body = "request {\n" +
            "        url:\"\"\n" +
            "    }"
    val completions = listOf(
        "let a = \"Hello\"",
        "listen on 8088 with {}",
        "print text `Hello`",
        "wait 10",
        "get " + request_without_body,
        "delete " + request_without_body,
        "put " + request_with_body,
        "post " + request_with_body,
        "patch " + request_with_body,

    )

}