package com.anit.alx.palletmaster.mvp.view

import android.content.Context
import com.arellomobile.mvp.MvpView
import com.arellomobile.mvp.viewstate.strategy.OneExecutionStateStrategy
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType

interface MainMenuView:MvpView {
    @StateStrategyType(value = OneExecutionStateStrategy::class)
    fun startCreatePalleteModule()

    @StateStrategyType(value = OneExecutionStateStrategy::class)
    fun startPreferenceModule()
}