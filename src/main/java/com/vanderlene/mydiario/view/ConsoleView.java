package com.vanderlene.mydiario.view;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Scanner;

import com.vanderlene.mydiario.model.Emocion;

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

    public LocalDate leerFecha(String mensaje) {
        while (true) {
            System.out.print(mensaje);
            String fechaStr = scanner.nextLine();
            try {
                return LocalDate.parse(fechaStr, formatter);
            } catch (DateTimeParseException e) {
                System.out.println("Formato inválido. Use dd/MM/yyyy");
            }
        }
    }

    public String leerTexto(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextLine();
    }
}





