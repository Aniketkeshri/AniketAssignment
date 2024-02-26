package com.example.aniketassignment.repository

import com.example.aniketassignment.RetrofitInstance.UserService
import com.example.aniketassignment.Room.User
import com.example.aniketassignment.Room.UserDao

class UserRepo(private val userDao: UserDao, private val userService: UserService) {
    suspend fun getUsers() {
        // Implement logic to fetch users from API and store in local database
    }

    suspend fun getUserById(userId: Int) {
        // Implement logic to fetch a user by ID from API or local database
    }

    fun getUserById() {
        TODO("Not yet implemented")
    }

    // Implement other CRUD operations as needed
    companion object {
        fun getUsers() {

        }
    }
}
