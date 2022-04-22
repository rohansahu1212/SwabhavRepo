package com.monocept.model;

public class Rectangle {
	private int widht;
	private final int height;
	private String color;

	public Rectangle(int widht, int height) {
		this.widht = widht;
		this.height = height; // we can't change it
	}

	public Rectangle(int widht, int height, String color) {
		this.widht = widht;
		this.height = height;
		this.color = validate(color);
	}

	public int calculateArea() {
		int area = widht * height;
		return area;
	}

	public void setWidht(int widht) {
		this.widht = widht;
	}

	public int getHeight() {
		return this.height;
	}

	public int getWidht() {
		return this.widht;
	}

	public String getColor() {
		return this.color;
	}

	private String validate(String check) {
		String color = check.toLowerCase();
// 		System.out.println("inside funct "+check);
		if (check.equalsIgnoreCase("red") || check.equalsIgnoreCase("blue") || check.equalsIgnoreCase("green")) {
			return color;
		}
		return "red";
	}

}
