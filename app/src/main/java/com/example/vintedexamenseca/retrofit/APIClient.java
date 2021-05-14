package com.example.vintedexamenseca.retrofit;

import android.content.Context;

import com.example.vintedexamenseca.beans.Prenda;
import com.example.vintedexamenseca.beans.Usuario;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;

public class APIClient {

    private Retrofit retrofit;
    private Context context;
    private Usuario usuario;

    private static final String BASE_URL = "http://192.168.1.40:8080/";


    public APIClient(Context context){

        this.context = context;

        retrofit =  new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

    }

        public Call<List<Prenda>> getPrendas(){

        VintedApiInterface service = retrofit.create(VintedApiInterface.class);
        return service.getPrendas();

    }



}
