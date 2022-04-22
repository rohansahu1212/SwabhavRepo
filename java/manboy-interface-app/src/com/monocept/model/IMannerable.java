package com.monocept.model;

public interface IMannerable {
	public default void wish() {
		System.out.println("hello");
	}

	public default void depart() {
		System.out.println("good bye");
	}
}
