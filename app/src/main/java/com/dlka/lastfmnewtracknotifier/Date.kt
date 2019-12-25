package com.dlka.lastfmnewtracknotifier

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Date (
    @Json(name = "uts")
    var uts: String? = null,
    @Json(name = "#text")
    var text: String? = null
)
