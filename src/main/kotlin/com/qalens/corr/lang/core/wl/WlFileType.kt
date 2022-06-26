package com.qalens.corr.lang.core.wl

import com.intellij.openapi.fileTypes.LanguageFileType
import com.qalens.corr.ide.JrnIcons
import com.qalens.corr.lang.core.jrn.JrnLanguage

object WlFileType:LanguageFileType(WlLanguage) {
    override fun getIcon() = JrnIcons.JOURNEY

    override fun getName() = "Workload"

    override fun getDefaultExtension() = "workload"

    override fun getDescription() = "Workload File"
}