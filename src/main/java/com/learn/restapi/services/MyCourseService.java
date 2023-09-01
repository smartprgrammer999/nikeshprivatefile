package com.learn.restapi.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.learn.restapi.entitycourse.Course;
@Service
public class MyCourseService implements CourseService {
	List<Course> mylist;

	public MyCourseService() {
		mylist=new ArrayList<>();
		mylist.add(new Course("uni1001","Core java",12000,"8 month")); 
		mylist.add(new Course("uni1002","Advance java",18000,"12 month"));
		mylist.add(new Course("uni1003","Python",15000,"36 month")); 
	}
   @Override
	public List<Course> getCourses() 
   {
		
		return mylist;
	}
@Override
public Course getCourse(String coid) {
	Course c=null;
	for(Course cou:mylist)
	{
		if(cou.getCoid().equals(coid))
		{
			c=cou;
			break;
		}
	}
	return c;
}

@Override
public Course addCourse(Course course) {
	System.out.println("hello nikesh"+course.getCoursfe());
	mylist.add(course);
	System.out.println("hello nikesh"+course.getCoid());
	return course;
}
   
}
