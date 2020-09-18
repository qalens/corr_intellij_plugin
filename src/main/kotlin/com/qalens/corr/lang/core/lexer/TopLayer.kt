package com.qalens.corr.lang.core.lexer

import com.intellij.lexer.FlexAdapter
import com.qalens.corr.lang.core.lexer.JourneyLexer

class TopLayer:FlexAdapter(JourneyLexer()) {
}