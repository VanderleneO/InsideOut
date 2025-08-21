package com.vanderlene.mydiario.controller;

import java.time.LocalDate;

import com.vanderlene.mydiario.model.DiarioServicio;
import com.vanderlene.mydiario.view.ConsoleView;

public class MyDiarioApp {
        private static DiarioServicio diarioServicio = new DiarioServicio();
        private static ConsoleView view = new ConsoleView();

        public static void main(String[] args) {

                LocalDate fechaFiltro = view.leerFecha("Ingrese la fecha a filtrar (dd/MM/yyyy): ");
                view.mostrarMensaje("Momentos en la fecha " + fechaFiltro + ":");
                view.mostrarMomentos(diarioServicio.filtrarPorFecha(fechaFiltro));
        }
}
