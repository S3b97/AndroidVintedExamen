package com.example.vintedexamenseca.lst_prendas.contract;

import android.content.Context;

import com.example.vintedexamenseca.beans.Prenda;

import java.util.ArrayList;

public interface LstPrendasContract {

    interface View{
        void success(ArrayList<Prenda> lstPrendas);
        void error(String message);
    }

    interface Presenter{
        void getPrendas(Context context);
    }

    interface Model{
        void getPrendasWS(Context context, OnLstPrendasListener onLstPrendasListener);

        interface OnLstPrendasListener{
            void resolve(ArrayList<Prenda> prendas);
            void reject (String error);
        }
    }

}
