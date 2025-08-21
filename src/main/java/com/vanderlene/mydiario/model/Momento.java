package com.vanderlene.mydiario.model;

public class Momento {
    private String titulo;

    public Momento(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Momento momento = (Momento) obj;
        return titulo.equals(momento.titulo);
    }

    @Override
    public int hashCode() {
        return titulo.hashCode();
    }
}