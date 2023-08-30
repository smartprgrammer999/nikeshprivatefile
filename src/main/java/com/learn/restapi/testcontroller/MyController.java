package com.learn.restapi.testcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
  public List<Course> getCourse()
  {
		//System.out.println("hello nikesh");
	 return this.courseserv.getCourses();
  }
	@GetMapping("/course/{coid}")
	public Course getCourse(@PathVariable String coid)
	{
		return this.courseserv.getCourse(coid);
	}
	@PostMapping("/course")
	public Course addCourse(@RequestBody Course pq)
	{
		return this.courseserv.addCourse(pq);
	}
}
