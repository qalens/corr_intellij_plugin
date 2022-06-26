package com.qalens.corr.lang.core.wl

import com.intellij.lang.Language

object WlLanguage:Language("Workload","text/workload"){
    override fun isCaseSensitive() = true
    override fun getDisplayName() = "Workload"
}