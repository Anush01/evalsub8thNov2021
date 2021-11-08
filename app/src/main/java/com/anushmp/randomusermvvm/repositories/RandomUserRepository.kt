package com.anushmp.randomusermvvm.repositories

import androidx.lifecycle.LiveData
import com.anushmp.randomusermvvm.datamodels.local.RandomUserDao
import com.anushmp.randomusermvvm.datamodels.local.RandomUserEntity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class RandomUserRepository(val dao:RandomUserDao) {

    fun addRandomUser(randomuser:RandomUserEntity){

        CoroutineScope(Dispatchers.Default).launch {

            dao.insertRandomUser(randomuser)

        }

    }


    fun getrandomuser(): LiveData<RandomUserEntity>{

        return dao.getCurrentRandomUser()



    }

    fun updateuserholder(randomuser: RandomUserEntity){

        CoroutineScope(Dispatchers.IO).launch {

            dao.updateRandomUser(randomuser)

        }



    }

}