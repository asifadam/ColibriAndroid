package com.example.asifadam93.colibriandroid.database;

/**
 * Created by Asif on 27/06/2016.
 */
public class Produit {

    private String libelle, date_vente;
    private int quantite;
    private float prix;

    public Produit(String libelle, String date_vente, int quantite, float prix) {
        this.libelle = libelle;
        this.date_vente = date_vente;
        this.quantite = quantite;
        this.prix = prix;
    }

    public Produit() {
        libelle = "";
        date_vente = "";
        quantite = 0;
        prix = 0;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getDate_vente() {
        return date_vente;
    }

    public void setDate_vente(String date_vente) {
        this.date_vente = date_vente;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }
}
