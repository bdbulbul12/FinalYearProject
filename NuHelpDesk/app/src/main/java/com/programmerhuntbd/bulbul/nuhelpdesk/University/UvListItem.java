package com.programmerhuntbd.bulbul.nuhelpdesk.University;

/**
 * Created by bulbul on 7/17/2018.
 */

public class UvListItem {
    private String head;
    private String collegeCode;
    private String contact;
    private String url;

    public UvListItem(){

    }

    public UvListItem(String head, String collegeCode, String contact, String url) {
        this.head = head;
        this.collegeCode = collegeCode;
        this.contact = contact;
        this.url = url;
    }

    public String getHead() {
        return head;
    }

    public String getCollegeCode() {
        return collegeCode;
    }

    public String getContact() {
        return contact;
    }

    public String getUrl() {
        return url;
    }
}
