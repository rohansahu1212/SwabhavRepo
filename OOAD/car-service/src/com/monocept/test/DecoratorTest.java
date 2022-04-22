package com.monocept.test;

import com.monocept.model.BasicInspection;
import com.monocept.model.OilChange;
import com.monocept.model.Service;
import com.monocept.model.TyreRotation;

public class DecoratorTest {
	public static void main(String[] args) {
		Service service=new OilChange(new TyreRotation(new BasicInspection()));
     //System.out.println(new OilChange(new TyreRotation(new BasicInspection())).getCost());
	System.out.println(service.getCost());
	}
}
