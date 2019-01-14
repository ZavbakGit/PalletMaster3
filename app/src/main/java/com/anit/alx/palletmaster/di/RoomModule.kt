/**
 */

package com.anit.alx.palletmaster.di

import android.content.Context
import com.anit.alx.palletmaster.data.room.RoomAppDataSource
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RoomModule {

  @Provides @Singleton fun provideRoomCurrencyDataSource(context: Context) =
      RoomAppDataSource.buildDataSource(context)
}


