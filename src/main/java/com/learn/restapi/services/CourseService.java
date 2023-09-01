package com.learn.restapi.services;

import java.util.List;

import com.learn.restapi.entitycourse.Course;

public interface CourseService {
	public List<Course> getCourses();
	public Course getCourse(String coid);
	public Course addCourse(Course course); 

}
