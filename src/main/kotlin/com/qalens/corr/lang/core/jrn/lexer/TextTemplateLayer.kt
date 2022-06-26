package com.qalens.corr.lang.core.jrn.lexer

import com.intellij.lexer.FlexAdapter
import com.intellij.lexer.LayeredLexer
import com.qalens.corr.lang.core.jrn.lexer.JourneyLexer
import com.qalens.corr.lang.core.jrn.psi.JrnElementTypes

class TextTemplateHighlighterLexer:LayeredLexer(TextTemplateLayer()){
    init {
        registerLayer(ScriptletHighlighterLexer(),JrnElementTypes.SCRIPLET_START,JrnElementTypes.SCRIPLET_END);
        registerLayer(ScriptletHighlighterLexer(),JrnElementTypes.SCRIPLET_ALT_START,JrnElementTypes.SCRIPLET_ALT_END);
    }
}
class TextTemplateLayer:FlexAdapter(JourneyLexer()) {
}