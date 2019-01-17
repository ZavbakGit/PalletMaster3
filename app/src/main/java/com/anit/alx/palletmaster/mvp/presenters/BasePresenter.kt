package com.anit.alx.palletmaster.mvp.presenters

import com.arellomobile.mvp.MvpPresenter
import com.arellomobile.mvp.MvpView

open abstract class BasePresenter<V:MvpView>: MvpPresenter<V>() {
    abstract fun onStart()

}