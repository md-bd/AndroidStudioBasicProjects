package com.example.android.quakereport;

public class Earthquake {
    // magnitude of the earthquake
    // private String mMagnitude;
    private double mMagnitude;

    // location of the earthquake
    private String mLocation;

    // date
    // private String mDate;

    /** Time of the earthquake */
    private long mTimeInMilliseconds;

    /**
     * Constructs a new {@link Earthquake} object.
     *
     * @param magnitude is the magnitude (size) of the earthquake
     * @param location is the city location of the earthquake
     * @param timeInMilliseconds is the time in milliseconds (from the Epoch) when the
     *  earthquake happened
     */
    public Earthquake(double magnitude, String location, long timeInMilliseconds) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
    }

    /**
     * Returns the magnitude of the earthquake.
     */
    public double getMagnitude() {
        return mMagnitude;
    }

    public String getLocation() {
        return mLocation;
    }

//    public String getDate() {
//        return mDate;
//    }

    /**
     * Returns the time of the earthquake.
     */
    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }


}
