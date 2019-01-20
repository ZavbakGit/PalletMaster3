package com.anit.alx.palletmaster.mvp.presenters

import com.anit.alx.palletmaster.di.App
import com.arellomobile.mvp.MvpPresenter
import com.arellomobile.mvp.MvpView

open class BasePresenter<V:MvpView>: MvpPresenter<V>() {

}