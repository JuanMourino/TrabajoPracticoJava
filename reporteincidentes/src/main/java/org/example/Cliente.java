package org.example;

public class Cliente {
    String cuit;
    String[] servicios;
    String email;

    public Cliente(String cuit, String[] servicios, String email) {
        this.cuit = cuit;
        this.servicios = servicios;
        this.email = email;
    }
}
