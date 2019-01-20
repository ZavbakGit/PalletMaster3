package com.anit.alx.featurepreference

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class PreferenceActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportFragmentManager.beginTransaction()
            .replace(android.R.id.content,SettingsFragment())
            .commit()
    }
}
