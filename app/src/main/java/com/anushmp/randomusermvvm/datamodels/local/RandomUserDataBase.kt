package com.anushmp.randomusermvvm.datamodels.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [RandomUserEntity::class], version = 1)
abstract class RandomUserDataBase: RoomDatabase() {

abstract fun getRandomUserdao(): RandomUserDao

companion object{

    private var Instance: RandomUserDataBase? = null

    fun getDataBaseSingleton(context:Context): RandomUserDataBase{

        if(Instance == null){

            var roombuilder = Room.databaseBuilder(context.applicationContext
            ,RandomUserDataBase::class.java
            ,"results")

            roombuilder.fallbackToDestructiveMigration()

            Instance = roombuilder.build()

            return Instance!!


        }else{

            return Instance!!

        }
    }

}



}