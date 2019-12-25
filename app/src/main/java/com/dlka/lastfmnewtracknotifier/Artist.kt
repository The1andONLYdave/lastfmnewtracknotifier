package com.dlka.lastfmnewtracknotifier

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Artist (
    @Json(name = "mbid")
    var mbid: String? = null,
    @Json(name = "#text")
    var text: String? = null
)
