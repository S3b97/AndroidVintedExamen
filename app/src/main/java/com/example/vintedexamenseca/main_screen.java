package com.example.vintedexamenseca;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.vintedexamenseca.lst_prendas.presenter.LstPrendasPresenter;
import com.example.vintedexamenseca.lst_prendas.view.LstPrendasView;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;

public class main_screen extends AppCompatActivity{
    private RecyclerView recycler;
    private LstPrendasPresenter lstPrendasPresenter;
    private RecyclerView.LayoutManager lManager;
    public static final String CATEGORY = "Category";

    public Button btnVerTodo;
    public ChipGroup chipGroup;
    public Chip chip;
    public Chip chip1;
    public Chip chip2;
    //public FloatingActionButton fab;
    public TextView textViewCategorias;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);
        initComponents();

        Button btn = findViewById(R.id.btnVerTodo);
        btn.setOnClickListener(v -> {
            Intent intent = new Intent(v.getContext(), LstPrendasView.class);
            startActivity(intent);

        });

    }


    private void initComponents(){
        btnVerTodo = findViewById(R.id.btnVerTodo);
        chipGroup = findViewById(R.id.chipGroup);
        chip = findViewById(R.id.chip);
        chip1 = findViewById(R.id.chip1);
        chip2 = findViewById(R.id.chip2);
        textViewCategorias = findViewById(R.id.textViewCategorias);
        //fab = (FloatingActionButton) findViewById(R.id.fab);
    }


 }