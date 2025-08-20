package com.vanderlene.mydiario.test;

import java.io.ByteArrayInputStream; 
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.vanderlene.mydiario.controller.myDiarioApp;

/**
 * Clase de test para MyDiarioApp, que simula la entrada y salida de la consola.
 */
public class DiarioServicioTest {

    private final InputStream originalIn = System.in;
    private final PrintStream originalOut = System.out;
    private ByteArrayOutputStream outputStreamCaptor;

    /**
     * Configuración antes de cada prueba.
     * Captura la salida de la consola para poder verificarla.
     */
    @BeforeEach
    public void setUp() {
        outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    /**
     * Limpieza después de cada prueba.
     * Restaura la entrada y salida de la consola a sus valores originales.
     */
    @AfterEach
    public void tearDown() {
        System.setIn(originalIn);
        System.setOut(originalOut);
    }

    /**
     * Prueba el comportamiento de la aplicación al escribir 'salir'.
     */
    @Test
    void testSalirDeLaAplicacion() {
        // Simula la entrada del usuario con la palabra "salir"
        String simulatedInput = "salir\n";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(simulatedInput.getBytes());
        System.setIn(inputStream);

        // Llama al método main de la aplicación
        myDiarioApp.main(new String[]{});

        // Obtiene la salida capturada y la convierte a String
        String consoleOutput = outputStreamCaptor.toString().trim();

        // Verifica que el mensaje de "Aplicación cerrada" esté presente en la salida
        assertTrue(consoleOutput.contains("Aplicación cerrada. ¡Hasta luego!"));
    }
}
