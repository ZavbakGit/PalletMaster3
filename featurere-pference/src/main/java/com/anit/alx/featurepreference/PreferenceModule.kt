package com.anit.alx.featurepreference

import android.content.Context
import android.support.v4.content.ContextCompat.startActivity
import android.content.Intent


class PreferenceModule private constructor(val context: Context) {

    fun getIntentPreferenceActivity() = Intent(context, PreferenceActivity::class.java)

    companion object {
        private var instance: PreferenceModule? = null

        fun getInstance(context: Context): PreferenceModule {
            if (instance == null)  // NOT thread safe!
                instance = context.let {
                    PreferenceModule(context)
                }
            return instance!!
        }

    }
}