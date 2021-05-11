package com.example.vintedexamenseca.retrofit;

import com.example.vintedexamenseca.beans.Prenda;
import com.example.vintedexamenseca.beans.Usuario;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface VintedApiInterface {

    @GET("prendas")
    Call<List<Prenda>> getPrendas();


}
