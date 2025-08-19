package com.vanderlene.mydiario.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors; // Asegúrate de tener esta importación

public class DiarioServicio {
    private List<Momento> momentos;

    public DiarioServicio() {
        this.momentos = new ArrayList<>();
    }

    public void agregarMomento(Momento momento) {
        momentos.add(momento);
    }

    public List<Momento> obtenerTodosLosMomentos() {
        return new ArrayList<>(momentos);
    }

    // MÉTODO QUE FALTA: filtra momentos por emoción
    public List<Momento> filtrarPorEmocion(Emocion emocion) {
        return momentos.stream()
                .filter(m -> m.getEmocion() == emocion)
                .collect(Collectors.toList());
    }

    // MÉTODO QUE FALTA: filtra momentos por fecha
    public List<Momento> filtrarPorFecha(LocalDate fecha) {
        return momentos.stream()
                .filter(m -> m.getFechaMomento().isEqual(fecha)) // Usa getFechaMomento()
                .collect(Collectors.toList());
    }
}


