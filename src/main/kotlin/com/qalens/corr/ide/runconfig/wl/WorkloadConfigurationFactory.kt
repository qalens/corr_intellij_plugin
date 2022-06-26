package com.qalens.corr.ide.runconfig.wl

import com.intellij.execution.configurations.ConfigurationFactory
import com.intellij.execution.configurations.ConfigurationType
import com.intellij.execution.configurations.RunConfiguration
import com.intellij.openapi.project.Project

class WorkloadConfigurationFactory(type:ConfigurationType): ConfigurationFactory(type) {
    private val FACTORY_NAME = "Journey configuration factory"
    private val FACTORY_ID = "JOURNEY_FACTORY"
    override fun createTemplateConfiguration(project: Project): RunConfiguration {
        return WorkloadRunConfiguration(project, this, "Demo", "console",mutableMapOf())
    }

    override fun getId(): String {
        return FACTORY_ID
    }

    override fun getName(): String {
        return FACTORY_NAME
    }
}