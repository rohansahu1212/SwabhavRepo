package com.monocept.model;

public class Infant extends Man {
	static {
		System.out.println("Infant static");
	}
 @Override
 public void play() {
	 System.out.println("Infant playing");
 }
}
