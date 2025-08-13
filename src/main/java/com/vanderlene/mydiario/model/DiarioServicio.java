package com.vanderlene.mydiario.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
      public boolean eliminarMomentoPorId(int id) { 
        return momentos.removeIf(m -> m.getId() == id);
    }
      public List<Momento> filtrarPorEmocion(Emocion emocion) {
        return momentos.stream()
                .filter(m -> m.getEmocion() == emocion)
                .collect(Collectors.toList());
    } 

   public List<Momento> filtrarPorFecha(LocalDate fecha) {
        return momentos.stream()
                       .filter(momento -> momento.getFechaMomento().equals(fecha))
                       .collect(Collectors.toList());
    }

}


