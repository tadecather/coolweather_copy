package com.tadecather.coolweathercopy.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by TAD on 7/24/2017.
 * Use for GSON
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public  More more;

    public class More{

        @SerializedName("txt")
        public String info;
    }
}
