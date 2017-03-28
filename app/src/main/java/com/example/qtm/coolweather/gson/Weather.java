package com.example.qtm.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by QTM on 2017/3/27.
 */

public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Forecast forecast;
    public Now now;
    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
