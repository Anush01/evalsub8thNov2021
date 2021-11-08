package com.anushmp.randomusermvvm.datamodels.remote

import com.google.gson.annotations.SerializedName

data class Info (

    @SerializedName("seed") val seed : String,
    @SerializedName("results") val results : String,
    @SerializedName("page") val page : String,
    @SerializedName("version") val version : String
)