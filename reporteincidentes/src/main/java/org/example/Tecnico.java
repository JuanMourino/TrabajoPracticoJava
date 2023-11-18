package org.example;

public class Tecnico {
    int IdTecnico;
    Tupla[] especialidades;
    int[] tiempoResolucion;
    String metodoContacto;
    Boolean Disponible;

    public Tecnico(int idTecnico, String[] capacidades, int[] tiempoResolucion, String metodoContacto, Boolean disponible) {
        IdTecnico = idTecnico;
        this.especialidades = new Tupla[capacidades.length];
        for (int i = 0; i < capacidades.length; i++) {
            this.especialidades[i] = new Tupla(capacidades[i], 0);
        }
        this.tiempoResolucion = tiempoResolucion;
        this.metodoContacto = metodoContacto;
        this.Disponible = true;
    }

    public boolean capacitado(Problema Problema) { // Dado un problema, nos dice si el tecnico esta calificado para resolverlo
        for (int i = 0; i < especialidades.length; i++) { // verifica por cada especialidad del tecnico, si es alguna de las capacitadas a solucionar x problema
            for (int j = 0; j < Problema.capacitadosSolucionar.length; j++) {
                if (Problema.capacitadosSolucionar[j] == especialidades[i].especialidad) {
                    return true;
                }
            }
        }
        return false;
    }

    public int problemasResueltos() { //Devuelve la cantidad total de incidentes resueltos
        int res = 0;
        for (int i = 0; i < especialidades.length; i++) {
            res =+ especialidades[i].incidentesResueltos);
        }
        return res;
    }
    public int problemasResueltosEspecificos(String TipoProblema) { //Devuelve la cantidad de incidentes resueltos en un tipo de problema
        int res = 0;
        for (int i = 0; i < especialidades.length; i++) {
            if (especialidades[i].especialidad == TipoProblema) {
                res = especialidades[i].incidentesResueltos;

            }

        }
        return res;
    }
}



