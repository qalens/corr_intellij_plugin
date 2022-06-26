package com.qalens.corr.ide.runconfig.wl

import com.intellij.execution.lineMarker.ExecutorAction
import com.intellij.execution.lineMarker.RunLineMarkerContributor
import com.intellij.icons.AllIcons
import com.intellij.psi.PsiElement
import com.intellij.psi.impl.source.tree.LeafPsiElement
import com.intellij.psi.tree.IElementType
import com.qalens.corr.lang.core.wl.psi.WlElementTypes
import java.util.*

class WorkloadRunLineMarkerProvider : RunLineMarkerContributor(){
    override fun getInfo(psiElement: PsiElement): Info? {
        val types: List<IElementType> = Arrays.asList(WlElementTypes.NAME)
            if (psiElement is LeafPsiElement && types.contains((psiElement).elementType)) {
                return Info(AllIcons.RunConfigurations.TestState.Run, ExecutorAction.getActions(0), { "Run Element" })
            }
            else
                return null


    }
}