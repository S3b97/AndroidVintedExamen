package com.example.vintedexamenseca;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.vintedexamenseca.addUser.View.activity_login;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Handler handler = new Handler();
        handler.postDelayed(
                () -> {
                    Intent intent = new Intent(
                            getBaseContext(), activity_login.class);
                    startActivity(intent);
                }
                , 4000
        );



    }
}