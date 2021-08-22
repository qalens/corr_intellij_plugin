package com.qalens.corr.ide.file
import com.intellij.ide.fileTemplates.FileTemplateGroupDescriptor
import com.intellij.ide.fileTemplates.FileTemplateGroupDescriptorFactory
import com.qalens.corr.ide.JrnIcons

object JrnFileTemplateGroup : FileTemplateGroupDescriptorFactory {
    val JOURNEY_FILE = "Journey File"
    override fun getFileTemplatesDescriptor(): FileTemplateGroupDescriptor {
        val group = FileTemplateGroupDescriptor("Journey Files",JrnIcons.JOURNEY)
        group.addTemplate(JOURNEY_FILE)
        return group
    }

}