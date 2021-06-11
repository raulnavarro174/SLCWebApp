package com.slc.model;

public class Dades {

    private String metode;

    private int id_jugador;
    
    private String columnes;

    public Dades(){

    }

    public Dades(String metode, int id_jugador, String columnes) {
        super();
        this.metode = metode;
        this.id_jugador = id_jugador;
        this.columnes = columnes;
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

    public String getColumnes() {
		return columnes;
	}

	public void setColumnes(String columnes) {
		this.columnes = columnes;
	}

	@Override
	public String toString() {
		return "Dades [metode=" + metode + ", id_jugador=" + id_jugador + ", columnes=" + columnes + "]";
	}
}
