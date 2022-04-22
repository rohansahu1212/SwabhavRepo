package com.monocept.model;

public class Rectangle {
	private int widht;
	private int height;

	public int calculateArea() {
		int area = widht * height;
		return area;
	}

	public void setWidht(int widht) {
		this.widht = check(widht);
	}


	public void setHeight(int height) {

		this.height = check(height);
	}

	private int check(int side) {
		if (side > 0 && side < 101) {
			return side;
		}
		if (side > 100) {
			return 100;
		}
		return 1;
	}

	public int getHeight() {
		return this.height;
	}

	public int getWidht() {
		return this.widht;
	}

}
