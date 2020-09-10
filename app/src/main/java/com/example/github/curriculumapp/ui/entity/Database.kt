package com.example.github.curriculumapp.ui.entity

import android.app.Application
import android.util.Log
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import com.example.github.curriculumapp.MyApplication

/**
 *   Created by zhangziyi on 9/9/20 14:42
 */

@Database(entities = [UserInfor::class], version = 1, exportSchema = false)
abstract class MyDatabase: RoomDatabase(){
    abstract fun userInforCacheDao() : UserInforCacheDao
}
object DatabaseUtils{
    private const val  DB_NAME = "resume.db"

    private val instance: MyDatabase by lazy {
        Room.databaseBuilder(MyApplication.instance,MyDatabase::class.java, DB_NAME)
            .addCallback(object : RoomDatabase.Callback(){
                override fun onCreate(db: SupportSQLiteDatabase) {
                    super.onCreate(db)
                    Log.v("create database","create database $DB_NAME")

                }

                override fun onOpen(db: SupportSQLiteDatabase) {
                    super.onOpen(db)
                    Log.v("open database","create database $DB_NAME")
                }
            }).build()
    }
    val userInforCacheDao = instance.userInforCacheDao()
}