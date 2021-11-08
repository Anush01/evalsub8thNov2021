package com.anushmp.randomusermvvm.datamodels.remote

import com.google.gson.annotations.SerializedName

data class Info (

    @SerializedName("seed") val seed : String,
    @SerializedName("results") val results : Int,
    @SerializedName("page") val page : Int,
    @SerializedName("version") val version : Double
)