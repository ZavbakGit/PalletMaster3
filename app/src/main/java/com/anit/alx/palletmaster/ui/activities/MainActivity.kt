package com.anit.alx.palletmaster.ui.activities

import com.anit.alx.palletmaster.R
import com.anit.alx.palletmaster.mvp.presenters.MainPresenter
import com.anit.alx.palletmaster.mvp.view.MainView
import com.arellomobile.mvp.presenter.InjectPresenter
import com.arellomobile.mvp.presenter.ProvidePresenter
import ru.terrakok.cicerone.android.support.SupportAppNavigator

class MainActivity : BaseActivity(), MainView {

    @InjectPresenter
    lateinit var presenter: MainPresenter

    @ProvidePresenter
    fun provideMainPresenter(): MainPresenter {
        return MainPresenter(getRouter())
    }

    override fun backTo() {
        presenter.onBackPressed()
    }

    override fun getIdConteiner()= R.id.conteiner_frame

    override fun getNavigator() = SupportAppNavigator(this, getIdConteiner())

    override fun getLayout() = R.layout.activity_main

}
