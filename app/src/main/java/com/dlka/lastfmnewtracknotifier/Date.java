
package com.dlka.lastfmnewtracknotifier;

import com.squareup.moshi.Json;

public class Date {

    @Json(name = "uts")
    private String uts;
    @Json(name = "#text")
    private String text;

    public String getUts() {
        return uts;
    }

    public void setUts(String uts) {
        this.uts = uts;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
