package com.example.qrable

import androidx.room.Database

@Database(entities = [ShopEntity::class],version = 1)
abstract class MyDataBase{
    abstract fun shopDao(): ShopDao
}
