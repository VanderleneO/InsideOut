package com.vanderlene.mydiario.view;

import java.util.List;
import java.util.Scanner;

public class ConsoleView {
    private Scanner scanner = new Scanner(System.in);

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void mostrarMomentos(List<?> momentos) {
        for (Object momento : momentos) {
            System.out.println(momento);
        }
    }
     public int leerEntero(String mensaje) { 
        System.out.print(mensaje);
        return Integer.parseInt(scanner.nextLine());
    }
}

