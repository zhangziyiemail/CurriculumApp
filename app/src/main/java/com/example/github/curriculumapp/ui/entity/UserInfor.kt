package com.example.github.curriculumapp.ui.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

/**
 *   Created by zhangziyi on 9/9/20 13:47
 */
@Entity(
    tableName = "user_info_cache"
)
data class UserInfor(
    @PrimaryKey val uid: Int,
    @ColumnInfo(name = "name") val name: String?,
    @ColumnInfo(name = "address") val address: String?,
    @ColumnInfo(name = "phoneNum") val phoneNum: String?,
    @ColumnInfo(name = "email") val email: String?,
    @ColumnInfo(name = "linkeIn") val linkedIn :String?,
    @ColumnInfo(name = "interduce") val interduce : String?,
    @ColumnInfo(name = "skill") val skill :Map<String, ArrayList<String>>?,
    @ColumnInfo(name = "note") val note: String?,
    @ColumnInfo(name = "experience") val experience : ArrayList<Experience>?

)
@Entity(
    tableName = "exprience_cache"
)
data class Experience(
    @PrimaryKey val uid: String,
    @ColumnInfo(name = "companyname") val name: String?,
    @ColumnInfo(name = "time") val time: String?,
    @ColumnInfo(name = "position") val position: String?,
    @ColumnInfo(name = "task") val task : ArrayList<String>?,
    @ColumnInfo(name = "technologies") val techologies : String

)