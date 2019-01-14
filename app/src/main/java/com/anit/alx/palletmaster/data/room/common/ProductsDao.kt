package com.anit.alx.palletmaster.data.room

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy
import android.arch.persistence.room.Query
import com.anit.alx.palletmaster.data.room.models.ProductEntity


/**
 * Created by agladkov on 20.08.18.
 */
@Dao
interface ProductsDao {

    // Get app configuration (can be expanded in future)
    @Query("SELECT * FROM " + RoomContract.TABLE_PRODUCT)
    fun getProducts(): List<ProductEntity>

    // Add or update configuration in DB
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun updateOrCreate(vararg productEntity: ProductEntity)

    @Query("DELETE FROM " + RoomContract.TABLE_PRODUCT)
    fun deleteAll()
}