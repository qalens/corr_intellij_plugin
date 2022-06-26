package com.qalens.corr.ide.runconfig.wl

import com.intellij.execution.configurations.GeneralCommandLine
import com.intellij.execution.process.ColoredProcessHandler
import com.intellij.execution.process.ProcessTerminatedListener

class WorkloadRunProcessHandler(process:Process,commandLineString:String) : ColoredProcessHandler(process,commandLineString) {
    companion object {
        public fun runCommandLine(
            commandLine: GeneralCommandLine,
        ): WorkloadRunProcessHandler {

            val WorkloadRunProcess =
                WorkloadRunProcessHandler(
                    commandLine.createProcess(),
                    commandLine.commandLineString
                )
            ProcessTerminatedListener.attach(WorkloadRunProcess)
            return WorkloadRunProcess
        }
    }

}