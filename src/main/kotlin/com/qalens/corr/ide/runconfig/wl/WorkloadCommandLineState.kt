package com.qalens.corr.ide.runconfig.wl

import com.intellij.execution.configurations.CommandLineState
import com.intellij.execution.configurations.GeneralCommandLine
import com.intellij.execution.process.ProcessHandler
import com.intellij.execution.runners.ExecutionEnvironment
import com.intellij.util.EnvironmentUtil

class WorkloadCommandLineState(env:ExecutionEnvironment,val config: WorkloadRunConfiguration) : CommandLineState(env) {
    override fun startProcess(): ProcessHandler {
        var params = mutableListOf("run","-w","-o",config.output)
        if (config.workloadName.length > 0) {
            params.add(config.workloadName)
        }
        val cl = GeneralCommandLine()
            .withEnvironment(config.environmentVars)
            .withWorkDirectory(this.environment.project.basePath)
            .withExePath("corr")
            .withParameters(params)
        return WorkloadRunProcessHandler.runCommandLine(cl);
    }

}