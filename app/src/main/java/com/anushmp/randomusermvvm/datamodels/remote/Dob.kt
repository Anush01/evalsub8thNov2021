package com.anushmp.randomusermvvm.datamodels.remote

import com.google.gson.annotations.SerializedName

data class Dob (

    @SerializedName("date") val date : String,
    @SerializedName("age") val age : String
)