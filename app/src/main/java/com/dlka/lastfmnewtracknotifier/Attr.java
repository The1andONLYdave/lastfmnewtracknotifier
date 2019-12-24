
package com.dlka.lastfmnewtracknotifier;

import com.squareup.moshi.Json;

public class Attr {

    @Json(name = "page")
    private String page;
    @Json(name = "total")
    private String total;
    @Json(name = "user")
    private String user;
    @Json(name = "perPage")
    private String perPage;
    @Json(name = "totalPages")
    private String totalPages;

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPerPage() {
        return perPage;
    }

    public void setPerPage(String perPage) {
        this.perPage = perPage;
    }

    public String getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(String totalPages) {
        this.totalPages = totalPages;
    }

}
