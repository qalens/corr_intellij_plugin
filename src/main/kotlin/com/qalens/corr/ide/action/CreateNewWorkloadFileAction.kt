package com.qalens.corr.ide.action

import com.intellij.ide.actions.CreateFileFromTemplateAction
import com.intellij.ide.actions.CreateFileFromTemplateDialog
import com.intellij.openapi.project.Project
import com.intellij.psi.PsiDirectory
import com.qalens.corr.ide.JrnIcons
import com.qalens.corr.ide.file.JrnFileTemplateGroup
import com.qalens.corr.ide.file.WlFileTemplateGroup

object CreateNewWorkloadFileAction : CreateFileFromTemplateAction(WlFileTemplateGroup.WORKLOAD_FILE,"Create New .workload",JrnIcons.JOURNEY) {
    override fun buildDialog(project: Project, directory: PsiDirectory, builder: CreateFileFromTemplateDialog.Builder) {
        builder.setTitle("Workload File")
            .addKind("Workload",JrnIcons.JOURNEY, WlFileTemplateGroup.WORKLOAD_FILE)
    }

    override fun getActionName(directory: PsiDirectory?, newName: String, templateName: String?): String {
        return "Create " + newName;
    }


}