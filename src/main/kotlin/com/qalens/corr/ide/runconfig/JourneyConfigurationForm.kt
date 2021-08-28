package com.qalens.corr.ide

import com.intellij.openapi.options.ConfigurationException
import com.intellij.openapi.options.SettingsEditor
import com.qalens.corr.ide.runconfig.JourneyRunConfiguration
import javax.swing.JPanel
import javax.swing.JTextField
import kotlin.Throws
import javax.swing.JComponent

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