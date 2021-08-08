package com.qalens.corr.ide.module

import com.intellij.ide.util.projectWizard.ModuleBuilder
import com.intellij.ide.util.projectWizard.ModuleBuilderListener
import com.intellij.openapi.module.Module
import com.intellij.openapi.module.ModuleType
import com.intellij.openapi.roots.ModifiableRootModel
import com.intellij.openapi.util.io.FileUtil
import com.intellij.openapi.vfs.LocalFileSystem
import com.intellij.openapi.vfs.VirtualFile
import java.io.File


class JourneyModuleBuilder : ModuleBuilder(), ModuleBuilderListener {
    override fun setupRootModel(rootModel: ModifiableRootModel) {
        super.setupRootModel(rootModel)
        val root: VirtualFile? = createAndGetContentEntry()
        if (root!=null){
            rootModel.addContentEntry(root);
        }
    }
    private fun createAndGetContentEntry(): VirtualFile? {
        if (contentEntryPath!=null) {
            println("Path: "+contentEntryPath);
            val path: String = FileUtil.toSystemDependentName(contentEntryPath!!)
            File(path).mkdirs()
            val src_path: String = FileUtil.toSystemDependentName(contentEntryPath!!+"/src")
            File(src_path).mkdirs()
            return LocalFileSystem.getInstance().refreshAndFindFileByPath(path)
        } else {
            throw Throwable("No Content Entry Found")
        }
    }
    override fun getModuleType(): ModuleType<*> {
        return JourneyModuleType
    }

    override fun moduleCreated(module: Module) {

    }

}