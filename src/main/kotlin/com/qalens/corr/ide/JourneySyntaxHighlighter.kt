package com.qalens.corr.ide

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
    val MARKUP_TAG = createTextAttributesKey("MARKUP_TAG",DefaultLanguageHighlighterColors.MARKUP_TAG)
    val IDENTIFIER = createTextAttributesKey("IDENTIFIER",DefaultLanguageHighlighterColors.IDENTIFIER)
    val TYPE = createTextAttributesKey("TYPE",DefaultLanguageHighlighterColors.CLASS_NAME)
    val BAD_CHARACTER = createTextAttributesKey("SIMPLE_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER);

    val Keywords = arrayOf(
        TEXT_TEMPLATE_MARKER,
        JSON_TEMPLATE_MARKER,
        EJSON_TEMPLATE_MARKER,
        TIMES,
        FOR,
        IN
    )
    val Braces = arrayOf(BRACES)
    val Brackets = arrayOf(BRACKETS)
    val Comma = arrayOf(COMMA)
    val Semicolon = arrayOf(SEMICOLON)
    val Constant = arrayOf(CONSTANT)
    val String = arrayOf(STRING)
    val MarkupTag = arrayOf(MARKUP_TAG)
    val Identifier = arrayOf(IDENTIFIER)
    val Type = arrayOf(TYPE)
    val badCharacter = arrayOf(BAD_CHARACTER)
    override fun getTokenHighlights(tokenType: IElementType): Array<TextAttributesKey> {
        if(
            tokenType.equals(JrnElementTypes.PRINT)
            || tokenType.equals(JrnElementTypes.TEXT)
            || tokenType.equals(JrnElementTypes.CONCAT)
            || tokenType.equals(JrnElementTypes.MUL)
            || tokenType.equals(JrnElementTypes.ADD)
            || tokenType.equals(JrnElementTypes.UUID)
            || tokenType.equals(JrnElementTypes.RANDOM)
            || tokenType.equals(JrnElementTypes.ENCODE)
            || tokenType.equals(JrnElementTypes.FAKE)
            || tokenType.equals(JrnElementTypes.SUB)
            || tokenType.equals(JrnElementTypes.DIV)
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

        )
            return Keywords;
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
        )
            return MarkupTag
        else if(tokenType.equals(JrnElementTypes.IDENTIFIER) || tokenType.equals(
                JrnElementTypes.JOURNEY_NAME)){
            return Identifier;
        } else if(tokenType.equals(JrnElementTypes.TYPE)){
            return Type;
        } else if (tokenType.equals(TokenType.BAD_CHARACTER)) {
            return badCharacter;
        }
        else return arrayOf<TextAttributesKey>();
    }

    override fun getHighlightingLexer(): Lexer {
        return JrnSyntaxHighLighterLexer()
    }
}