package com.anushmp.randomusermvvm.datamodels.remote

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Networker {

    companion object{

        val base_url = "https://randomuser.me/"

        fun getRetrofit(): Retrofit{

            return Retrofit.Builder()
                .baseUrl(base_url)
                .addConverterFactory(GsonConverterFactory.create())
                .client(OkHttpClient.Builder().build())
                .build()

        }



    }

}