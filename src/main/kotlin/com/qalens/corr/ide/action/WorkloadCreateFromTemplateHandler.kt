package com.qalens.corr.ide.action

import com.intellij.ide.fileTemplates.DefaultCreateFromTemplateHandler
import com.intellij.ide.fileTemplates.FileTemplate
import com.intellij.ide.fileTemplates.FileTemplate.ATTRIBUTE_NAME
import com.intellij.openapi.fileTypes.ex.FileTypeManagerEx
import com.qalens.corr.ide.file.WlFileTemplateGroup
import com.qalens.corr.lang.core.wl.WlFileType

class WorkloadCreateFromTemplateHandler : DefaultCreateFromTemplateHandler() {
    override fun handlesTemplate(template: FileTemplate): Boolean {
        val fileType = FileTypeManagerEx.getInstanceEx().getFileTypeByExtension(template.extension)
        return WlFileType == fileType && WlFileTemplateGroup.WORKLOAD_FILE == template.name
    }
    override fun isNameRequired(): Boolean = true
    override fun prepareProperties(props: MutableMap<String, Any>) {
        val name = props[ATTRIBUTE_NAME] as? String ?: return
        props["WORKLOAD_NAME"] = name
    }
}