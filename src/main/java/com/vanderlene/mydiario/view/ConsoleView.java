package com.vanderlene.mydiario.view;

import java.util.List;
import java.util.Scanner;

import com.vanderlene.mydiario.model.Emocion;

public class ConsoleView {
    private final Scanner scanner = new Scanner(System.in);

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void mostrarMomentos(List<?> momentos) {
        for (Object momento : momentos) {
            System.out.println(momento);
        }
    }

    public Emocion leerEmocion(String mensaje) {
        mostrarMensaje(mensaje);
        for (Emocion e : Emocion.values()) {
            System.out.println("- " + e);
        }
        String entrada = scanner.nextLine().toUpperCase();
        try {
            return Emocion.valueOf(entrada);
        } catch (IllegalArgumentException e) {
            mostrarMensaje("Emoción no válida, intenta de nuevo.");
            return leerEmocion(mensaje);
        }
    }
}



