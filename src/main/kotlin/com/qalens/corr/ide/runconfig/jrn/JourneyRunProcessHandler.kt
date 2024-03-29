package com.qalens.corr.ide.runconfig.jrn

import com.intellij.execution.configurations.GeneralCommandLine
import com.intellij.execution.process.ColoredProcessHandler
import com.intellij.execution.process.ProcessTerminatedListener

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