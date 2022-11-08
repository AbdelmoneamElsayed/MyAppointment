package com.example.myappointment;

public class CandroidModel {
    private int picture;
    private String url;
    private int versionName;

    public CandroidModel(int picture, int versionName, String url) {
        this.picture = picture;
        this.url = url;
        this.versionName = versionName;
    }

    public int getPicture() {
        return picture;
    }

    public String getUrl() {
        return url;
    }

    public int getVersionName() {
        return versionName;
    }
}
