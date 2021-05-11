package com.example.vintedexamenseca.beans;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Usuario implements Serializable {

    private static final String EMAIL = "email";
    private static final String PASSWORD = "password";

    @SerializedName(EMAIL)
    private String email;
    @SerializedName(PASSWORD)
    private String password;


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
