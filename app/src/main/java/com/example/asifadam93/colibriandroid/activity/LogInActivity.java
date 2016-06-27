package com.example.asifadam93.colibriandroid.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.asifadam93.colibriandroid.R;

public class LogInActivity extends Activity {

    EditText etMail, etPassword;
    Button buttonConnexion;
    Intent intentProductDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etMail = (EditText)findViewById(R.id.editTextEmail);
        etPassword = (EditText)findViewById(R.id.editTextPassword);

        buttonConnexion = (Button)findViewById(R.id.buttonLogIn);

        buttonConnexion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intentProductDisplay = new Intent(LogInActivity.this, ProductDisplayActivity.class);
                startActivity(intentProductDisplay);
            }
        });
    }
}
