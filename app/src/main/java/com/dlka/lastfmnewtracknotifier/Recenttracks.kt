package com.dlka.lastfmnewtracknotifier

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Recenttracks (
    @Json(name = "@attr")
    var attr: Attr? = null,
    @Json(name = "track")
    var track: List<Track>? = null
)