package com.anushmp.randomusermvvm.datamodels.remote

import retrofit2.Call
import retrofit2.http.GET

interface RandomUserAPI {

    @GET("api")
    fun getRandomUser(): Call<RandomUserResponse>

}