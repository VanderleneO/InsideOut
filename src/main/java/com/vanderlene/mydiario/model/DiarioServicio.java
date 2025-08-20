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

   public List<Momento> filtrarPorFecha(LocalDate fecha) {
        return momentos.stream()
                       .filter(momento -> momento.getFechaMomento().equals(fecha))
                       .collect(Collectors.toList());
    }
}


