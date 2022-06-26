package com.qalens.corr.lang.core.jrn.lexer

import com.intellij.lexer.FlexAdapter
import com.intellij.lexer.LayeredLexer
import com.qalens.corr.lang.core.jrn.lexer.JourneyLexer

class ScriptletHighlighterLexer:LayeredLexer(ScriptletLayer()){
    init {
    }
}
class ScriptletLayer:FlexAdapter(JourneyLexer()) {
}