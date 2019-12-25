package com.dlka.lastfmnewtracknotifier

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass


@JsonClass(generateAdapter = true)
data class Image (
    @Json(name = "size")
    var size: String? = null,
    @Json(name = "#text")
    var text: String? = null
)
