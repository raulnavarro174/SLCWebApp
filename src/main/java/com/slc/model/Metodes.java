package com.slc.model;

public class Metodes {
	private String nom;

	private String valor;

	public Metodes() {

	}

	public Metodes(String nom, String valor) {
		super();
		this.nom = nom;
		this.valor = valor;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}
}
