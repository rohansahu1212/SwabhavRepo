package com.monocept.service;

import java.util.List;

import com.monocept.model.Course;
import com.monocept.repositor.CourseReopository;

public class CourseService {

	private List<Course> courses;
	private CourseService courseService = null;

	private CourseService() {
		
	}
	public CourseService getInstance() {
		if(courseService==null)
			courseService= new CourseService();
		return courseService;
	}
	
	public List<Course> getCourses(){
		courses= new CourseReopository().getCourses();
		return courses;
	}
	
}
