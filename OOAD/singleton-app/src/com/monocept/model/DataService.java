package com.monocept.model;

public class DataService {
	private static DataService service;

	private DataService() {
		System.out.println("inside Contrcutor");
	}

	public static DataService getInstance() {
		if (service == null)
			service = new DataService();
		return service;
	}

	public void doWork1() {
		System.out.println("thread one is running");
	}

	public void doWork2() {
		System.out.println("thread two is running");
	}

	public void doWork3() {
		System.out.println("thread three is running");
	}

	public void printMessage(String msg) {
		System.out.println("printing details " + msg);
		System.out.println(this.hashCode());
	}
}
