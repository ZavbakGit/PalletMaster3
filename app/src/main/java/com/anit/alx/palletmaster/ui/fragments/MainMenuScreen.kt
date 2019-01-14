package com.anit.alx.palletmaster.ui.fragments

import android.os.Bundle
import com.anit.alx.palletmaster.R
import com.anit.alx.palletmaster.mvp.presenters.MainMenuPresenter
import com.anit.alx.palletmaster.mvp.view.MainMenuView
import com.arellomobile.mvp.presenter.InjectPresenter
import com.arellomobile.mvp.presenter.ProvidePresenter
import com.campus.android.app.interfaces.RouterProvider

class MainMenuScreen : BaseScreen(), MainMenuView {

    @InjectPresenter
    lateinit var presenter: MainMenuPresenter

    @ProvidePresenter
    fun provideMainPresenter(): MainMenuPresenter {
        return MainMenuPresenter((activity as RouterProvider).getRouter())
    }

    //singelton 2
    companion object {
        private val ARG_CAUGHT = "MainMenuScreen"

        fun newInstance(): MainMenuScreen {
            val args: Bundle = Bundle()
            args.putSerializable(ARG_CAUGHT, null)
            val fragment = MainMenuScreen()
            fragment.arguments = args
            return fragment
        }
    }

    override fun getRouter() = (activity as RouterProvider).getRouter()
    override fun getLayout() = R.layout.main_menu_screen
    override fun onBackPressed() = presenter.onBackPressed()
}