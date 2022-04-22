package com.monocept.model;

public class OilChange extends Decorator implements Service {
	//Service service;
	 private  double cost=300; 

	public OilChange(Service service) {
		super(service);
		//this.service = service;
	}

	@Override
	public double getCost() {
		System.out.println();
		return service.getCost()+cost;
	}

}
