package com.dlka.lastfmnewtracknotifier

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class API (
    @Json(name = "recenttracks")
    var recenttracks: Recenttracks? = null,
    var attr: Map<String, Attr>?
)