package com.example.android.infinitytechapp;

public class Info {
    private String mName;
    private String mPositionName;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;
    public Info (String nName,String positionName, int imageResourceId){
        mName = nName;
        mPositionName= positionName;
        mImageResourceId=imageResourceId;

    }

    public String getmName (){
        return mName;
    }
    public String getmPositionName (){
        return mPositionName;
    }
    public int getImageResourceId() {
        return mImageResourceId;
    }
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
