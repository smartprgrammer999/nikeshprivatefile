package com.learn.restapi.testcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
	@GetMapping("/courses")
  public List<Course> getCourse()
  {
	 return this.courseserv.getCourses();
  }
}
