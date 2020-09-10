package com.example.github.curriculumapp.ui.entity

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

/**
 *   Created by zhangziyi on 9/9/20 14:45
 */

@Dao
interface UserInforCacheDao{

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun cacheUserInfor(user : UserInfor) : List<Long>

    @Query("SELECT * FROM user_info_cache WHERE name LIKE :username")
    fun getUser(username: String) : UserInfor


}