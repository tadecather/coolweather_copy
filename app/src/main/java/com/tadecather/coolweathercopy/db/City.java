package com.tadecather.coolweathercopy.db;

import org.litepal.crud.DataSupport;

/**
 * Created by TAD on 7/10/2017.
 * database table city
 */

public class City extends DataSupport{

    private int id;
    private String cityName;
    private int cityCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }
}
