package com.qalens.corr.lang.core.jrn

import com.intellij.openapi.fileTypes.LanguageFileType
import com.qalens.corr.ide.JrnIcons

object JrnFileType:LanguageFileType(JrnLanguage) {
    override fun getIcon() = JrnIcons.JOURNEY

    override fun getName() = "Journey"

    override fun getDefaultExtension() = "journey"

    override fun getDescription() = "Journey File"
}