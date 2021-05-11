package com.example.vintedexamenseca.beans;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Prenda implements Serializable {

    private static final String NOM_PRENDA = "nom_prenda";
    private static final String MARCA = "marca";
    private static final String PRECIO = "precio";
    private static final String TALLA = "talla";
    private static final String DESCRIPCION = "descripcion";
    private static final String CATEGORIA = "categoria";


    @SerializedName(NOM_PRENDA)
    private String nom_prenda;
    @SerializedName(PRECIO)
    private int precio;
    @SerializedName(MARCA)
    private String marca;
    @SerializedName(TALLA)
    private String talla;
    @SerializedName(DESCRIPCION)
    private String descripcion;
    @SerializedName(CATEGORIA)
    private String categoria;


    public String getNom_prenda() {
        return nom_prenda;
    }

    public void setNom_prenda(String nom_prenda) {
        this.nom_prenda = nom_prenda;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
