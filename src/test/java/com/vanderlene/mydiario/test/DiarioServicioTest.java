package com.vanderlene.mydiario.test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.vanderlene.mydiario.model.DiarioServicio;
import com.vanderlene.mydiario.model.Emocion;
import com.vanderlene.mydiario.model.Momento;

public class DiarioServicioTest {

    private DiarioServicio diarioServicio;
    private Momento momento1, momento2, momento3;

    @BeforeEach
    void setUp() {
        diarioServicio = new DiarioServicio();

        momento1 = new Momento("Día de la graduación", "Me gradué hoy", Emocion.ALEGRIA, LocalDate.of(2023, 10, 26));
        momento2 = new Momento("Me enfermé", "Me duele la garganta", Emocion.TRISTEZA, LocalDate.of(2023, 10, 27));
        momento3 = new Momento("Visita a un amigo", "Visité a un amigo hoy", Emocion.ALEGRIA,
                LocalDate.of(2023, 10, 28));

        diarioServicio.agregarMomento(momento1);
        diarioServicio.agregarMomento(momento2);
        diarioServicio.agregarMomento(momento3);
    }

    @Test
    void testEliminarMomentoExistente() {
        assertEquals(3, diarioServicio.obtenerTodosLosMomentos().size());

        boolean eliminado = diarioServicio.eliminarMomentoPorId(momento2.getId());

        assertTrue(eliminado);
        assertEquals(2, diarioServicio.obtenerTodosLosMomentos().size());
        assertFalse(diarioServicio.obtenerTodosLosMomentos().contains(momento2));
    }
}
