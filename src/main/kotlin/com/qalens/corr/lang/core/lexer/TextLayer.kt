package com.qalens.corr.lang.core.lexer

import com.intellij.lexer.FlexAdapter
import com.intellij.lexer.LayeredLexer
import com.qalens.corr.lang.core.lexer.JourneyLexer
import com.qalens.corr.lang.core.psi.JrnElementTypes

class TextHighlighterLexer:LayeredLexer(TextLayer()){
    init {
        registerLayer(TextTemplateHighlighterLexer(),JrnElementTypes.BACKTICK)
    }
}
class TextLayer:FlexAdapter(JourneyLexer()) {
}