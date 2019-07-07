package com.programmerhuntbd.bulbul.nuhelpdesk.StudyCurriculam.Semester;

/**
 * Created by bulbul on 9/20/2018.
 */

public class SylUpload {
    private String sylName;
    private String sylImageUrl;
    private String mKey;

    public SylUpload() {
    }

    public SylUpload(String sylName, String sylImageUrl) {
        this.sylName = sylName;
        this.sylImageUrl = sylImageUrl;

    }

    public String getSylName() {
        return sylName;
    }

    public void setSylName(String sylName) {
        this.sylName = sylName;
    }

    public String getSylImageUrl() {
        return sylImageUrl;
    }

    public void setSylImageUrl(String sylImageUrl) {
        this.sylImageUrl = sylImageUrl;
    }

    public String getmKey() {
        return mKey;
    }

    public void setmKey(String mKey) {
        this.mKey = mKey;
    }
}
