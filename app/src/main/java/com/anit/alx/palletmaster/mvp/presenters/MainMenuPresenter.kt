package com.anit.alx.palletmaster.mvp.presenters

import com.anit.alx.palletmaster.mvp.view.MainMenuView
import com.anit.alx.palletmaster.mvp.view.MainView
import com.anit.alx.palletmaster.navigate.Screens
import com.arellomobile.mvp.InjectViewState
import ru.terrakok.cicerone.Router

@InjectViewState
class MainMenuPresenter(val router: Router) : BasePresenter<MainMenuView>() {
    fun onBackPressed(): Boolean {
        router.exit()
        return true
    }
}