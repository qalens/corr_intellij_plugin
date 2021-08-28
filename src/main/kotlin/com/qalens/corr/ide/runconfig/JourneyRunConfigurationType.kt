package com.qalens.corr.ide.runconfig

import com.intellij.execution.configurations.ConfigurationFactory
import com.intellij.execution.configurations.ConfigurationType
import com.qalens.corr.ide.JrnIcons
import javax.swing.Icon

object JourneyRunConfigurationType : ConfigurationType {
    override fun getDisplayName(): String {
        return "Journey"
    }

    override fun getConfigurationTypeDescription(): String {
        return "Journey Run Configuration Type"
    }

    override fun getIcon(): Icon {
        return JrnIcons.JOURNEY
    }

    override fun getId(): String {
        return "JourneyRunConfiguration";
    }

    override fun getConfigurationFactories(): Array<ConfigurationFactory> {
        return arrayOf(JourneyConfigurationFactory(this))
    }
}