package com.example.logonrm.androidrestapp.api;


import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

//Se tiver uma instancia do retro existe, retorna, senão qual é a url base e o conversor
//url wwwgoogle.com
//serviço /xuxu/uol
public class RetrofitClient {

    private static Retrofit retrofit = null;

    public static Retrofit getClient(String baseUrl) {
        if (retrofit==null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
