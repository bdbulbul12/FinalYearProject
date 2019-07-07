package com.programmerhuntbd.bulbul.nuhelpdesk.ExStudent;

/**
 * Created by bulbul on 9/6/2018.
 */
import com.google.firebase.database.Exclude;

/**
 * Created by bulbul on 9/5/2018.
 */
public class Upload {
    private String mName;
    private String mCompany;
    private String mMobile;
    private String mImageUrl;
    private String mCollege;
    private String mKey;

    public Upload() {
        //empty constructor needed
    }

    public Upload( String name,String company,String mobile,String college,String imageUrl2) {
        if (name.trim().equals("")) {
            name = "No Name";
        }

        mName = name;
        mImageUrl = imageUrl2;
        mCompany=company;
        mMobile=mobile;
        mCollege=college;
    }

    public String getmCollege() {
        return mCollege;
    }

    public void setmCollege(String mCollege) {
        this.mCollege = mCollege;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getmCompany() {
        return mCompany;
    }

    public void setmCompany(String mCompany) {
        this.mCompany = mCompany;
    }

    public String getmMobile() {
        return mMobile;
    }

    public void setmMobile(String mMobile) {
        this.mMobile = mMobile;
    }

    public String getImageUrl2() {
        return mImageUrl;
    }

    public void setImageUrl(String imageUrl) {
        mImageUrl = imageUrl;
    }

    @Exclude
    public String getKey() {
        return mKey;
    }

    @Exclude
    public void setKey(String key) {
        mKey = key;
    }
}