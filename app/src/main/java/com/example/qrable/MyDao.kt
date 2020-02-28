package com.example.qrable

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface MyDao {
    @Query("SELECT * from shop_table")
    fun getAllShop() : List<Shop>
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insertShop(vararg shops:Shop)
}