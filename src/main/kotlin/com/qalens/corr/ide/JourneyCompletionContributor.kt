package com.qalens.corr.ide

import com.intellij.codeInsight.completion.*
import com.intellij.codeInsight.lookup.LookupElementBuilder
import com.intellij.patterns.PlatformPatterns
import com.intellij.patterns.PlatformPatterns.psiElement
import com.intellij.psi.PsiErrorElement
import com.intellij.util.ProcessingContext
import com.qalens.corr.lang.JrnLanguage
import com.qalens.corr.lang.core.psi.JrnElementTypes
import com.qalens.corr.lang.core.psi.JrnRootFn
import com.qalens.corr.lang.core.psi.JrnStatement
import com.qalens.corr.lang.core.psi.JrnTokenType

class JourneyCompletionContributor() : CompletionContributor() {
    init {
        extend(CompletionType.BASIC,
            PlatformPatterns.psiElement().withLanguage(JrnLanguage)
            ,
            object: CompletionProvider<CompletionParameters>(){
                override fun addCompletions(
                    parameters: CompletionParameters,
                    context: ProcessingContext,
                    result: CompletionResultSet
                ) {
//                    //println(parameters.position.parent);
//                    if(parameters.position.context.toString().startsWith("PsiErrorElement:fillable expected"))
//                        result.addElement(LookupElementBuilder.create("fillable"))
//                    if(parameters.position.context.toString().startsWith("PsiErrorElement:text expected"))
//                        result.addElement(LookupElementBuilder.create("text"))
//
//                    if(parameters.position.context.toString().startsWith("PsiErrorElement:object expected"))
//                        result.addElement(LookupElementBuilder.create("object"))
                    //if (parameters.position.context.toString().startsWith("PsiErrorElement")){

                    //}

                    //result.addElement(LookupElementBuilder.create("print fillable text `Hello`;"))
//                    if (parameters.position.context is JrnRootFn){
//                        println("Expecting Statement");
//                    }
//                    if(parameters.position.context.toString().startsWith("PsiErrorElement:<statement> or '}' expected")){
//                        result.addElement(LookupElementBuilder.create("get(url:@text\"\");"));
//                        result.addElement(LookupElementBuilder.create("post(url:@text\"\",body:@json{});"));
//                        result.addElement(LookupElementBuilder.create("put(url:@text\"\",body:@json{});"));
//                        result.addElement(LookupElementBuilder.create("patch(url:@text\"\",body:@json{});"));
//                        result.addElement(LookupElementBuilder.create("delete(url:@text\"\",body:@json{});"));
//                        result.addElement(LookupElementBuilder.create("for(object:Object in objects) {};"));
//                        result.addElement(LookupElementBuilder.create("times(1,i,object:Object in objects){};"));
//                        result.addElement(LookupElementBuilder.create("print(text:@text\"Hello\");"));
//                    } else if(parameters.position.context.toString().startsWith("JrnVariableExpressionImpl(VARIABLE_EXPRESSION)")){
//                        result.addElement(LookupElementBuilder.create("concat(a,b,c)"));
//                        result.addElement(LookupElementBuilder.create("add(a,b,c)"));
//                        result.addElement(LookupElementBuilder.create("mul(a,b,c)"));
//                        result.addElement(LookupElementBuilder.create("uuid()"));
//                        result.addElement(LookupElementBuilder.create("random(a,b)"));
//                        result.addElement(LookupElementBuilder.create("round(a,b)"));
//                    }

                }

            }
        )
    }
}