package com.learn.restapi.services;

import java.util.List;

import com.learn.restapi.entitycourse.Course;

public interface CourseService {
	public List<Course> getCourses();
	public Course getCourse(String coid);
	public Course addCourse(Course course); 
	public Course updateCourse(Course course);
	public void deleteCourse(String courseid);

}
