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
        
        // --- Funcionalidad de filtrado por emoción ---
        Emocion emocion = view.leerEmocion("Ingrese la emoción para filtrar:");
        view.mostrarMensaje("Momentos con emoción " + emocion + ":");
        view.mostrarMomentos(diarioServicio.filtrarPorEmocion(emocion));
        
        System.out.println("--------------------");

        // --- Funcionalidad de filtrado por fecha ---
        LocalDate fechaFiltro = view.leerFecha("Ingrese la fecha a filtrar (dd/MM/yyyy):");
        view.mostrarMensaje("Momentos en la fecha " + fechaFiltro + ":");
        view.mostrarMomentos(diarioServicio.filtrarPorFecha(fechaFiltro));
    }
}






