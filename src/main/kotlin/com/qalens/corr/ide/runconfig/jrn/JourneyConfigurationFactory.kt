package com.qalens.corr.ide.runconfig.jrn

import com.intellij.execution.configurations.ConfigurationFactory
import com.intellij.execution.configurations.ConfigurationType
import com.intellij.execution.configurations.RunConfiguration
import com.intellij.openapi.project.Project

class JourneyConfigurationFactory(type:ConfigurationType): ConfigurationFactory(type) {
    private val FACTORY_NAME = "Journey configuration factory"
    private val FACTORY_ID = "JOURNEY_FACTORY"
    override fun createTemplateConfiguration(project: Project): RunConfiguration {
        return JourneyRunConfiguration(project, this, "Demo")
    }

    override fun getId(): String {
        return FACTORY_ID
    }

    override fun getName(): String {
        return FACTORY_NAME
    }
}