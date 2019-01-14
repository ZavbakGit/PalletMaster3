package com.anit.alx.palletmaster.data.room.models

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import com.anit.alx.palletmaster.data.room.RoomContract

@Entity(tableName = RoomContract.TABLE_PRODUCT)
data class ProductEntity(@PrimaryKey val guid: String, val code: String, val name:String)