package com.qalens.corr.ide.runconfig.wl

import com.intellij.execution.configurations.ConfigurationFactory
import com.intellij.execution.configurations.ConfigurationType
import com.qalens.corr.ide.JrnIcons
import javax.swing.Icon

object WorkloadRunConfigurationType : ConfigurationType {
    override fun getDisplayName(): String {
        return "Workload"
    }

    override fun getConfigurationTypeDescription(): String {
        return "Workload Run Configuration Type"
    }

    override fun getIcon(): Icon {
        return JrnIcons.JOURNEY
    }

    override fun getId(): String {
        return "WorkloadRunConfiguration";
    }

    override fun getConfigurationFactories(): Array<ConfigurationFactory> {
        return arrayOf(WorkloadConfigurationFactory(this))
    }
}