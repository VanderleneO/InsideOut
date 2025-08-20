    package com.vanderlene.mydiario.model;

    import java.time.LocalDate;
    import java.time.LocalDateTime;

    public class Momento {
        private static int contadorId = 0;

        private final int id;
        private String titulo;
        private String descripcion;
        private Emocion emocion;
        private final LocalDate fechaMomento;
        private final LocalDateTime fechaCreacion;
        private LocalDateTime fechaModificacion;

        public Momento(String titulo, String descripcion, Emocion emocion, LocalDate fechaMomento) {
            this.id = ++contadorId;
            this.titulo = titulo;
            this.descripcion = descripcion;
            this.emocion = emocion;
            this.fechaMomento = fechaMomento;
            this.fechaCreacion = LocalDateTime.now();
            this.fechaModificacion = LocalDateTime.now();
        }

        public int getId() { return id; }
        public String getTitulo() { return titulo; }
        public String getDescripcion() { return descripcion; }
        public Emocion getEmocion() { return emocion; }
        public LocalDate getFechaMomento() { return fechaMomento; }

        @Override
        public String toString() {
            return "ID: " + id +
                ", Fecha: " + fechaMomento +
                ", Título: " + titulo +
                ", Descripción: " + descripcion +
                ", Emoción: " + emocion;
        }
    }











