package com.example.asifadam93.colibriandroid.database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Asif on 27/06/2016.
 */
public class DbProduit extends MyDBHandler {

    public DbProduit(Context context) {
        super(context);
    }

    public List<Produit> getListeDestinataireInternalise(int id_user) {

        List<Produit> historiqueList = new ArrayList<Produit>();
        // Select All Query
        String selectQuery = "select * from stockage_magasin where id_utilisateur = "+id_user;

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                Produit produit = new Produit();

                produit.setLibelle(cursor.getString(1));
                produit.setQuantite(cursor.getInt(2));
                produit.setDate_vente(cursor.getString(3));
                produit.setPrix(cursor.getInt(4));

                Log.i("bdd",cursor.getString(1));

                historiqueList.add(produit);

            } while (cursor.moveToNext());
        } else {
            historiqueList.clear();
        }

        // return contact list
        db.close();
        return historiqueList;
    }
}
