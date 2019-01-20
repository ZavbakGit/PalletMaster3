package com.anit.alx.palletmaster.mvp.presenters

import android.content.Context
import com.anit.alx.createpallete.CreatePalleteModule
import com.anit.alx.featurepreference.PreferenceModule
import com.anit.alx.palletmaster.di.App
import com.anit.alx.palletmaster.mvp.model.EnumMenu
import com.anit.alx.palletmaster.mvp.view.MainMenuView
import com.anit.alx.palletmaster.mvp.view.MainView
import com.anit.alx.palletmaster.navigate.Screens
import com.arellomobile.mvp.InjectViewState
import ru.terrakok.cicerone.Router
import javax.inject.Inject

@InjectViewState
class MainMenuPresenter(val router: Router) : BasePresenter<MainMenuView>() {

    init {
        App.appComponent.inject(this)
    }

    fun onBackPressed(): Boolean {
        router.exit()
        return true
    }

    fun clickItemMenu(position: Int) {
        val item = EnumMenu.values().toList()[position]
        when(item){
            EnumMenu.CREATE_PALETTE -> viewState.startCreatePalleteModule()
            EnumMenu.SETTINGS-> viewState.startPreferenceModule()
        }
    }

    fun pressKey(number: Char) {

    }
    fun startPreferenceModule(activity: Context) {
        router.navigateTo(Screens.StartPreferencesScreen)
    }

    fun startCreateMenuModule(activity: Context) {
       router.navigateTo(Screens.StartCreatePalletScreen)
    }

    fun getListMenu(): List<EnumMenu> {
        return EnumMenu.values().toList()
    }
}