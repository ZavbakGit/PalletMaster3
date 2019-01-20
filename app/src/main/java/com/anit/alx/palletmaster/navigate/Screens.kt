package com.anit.alx.palletmaster.navigate


import android.content.Context
import android.content.Intent
import android.support.v4.app.Fragment
import com.anit.alx.createpallete.CreatePalletActivity
import com.anit.alx.createpallete.CreatePalleteModule
import com.anit.alx.featurepreference.PreferenceModule
import ru.terrakok.cicerone.android.support.SupportAppScreen
import com.anit.alx.palletmaster.ui.fragments.MainMenuScreen


object Screens {
    object StartMainMenuScreen : SupportAppScreen() {
        override fun getFragment() = MainMenuScreen.newInstance()
    }

    object StartCreatePalletScreen : SupportAppScreen() {
        override fun getActivityIntent(context: Context?): Intent {
            return CreatePalleteModule.getInstance(context!!).getIntentCreatePalletActivity()
        }
    }

    object StartPreferencesScreen : SupportAppScreen() {
        override fun getActivityIntent(context: Context?): Intent {
            return PreferenceModule.getInstance(context!!).getIntentPreferenceActivity()
        }
    }
}