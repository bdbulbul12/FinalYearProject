package com.programmerhuntbd.bulbul.nuhelpdesk.AllResult;

/**
 * Created by bulbul on 9/22/2018.
 */

public class StudentResultListItem {

    private String name,reg,colllegeName,session,itcs,pl,plPractical,physics,math,english;

    public StudentResultListItem() {

    }

    public StudentResultListItem(String name, String reg, String colllegeName, String session) {
        this.name = name;
        this.reg = reg;
        this.colllegeName = colllegeName;
        this.session = session;
    }

    public StudentResultListItem(String name, String reg, String colllegeName, String session, String itcs, String pl, String plPractical, String physics, String math, String english) {
        this.name = name;
        this.reg = reg;
        this.colllegeName = colllegeName;
        this.session = session;
        this.itcs = itcs;
        this.pl = pl;
        this.plPractical = plPractical;
        this.physics = physics;
        this.math = math;
        this.english = english;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReg() {
        return reg;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public String getColllegeName() {
        return colllegeName;
    }

    public void setColllegeName(String colllegeName) {
        this.colllegeName = colllegeName;
    }

    public String getSession() {
        return session;
    }

    public void setSession(String session) {
        this.session = session;
    }

    public String getItcs() {
        return itcs;
    }

    public void setItcs(String itcs) {
        this.itcs = itcs;
    }

    public String getPl() {
        return pl;
    }

    public void setPl(String pl) {
        this.pl = pl;
    }

    public String getPlPractical() {
        return plPractical;
    }

    public void setPlPractical(String plPractical) {
        this.plPractical = plPractical;
    }

    public String getPhysics() {
        return physics;
    }

    public void setPhysics(String physics) {
        this.physics = physics;
    }

    public String getMath() {
        return math;
    }

    public void setMath(String math) {
        this.math = math;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }
}
