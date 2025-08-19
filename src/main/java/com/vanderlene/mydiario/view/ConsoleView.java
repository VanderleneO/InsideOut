package com.vanderlene.mydiario.view;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Scanner;

import com.vanderlene.mydiario.model.Emocion; // Asegúrate de tener esta importación

public class ConsoleView {
    private final Scanner scanner = new Scanner(System.in);
    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void mostrarMomentos(List<?> momentos) {
        for (Object momento : momentos) {
            System.out.println(momento);
        }
    }

    // MÉTODO QUE FALTA: lee una emoción del usuario
    public Emocion leerEmocion(String mensaje) {
        mostrarMensaje(mensaje);
        while (true) {
            String input = scanner.nextLine().trim().toUpperCase();
            try {
                return Emocion.valueOf(input);
            } catch (IllegalArgumentException e) {
                mostrarMensaje("Emoción no válida. Por favor, intente de nuevo.");
                mostrarMensaje("Emociones válidas: " + java.util.Arrays.toString(Emocion.values()));
            }
        }
    }

    // MÉTODO QUE FALTA: lee una fecha del usuario
    public LocalDate leerFecha(String mensaje) {
        mostrarMensaje(mensaje);
        while (true) {
            String input = scanner.nextLine().trim();
            try {
                return LocalDate.parse(input, formatter);
            } catch (DateTimeParseException e) {
                mostrarMensaje("Formato de fecha no válido. Por favor, use el formato dd/MM/yyyy.");
            }
        }
    }
}

