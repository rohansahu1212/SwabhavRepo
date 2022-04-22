package com.monocept.model;

public class RibbonedHat extends HatDecoator  {
	
	public RibbonedHat(Hat hat) {
		super(hat);
	}

	@Override
	public double getPrice() {
		
		return hat.getPrice()+300;
	}

	@Override
	public String getDescription() {
		
		return hat.getDescription()+" Ribbon is added \n ";
	}

	@Override
	public String getName() {
		
		return hat.getName()+" Ribbon ";
	}

}
