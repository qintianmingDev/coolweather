package com.example.qtm.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by QTM on 2017/3/27.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;
    public class More{
        @SerializedName("txt")
        public String info;
    }
}
