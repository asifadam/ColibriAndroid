package com.example.asifadam93.colibriandroid.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.asifadam93.colibriandroid.R;
import com.example.asifadam93.colibriandroid.database.DbUser;

public class LogInActivity extends Activity {

    EditText etMail, etPassword;
    String eMail, password;
    Button buttonConnexion;
    Intent intentProductDisplay;
    DbUser dbUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        dbUser = new DbUser(this);

        etMail = (EditText) findViewById(R.id.editTextEmail);
        etPassword = (EditText) findViewById(R.id.editTextPassword);

        buttonConnexion = (Button) findViewById(R.id.buttonLogIn);

        buttonConnexion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                eMail = etMail.getText().toString();
                password = etPassword.getText().toString();

                boolean isIdOk = dbUser.isEmailExist(eMail, password);

                if (isIdOk) {
                    intentProductDisplay = new Intent(LogInActivity.this, ProductDisplayActivity.class);
                    startActivity(intentProductDisplay);
                } else {
                    Toast.makeText(getApplicationContext(),"Login failed",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
