package com.example.aniketassignment.RetrofitInstance

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiClient {
    private const val BASE_URL = "https://dummyjson.com/"

    // Function to create and configure Retrofit instance
    fun create(): UserService {
        // Create Retrofit instance
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL) // Set base URL
            .addConverterFactory(GsonConverterFactory.create()) // Use Gson converter
            .build()

        // Create service interface implementation using Retrofit
        return retrofit.create(UserService::class.java)
    }
}
