package com.vanderlene.mydiario.controller;

import java.time.LocalDate;

import com.vanderlene.mydiario.model.DiarioServicio;
import com.vanderlene.mydiario.model.Emocion;
import com.vanderlene.mydiario.model.Momento;
import com.vanderlene.mydiario.view.ConsoleView;

public class MyDiarioApp {
    private static DiarioServicio diarioServicio = new DiarioServicio();
    private static ConsoleView view = new ConsoleView();

    public static void main(String[] args) {
        String titulo = view.leerTexto("Ingrese el título del momento: ");
        String descripcion = view.leerTexto("Ingrese la descripción: ");
        String emocionStr = view.leerTexto("Ingrese la emoción: ");
        Emocion emocion = Emocion.valueOf(emocionStr.toUpperCase());
        LocalDate fechaMomento = view.leerFecha("Ingrese la fecha (dd/MM/yyyy): ");

        Momento momento = new Momento(titulo, descripcion, emocion, fechaMomento);
        diarioServicio.agregarMomento(momento);

        view.mostrarMensaje("Momento agregado correctamente.");
    }
}
