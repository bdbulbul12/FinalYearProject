package com.programmerhuntbd.bulbul.nuhelpdesk.ExStudent;

/**
 * Created by bulbul on 9/15/2018.
 */

public class ExListItem {

    private String name;
    private String company;
    private String contact;
    private String college;

    public ExListItem() {
    }

    public ExListItem(String name, String company, String contact,String college) {
        this.name = name;
        this.company = company;
        this.contact = contact;
        this.college=college;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }
}
