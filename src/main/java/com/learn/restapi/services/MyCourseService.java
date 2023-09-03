package com.learn.restapi.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.restapi.dao.CourseDao;
import com.learn.restapi.entitycourse.Course;
@Service
public class MyCourseService implements CourseService {
	//List<Course> mylist;
	@Autowired
   private CourseDao coursedao;
	public MyCourseService() {
//		mylist=new ArrayList<>();
//		mylist.add(new Course("uni1001","Core java",12000,"8 month")); 
//		mylist.add(new Course("uni1002","Advance java",18000,"12 month"));
//		mylist.add(new Course("uni1003","Python",15000,"36 month")); 
	}
   @Override
	public List<Course> getCourses() 
   {
		
		return coursedao.findAll();
	}
@Override
public void deleteCourse(String courseid) {
	//mylist=this.mylist.stream().filter(e->!e.getCoid().equals(courseid)).collect(Collectors.toList());
	Course entity=coursedao.getOne(courseid);
	coursedao.delete(entity);
}
@Override
public Course getCourse(String coid) {
//	Course c=null;
//	for(Course cou:mylist)
//	{
//		if(cou.getCoid().equals(coid))
//		{
//			c=cou;
//			break;
//		}
//	}
	System.out.println("MY id="+coid);
	return coursedao.getOne(coid);
}

@Override
public Course addCourse(Course course) {
//	System.out.println("hello nikesh"+course.getCoursfe());
//	mylist.add(course);
//	System.out.println("hello nikesh"+course.getCoid());
	return coursedao.save(course);
}
@Override
public Course updateCourse(Course course) {
//	mylist.forEach(e->{if(e.getCoid().equals(course.getCoid()))
//	{
//		e.setConame(course.getConame());
//		e.setCoursfe(course.getCoursfe());
//		e.setDuration(course.getDuration());
//	}
//	}
//			
//			);
	return coursedao.save(course);

}
   
}
