package com.vanderlene.mydiario.model;

import java.time.LocalDate;
import java.util.Objects;

public class Momento {
    private static int contadorId = 0;

    private final int id;

    public Momento(String titulo, String descripcion, Emocion emocion, LocalDate fechaMomento) {
        this.id = ++contadorId;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Momento momento = (Momento) o;
        return id == momento.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
