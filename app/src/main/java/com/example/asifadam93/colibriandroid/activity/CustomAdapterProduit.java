package com.example.asifadam93.colibriandroid.activity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.asifadam93.colibriandroid.R;
import com.example.asifadam93.colibriandroid.database.Produit;

import java.util.List;

/**
 * Created by Asif on 27/06/2016.
 */
public class CustomAdapterProduit extends BaseAdapter {

    Context contexte;
    List<Produit> listeProduit;


    public CustomAdapterProduit(Context contexte, List<Produit> listeProduit) {
        this.contexte = contexte;
        this.listeProduit = listeProduit;
    }


    public int getCount() {
        // TODO Auto-generated method stub
        return listeProduit.size();
    }

    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return listeProduit.get(position);
    }

    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    public View getView(final int position, View convertView, final ViewGroup parent) {

        ViewHolder holder = null;
        final LayoutInflater mInflater = (LayoutInflater) contexte.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView == null) {

            convertView = mInflater.inflate(R.layout.custom_produit, parent, false);

            holder = new ViewHolder();
            holder.mNom = (TextView) convertView.findViewById(R.id.textViewNomDestinataire);

            holder.mNom.setFocusable(false);

            convertView.setTag(holder);

        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Produit d = listeProduit.get(position);
        holder.mNom.setText(d.getLibelle());

        return convertView;
    }

    @Override
    public boolean areAllItemsEnabled() {
        return true;
    }

    @Override
    public boolean isEnabled(int position) {
        return true;
    }


    static class ViewHolder {
        TextView mNom;
    }
}
