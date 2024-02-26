package com.example.aniketassignment.Room

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "User_table")
data class User(
    @PrimaryKey(autoGenerate = true)
    val id:Int,
    val firstName:String,
    val lastName:String,
    val image:Int
)
