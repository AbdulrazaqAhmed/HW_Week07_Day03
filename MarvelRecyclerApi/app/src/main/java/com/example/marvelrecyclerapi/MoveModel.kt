package com.example.marvelrecyclerapi


import com.google.gson.annotations.SerializedName

data class MoveModel(
    @SerializedName("bio")
    val bio: String,
    @SerializedName("createdby")
    val createdby: String,
    @SerializedName("firstappearance")
    val firstappearance: String,
    @SerializedName("imageurl")
    val imageurl: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("publisher")
    val publisher: String,
    @SerializedName("realname")
    val realname: String,
    @SerializedName("team")
    val team: String
)