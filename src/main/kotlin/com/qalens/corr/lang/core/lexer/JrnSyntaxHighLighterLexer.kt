package com.qalens.corr.lang.core.lexer

import com.intellij.lexer.LayeredLexer
import com.intellij.lexer.Lexer
import com.qalens.corr.lang.core.psi.JrnElementTypes

class JrnSyntaxHighLighterLexer() : LayeredLexer(JrnLexer()) {
    init {
        registerLayer(JrnLexer(),JrnElementTypes.TEXTSTART)
        registerLayer(JrnLexer(),JrnElementTypes.JSONSTART)
        registerLayer(JrnLexer(),JrnElementTypes.EJSONSTART)

    }
}