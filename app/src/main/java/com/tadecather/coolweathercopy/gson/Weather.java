package com.tadecather.coolweathercopy.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by TAD on 7/24/2017.
 *
 */

public class Weather {
    public String status;

    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
