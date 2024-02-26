package com.example.aniketassignment.Room

import android.provider.ContactsContract.Contacts
import androidx.lifecycle.LiveData
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import retrofit2.http.GET
import retrofit2.http.Path

interface UserDao {
    @GET("users")
    suspend fun getUsers(): List<User>

    @GET("users/{userId}")
    suspend fun getUserById(@Path("userId") userId: Int): User
}