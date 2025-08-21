package com.vanderlene.mydiario.test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DiarioServicioTest {

    private DiarioServicio diarioServicio;

    @BeforeEach
    void setUp() {
        diarioServicio = new DiarioServicio();
    }

    @Test
    void testFiltrarPorFechaConMomentosEncontrados() {
        // Configuración de datos de prueba
        LocalDate fechaDeseada = LocalDate.of(2023, 10, 26);
        diarioServicio.agregarMomento(new Momento("Un día feliz", LocalDate.of(2023, 10, 26)));
        diarioServicio.agregarMomento(new Momento("Un día normal", LocalDate.of(2023, 10, 25)));
        diarioServicio.agregarMomento(new Momento("Otro día feliz", LocalDate.of(2023, 10, 26)));

        List<Momento> momentosFiltrados = diarioServicio.filtrarPorFecha(fechaDeseada);

        assertNotNull(momentosFiltrados, "La lista no debe ser nula");
        assertEquals(2, momentosFiltrados.size(), "Debería haber 2 momentos para la fecha deseada");
        assertTrue(momentosFiltrados.stream()
                .allMatch(m -> m.getFechaMomento().equals(fechaDeseada)),
                "Todos los momentos deben tener la fecha correcta");
    }

    @Test
    void testFiltrarPorFechaSinMomentosEncontrados() {
        // Configuración de datos de prueba
        LocalDate fechaDeseada = LocalDate.of(2023, 10, 26);
        diarioServicio.agregarMomento(new Momento("Un día normal", LocalDate.of(2023, 10, 25)));
        diarioServicio.agregarMomento(new Momento("Otro día", LocalDate.of(2023, 10, 27)));

        List<Momento> momentosFiltrados = diarioServicio.filtrarPorFecha(fechaDeseada);

        assertNotNull(momentosFiltrados, "La lista no debe ser nula");
        assertTrue(momentosFiltrados.isEmpty(), "La lista debería estar vacía");
    }

    public static class DiarioServicio {
        private List<Momento> momentos;

        public DiarioServicio() {
            this.momentos = new ArrayList<>();
        }

        public void agregarMomento(Momento momento) {
            this.momentos.add(momento);
        }

        public List<Momento> filtrarPorFecha(LocalDate fecha) {
            return momentos.stream()
                    .filter(momento -> momento.getFechaMomento().equals(fecha))
                    .collect(Collectors.toList());
        }
    }

    public static class Momento {
        private String descripcion;
        private LocalDate fechaMomento;

        public Momento(String descripcion, LocalDate fechaMomento) {
            this.descripcion = descripcion;
            this.fechaMomento = fechaMomento;
        }

        public LocalDate getFechaMomento() {
            return fechaMomento;
        }

        public String getDescripcion() {
            return descripcion;
        }
    }
}
