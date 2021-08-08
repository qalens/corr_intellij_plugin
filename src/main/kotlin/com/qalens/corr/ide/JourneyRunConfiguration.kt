package com.qalens.corr.ide

import com.intellij.execution.Executor
import com.intellij.execution.configurations.*
import com.intellij.execution.runners.ExecutionEnvironment
import com.intellij.openapi.options.SettingsEditor
import com.intellij.openapi.project.Project
import com.intellij.openapi.util.InvalidDataException
import com.intellij.openapi.util.JDOMExternalizer
import com.intellij.openapi.util.WriteExternalException
import org.jdom.Element
import java.util.HashMap

class JourneyRunConfiguration(project:Project,factory:ConfigurationFactory,var journeyName:String):
    LocatableConfigurationBase<RunProfileState>(project,factory), RunProfileWithCompileBeforeLaunchOption{
    override fun getState(executor: Executor, environment: ExecutionEnvironment): RunProfileState? {
        return JourneyCommandLineState(environment,this);
    }

    override fun getConfigurationEditor(): SettingsEditor<out RunConfiguration> {
        return JourneyConfigurationForm();
    }

    override fun readExternal(element: Element) {
        super<LocatableConfigurationBase>.readExternal(element)
        journeyName = JDOMExternalizer.readString(element, "journeyName")?:""
    }

    override fun writeExternal(element: Element) {
        super<LocatableConfigurationBase>.writeExternal(element)
        JDOMExternalizer.write(element, "journeyName", journeyName)
    }
}
//    :RunConfigurationBase<RunProfileState>(project,factory,name) {
//    var journeyName:String = "";
//    override fun getState(executor: Executor, environment: ExecutionEnvironment): RunProfileState? {
//        return JourneyCommandLineState(environment,this);
//    }
//
//    override fun getConfigurationEditor(): SettingsEditor<out RunConfiguration> {
//        return JourneyConfigurationForm();
//    }
//}