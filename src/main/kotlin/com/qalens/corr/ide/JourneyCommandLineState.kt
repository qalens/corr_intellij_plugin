package com.qalens.corr.ide

import com.intellij.execution.configurations.CommandLineState
import com.intellij.execution.configurations.GeneralCommandLine
import com.intellij.execution.process.ProcessHandler
import com.intellij.execution.runners.ExecutionEnvironment
import com.intellij.openapi.diagnostic.Logger
import com.intellij.openapi.project.Project

class JourneyCommandLineState(env:ExecutionEnvironment,val config:JourneyRunConfiguration) : CommandLineState(env) {
    override fun startProcess(): ProcessHandler {
        var params = mutableListOf("run")
        if (config.journeyName.length > 0) {
            params.add(config.journeyName)
        }
        val cl = GeneralCommandLine()
            .withWorkDirectory(this.environment.project.basePath)
            .withExePath("corr")
            .withParameters(params)
        return JourneyRunProcessHandler.runCommandLine(cl);
    }

}