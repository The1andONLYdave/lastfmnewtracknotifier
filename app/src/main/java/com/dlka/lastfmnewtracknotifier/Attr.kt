package com.dlka.lastfmnewtracknotifier

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Attr (
    @field:Json(name = "page")
    var page: String? = null,
    @field:Json(name = "total")
    var total: String? = null,
    @field:Json(name = "user")
    var user: String? = null,
    @field:Json(name = "perPage")
    var perPage: String? = null,
    @field:Json(name = "totalPages")
    var totalPages: String? = null
)