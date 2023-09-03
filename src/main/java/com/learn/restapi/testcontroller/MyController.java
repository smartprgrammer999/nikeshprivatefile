package com.learn.restapi.testcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.learn.restapi.entitycourse.Course;
import com.learn.restapi.services.MyCourseService;

@RestController
public class MyController {
	@Autowired
	MyCourseService courseserv;
	@GetMapping("/nkhome")
	public String getName()
	{
		return "Gaya is my home";
	}
	@GetMapping("/course")
	//get the course
  public List<Course> getCourse()
  {
		//System.out.println("hello nikesh");
	 return this.courseserv.getCourses();
  }
	//get particular course by id 
	@GetMapping("/course/{coid}")
	public Course getCourse(@PathVariable String coid)
	{
		return this.courseserv.getCourse(coid);
	}
	//post the course
	@PostMapping("/course")
	public Course addCourse(@RequestBody Course course)
	{
		 
		return this.courseserv.addCourse(course);
	}
	//update course
	@PutMapping("/course")
	public Course updateCourse(@RequestBody Course course)
	{ 
		return this.courseserv.updateCourse(course);
	}
	//delete course
	@DeleteMapping("/course/{courseid}")
	public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseid)
	{
		try {
		this.courseserv.deleteCourse(courseid);
		return new ResponseEntity<>(HttpStatus.OK);
	    }catch(Exception e)
		{
	    	return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
