package com.dlka.lastfmnewtracknotifier

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Track (
    @Json(name = "artist")
    var artist: Artist? = null,
    @Json(name = "album")
    var album: Album? = null,
    @Json(name = "image")
    var image: List<Image>? = null,
    @Json(name = "streamable")
    var streamable: String? = null,
    @Json(name = "date")
    var date: Date? = null,
    @Json(name = "url")
    var url: String? = null,
    @Json(name = "name")
    var name: String? = null,
    @Json(name = "mbid")
    var mbid: String? = null

)