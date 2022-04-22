package com.monocept.model.test;

class Container<T extends Number> {
	T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;

	}

	public void show() {
		System.out.println(value.getClass().getSimpleName());
	}
}

public class GenericsDemoTest {
	public static void main(String[] args) {
		Container<Double> ob1 = new Container<Double>();
		ob1.setValue(5.05);
		ob1.show();
		Container<Integer> ob2 = new Container<Integer>();
		ob2.setValue(5);
		ob2.show();
	}

}
