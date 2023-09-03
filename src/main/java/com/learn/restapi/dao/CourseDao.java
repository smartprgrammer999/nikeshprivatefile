package com.learn.restapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.restapi.entitycourse.Course;

public interface CourseDao extends JpaRepository<Course,String>{

}
