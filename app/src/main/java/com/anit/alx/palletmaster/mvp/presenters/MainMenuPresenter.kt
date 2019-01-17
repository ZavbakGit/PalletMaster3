package com.anit.alx.palletmaster.mvp.presenters

import com.anit.alx.palletmaster.mvp.view.MainMenuView
import com.anit.alx.palletmaster.mvp.view.MainView
import com.anit.alx.palletmaster.navigate.Screens
import com.arellomobile.mvp.InjectViewState
import ru.terrakok.cicerone.Router

@InjectViewState
class MainMenuPresenter(val router: Router) : BasePresenter<MainMenuView>() {
    override fun onStart() {
        viewState.refresh()
    }

    fun onBackPressed(): Boolean {
        router.exit()
        return true
    }

    fun getListMenu() = listOf(
        "Товары",
        "Паддоны",
        "Штрихкода",
        "Формирование паддона",
        "Настройки"
    )

    fun clickItemMenu(position: Int){

    }

    fun pressKey(number: Char) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}