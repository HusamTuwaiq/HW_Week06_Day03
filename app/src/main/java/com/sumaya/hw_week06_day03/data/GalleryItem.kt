package com.sumaya.hw_week06_day03.data

import com.google.gson.annotations.SerializedName

data class GalleryItem(
    var title: String  ,
    @SerializedName("url_s") var url: String
)

