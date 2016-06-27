package com.example.asifadam93.colibriandroid.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.asifadam93.colibriandroid.R;
import com.example.asifadam93.colibriandroid.database.DbProduit;
import com.example.asifadam93.colibriandroid.database.Produit;

import java.util.List;

public class ProductDisplayActivity extends Activity {

    CustomAdapterProduit customAdapterProduit;
    List<Produit> produits;
    DbProduit dbProduit;
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_display);

        dbProduit = new DbProduit(this);

        lv = (ListView) findViewById(R.id.listViewDestinataire);

        produits = dbProduit.getListeDestinataireInternalise(2);

        customAdapterProduit = new CustomAdapterProduit(this, produits);
        lv.setAdapter(customAdapterProduit);
    }
}
