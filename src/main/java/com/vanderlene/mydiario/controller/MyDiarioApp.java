package com.vanderlene.mydiario.controller;

import java.time.LocalDate;

import com.vanderlene.mydiario.model.*;
import com.vanderlene.mydiario.view.ConsoleView;

public class MyDiarioApp {
    private static DiarioServicio diarioServicio = new DiarioServicio();
    private static ConsoleView view = new ConsoleView();

    public static void main(String[] args) {
        diarioServicio.agregarMomento(
            new Momento("Cumpleaños", "Fui a una fiesta", Emocion.ALEGRIA, LocalDate.now())
        );
 Emocion emocion = view.leerEmocion("Ingrese la emoción para filtrar:");
        view.mostrarMensaje("Momentos con emoción " + emocion + ":");
        view.mostrarMomentos(diarioServicio.filtrarPorEmocion(emocion));
    }
}








