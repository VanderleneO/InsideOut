package com.vanderlene.mydiario.model;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class DiarioServicioTest {

    @Test
    void testObtenerTodosLosMomentos() {

        DiarioServicio diario = new DiarioServicio();

        Momento momento1 = new Momento("Cumpleaños", "en la playa", Emocion.ALEGRIA, LocalDate.now());
        Momento momento2 = new Momento("Cumpleaños", "en el parque", Emocion.NOSTALGIA, LocalDate.now());

        diario.agregarMomento(momento1);
        diario.agregarMomento(momento2);

        List<Momento> momentosObtenidos = diario.obtenerTodosLosMomentos();

        assertEquals(2, momentosObtenidos.size(), "La lista debe tener 2 momentos.");
        assertTrue(momentosObtenidos.contains(momento1), "La lista debe contener el momento 1.");
        assertTrue(momentosObtenidos.contains(momento2), "La lista debe contener el momento 2.");
    }
}