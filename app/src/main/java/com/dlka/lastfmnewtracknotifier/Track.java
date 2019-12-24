
package com.dlka.lastfmnewtracknotifier;

import java.util.List;
import com.squareup.moshi.Json;

public class Track {

    @Json(name = "artist")
    private Artist artist;
    @Json(name = "album")
    private Album album;
    @Json(name = "image")
    private List<Image> image = null;
    @Json(name = "streamable")
    private String streamable;
    @Json(name = "date")
    private Date date;
    @Json(name = "url")
    private String url;
    @Json(name = "name")
    private String name;
    @Json(name = "mbid")
    private String mbid;

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public List<Image> getImage() {
        return image;
    }

    public void setImage(List<Image> image) {
        this.image = image;
    }

    public String getStreamable() {
        return streamable;
    }

    public void setStreamable(String streamable) {
        this.streamable = streamable;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMbid() {
        return mbid;
    }

    public void setMbid(String mbid) {
        this.mbid = mbid;
    }

}
