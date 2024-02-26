package com.example.aniketassignment.ViewModel

import android.provider.ContactsContract
import androidx.databinding.Bindable
import androidx.databinding.Observable
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.aniketassignment.Room.UserDao

class UserViewModel(private val repository: UserDao) : ViewModel(), Observable {

    private lateinit var contactUpdateDelete: ContactsContract.Contacts

    val name = MutableLiveData<String?>()
    val email = MutableLiveData<String?>()
    val id = MutableLiveData<Int?>()

    override fun addOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {
        // Implement if needed
    }

    override fun removeOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {
        // Implement if needed
    }
}
