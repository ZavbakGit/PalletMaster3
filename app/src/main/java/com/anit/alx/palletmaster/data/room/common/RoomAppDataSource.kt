package com.anit.alx.palletmaster.data.room

import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.content.Context
import com.anit.alx.palletmaster.data.room.models.ProductEntity



@Database(entities = arrayOf(ProductEntity::class), version = 1, exportSchema = false)
abstract class RoomAppDataSource: RoomDatabase() {
    abstract fun productsDao(): ProductsDao

    companion object {
        private val TAG = RoomAppDataSource::class.java.simpleName

        fun buildDataSource(context: Context): RoomAppDataSource = Room.databaseBuilder(
                context.applicationContext, RoomAppDataSource::class.java, RoomContract.DATABASE_APP)
                .fallbackToDestructiveMigration()
                .build()
    }

}