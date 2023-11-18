package org.example;

public class Incidente{
    int idIncidente;
    String descripcion;
    Problema Problema;
    Boolean Resuelto;
    int TiempoResolucion;

    Cliente Cliente;
    Tecnico Tecnico;

    public Incidente(int idIncidente, String descripcion, org.example.Problema problema, int tiempoResolucion, org.example.Cliente cliente) {
        this.idIncidente = idIncidente;
        this.descripcion = descripcion;
        Problema = problema;
        Resuelto = false;
        TiempoResolucion = tiempoResolucion;
        Cliente = cliente;
        Tecnico = null;
    }


    public void resolver(){
        Resuelto = true;
        Cliente.notificarCliente(); // placeholder, a ser cambiado a necesidad.
    }
}
