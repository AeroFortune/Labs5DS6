package com.example.lab5_login;

public class Usuario {

    String cedula;
    String nombre;
    String usuario;
    String password;

    public Usuario(String cedula, String nombre, String usuario, String password) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.usuario = usuario;
        this.password = password;
    }

    public Usuario(){
    }


    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }





}
