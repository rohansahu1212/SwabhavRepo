package com.monocept.model;

public class Transection {
	private int transectionId;
	private double transectionAmount;
	private String dateTime;

	public Transection(int transectionId, double amount, String dateTime) {

		this.transectionId = transectionId;
		this.transectionAmount = amount;
		this.dateTime = dateTime;
	}

	public int getTransectionId() {
		return transectionId;
	}

	public double getTransectionAmount() {
		return transectionAmount;
	}

	public String getDateTime() {
		return dateTime;
	}

}
