package com.example.vintedexamenseca.addUser.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.vintedexamenseca.R;
import com.example.vintedexamenseca.addUser.Contract.AddUsuarioContract;
import com.example.vintedexamenseca.beans.Usuario;
import com.example.vintedexamenseca.main_screen;
import com.example.vintedexamenseca.retrofit.APIClient;
import com.google.android.material.textfield.TextInputEditText;

import retrofit2.Call;

public class activity_login extends AppCompatActivity {

    TextInputEditText email, password;
    Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        email = findViewById(R.id.editTextEmail);
        password = findViewById(R.id.editTextPassword);
        loginButton = findViewById(R.id.LoginButton);

        Button btn = findViewById(R.id.LoginButton);
        btn.setOnClickListener(v -> {
            Intent intent = new Intent(v.getContext(), main_screen.class);
            startActivity(intent);


        });

    }



}