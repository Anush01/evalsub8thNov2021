package com.anushmp.randomusermvvm.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.anushmp.randomusermvvm.datamodels.local.RandomUserEntity
import com.anushmp.randomusermvvm.datamodels.remote.Networker
import com.anushmp.randomusermvvm.datamodels.remote.RandomUserAPI
import com.anushmp.randomusermvvm.datamodels.remote.RandomUserResponse
import com.anushmp.randomusermvvm.repositories.RandomUserRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.await

class RandomUserViewModel(val repo:RandomUserRepository): ViewModel() {

    var retrofit = Networker.getRetrofit()
    var api = retrofit.create(RandomUserAPI::class.java)

    fun FirstTimeApiCall(){

        CoroutineScope(Dispatchers.IO).launch {

           val result = api.getRandomUser().await()
            val response = result.results[0]
            val info = result.info

            var randomuserfromapi:RandomUserEntity = RandomUserEntity(
                response.gender,
                response.name.title,
                response.name.first,
                response.name.last,
                response.location.street.number,
                response.location.street.name,
                response.location.city,
                response.location.state,
                response.location.country,
                response.location.postcode,
                response.location.coordinates.latitude,
                response.location.coordinates.longitude,
                response.location.timezone.offset,
                response.location.timezone.description,
                response.email,
                response.login.uuid,
                response.login.username,
                response.login.password,
                response.login.salt,
                response.login.md5,
                response.login.sha1,
                response.login.sha256,
                response.dob.date,
                response.dob.age,
                response.registered.date,
                response.registered.age,
                response.phone,
                response.cell,
                response.id.name,
                response.id.value,
                response.picture.large,
                response.picture.medium,
                response.picture.thumbnail,
                response.nat,
                info.seed,
                info.results,
                info.page,
                info.version

            )

            repo.addRandomUser(randomuserfromapi)

        }

    }


    fun updaterandomuser(){


        CoroutineScope(Dispatchers.IO).launch {

            val result = api.getRandomUser().await()
            val response = result.results[0]
            val info = result.info

            var randomuserfromapi:RandomUserEntity = RandomUserEntity(
                response.gender,
                response.name.title,
                response.name.first,
                response.name.last,
                response.location.street.number,
                response.location.street.name,
                response.location.city,
                response.location.state,
                response.location.country,
                response.location.postcode,
                response.location.coordinates.latitude,
                response.location.coordinates.longitude,
                response.location.timezone.offset,
                response.location.timezone.description,
                response.email,
                response.login.uuid,
                response.login.username,
                response.login.password,
                response.login.salt,
                response.login.md5,
                response.login.sha1,
                response.login.sha256,
                response.dob.date,
                response.dob.age,
                response.registered.date,
                response.registered.age,
                response.phone,
                response.cell,
                response.id.name,
                response.id.value,
                response.picture.large,
                response.picture.medium,
                response.picture.thumbnail,
                response.nat,
                info.seed,
                info.results,
                info.page,
                info.version

            )

            repo.updateuserholder(randomuserfromapi)

        }





    }

    fun getrandomuser(): LiveData<RandomUserEntity>{

        return repo.getrandomuser()

    }

}