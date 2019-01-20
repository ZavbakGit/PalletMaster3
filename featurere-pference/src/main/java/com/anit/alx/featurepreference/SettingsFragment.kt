package com.anit.alx.featurepreference

import android.os.Bundle
import android.support.v7.preference.PreferenceFragmentCompat


class SettingsFragment: PreferenceFragmentCompat() {
    override fun onCreatePreferences(saveInstantState: Bundle?, rootkey: String?) {
        setPreferencesFromResource(R.xml.preferences,rootkey)
    }
}