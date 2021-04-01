package com.slc.model;

public class Dades {

    private String metode;

    @NoNull
    private int id_jugador;

    public Dades(){

    }

    public Dades(String metode, int id_jugador) {
        super();
        this.metode = metode;
        this.id_jugador = id_jugador;
    }

    public String getMetode() {
        return metode;
    }

    public void setMetode(String metode) {
        this.metode = metode;
    }

    public int getId_jugador() {
        return id_jugador;
    }

    public void setId_jugador(int id_jugador) {
        this.id_jugador = id_jugador;
    }

    @Override
    public java.lang.String toString() {
        return "Dades{" +
                "metode='" + metode + '\'' +
                ", id_jugador=" + id_jugador +
                '}';
    }
}
