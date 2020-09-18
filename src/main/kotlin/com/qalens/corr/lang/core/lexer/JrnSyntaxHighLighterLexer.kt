package com.qalens.corr.lang.core.lexer

import com.intellij.lexer.LayeredLexer
import com.qalens.corr.lang.core.psi.JrnElementTypes

class JrnSyntaxHighLighterLexer() : LayeredLexer(TopLayer()) {
    init {
        registerLayer(TextHighlighterLexer(),JrnElementTypes.TEXT)
    }
}