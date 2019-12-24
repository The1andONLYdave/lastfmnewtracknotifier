
package com.dlka.lastfmnewtracknotifier;

import com.squareup.moshi.Json;

public class API {

    @Json(name = "recenttracks")
    private Recenttracks recenttracks;

    public Recenttracks getRecenttracks() {
        return recenttracks;
    }

    public void setRecenttracks(Recenttracks recenttracks) {
        this.recenttracks = recenttracks;
    }

}
