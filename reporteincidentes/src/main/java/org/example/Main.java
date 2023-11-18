package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    Cliente[] clientes;
    Incidente[] incidentes;
    Tecnico[] tecnicos;

    public Cliente buscarCliente(String cuit) { // Dado un CUIT, devuelve un cliente.
        Cliente res = null;
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i].cuit == cuit) {
                res = clientes[i];
            }
        }
        return res;
    }

    private Tecnico[] tecnicosDisponibles(Problema Problema) { // Dado un problema, devuelve los tecnicos disponibles para este tipo de problema
        Tecnico[] res;
        Tecnico[] temp = new Tecnico[tecnicos.length];
        int disponibles = 0;
        for (int i = 0; i < tecnicos.length; i++) {
            if (tecnicos[i].Disponible == true && tecnicos[i].capacitado(Problema)) {
                disponibles++;
                temp[i] = tecnicos[i];
            }
        }
        res = new Tecnico[disponibles];
        int iteraciones = 0;
        for (int i = 0; i < temp.length; i++) { // no me gusta del todo como quedo esto, buscar mejor metodo de indexar en lista
            if (temp[i] != null) {
                res[iteraciones] = temp[i];
                iteraciones++;
            }
        }
        return res;
    }

    private void asignarTecnico(Incidente Incidente, Tecnico Tecnico) { // Asigna un tecnico a un Incidente
        Incidente.Tecnico = Tecnico;
        Tecnico.NotificarTecnico(); // placeholder, agregar una notificacion
    }

    private Incidentes[] ìncidentesActivos() { //devuelve todos los incidentes activos y sus
        int longitud = 0;
        for (int i = 0; i < incidentes.length; i++) {
            if (incidentes[i].Resuelto == false) {
                longitud++;
            }
        }
        Incidentes[] res = new Incidentes[longitud];
        int iterador = 0;
        for (int i = 0; i < incidentes.length; i++) {
            if (incidentes[i].Resuelto == false) {
                Incidentes[iterador];
                iterador++;
            }
        }
        return res;
    }
    private Tecnico masIncidentesResueltos(){
        Tecnico maximo = tecnicos[0];
        for (int i = 1;i<tecnicos.length;i++){
            if (maximo.problemasResueltos() < tecnicos[i].problemasResueltos()){
                maximo = tecnicos[i];
            }
        }
        return maximo;
    }



}