package com.example.vintedexamenseca.lst_prendas.model;

import android.content.Context;

import com.example.vintedexamenseca.beans.Prenda;
import com.example.vintedexamenseca.lst_prendas.contract.LstPrendasContract;
import com.example.vintedexamenseca.retrofit.APIClient;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LstPrendasModel implements LstPrendasContract.Model {
    @Override
    public void getPrendasWS(Context context, OnLstPrendasListener onLstPrendasListener) {
        APIClient apiClient = new APIClient(context);
        final Call<List<Prenda>> peticion = apiClient.getPrendas();

        peticion.enqueue(new Callback<List<Prenda>>() {
            @Override
            public void onResponse(Call<List<Prenda>> call, Response<List<Prenda>> response) {

                if (response != null && response.body() !=null){
                    onLstPrendasListener.resolve(new ArrayList<>(response.body()));
                }

            }

            @Override
            public void onFailure(Call<List<Prenda>> call, Throwable t) {

                t.printStackTrace();
                onLstPrendasListener.reject(t.getLocalizedMessage());

            }
        });
    }
}
