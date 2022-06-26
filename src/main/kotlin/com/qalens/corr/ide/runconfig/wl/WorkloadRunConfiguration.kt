package com.qalens.corr.ide.runconfig.wl

import com.intellij.execution.Executor
import com.intellij.execution.configurations.*
import com.intellij.execution.runners.ExecutionEnvironment
import com.intellij.openapi.options.SettingsEditor
import com.intellij.openapi.project.Project
import com.intellij.openapi.util.JDOMExternalizer
import org.jdom.Element

class WorkloadRunConfiguration(project:Project,factory:ConfigurationFactory,var workloadName:String,var output:String,var environmentVars:MutableMap<String,String>):
    LocatableConfigurationBase<RunProfileState>(project,factory), RunProfileWithCompileBeforeLaunchOption{
    override fun getState(executor: Executor, environment: ExecutionEnvironment): RunProfileState? {
        return WorkloadCommandLineState(environment,this);
    }

    override fun getConfigurationEditor(): SettingsEditor<out RunConfiguration> {
        return WorkloadConfigurationEditor();
    }

    override fun readExternal(element: Element) {
        super.readExternal(element)
        workloadName = JDOMExternalizer.readString(element, "workloadName")?:""
        output = JDOMExternalizer.readString(element, "output")?:"console"
        JDOMExternalizer.readMap(element,environmentVars,"envVars","envVars")
    }

    override fun writeExternal(element: Element) {
        super.writeExternal(element)
        JDOMExternalizer.write(element, "workloadName", workloadName)
        JDOMExternalizer.write(element, "output", output)
        JDOMExternalizer.writeMap(element, environmentVars,"envVars", "envVars")
    }
}