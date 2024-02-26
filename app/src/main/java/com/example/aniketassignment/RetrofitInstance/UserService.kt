package com.example.aniketassignment.RetrofitInstance

import com.example.aniketassignment.Room.User
import retrofit2.http.GET
import retrofit2.http.Path

interface UserService {
    @GET("users")
    suspend fun getUsers(): List<User>

    @GET("users/{userId}")
    suspend fun getUserById(@Path("userId") userId: Int): User
}
