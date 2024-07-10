package com.liquibase.project.controller;

import com.liquibase.project.entity.Course;
import com.liquibase.project.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/course")
public class CourseController {

    @Autowired
    private CourseService courseService;
    @PostMapping("/")
    public Course createCourse(@RequestBody Course course){
        return courseService.createCourse(course);
    }
}
