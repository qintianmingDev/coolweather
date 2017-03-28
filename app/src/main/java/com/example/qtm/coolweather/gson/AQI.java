package com.example.qtm.coolweather.gson;

/**
 * Created by QTM on 2017/3/27.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
