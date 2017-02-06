package com.teamandroidangel.iamangelauditor.miwoklanguage;

/**
 * Created by iamangelauditor on 1/28/17.
 */

public class Word {


     //Default translation for the word
    private String mDefaultTranslation;

     //Miwok translation for the word
    private String mMiwokTranslation;

    private int mImageResourcesId;

    //Create a new Word object
    //@param defaultTranslation is the word in a language that the user is already familiar with  (such as English)
    //@param miwokTranslation   is the word in the Miwok language

    public  Word(String defaultTranslation, String miwokTranslation, int imageResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourcesId = imageResourceId;
    }
    public  Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourcesId = 0;
    }

    //Get the default translation of the wo
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }
    //Get the Miwok translation of the word.
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }
    public int getImageResourcesId() {
        return mImageResourcesId;
    }
}