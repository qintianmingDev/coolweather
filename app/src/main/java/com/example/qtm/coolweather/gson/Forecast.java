package com.example.qtm.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by QTM on 2017/3/27.
 */

public class Forecast {
    public String date;
    @SerializedName("tmp")
    public Temperature temperature;
    public class Temperature{
        public String max;
        public String min;
    }
    @SerializedName("cond")
    public More more;
    public class More{
        @SerializedName("txt_d")
        public String info;
    }
}
