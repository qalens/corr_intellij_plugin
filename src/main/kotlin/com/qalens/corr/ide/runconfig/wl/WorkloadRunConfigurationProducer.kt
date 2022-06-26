package com.qalens.corr.ide.runconfig.wl

import com.intellij.execution.actions.ConfigurationContext
import com.intellij.execution.actions.RunConfigurationProducer
import com.intellij.openapi.actionSystem.CommonDataKeys
import com.intellij.openapi.util.Ref
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.impl.source.tree.LeafPsiElement
import java.lang.Exception

object WorkloadRunConfigurationProducer:RunConfigurationProducer<WorkloadRunConfiguration>(WorkloadRunConfigurationType) {
    override fun setupConfigurationFromContext(
        configuration: WorkloadRunConfiguration,
        context: ConfigurationContext,
        sourceElement: Ref<PsiElement>
    ): Boolean {

        val selectedFiles = CommonDataKeys.VIRTUAL_FILE_ARRAY.getData(context.dataContext)
        if (selectedFiles == null || selectedFiles.size > 1) {
            return false
        }
//        val module: Module = GaugeUtil.moduleForPsiElement(context.psiLocation) ?: return false
        val vf = context.psiLocation?.containingFile?.virtualFile;
        if (context.psiLocation == null   ||  vf == null ||  ! (vf.extension.equals("workload") || vf.extension.equals("workload"))
        ) {
            return false
        }
        try {
                val text = (sourceElement.get() as LeafPsiElement).text;
                configuration.name = "Workload "+toName(text)
                configuration.workloadName = toName(text)
            return true
        } catch (ex: Exception) {
            ex.printStackTrace()
        }
        return true

    }
    fun toName(raw:String):String{
        if (raw.startsWith("`").and(raw.endsWith("`"))){
            return raw.substring(1,raw.length-1)
        } else {
            return raw
        }
    }

    override fun isConfigurationFromContext(
        configuration: WorkloadRunConfiguration,
        context: ConfigurationContext
    ): Boolean {
        if (configuration.type !is WorkloadRunConfigurationType) return false
        val location = context.location
        if (location == null || location.virtualFile == null || context.psiLocation == null) return false
        val WorkloadToExecute: String = configuration.workloadName
        if(context.psiLocation!=null){
            val WorkloadFromPsi:String  = getWorkloadIdentifier(context, context.psiLocation!!.containingFile)
            return WorkloadToExecute.equals(WorkloadFromPsi)
        }
        return false;

//        val containingFile = context.location?.virtualFile
//        if (containingFile?.extension != "Workload") {
//            return false
//        }
//        if (containingFile?.name != configuration.name){
//            return false
//        }
//        val foundconf = context.configurationsFromContext?.find {
//            var ret = false;
//            if (it.configuration is WorkloadRunConfiguration) {
//                if ((it.configuration as WorkloadRunConfiguration).workloadName.equals(configuration.workloadName)) {
//                    ret = true
//                } else {
//                    ret = false
//                }
//            }
//            return@find ret
//        }
//        if (foundconf == null){
//            return false
//        } else {
//            return true;
//        }
//        val WorkloadToExecute = configuration.workloadName
//        val location = context.location
//        if (location == null || location.virtualFile == null || context.psiLocation == null) return false
//        val containsConfig = context.configurationsFromContext?.map {  if (it.configuration is WorkloadRunConfiguration){
//             return (it.configuration as WorkloadRunConfiguration).workloadName.equals(WorkloadToExecute)
//            }
//            return false;
//        }?.contains(true);
//        return containsConfig?:false;
//    }
//        return true
    }
    private fun getWorkloadIdentifier(context: ConfigurationContext, file: PsiFile): String {
        val selectedElement = context.psiLocation ?: return ""
        try {
            return toName((selectedElement as LeafPsiElement).text)
        } catch (ex:Exception) {
            return ""
        }
    }

}