package com.vanderlene.mydiario.model;

import java.util.ArrayList;
import java.util.List;

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
}


