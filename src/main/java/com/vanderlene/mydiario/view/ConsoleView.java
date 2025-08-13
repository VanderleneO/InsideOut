package com.vanderlene.mydiario.view;

import java.util.List;

public class ConsoleView {
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void mostrarMomentos(List<?> momentos) {
        for (Object momento : momentos) {
            System.out.println(momento);
        }
    }
}

