package com.anit.alx.createpallete

import android.content.Context
import android.support.v4.content.ContextCompat.startActivity
import android.content.Intent


class CreatePalleteModule private constructor(val context: Context) {

    fun getIntentCreatePalletActivity() = Intent(context, CreatePalletActivity::class.java)

    companion object {
        private var instance: CreatePalleteModule? = null

        fun getInstance(context: Context): CreatePalleteModule {
            if (instance == null)  // NOT thread safe!
                instance = context.let {
                    CreatePalleteModule(context)
                }
            return instance!!
        }

    }
}