package com.tadecather.coolweathercopy.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by TAD on 7/24/2017.
 *
 */

public class Forecast {
    public String data;

    @SerializedName("tnp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature{

        public String max;

        public String min;

    }

    public class More{

        @SerializedName("txt_d")
        public String info;
    }

}