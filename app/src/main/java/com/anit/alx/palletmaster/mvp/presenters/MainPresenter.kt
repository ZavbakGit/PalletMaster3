package com.anit.alx.palletmaster.mvp.presenters

import com.anit.alx.palletmaster.mvp.view.MainView
import com.anit.alx.palletmaster.navigate.Screens
import com.arellomobile.mvp.InjectViewState
import ru.terrakok.cicerone.Router

@InjectViewState
class MainPresenter(val router: Router):BasePresenter<MainView>() {
    override fun onFirstViewAttach() {
        super.onFirstViewAttach()
        router.replaceScreen(Screens.StartMainMenuScreen)
    }

    fun onBackPressed() {
       router.exit()
    }

}