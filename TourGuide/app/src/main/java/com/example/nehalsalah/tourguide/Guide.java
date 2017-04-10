package com.example.nehalsalah.tourguide;

/**
 * {@link Guide} represents a historical monument that the tourist wants to see.
 * It contains a Historical Monument, Infromation, and an image for that guide.
 */
public class Guide {

    /**
     * Historical Monument for the tour guide
     */
    final private String mHistoricalMonument;

    /**
     * Infromation for that Historical Monument
     */
    final private String mInfromation;

    /**
     * Address for that Historical Monument
     */
    final private String mAddress;

    /**
     * Image resource ID for the guide
     */
    final private int mImageResourceId;

    /**
     * Create a new guide object.
     *
     * @param HistoricalMonument is the Historical Monument for the tour guide
     * @param Infromation        is the Infromation for that Historical Monument
     * @param Address            is Address for that Historical Monument
     * @param ImageResourceId    is the resource ID for the Image file associated with this guide
     */
    public Guide(String HistoricalMonument, String Infromation, String Address, int ImageResourceId) {
        mHistoricalMonument = HistoricalMonument;
        mInfromation = Infromation;
        mAddress = Address;
        mImageResourceId = ImageResourceId;
    }

    /**
     * Get the default translation of the word.
     */
    public String getMonument() {
        return mHistoricalMonument;
    }

    /**
     * Get the Infromation for that Historical Monument.
     */
    public String getInfromation() {
        return mInfromation;
    }

    /**
     * Get the Address for that Historical Monument.
     */
    public String getAddress() {
        return mAddress;
    }

    /**
     * Return the image resource ID of the guide.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

}