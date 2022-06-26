package com.qalens.corr.ide.runconfig.wl

import com.intellij.execution.configuration.EnvironmentVariablesTextFieldWithBrowseButton
import com.intellij.openapi.options.ConfigurationException
import com.intellij.openapi.options.SettingsEditor
import com.intellij.ui.components.JBCheckBox
import com.intellij.ui.components.JBTextField
import com.intellij.util.ui.FormBuilder
import javax.swing.JCheckBox
import javax.swing.JPanel
import javax.swing.JTextField
import kotlin.Throws
import javax.swing.JComponent

class WorkloadConfigurationEditor : SettingsEditor<WorkloadRunConfiguration>() {
    private lateinit var workloadName: JBTextField
    private lateinit var outputToInfluxDB: JBCheckBox
    private lateinit var executionEnvironmentVariables: EnvironmentVariablesTextFieldWithBrowseButton
    override fun resetEditorFrom(s: WorkloadRunConfiguration) {
        workloadName.text = s.workloadName
        outputToInfluxDB.isSelected = s.output == "influxdb2"
        executionEnvironmentVariables.envs = s.environmentVars
    }

    @Throws(ConfigurationException::class)
    override fun applyEditorTo(s: WorkloadRunConfiguration) {
        s.workloadName = workloadName.text
        s.environmentVars = executionEnvironmentVariables.envs;
        if(outputToInfluxDB.isSelected){
            s.output = "influxdb2"
        } else {
            s.output = "console"
        }
    }

    override fun createEditor(): JComponent {
        workloadName = JBTextField()
        outputToInfluxDB = JBCheckBox()
        executionEnvironmentVariables = EnvironmentVariablesTextFieldWithBrowseButton();
        setListeners()
        return FormBuilder.createFormBuilder()
            .addLabeledComponent("Workload Name",workloadName)
            .addLabeledComponent("Output To InfluxDB",outputToInfluxDB)
            .addLabeledComponent("Environment Variables",executionEnvironmentVariables)
            .panel
    }
    private fun setListeners(){
        workloadName.addPropertyChangeListener({

        })
        outputToInfluxDB.addChangeListener({
            fireEditorStateChanged()
        })
        executionEnvironmentVariables.addPropertyChangeListener({
            fireEditorStateChanged()
        })
    }
}