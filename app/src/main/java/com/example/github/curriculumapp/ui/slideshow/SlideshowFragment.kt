package com.example.github.curriculumapp.ui.slideshow

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.github.curriculumapp.*

import kotlinx.android.synthetic.main.item_top.view.*

import kotlinx.android.synthetic.main.fragment_slideshow.view.*

class SlideshowFragment : Fragment() {

    private lateinit var slideshowViewModel: SlideshowViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        val root = inflater.inflate(R.layout.fragment_slideshow, container, false)
        var kide= KideUtils.CreateUser()
        AddViewUtils.addView(kide,root.top_layout)
        return root
    }
}