package com.example.vintedexamenseca.lst_prendas.presenter;

import android.content.Context;

import com.example.vintedexamenseca.beans.Prenda;
import com.example.vintedexamenseca.lst_prendas.contract.LstPrendasContract;
import com.example.vintedexamenseca.lst_prendas.model.LstPrendasModel;

import java.util.ArrayList;

public class LstPrendasPresenter implements LstPrendasContract.Presenter {

    private LstPrendasModel lstPrendasModel;
    private LstPrendasContract.View vista;

    public LstPrendasPresenter(LstPrendasContract.View vista){
        this.vista = vista;
        this.lstPrendasModel= new LstPrendasModel();

    }


    @Override
    public void getPrendas(Context context) {

        lstPrendasModel.getPrendasWS(context, new LstPrendasContract.Model.OnLstPrendasListener() {
            @Override
            public void resolve(ArrayList<Prenda> prendas) {vista.success(prendas);

            }

            @Override
            public void reject(String error) {

                vista.error("Problema al traer los datos");

            }
        });

    }
}
