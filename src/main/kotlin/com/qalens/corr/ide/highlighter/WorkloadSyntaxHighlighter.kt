package com.qalens.corr.ide.highlighter

import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.HighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IElementType
import com.qalens.corr.lang.core.jrn.psi.JrnElementTypes
import com.qalens.corr.lang.core.wl.lexer.WlSyntaxHighLighterLexer
import com.qalens.corr.lang.core.wl.psi.WlElementTypes

object WorkloadSyntaxHighlighter:SyntaxHighlighterBase() {
    val COMMA = createTextAttributesKey("COMMA",DefaultLanguageHighlighterColors.COMMA)
    val CONSTANT = createTextAttributesKey("CONSTANT",DefaultLanguageHighlighterColors.CONSTANT)
    val BAD_CHARACTER = createTextAttributesKey("SIMPLE_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER);
    val LINE_COMMENT = createTextAttributesKey("LINE_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT)
    val BLOCK_COMMENT = createTextAttributesKey("BLOCK_COMMENT", DefaultLanguageHighlighterColors.BLOCK_COMMENT)
    val STRING = createTextAttributesKey("STRING",DefaultLanguageHighlighterColors.STRING)
    val BRACES = createTextAttributesKey("BARCES",DefaultLanguageHighlighterColors.BRACES)
    val BRACKETS = createTextAttributesKey("BRACKETS",DefaultLanguageHighlighterColors.BRACKETS)
    val Braces = arrayOf(BRACES)
    val Brackets = arrayOf(BRACKETS)
    val Comma = arrayOf(COMMA)
    val Constant = arrayOf(CONSTANT)
    val badCharacter = arrayOf(BAD_CHARACTER)
    val lineComment = arrayOf(LINE_COMMENT)
    val blockComment = arrayOf(BLOCK_COMMENT)
    val String = arrayOf(STRING)
    override fun getTokenHighlights(tokenType: IElementType): Array<TextAttributesKey> {
        if(
            tokenType.equals(WlElementTypes.JOURNEY)
            || tokenType.equals(WlElementTypes.SCENARIOS)
            || tokenType.equals(WlElementTypes.STARTUP)
            || tokenType.equals(WlElementTypes.STAGES)
            || tokenType.equals(WlElementTypes.EXECUTOR)
        )
            return arrayOf(createTextAttributesKey("Keywords",DefaultLanguageHighlighterColors.KEYWORD));
        else if (tokenType.equals(WlElementTypes.COMMA))
            return Comma
        else if(
            tokenType.equals(WlElementTypes.POSITIVEINTEGERVALUE)
        ) {
            return Constant;
        } else if (tokenType.equals(WlElementTypes.STRING_LITERAL)
            || tokenType.equals(WlElementTypes.NAME)
        ){
            return String;
        }else if(tokenType.equals(WlElementTypes.LBRACE) || tokenType.equals(
                WlElementTypes.RBRACE))
            return Braces;
        else if(tokenType.equals(WlElementTypes.LBRACK) || tokenType.equals(
                WlElementTypes.RBRACK))
            return Brackets
         else if (tokenType.equals(TokenType.BAD_CHARACTER)) {
            return badCharacter;
        } else if(tokenType.equals(WlElementTypes.LINE_COMMENT)){
            return lineComment
        } else if(tokenType.equals(WlElementTypes.BLOCK_COMMENT)){
            return blockComment
        }
        else return arrayOf<TextAttributesKey>();
    }

    override fun getHighlightingLexer(): Lexer {
        return WlSyntaxHighLighterLexer()
    }
}