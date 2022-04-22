package com.monocept.model;

public class Person {
	private final String name;
	private final int age;
	private float height;
	private float weight;
	private GenderOptions gender;

	public Person(int age, String name, float height, float weight, GenderOptions gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.weight = weight;
		this.height = height;
	}

	public Person(String name, int age) {
		this(age, name, 60, 60, GenderOptions.MALE);
	}

	public void eat() {
		this.weight += (this.weight * (1 / 10));
	}

	public void workout() {
		this.height += this.height * (2 / 100);
		this.weight -= this.weight * (5 / 100);
	}

	public String getName() {
		return this.name;

	}
	

	public int getAge() {
		return this.age;

	}

	public float getWeight() {
		return this.weight;

	}

	public float getHeight() {
		return this.height;
	}

	public GenderOptions getGender() {
		return this.gender;
	}
}