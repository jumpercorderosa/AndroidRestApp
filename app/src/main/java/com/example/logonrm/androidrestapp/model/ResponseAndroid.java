package com.example.logonrm.androidrestapp.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ResponseAndroid {

    //Isso se chama anotação
    //Na aplicação fica androids, no serviço chamarei de android
    @SerializedName("android")
    private List<Android> androids;

    public List<Android> getAndroids() {
        return androids;
    }

    public void setAndroids(List<Android> androids) {
        this.androids = androids;
    }
}
