package com.qalens.corr.lang.core.lexer

import com.intellij.lexer.FlexAdapter
import com.intellij.lexer.LayeredLexer

class ScriptletHighlighterLexer:LayeredLexer(ScriptletLayer()){
    init {
    }
}
class ScriptletLayer:FlexAdapter(JourneyLexer()) {
}