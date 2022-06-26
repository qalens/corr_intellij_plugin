package com.qalens.corr.lang.core.jrn

import com.intellij.lang.Language

object JrnLanguage:Language("Journey","text/journey"){
    override fun isCaseSensitive() = true
    override fun getDisplayName() = "Journey"
}