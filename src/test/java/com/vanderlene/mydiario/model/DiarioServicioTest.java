package com.vanderlene.mydiario.model;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DiarioServicioTest {

    @Test
    @DisplayName("1️⃣ Este test debe agregar un Momento a mi Lista de Momentos")
    void testAgregarMomento() {

        DiarioServicio servicio = new DiarioServicio();
        Momento miMomento = new Momento("mi momento test", "mi primero test", Emocion.ALEGRIA ,LocalDate.now() );

        servicio.agregarMomento(miMomento);

        assertEquals(1, servicio.getMomentos().size(), "El tamaño de la lista debe ser 1 después de agregar un elemento.");
}
}