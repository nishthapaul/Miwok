package com.example.android.miwok;

/**
 * Created by NISHTHA PAUL on 20-12-2018.
 */

public class Word {
    private static final int NO_IMAGE_PROVIDED = -1;
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId=NO_IMAGE_PROVIDED;
    private int mAudioResourceId;
     // This constructor of 2 parameters is used for phrases activity where there are no images
    public Word(String defaultTranslation,String miwokTranslation,int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation=miwokTranslation;
        mAudioResourceId=audioResourceId;
    }
    // used for the left 3 activities
    public Word(String defaultTranslation,String miwokTranslation,int imageResourceId, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation=miwokTranslation;
        mImageResourceId=imageResourceId;
        mAudioResourceId=audioResourceId;
    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }
    // no need to provide setter methods bcoz we need not chang the translations

    public int getmImageResourceId(){
        return mImageResourceId; }

    public int getmAudioResourceId(){
        return mAudioResourceId; }

    // checks whether image is there or not
    public boolean hasImage(){
        return (mImageResourceId != NO_IMAGE_PROVIDED);
    }
}
