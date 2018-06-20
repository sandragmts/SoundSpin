package com.example.android.soundspin;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;

/**
 * {@link Word} represents a the music category the user wishes to view.
 * It contains main info about each category and sub info about each category.
 */
public class Word {

    /**
     * Main info about each category
     */
    private String mMainView;

    /**
     * Sub info about each category
     */
    private String mDefaultView;


    /**
     * Image resource ID for the word
     */
    private int mImageResourceId;

    /**
     * Create a new Word object.
     *
     * @param mainView    is the main info about a category
     * @param defaultView is the sub info about a main info
     */
    public Word(String mainView, String defaultView) {
        mMainView = mainView;
        mDefaultView = defaultView;
    }

    /**
     * Create a new Word object.
     *
     * @param mainView        shows main info for each activity
     * @param defaultView     gets the sub info for each acitivity
     * @param imageResourceId is the drawable resource ID for the image associated with the word
     */
    public Word(String mainView, String defaultView, int imageResourceId) {
        mMainView = mainView;
        mDefaultView = defaultView;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the default translation of the word.
     */
    public String getMainView() {
        return mMainView;
    }

    /**
     * Get the additional info in each view.
     */
    public String getmDefaultView() {
        return mDefaultView;
    }

    /**
     * Get the image resource ID
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

}
