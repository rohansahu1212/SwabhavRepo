package com.monocept.domain;

public class Aircraft {
	private String model;
	private int nbSeats;
	

	public String getModel() {
		return model;
	}


	public int getNbSeats() {
		return nbSeats;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public void setNbSeats(int nbSeats) {
		this.nbSeats = nbSeats;
	}


	public Aircraft(String model, int nbSeats) {
		super();
		this.model = model;
		this.nbSeats = nbSeats;
	}


	public Aircraft() {
		// TODO Auto-generated constructor stub
	}

}
