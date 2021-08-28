package com.qalens.corr.ide.formatter

import com.intellij.formatting.*
import com.intellij.psi.codeStyle.CodeStyleSettings
import com.qalens.corr.lang.JrnLanguage
import com.qalens.corr.lang.core.psi.JrnElementTypes


class JrnFormattingModelBuilder : FormattingModelBuilder {
    override fun createModel(formattingContext: FormattingContext): FormattingModel {
        val codeStyleSettings = formattingContext.codeStyleSettings
        return FormattingModelProvider
            .createFormattingModelForPsiFile(
                formattingContext.containingFile,
                JrnCodeBlock(
                    formattingContext.node,
                    Wrap.createWrap(WrapType.NONE, false),
                    Alignment.createAlignment(),
                    createSpaceBuilder(codeStyleSettings)
                ),
                codeStyleSettings
            )
    }

    companion object {
        private fun createSpaceBuilder(settings: CodeStyleSettings): SpacingBuilder {
            return SpacingBuilder(settings, JrnLanguage)
                .around(JrnElementTypes.ASSIGN)
                .spaceIf(settings.getCommonSettings(JrnLanguage.id).SPACE_AROUND_ASSIGNMENT_OPERATORS)
                .before(JrnElementTypes.ASSIGNABLE)
                .none()
        }
    }
}