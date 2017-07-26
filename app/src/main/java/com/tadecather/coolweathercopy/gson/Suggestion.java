package com.tadecather.coolweathercopy.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by TAD on 7/24/2017.
 * use for Gson
 */

public class Suggestion {

    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    public class Comfort{

        @SerializedName("txt")
        public String info;
    }

    public class CarWash{

        @SerializedName("txt")
        public String info;
    }

    public class Sport{

        @SerializedName("txt")
        public String info;
    }


}
