package com.qalens.corr.ide

import com.intellij.execution.configuration.EnvironmentVariablesTextFieldWithBrowseButton
import com.intellij.openapi.options.ConfigurationException
import com.intellij.openapi.options.SettingsEditor
import com.qalens.corr.ide.runconfig.jrn.JourneyRunConfiguration
import javax.swing.JComponent
import javax.swing.JPanel
import javax.swing.JTextField

class JourneyConfigurationForm : SettingsEditor<JourneyRunConfiguration>() {
    private var configWindow: JPanel? = null
    private var journeyName: JTextField? = null
    override fun resetEditorFrom(s: JourneyRunConfiguration) {
        journeyName!!.text = s.journeyName
    }

    @Throws(ConfigurationException::class)
    override fun applyEditorTo(s: JourneyRunConfiguration) {
        s.journeyName = journeyName!!.text
    }

    override fun createEditor(): JComponent {
        return configWindow!!
    }
}