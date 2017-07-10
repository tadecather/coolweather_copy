package com.tadecather.coolweathercopy.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by TAD on 7/10/2017.
 * This class is used to connect to the network!
 */

public class HttpUtil {

    //使用 okHttp 连接网络，使用回调函数来处理结果
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }

}
