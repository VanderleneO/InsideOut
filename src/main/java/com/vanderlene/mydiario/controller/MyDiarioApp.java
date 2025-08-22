package com.vanderlene.mydiario.controller;

import java.time.LocalDate;

import com.vanderlene.mydiario.model.DiarioServicio;
import com.vanderlene.mydiario.model.Emocion;
import com.vanderlene.mydiario.model.Momento;
import com.vanderlene.mydiario.view.ConsoleView;

public class MyDiarioApp {
    private static ConsoleView view = new ConsoleView();
    private static DiarioServicio diarioServicio = new DiarioServicio();

    public static void main(String[] args) {
        diarioServicio
                .agregarMomento(new Momento("Cumpleaños", "", Emocion.ALEGRIA, LocalDate.now()));
        view.mostrarMensaje("Listado de momentos vividos:");
        view.mostrarMomentos(diarioServicio.obtenerTodosLosMomentos());

    }
}
