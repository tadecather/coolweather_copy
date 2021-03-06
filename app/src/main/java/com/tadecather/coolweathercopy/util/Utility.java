package com.tadecather.coolweathercopy.util;

import android.text.TextUtils;
import android.util.Log;

import com.google.gson.Gson;
import com.tadecather.coolweathercopy.db.City;
import com.tadecather.coolweathercopy.db.County;
import com.tadecather.coolweathercopy.db.Province;
import com.tadecather.coolweathercopy.gson.Weather;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by TAD on 7/10/2017.
 * This class is used to parse the JOSN data!
 */

public class Utility {


    //处理省的数据
    public static boolean handleProvinceResponse(String resonpse){
        if(!TextUtils.isEmpty(resonpse)){
            try{
                JSONArray allProvinces = new JSONArray(resonpse);
                for(int i = 0; i < allProvinces.length(); i++){
                    JSONObject provincObject = allProvinces.getJSONObject(i);
                    Province province = new Province();
                    province.setProvinceName(provincObject.getString("name"));
                    province.setProvinceCode(provincObject.getInt("id"));
                    province.save();
                }
            } catch (JSONException e){
                e.printStackTrace();
            }
        }
        return false;
    }


    //处理市的数据
    public static boolean handleCityResponse(String resonpse, int procvinceId){
        if(!TextUtils.isEmpty(resonpse)){
            try{
                JSONArray allCities = new JSONArray(resonpse);
                for(int i = 0; i < allCities.length(); i++){
                    JSONObject cityObject = allCities.getJSONObject(i);
                    City city = new City();
                    city.setCityName(cityObject.getString("name"));
                    city.setCityCode(cityObject.getInt("id"));
                    city.setProvinceId(procvinceId);
                    city.save();
                }
            } catch (JSONException e){
                e.printStackTrace();
            }
        }
        return false;
    }


    //处理县的数据
    public static boolean handleCountyResponse(String resonpse, int cityId){
        if(!TextUtils.isEmpty(resonpse)){
            try{
                JSONArray allCounties = new JSONArray(resonpse);
                for(int i = 0; i < allCounties.length(); i++) {
                    JSONObject countyObject = allCounties.getJSONObject(i);
                    County county = new County();
                    county.setCountyName(countyObject.getString("name"));
                    county.setWeatherId(countyObject.getString("weather_id"));
                    county.setCityId(cityId);
                    Log.d("Unity", "handleCountyResponse: " + county.getCountyName() + county.getId());
                    county.save();
                }
            } catch (JSONException e){
                e.printStackTrace();
            }
        }
        return false;
    }


    //处理天气返回信息

    public static Weather handleWeatherRespone(String respone){
        try{
            JSONObject jsonObject = new JSONObject(respone);
            JSONArray jsonArray = jsonObject.getJSONArray("HeWeather");
            String weatherContent = jsonArray.getJSONObject(0).toString();
            return new Gson().fromJson(weatherContent, Weather.class);
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;

    }
}
