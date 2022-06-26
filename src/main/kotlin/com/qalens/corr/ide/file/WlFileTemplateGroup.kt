package com.qalens.corr.ide.file
import com.intellij.ide.fileTemplates.FileTemplateGroupDescriptor
import com.intellij.ide.fileTemplates.FileTemplateGroupDescriptorFactory
import com.qalens.corr.ide.JrnIcons

object WlFileTemplateGroup : FileTemplateGroupDescriptorFactory {
    val WORKLOAD_FILE = "Workload File"
    override fun getFileTemplatesDescriptor(): FileTemplateGroupDescriptor {
        val group = FileTemplateGroupDescriptor("Workload File",JrnIcons.JOURNEY)
        group.addTemplate(WORKLOAD_FILE)
        return group
    }

}