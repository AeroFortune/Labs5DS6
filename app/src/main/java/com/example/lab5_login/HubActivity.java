package com.example.lab5_login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hub);
    }

    public void MenuRegistros(View v){
        Intent i = new Intent(getApplicationContext(), RegistroActivity.class);
        startActivity(i);
    }

    public void MenuInformacion(View v){
        Intent i = new Intent(getApplicationContext(), LabInfoActivity.class);
        startActivity(i);
    }

}