package com.monocept.model;

public class Course {
	private int coureId;
	private String courseName;
	private String courseDuration;

	public Course(int coureId, String courseName, String courseDuration) {
		super();
		this.coureId = coureId;
		this.courseName = courseName;
		this.courseDuration = courseDuration;
	}

	public int getCoureId() {
		return coureId;
	}

	public String getCourseName() {
		return courseName;
	}

	public String getCourseDuration() {
		return courseDuration;
	}

}
