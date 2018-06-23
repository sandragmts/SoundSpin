package com.example.android.soundspin;

/**
 * {@link SongList} represents a the music category the user wishes to view.
 * It contains main info about each category and sub info about each category.
 */
public class SongList {

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
     * Create a new SongList object.
     *
     * @param mainView    is the main info about a category
     * @param defaultView is the sub info about a main info
     */
    public SongList(String mainView, String defaultView) {
        mMainView = mainView;
        mDefaultView = defaultView;
    }

    /**
     * Create a new SongList object.
     *
     * @param mainView        shows main info for each activity
     * @param defaultView     gets the sub info for each acitivity
     * @param imageResourceId is the drawable resource ID for the image associated with the word
     */
    public SongList(String mainView, String defaultView, int imageResourceId) {
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
