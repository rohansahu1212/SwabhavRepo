package com.monocept.model;

public class Course {
	private int cId;
	private String cName;
	private String duration;

	public Course(int cId, String cName, String duration) {
		this.cId = cId;
		this.cName = cName;
		this.duration = duration;
	}

	public int getcId() {
		return cId;
	}

	public String getcName() {
		return cName;
	}

	public String getDuration() {
		return duration;
	}

}
