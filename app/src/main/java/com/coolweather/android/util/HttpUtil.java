package com.coolweather.android.util;

import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;

public class HttpUtil {
    public static void sendOkhttpRequest(String address, Callback callback) {
        //创建客户端实例
        OkHttpClient client = new OkHttpClient();
        //建立请求连接
        Request request = new Request.Builder().url(address).build();
        //根据请求建立回调处理响应
        client.newCall(request).enqueue(callback);

    }
}
