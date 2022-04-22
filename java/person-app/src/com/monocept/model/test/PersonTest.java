package com.monocept.model.test;

import com.monocept.model.BmiCalculater;
import com.monocept.model.GenderOptions;
import com.monocept.model.Person;

public class PersonTest {

	public static void main(String[] args) {
		Person p1 = new Person("Rohan", 23);
		Person p2 = new Person(30, "ankit", (float) 6.2, (float) 77.0, GenderOptions.MALE);
		// printDetails(p2);
		// printDetails(p1);
		p1.eat();
		p1.workout();
		p2.eat();
		p2.workout();
		// printDetails(p2);
		// printDetails(p1);
		BmiCalculater person = new BmiCalculater(p2);
	//	System.out.println(person.getBmiScore());
		System.out.println(person.getDetails());
		//System.out.println(person.getBodyCategory());
	}

	private static void printDetails(Person person) {
		System.out.println("name of person " + person.getName());
		System.out.println("age of person" + person.getAge());
		System.out.println("weight of person" + person.getWeight());
		System.out.println("height of person " + person.getHeight());
		System.out.println("gender of person " + person.getGender());
	}

}
