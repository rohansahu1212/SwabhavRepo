package com.monocept.model;

public interface IEmotional {
	public default void cry() {
		System.out.println("crying");
	}
	public default void laugh() {
		System.out.println("laugh");
	}
}
