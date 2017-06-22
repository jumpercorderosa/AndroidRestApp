package com.example.logonrm.androidrestapp.api;

import com.example.logonrm.androidrestapp.model.ResponseAndroid;

import retrofit2.Call;
import retrofit2.http.GET;

public interface AndroidAPI {


    //chamada do serviço
    @GET("v2/58af1fb21000001e1cc94547")

    //uma forma de ter o retorno
    Call<ResponseAndroid> getVersoes();


}
