package com.anushmp.randomusermvvm.datamodels.remote

import com.google.gson.annotations.SerializedName

data class RandomUserResponse (

    @SerializedName("results") val results : List<Results>,
    @SerializedName("info") val info : Info
)