package com.qalens.corr.ide.module

import com.intellij.openapi.module.ModuleType
import com.qalens.corr.ide.JrnIcons
import javax.swing.Icon

object JourneyModuleType: ModuleType<JourneyModuleBuilder>("JOURNEY_MODULE") {
//    private val INSTANCE: JourneyModuleType = JourneyModuleType()

    override fun createModuleBuilder(): JourneyModuleBuilder {
        return JourneyModuleBuilder()
    }


    override fun getName(): String {
        return "Journey"
    }

    override fun getDescription(): String {
        return "Add support for Journey"
    }

    fun getBigIcon(): Icon {
        return JrnIcons.JOURNEY
    }

    override fun getNodeIcon( isOpened: Boolean): Icon {
        return JrnIcons.JOURNEY
    }

    fun getInstance(): JourneyModuleType? {
        return this;
    }
}