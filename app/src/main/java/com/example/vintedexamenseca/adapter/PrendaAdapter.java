package com.example.vintedexamenseca.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.vintedexamenseca.R;
import com.example.vintedexamenseca.beans.Prenda;

import java.util.ArrayList;

public class PrendaAdapter extends RecyclerView.Adapter<PrendaAdapter.PrendaViewHolder> {

    private ArrayList<Prenda> lstPrenda;

    public static class PrendaViewHolder extends RecyclerView.ViewHolder{

    public TextView nom_prenda;
    public TextView precio;
    public TextView marca;
    public CardView cardView;

    public PrendaViewHolder(View v){
        super(v);
        nom_prenda = v.findViewById(R.id.txtNombrePrenda);
        precio = v.findViewById(R.id.txtPrecio);
        marca = v.findViewById(R.id.txtMarca);
        cardView = v.findViewById(R.id.Card_View_Prendas);
    }
    }


    public PrendaAdapter(ArrayList<Prenda> lstPrenda){this.lstPrenda = lstPrenda;}

    @NonNull
    @Override
    public PrendaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_productos, parent,false);

        return new PrendaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull PrendaViewHolder holder, int position) {

        final  Prenda prenda = lstPrenda.get(position);
        holder.nom_prenda.setText(prenda.getNom_prenda());
        holder.marca.setText(prenda.getMarca());
        holder.precio.setText(String.valueOf(prenda.getPrecio()));

        //Detalle de la prenda
        holder.cardView.setOnClickListener(v -> {




        });


    }

    @Override
    public int getItemCount() {
        return lstPrenda.size();
    }
}
