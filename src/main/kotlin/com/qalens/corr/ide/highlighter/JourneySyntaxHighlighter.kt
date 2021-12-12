package com.qalens.corr.ide.highlighter

import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.HighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IElementType
import com.qalens.corr.lang.core.lexer.JrnSyntaxHighLighterLexer
import com.qalens.corr.lang.core.psi.JrnElementTypes

object JourneySyntaxHighlighter:SyntaxHighlighterBase() {
    val TEXT_TEMPLATE_MARKER = createTextAttributesKey("TEXT_TEMPLATE_MARKER",DefaultLanguageHighlighterColors.KEYWORD)
    val JSON_TEMPLATE_MARKER = createTextAttributesKey("JSON_TEMPLATE_MARKER",DefaultLanguageHighlighterColors.KEYWORD)
    val EJSON_TEMPLATE_MARKER = createTextAttributesKey("EJSON_TEMPLATE_MARKER",DefaultLanguageHighlighterColors.KEYWORD)
    val TIMES = createTextAttributesKey("TIMES",DefaultLanguageHighlighterColors.KEYWORD)
    val FOR = createTextAttributesKey("FOR",DefaultLanguageHighlighterColors.KEYWORD)
    val IN = createTextAttributesKey("IN",DefaultLanguageHighlighterColors.KEYWORD)
    val BRACES = createTextAttributesKey("BARCES",DefaultLanguageHighlighterColors.BRACES)
    val BRACKETS = createTextAttributesKey("BRACKETS",DefaultLanguageHighlighterColors.BRACKETS)
    val COMMA = createTextAttributesKey("COMMA",DefaultLanguageHighlighterColors.COMMA)
    val SEMICOLON = createTextAttributesKey("SEMICOLON",DefaultLanguageHighlighterColors.SEMICOLON)
    val CONSTANT = createTextAttributesKey("CONSTANT",DefaultLanguageHighlighterColors.CONSTANT)
    val STRING = createTextAttributesKey("STRING",DefaultLanguageHighlighterColors.STRING)
    val IDENTIFIER = createTextAttributesKey("IDENTIFIER",DefaultLanguageHighlighterColors.IDENTIFIER)
    val TYPE = createTextAttributesKey("TYPE",DefaultLanguageHighlighterColors.CLASS_NAME)
    val BAD_CHARACTER = createTextAttributesKey("SIMPLE_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER);
    val FUNCTION_CALL = createTextAttributesKey("FUNCTION_CALL", DefaultLanguageHighlighterColors.HIGHLIGHTED_REFERENCE);
    val SCRIPTLET_CHARS = createTextAttributesKey("SCRIPLET", DefaultLanguageHighlighterColors.MARKUP_ENTITY);
    val LINE_COMMENT = createTextAttributesKey("LINE_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT)
    val BLOCK_COMMENT = createTextAttributesKey("BLOCK_COMMENT", DefaultLanguageHighlighterColors.BLOCK_COMMENT)


    val Keywords = arrayOf(
        TEXT_TEMPLATE_MARKER,
        JSON_TEMPLATE_MARKER,
        EJSON_TEMPLATE_MARKER,
        TIMES,
        FOR,
        IN
    )
    val FunctionCall = arrayOf(
        FUNCTION_CALL
    )
    val Braces = arrayOf(BRACES)
    val Brackets = arrayOf(BRACKETS)
    val Comma = arrayOf(COMMA)
    val Semicolon = arrayOf(SEMICOLON)
    val Constant = arrayOf(CONSTANT)
    val String = arrayOf(STRING)
    val MarkupTag = arrayOf(SCRIPTLET_CHARS)
    val Identifier = arrayOf(IDENTIFIER)
    val Type = arrayOf(TYPE)
    val badCharacter = arrayOf(BAD_CHARACTER)
    val lineComment = arrayOf(LINE_COMMENT)
    val blockComment = arrayOf(BLOCK_COMMENT)
    override fun getTokenHighlights(tokenType: IElementType): Array<TextAttributesKey> {
        if(
            tokenType.equals(JrnElementTypes.PRINT)
            || tokenType.equals(JrnElementTypes.TEXT)
            || tokenType.equals(JrnElementTypes.FOR)
            || tokenType.equals(JrnElementTypes.OBJECT_TEMPLATE)
            || tokenType.equals(JrnElementTypes.LET)
            || tokenType.equals(JrnElementTypes.GET)
            || tokenType.equals(JrnElementTypes.PUT)
            || tokenType.equals(JrnElementTypes.POST)
            || tokenType.equals(JrnElementTypes.PATCH)
            || tokenType.equals(JrnElementTypes.DELETE)
            || tokenType.equals(JrnElementTypes.AND)
            || tokenType.equals(JrnElementTypes.MATCHING)
            || tokenType.equals(JrnElementTypes.HEADERS)
            || tokenType.equals(JrnElementTypes.URL)
            || tokenType.equals(JrnElementTypes.BODY)
            || tokenType.equals(JrnElementTypes.REQUEST)
            || tokenType.equals(JrnElementTypes.RESPOND)
            || tokenType.equals(JrnElementTypes.ON)
            || tokenType.equals(JrnElementTypes.TO)
            || tokenType.equals(JrnElementTypes.WITH)
            || tokenType.equals(JrnElementTypes.ASYNC)
            || tokenType.equals(JrnElementTypes.SYNC)
            || tokenType.equals(JrnElementTypes.LOAD)
            || tokenType.equals(JrnElementTypes.CALL)
            || tokenType.equals(JrnElementTypes.PUSH)
            || tokenType.equals(JrnElementTypes.LISTEN)
            || tokenType.equals(JrnElementTypes.FROM)
            || tokenType.equals(JrnElementTypes.SANDBOX)
            || tokenType.equals(JrnElementTypes.STATUS)
            || tokenType.equals(JrnElementTypes.IF)
            || tokenType.equals(JrnElementTypes.ELSE)
            || tokenType.equals(JrnElementTypes.FORM)

        )
            return Keywords;
        else if (
                tokenType.equals(JrnElementTypes.CONCAT)
                || tokenType.equals(JrnElementTypes.MUL)
                || tokenType.equals(JrnElementTypes.ADD)
                || tokenType.equals(JrnElementTypes.UUID)
                || tokenType.equals(JrnElementTypes.RANDOM)
                || tokenType.equals(JrnElementTypes.ENCODE)
                || tokenType.equals(JrnElementTypes.FAKE)
                || tokenType.equals(JrnElementTypes.SUB)
                || tokenType.equals(JrnElementTypes.DIV)
                || tokenType.equals(JrnElementTypes.RANDOMELEMENT)
                || tokenType.equals(JrnElementTypes.UNIQUERANDOMELEMENTS)
                || tokenType.equals(JrnElementTypes.ARRAY)
                || tokenType.equals(JrnElementTypes.CONTAINS)
                || tokenType.equals(JrnElementTypes.TIMESTAMP)
                || tokenType.equals(JrnElementTypes.LEFT)
                || tokenType.equals(JrnElementTypes.RIGHT)
                || tokenType.equals(JrnElementTypes.LPAD)
                || tokenType.equals(JrnElementTypes.RPAD)
                || tokenType.equals(JrnElementTypes.MID)
                )
            return FunctionCall;
        else if(tokenType.equals(JrnElementTypes.LBRACE) || tokenType.equals(
                JrnElementTypes.RBRACE))
            return Braces;
        else if(tokenType.equals(JrnElementTypes.LBRACK) || tokenType.equals(
                JrnElementTypes.RBRACK))
            return Brackets
        else if (tokenType.equals(JrnElementTypes.COMMA))
            return Comma
        else if (tokenType.equals(JrnElementTypes.SEMICOLON))
            return Semicolon;
        else if(
            tokenType.equals(JrnElementTypes.BOOLEANVALUE)
            || tokenType.equals(JrnElementTypes.POSITIVEINTEGERVALUE)
            || tokenType.equals(JrnElementTypes.INETEGERVALUE)
            || tokenType.equals(JrnElementTypes.NULLVALUE)
            || tokenType.equals(JrnElementTypes.DOUBLEVALUE)
        ) {
            return Constant;
        }
        else if (tokenType.equals(JrnElementTypes.STRING_LITERAL)
            || tokenType.equals(JrnElementTypes.NAME)
            || tokenType.equals(JrnElementTypes.TEXT_LITERAL)
        ){
            return String;
        }
        else if(tokenType.equals(JrnElementTypes.SCRIPLET_START)
            || tokenType.equals(JrnElementTypes.SCRIPLET_END)
            || tokenType.equals(JrnElementTypes.SCRIPLET_ALT_START)
            || tokenType.equals(JrnElementTypes.SCRIPLET_ALT_END)
        )
            return MarkupTag
        else if(tokenType.equals(JrnElementTypes.IDENTIFIER) || tokenType.equals(
                JrnElementTypes.JOURNEY_NAME)){
            return Identifier;
        } else if(tokenType.equals(JrnElementTypes.TYPE)){
            return Type;
        } else if (tokenType.equals(TokenType.BAD_CHARACTER)) {
            return badCharacter;
        } else if(tokenType.equals(JrnElementTypes.LINE_COMMENT)){
            return lineComment
        } else if(tokenType.equals(JrnElementTypes.BLOCK_COMMENT)){
            return blockComment
        }
        else return arrayOf<TextAttributesKey>();
    }

    override fun getHighlightingLexer(): Lexer {
        return JrnSyntaxHighLighterLexer()
    }
}