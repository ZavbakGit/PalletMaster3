package com.anit.alx.palletmaster.di


import com.anit.alx.palletmaster.ui.activities.BaseActivity
import com.campus.android.di.LocalNavigationModule
import com.campus.android.di.NavigationModule
import dagger.Component

import javax.inject.Singleton

@Component(
    modules = arrayOf(
        AppModule::class,
        NavigationModule::class,
        LocalNavigationModule::class,
        RoomModule::class
    )
)
@Singleton
interface AppComponent {
    fun inject(baseActivity: BaseActivity)
}


