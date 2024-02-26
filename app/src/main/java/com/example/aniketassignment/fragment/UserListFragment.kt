package com.example.aniketassignment.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.aniketassignment.R
import com.example.aniketassignment.databinding.FragmentUserDetailBinding


class UserListFragment : Fragment() {
    private lateinit var binder:FragmentUserDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Handle any initialization if needed



    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binder= DataBindingUtil.inflate(inflater,R.layout.fragment_user_list,container,false)
        return binder.root

    }
}
