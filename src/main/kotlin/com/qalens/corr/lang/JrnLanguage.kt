package com.qalens.corr.lang

import com.intellij.lang.Language

object JrnLanguage:Language("Journey","text/journey"){
    override fun isCaseSensitive() = true
    override fun getDisplayName() = "Journey"
}