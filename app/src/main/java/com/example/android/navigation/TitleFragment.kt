package com.example.android.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.android.navigation.databinding.FragmentTitleBinding

class TitleFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment

         val binding:FragmentTitleBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_title, container, false)

        //this sets the onclick listener from the view using The Navigation
//      binding.playButton.setOnClickListener { view:View ->
//          Navigation.findNavController(view).navigate(R.id.action_titleFragment_to_gameFragment)}

        // this sets the click listener using the createNavigationOnClicklistener in Navigation
        binding.playButton.setOnClickListener (Navigation.createNavigateOnClickListener(R.id.action_titleFragment_to_gameFragment))


        //this sets the click listener from the view findNavController method
//        binding.playButton.setOnClickListener { view:View ->
//            view.findNavController().navigate(R.id.action_titleFragment_to_gameFragment)}


        return  binding.root
    }


}