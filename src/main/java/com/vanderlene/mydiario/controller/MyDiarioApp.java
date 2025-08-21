package com.vanderlene.mydiario.controller;

import com.vanderlene.mydiario.model.DiarioServicio;
import com.vanderlene.mydiario.model.Momento;
import com.vanderlene.mydiario.view.ConsoleView;

public class MyDiarioApp {
    private static DiarioServicio diarioServicio = new DiarioServicio();
    private static ConsoleView view = new ConsoleView();

    public static void main(String[] args) {
      
       
diarioServicio.agregarMomento(new Momento("Cumpleaños"));
 
        view.mostrarMensaje("Listado de momentos vividos:");
        view.mostrarMomentos(diarioServicio.obtenerTodosLosMomentos());
    }
}



