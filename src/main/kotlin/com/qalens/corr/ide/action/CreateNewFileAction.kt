package com.qalens.corr.ide.action

import com.intellij.ide.actions.CreateFileFromTemplateAction
import com.intellij.ide.actions.CreateFileFromTemplateDialog
import com.intellij.ide.fileTemplates.FileTemplate
import com.intellij.openapi.project.Project
import com.intellij.psi.PsiDirectory
import com.intellij.psi.PsiFile
import com.qalens.corr.ide.JrnIcons
import com.qalens.corr.ide.file.JrnFileTemplateGroup

object CreateNewFileAction : CreateFileFromTemplateAction(JrnFileTemplateGroup.JOURNEY_FILE,"Create New .journey",JrnIcons.JOURNEY) {
    override fun buildDialog(project: Project, directory: PsiDirectory, builder: CreateFileFromTemplateDialog.Builder) {
        builder.setTitle("Journey File")
            .addKind("Journey",JrnIcons.JOURNEY,JrnFileTemplateGroup.JOURNEY_FILE)
    }

    override fun getActionName(directory: PsiDirectory?, newName: String, templateName: String?): String {
        return "Create " + newName;
    }


}