package com.tadecather.coolweathercopy.gson;

/**
 * Created by TAD on 7/24/2017.
 * use for GSON
 */

public class AQI {

    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
