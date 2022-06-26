package com.qalens.corr.lang.core.wl.psi

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider
import com.qalens.corr.lang.core.wl.WlFileType
import com.qalens.corr.lang.core.wl.WlLanguage

class WlFile(fileViewProvider: FileViewProvider)
    : PsiFileBase(fileViewProvider, WlLanguage){
    override fun getFileType(): FileType {
        return WlFileType;
    }
}