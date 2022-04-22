package com.monocept.model.test;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Animal {
	String type() default "Carnivorus";

	int lifeSpan() default 20;
}

@Animal(type = "herbivorous")
class Dog {
	public String name;
	public int age;

	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

public class AnnotationTest {
	public static void main(String[] args) {
		Dog dog = new Dog("pavalian", 12);
	

		Class c = dog.getClass();
		Annotation an = c.getAnnotation(Animal.class);
		Animal animal = (Animal) an;
		System.out.println(animal.lifeSpan());
		System.out.println(animal.type());
	}

}
