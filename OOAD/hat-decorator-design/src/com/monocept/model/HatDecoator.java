package com.monocept.model;

public abstract class  HatDecoator implements Hat {
Hat hat;

public HatDecoator(Hat hat) {
	this.hat = hat;
}


 //public String getName();
}
