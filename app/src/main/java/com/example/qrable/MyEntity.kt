package com.example.qrable

import android.media.Image
import android.widget.ImageView
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "shop_table")
data class Shop(
    @PrimaryKey var id:Int,
    var shopName: String?,
    var imageId: Int
)