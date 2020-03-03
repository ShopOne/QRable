package com.example.qrable

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [ShopEntity::class],version = 1)
abstract class MyDataBase: RoomDatabase(){
    abstract fun shopDao(): ShopDao
}
