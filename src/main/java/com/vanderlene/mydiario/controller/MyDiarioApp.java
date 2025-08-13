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
        diarioServicio.agregarMomento(
            new Momento("Cumpleaños", "Fui a una fiesta", Emocion.ALEGRIA, LocalDate.now())
        );

        view.mostrarMensaje("Listado de momentos vividos:");
        view.mostrarMomentos(diarioServicio.obtenerTodosLosMomentos());

        int id = view.leerEntero("Ingrese el ID del momento a eliminar: ");
        if (diarioServicio.eliminarMomentoPorId(id)) {
            view.mostrarMensaje("Momento eliminado.");
        } else {
            view.mostrarMensaje("No se encontró un momento con ese ID.");
        }

       
        view.mostrarMensaje("Momentos después de eliminar:");
        view.mostrarMomentos(diarioServicio.obtenerTodosLosMomentos());
    }
}








