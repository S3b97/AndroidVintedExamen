package com.example.vintedexamenseca.lst_prendas.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import com.example.vintedexamenseca.R;
import com.example.vintedexamenseca.adapter.PrendaAdapter;
import com.example.vintedexamenseca.beans.Prenda;

public class LstPrendasView extends AppCompatActivity {


    private Prenda prenda;
    private RecyclerView recycler;
    private RecyclerView.LayoutManager lManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lst_recycler_prendas);


        Bundle bundle = getIntent().getExtras();
        prenda = (Prenda) bundle.getSerializable("prenda");

        initComponents();
        addDetail();
    }

    private void addDetail(){
        lManager=new LinearLayoutManager(this);
        recycler.setLayoutManager(lManager);

    }


    private void initComponents(){
        recycler=findViewById(R.id.recyclerPrendas);
    }
}