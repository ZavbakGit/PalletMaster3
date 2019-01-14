package com.anit.alx.palletmaster.navigate


import android.content.Context
import android.content.Intent
import android.support.v4.app.Fragment
import ru.terrakok.cicerone.android.support.SupportAppScreen
import com.anit.alx.palletmaster.ui.fragments.MainMenuScreen


object Screens {
    object StartMainMenuScreen : SupportAppScreen(){
        override fun getFragment() = MainMenuScreen.newInstance()
    }
}