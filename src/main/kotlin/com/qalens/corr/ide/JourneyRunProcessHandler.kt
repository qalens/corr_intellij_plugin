package com.qalens.corr.ide

import com.intellij.execution.ExecutionException
import com.intellij.execution.configurations.GeneralCommandLine
import com.intellij.execution.process.ColoredProcessHandler
import com.intellij.execution.process.ProcessTerminatedListener
import com.intellij.openapi.project.Project

class JourneyRunProcessHandler(process:Process,commandLineString:String) : ColoredProcessHandler(process,commandLineString) {
    companion object {
        public fun runCommandLine(
            commandLine: GeneralCommandLine,
        ): JourneyRunProcessHandler {

            val journeyRunProcess =
                JourneyRunProcessHandler(
                    commandLine.createProcess(),
                    commandLine.commandLineString
                )
            ProcessTerminatedListener.attach(journeyRunProcess)
            return journeyRunProcess
        }
    }

}