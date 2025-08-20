package com.vanderlene.mydiario.controller;

import com.vanderlene.mydiario.view.ConsoleView;

public class myDiarioApp {
    private static ConsoleView view = new ConsoleView();

    public static void main(String[] args) {
        view.mostrarMensaje("Bienvenido a Mi Diario");

        String opcion = "";
        while (!opcion.equalsIgnoreCase("salir")) {
            opcion = view.leerTexto("Escriba 'salir' para cerrar la aplicación: ");
        }

        view.mostrarMensaje("Aplicación cerrada. ¡Hasta luego!");
    }
    
}








