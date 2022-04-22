package com.monocept.model.test;

import com.monocept.model.Animal;
import com.monocept.model.Hippo;
import com.monocept.model.Wolf;

public class AnimalTest {
public static void main(String[] args) {
	Animal [] animals= {new Wolf(),new Hippo()};
	for(Animal animal:animals) {
		animal.eat();
		animal.makeSound();
		animal.sleep();
		System.out.println("-----------------------------------");
	}
}
}
