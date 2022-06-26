package com.qalens.corr.ide.runconfig.jrn

import com.intellij.execution.lineMarker.ExecutorAction
import com.intellij.execution.lineMarker.RunLineMarkerContributor
import com.intellij.icons.AllIcons
import com.intellij.psi.PsiElement
import com.intellij.psi.impl.source.tree.LeafPsiElement
import com.intellij.psi.tree.IElementType
import com.qalens.corr.lang.core.jrn.psi.JrnElementTypes
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