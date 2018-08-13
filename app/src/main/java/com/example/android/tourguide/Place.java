package com.example.android.tourguide;

/**
 * Created by euenia on 2018-08-01.
 */

public class Place {
    private int mName;
    private int mLocalization;
    private int mDescription;
    private int mImage;

    /**
     * Create a new Place object.
     */
    public Place(int name, int localization, int image, int description) {
        /* The following 3 items are shown on the fragments screen */
        mName = name;
        mLocalization = localization;
        mImage = image;
        /* Additional item which is shown on the details screen */
        mDescription = description;
    }

    /**
     * Get the int resource ID for the name of the place.
     */
    public int getName() {
        return mName;
    }

    /**
     * Get the int resource ID for the localization of the place.
     */
    public int getLocalization() {
        return mLocalization;
    }

    /**
     * Return the image resource ID of the word.
     */
    public int getImage() {
        return mImage;
    }

    /**
     * Return the audio resource ID of the word.
     */
    public int getDescription() {
        return mDescription;
    }
}
