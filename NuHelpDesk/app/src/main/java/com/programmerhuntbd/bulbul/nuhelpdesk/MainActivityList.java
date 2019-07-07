package com.programmerhuntbd.bulbul.nuhelpdesk;

/**
 * Created by bulbul on 8/31/2018.
 */

public class MainActivityList {
    private String title;
    private String date;
    private String url;


    public MainActivityList() {

    }

    public MainActivityList(String title, String date, String url) {
        this.title = title;
        this.date = date;
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public String getDate() {
        return date;
    }

    public String getUrl() {
        return url;
    }
}
