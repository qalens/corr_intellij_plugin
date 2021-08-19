package com.qalens.corr.lang.core.lexer

import com.intellij.lexer.FlexAdapter
import com.intellij.lexer.LayeredLexer
import com.qalens.corr.lang.core.psi.JrnElementTypes

class TextTemplateHighlighterLexer:LayeredLexer(TextTemplateLayer()){
    init {
        registerLayer(ScriptletHighlighterLexer(),JrnElementTypes.SCRIPLET_START,JrnElementTypes.SCRIPLET_END);
    }
}
class TextTemplateLayer:FlexAdapter(JourneyLexer()) {
}