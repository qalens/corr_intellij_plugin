package com.qalens.corr.lang.core.jrn.lexer

import com.intellij.lexer.LayeredLexer
import com.qalens.corr.lang.core.jrn.psi.JrnElementTypes

class JrnSyntaxHighLighterLexer() : LayeredLexer(TopLayer()) {
    init {
        registerLayer(TextHighlighterLexer(),JrnElementTypes.TEXT)
    }
}