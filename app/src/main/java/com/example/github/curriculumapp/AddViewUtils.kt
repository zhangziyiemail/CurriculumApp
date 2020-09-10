package com.example.github.curriculumapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import com.example.github.curriculumapp.ui.entity.UserInfor
import kotlinx.android.synthetic.main.fragment_slideshow.view.*
import kotlinx.android.synthetic.main.item_experience.view.*
import kotlinx.android.synthetic.main.item_interduce.view.*
import kotlinx.android.synthetic.main.item_skill.view.*
import kotlinx.android.synthetic.main.item_top.view.*
import kotlinx.android.synthetic.main.nav_header_main.view.*

/**
 *   Created by zhangziyi on 9/9/20 21:24
 */
object AddViewUtils {
    fun addView(userInfor: UserInfor, layoutGroup : ViewGroup){
        val layout: View = LayoutInflater.from(MyApplication.instance)
            .inflate(R.layout.item_top, null)
        layout.tv_name.text = userInfor.name
        layout.tv_address.text =userInfor.address
        layout.tv_email.text = userInfor.email
        layout.tv_linkedin.text = userInfor.linkedIn

        val item_interduce: View = LayoutInflater.from(MyApplication.instance)
            .inflate(R.layout.item_interduce, null)
        item_interduce.tv_interduce.text = userInfor.interduce


        layoutGroup.addView(layout)
        layoutGroup.addView(item_interduce)

        val skill = userInfor.skill


        skill?.forEach {
            val item_skill: View = LayoutInflater.from(MyApplication.instance)
                .inflate(R.layout.item_skill, null)
            item_skill.tv_skill.text = it.key
            it.value.forEach {
                item_skill.tv_detail.text =  item_skill.tv_detail.text.toString() +","+ it
            }
            layoutGroup.addView(item_skill)
        }

        val item_note: View = LayoutInflater.from(MyApplication.instance)
            .inflate(R.layout.item_interduce, null)
        item_note.tv_interduce.text = userInfor.note
        layoutGroup.addView(item_note)

        userInfor.experience?.forEach {
            val item_experience: View = LayoutInflater.from(MyApplication.instance)
                .inflate(R.layout.item_experience, null)
            item_experience.tv_companyName.text = it.name
            item_experience.tv_time.text = it.time
            item_experience.tv_position.text = it.position
            layoutGroup.addView(item_experience)
            it.task?.forEach {
                val item_task: View = LayoutInflater.from(MyApplication.instance)
                    .inflate(R.layout.item_interduce, null)
                item_task.tv_interduce.text = it
                layoutGroup.addView(item_task)
            }
            val item_technologies: View = LayoutInflater.from(MyApplication.instance)
                .inflate(R.layout.item_interduce, null)
            item_technologies.tv_interduce.text = it.techologies
            layoutGroup.addView(item_technologies)
        }





    }
}