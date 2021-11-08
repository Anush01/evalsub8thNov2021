package com.anushmp.randomusermvvm.datamodels.local

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface RandomUserDao {

    //@Insert(onConflict = OnConflictStrategy.REPLACE)
    @Update
    fun updateRandomUser(randomUserEntity: RandomUserEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertRandomUser(randomUserEntity: RandomUserEntity)

    @Query("select * from userdata where id = 1")
    fun getCurrentRandomUser(): LiveData<RandomUserEntity>


}