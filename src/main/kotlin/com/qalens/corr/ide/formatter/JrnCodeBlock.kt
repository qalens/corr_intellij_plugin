package com.qalens.corr.ide.formatter

import com.intellij.formatting.*
import com.intellij.lang.ASTNode
import com.intellij.psi.TokenType
import com.intellij.psi.formatter.common.AbstractBlock

class JrnCodeBlock(node: ASTNode, wrap: Wrap, alignment: Alignment,private val spacingBuilder: SpacingBuilder) : AbstractBlock(node, wrap, alignment) {
    override fun getSpacing(child1: Block?, child2: Block): Spacing? {
        return spacingBuilder.getSpacing(this,child1,child2)
    }

    override fun isLeaf(): Boolean {
        return myNode.firstChildNode == null
    }

    override fun buildChildren(): MutableList<Block> {
        val lst= mutableListOf<Block>()
        var child = myNode.firstChildNode;
        while (child!=null) {
            if (child.elementType != TokenType.WHITE_SPACE) {
                lst.add(
                    JrnCodeBlock(
                        child,
                        Wrap.createWrap(WrapType.NONE, false),
                        Alignment.createAlignment(),
                        spacingBuilder
                    )
                )
            }
            child=myNode.treeNext
        }
        return lst;
    }
}