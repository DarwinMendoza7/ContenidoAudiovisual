package main;

import controlador.Controlador;
import vista.Vista;

public class Main {
    public static void main(String[] args) {
        Vista vista = new Vista();
        Controlador controlador = new Controlador(vista);

        // Mostrar los detalles de cada contenido audiovisual
        controlador.mostrarDetalles();
    }
}