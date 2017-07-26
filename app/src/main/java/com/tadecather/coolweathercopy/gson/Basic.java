package com.tadecather.coolweathercopy.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by TAD on 7/24/2017.
 * base GSON 解析天气数据
 */

public class Basic {


    //直接使用注释 使 GSON 数据建立映射关系
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }

}
