package com.liquibase.project.controller;

import com.liquibase.project.entity.School;
import com.liquibase.project.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SchoolController {
    @Autowired
    private SchoolService schoolService;

    @PostMapping("/school")
    private School createStudent(@RequestBody School school){
        return schoolService.createStudent(school);
    }
}
