package com.appprueba.prueba.web.app.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
public class Usuario {

    private String nombre;
    private String apellidos;
    private String email;

    public Usuario(String nombre, String apellidos, String email) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
    }

    public Usuario() {
    }





}
