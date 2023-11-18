package org.example;

public class Problema {
    String tipoProblema;
    String[] capacitadosSolucionar;
    int TiempoResolucionMaximo;

    public Problema(String tipoProblema, String[] capacitadosSolucionar, int tiempoResolucionMaximo) {
        this.tipoProblema = tipoProblema;
        this.capacitadosSolucionar = capacitadosSolucionar;
        TiempoResolucionMaximo = tiempoResolucionMaximo;
    }
}
