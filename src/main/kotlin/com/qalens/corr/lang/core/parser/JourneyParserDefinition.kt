package com.qalens.corr.lang.core.parser

import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.lang.PsiParser
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet
import com.qalens.corr.lang.JrnLanguage
import com.qalens.corr.lang.core.lexer.TopLayer
import com.qalens.corr.lang.core.psi.JrnFile
import com.qalens.corr.lang.core.psi.JrnElementTypes

class JourneyParserDefinition :ParserDefinition{
    override fun createParser(project: Project?): PsiParser {
        return JourneyParser();
    }

    override fun createFile(viewProvider: FileViewProvider): PsiFile {
        return JrnFile(viewProvider);
    }

    override fun getStringLiteralElements(): TokenSet {
        return TokenSet.EMPTY;
    }

    override fun getFileNodeType(): IFileElementType {
        return IFileElementType(JrnLanguage);
    }

    override fun createLexer(project: Project?): Lexer {
        return TopLayer();
    }

    override fun createElement(node: ASTNode?): PsiElement {
        return JrnElementTypes.Factory.createElement(node);
    }

    override fun getCommentTokens(): TokenSet {
        return TokenSet.EMPTY;
    }
}