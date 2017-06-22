package com.example.logonrm.androidrestapp.api;

import com.example.logonrm.androidrestapp.model.Android;

//acessa o AndroidAPI
public class APIUtils {

    public static final String BASE_URL = "http://www.mocky.io";

    public static AndroidAPI getAndroidAPIVersion() {
        return RetrofitClient.getClient(BASE_URL)
                .create(AndroidAPI.class);
    }

}
