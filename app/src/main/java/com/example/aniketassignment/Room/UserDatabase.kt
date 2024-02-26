package com.example.aniketassignment.Room


import android.content.Context
import android.provider.ContactsContract.Contacts
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Contacts::class], version = 1, exportSchema = false)
abstract class UserDatabase : RoomDatabase() {

    abstract fun UserDao(): UserDao

    companion object {
        @Volatile
        private var INSTANCE: UserDatabase? = null

        fun getDatabase(context: Context): UserDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    UserDatabase::class.java,
                    "User_table"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}
