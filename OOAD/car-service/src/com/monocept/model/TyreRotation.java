package com.monocept.model;

public class TyreRotation extends Decorator implements Service {
	//Service service;
	private double cost = 500;

	public TyreRotation(Service service) {

		super(service);
		//this.service = service;
	}

	@Override
	public double getCost() {
		System.out.println("tyre rotation");
		return service.getCost() + cost;
	}

}
