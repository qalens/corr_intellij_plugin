package com.qalens.corr.ide

import com.intellij.codeInsight.completion.*
import com.intellij.codeInsight.lookup.LookupElementBuilder
import com.intellij.patterns.PlatformPatterns
import com.intellij.util.ProcessingContext
import com.qalens.corr.lang.JrnLanguage

class JourneyCompletionContributor() : CompletionContributor() {
    init {
        extend(CompletionType.BASIC,

            PlatformPatterns.psiElement().withLanguage(JrnLanguage),
            object: CompletionProvider<CompletionParameters>(){
                override fun addCompletions(
                    parameters: CompletionParameters,
                    context: ProcessingContext,
                    result: CompletionResultSet
                ) {
                    if(parameters.position.context.toString().startsWith("PsiErrorElement:<statement> or '}' expected")){
                        result.addElement(LookupElementBuilder.create("get(url:@text\"\");"));
                        result.addElement(LookupElementBuilder.create("post(url:@text\"\",body:@json{});"));
                        result.addElement(LookupElementBuilder.create("put(url:@text\"\",body:@json{});"));
                        result.addElement(LookupElementBuilder.create("patch(url:@text\"\",body:@json{});"));
                        result.addElement(LookupElementBuilder.create("delete(url:@text\"\",body:@json{});"));
                        result.addElement(LookupElementBuilder.create("for(object:Object in objects) {};"));
                        result.addElement(LookupElementBuilder.create("times(1,i,object:Object in objects){};"));
                        result.addElement(LookupElementBuilder.create("print(text:@text\"Hello\");"));
                    }

                }

            }
        )
    }
}