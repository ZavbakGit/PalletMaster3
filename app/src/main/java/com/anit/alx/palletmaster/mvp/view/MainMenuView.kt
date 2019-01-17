package com.anit.alx.palletmaster.mvp.view

import com.arellomobile.mvp.MvpView
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType

interface MainMenuView:MvpView {
    @StateStrategyType(AddToEndSingleStrategy::class)
    abstract fun refresh()
}