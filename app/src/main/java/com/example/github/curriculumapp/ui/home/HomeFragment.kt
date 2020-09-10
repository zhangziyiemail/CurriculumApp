package com.example.github.curriculumapp.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.github.curriculumapp.AddViewUtils
import com.example.github.curriculumapp.KideUtils
import com.example.github.curriculumapp.LeeUtils
import com.example.github.curriculumapp.R
import kotlinx.android.synthetic.main.fragment_slideshow.view.*

class HomeFragment : Fragment() {
    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_home, container, false)
        var lee= LeeUtils.CreateUser()
        AddViewUtils.addView(lee,root.top_layout)
        return root
    }
}