package com.anushmp.randomusermvvm.datamodels.remote

import com.google.gson.annotations.SerializedName

data class Street (

    @SerializedName("number") val number : String,
    @SerializedName("name") val name : String
)