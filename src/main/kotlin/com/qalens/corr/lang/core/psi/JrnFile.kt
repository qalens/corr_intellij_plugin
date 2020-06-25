package com.qalens.corr.lang.core.psi

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider
import com.qalens.corr.lang.JrnFileType
import com.qalens.corr.lang.JrnLanguage

class JrnFile(fileViewProvider: FileViewProvider)
    : PsiFileBase(fileViewProvider, JrnLanguage){
    override fun getFileType(): FileType {
        return JrnFileType;
    }
}