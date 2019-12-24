
package com.dlka.lastfmnewtracknotifier;

import java.util.List;
import com.squareup.moshi.Json;

public class Recenttracks {

    @Json(name = "@attr")
    private Attr attr;
    @Json(name = "track")
    private List<Track> track = null;

    public Attr getAttr() {
        return attr;
    }

    public void setAttr(Attr attr) {
        this.attr = attr;
    }

    public List<Track> getTrack() {
        return track;
    }

    public void setTrack(List<Track> track) {
        this.track = track;
    }

}
