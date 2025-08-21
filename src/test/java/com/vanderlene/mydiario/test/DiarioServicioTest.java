package com.vanderlene.mydiario.test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.vanderlene.mydiario.model.DiarioServicio;
import com.vanderlene.mydiario.model.Emocion;
import com.vanderlene.mydiario.model.Momento;

public class DiarioServicioTest {

    private DiarioServicio diarioServicio;

    @BeforeEach
    void setUp() {
        diarioServicio = new DiarioServicio();
        diarioServicio.agregarMomento(
                new Momento("Día de la graduación", "Me gradué hoy", Emocion.ALEGRIA, LocalDate.of(2023, 10, 26)));
        diarioServicio.agregarMomento(
                new Momento("Me enfermé", "Me duele la garganta", Emocion.TRISTEZA, LocalDate.of(2023, 10, 27)));
        diarioServicio.agregarMomento(
                new Momento("Visita a un amigo", "Visité a un amigo hoy", Emocion.ALEGRIA, LocalDate.of(2023, 10, 28)));
    }

    @Test
    void testFiltrarPorEmocionConMomentosEncontrados() {

        Emocion emocionDeseada = Emocion.ALEGRIA;

        List<Momento> momentosFiltrados = diarioServicio.filtrarPorEmocion(emocionDeseada);

        assertNotNull(momentosFiltrados, "La lista no debe ser nula");
        assertEquals(2, momentosFiltrados.size(), "Debería haber 2 momentos para la emoción deseada");
        assertTrue(momentosFiltrados.stream()
                .allMatch(m -> m.getEmocion().equals(emocionDeseada)),
                "Todos los momentos deben tener la emoción correcta");
    }
}
