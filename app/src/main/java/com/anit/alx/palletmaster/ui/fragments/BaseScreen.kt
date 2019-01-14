package com.anit.alx.palletmaster.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.anit.alx.palletmaster.R
import com.anit.alx.palletmaster.di.App
import com.arellomobile.mvp.MvpAppCompatFragment
import com.campus.android.app.interfaces.BackButtonListener
import ru.terrakok.cicerone.Navigator
import ru.terrakok.cicerone.Router

open abstract class BaseScreen : MvpAppCompatFragment(), BackButtonListener {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {

        val view = inflater!!.inflate(getLayout(), container, false)
        return view
    }


    abstract fun getRouter():Router
    abstract fun getLayout(): Int
}