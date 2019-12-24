
package com.dlka.lastfmnewtracknotifier;

import com.squareup.moshi.Json;

public class Artist {

    @Json(name = "mbid")
    private String mbid;
    @Json(name = "#text")
    private String text;

    public String getMbid() {
        return mbid;
    }

    public void setMbid(String mbid) {
        this.mbid = mbid;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
