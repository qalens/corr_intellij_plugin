package com.qalens.corr.ide

import com.intellij.execution.lineMarker.ExecutorAction
import com.intellij.execution.lineMarker.RunLineMarkerContributor
import com.intellij.icons.AllIcons
import com.intellij.psi.PsiElement
import com.intellij.psi.impl.source.tree.LeafPsiElement
import com.intellij.psi.tree.IElementType
import com.intellij.util.Function
import com.qalens.corr.lang.core.psi.JrnElementType
import com.qalens.corr.lang.core.psi.JrnElementTypes
import com.qalens.corr.lang.core.psi.JrnTokenType
import java.util.*

class JourneyRunLineMarkerProvider : RunLineMarkerContributor(){
    override fun getInfo(psiElement: PsiElement): Info? {
        val types: List<IElementType> = Arrays.asList(JrnElementTypes.NAME)
            if (psiElement is LeafPsiElement && types.contains((psiElement).elementType)) {
                return Info(AllIcons.RunConfigurations.TestState.Run, ExecutorAction.getActions(0), { "Run Element" })
            }
            else
                return null


    }
}