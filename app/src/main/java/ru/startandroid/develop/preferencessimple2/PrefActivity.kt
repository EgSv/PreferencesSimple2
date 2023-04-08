package ru.startandroid.develop.preferencessimple2

import android.os.Bundle
import android.os.PersistableBundle
import android.preference.PreferenceActivity

class PrefActivity : PreferenceActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        addPreferencesFromResource(R.xml.pref)
    }
}