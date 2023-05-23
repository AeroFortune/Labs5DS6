package com.example.lab5_login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtEmail, txtPassword;

    // Para estos dos ^ a un array completo idk how bro aunque maybe no sea necesario.

    String email = "admin@password.com";
    String password = "password";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.InicializarControles();
    }

    public void InicializarControles(){
        txtEmail = (EditText) findViewById(R.id.txtEmail);
        txtPassword = (EditText) findViewById(R.id.txtPassword);
    }

    public void IniciarSesion(View view) {

        String inputUsername = txtEmail.getText().toString();
        String inputPassword = txtPassword.getText().toString();

        try {
            if (inputPassword.equals(password) && inputUsername.equals(email)){
                // Método para enviar al intent aqui.
                Intent i = new Intent(getApplicationContext(), HubActivity.class);
                startActivity(i);
            } else {
                Toast.makeText(this, "Datos incorrectos!", Toast.LENGTH_SHORT).show();
            }
        } catch (Exception e){
            Toast.makeText(this, "Algo salio mal!", Toast.LENGTH_SHORT).show();
        }
    }

    // TO DO
    // Método para enviar datos del usuario ingresado?
    // Método para idk

}