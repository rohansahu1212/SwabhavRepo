package com.monocept.test;

import com.monocept.model.GoldenHat;
import com.monocept.model.Hat;
import com.monocept.model.RibbonedHat;
import com.monocept.model.StandardHat;

public class HatTest {
	public static void main(String[] args) {
		Hat hat = new RibbonedHat(new GoldenHat(new StandardHat()));
		System.out.println("hat name " + hat.getName());
		System.out.println("hat cost " + hat.getPrice());
		System.out.println("hat details " + hat.getDescription());
	}
}
