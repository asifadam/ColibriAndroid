package com.example.asifadam93.colibriandroid.database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by Asifadam93 on 27/06/2016.
 */
public class DbUser extends MyDBHandler {

    public DbUser(Context context) {
        super(context);
    }

    public boolean isEmailExist(String email, String password) {
        boolean isExist = false;
        int id;

        String selectQueryEmail = "select 1 from utilisateur where mail = '" + email + "'";

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQueryEmail, null);

        if (cursor.getCount() == 0) {
            isExist = false;
        } else {
            String selectQueryPassword = "select 1 from utilisateur where password = '" + password + "'";

            Cursor cursorPassword = db.rawQuery(selectQueryPassword, null);

            if(cursorPassword.getCount() != 0){
                isExist = true;
            }else {
                isExist = false;
            }
        }

        return isExist;
    }


}
