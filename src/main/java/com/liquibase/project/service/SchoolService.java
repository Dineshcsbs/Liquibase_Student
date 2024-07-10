package com.liquibase.project.service;

import com.liquibase.project.entity.School;
import com.liquibase.project.repository.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class SchoolService {
    @Autowired
    private SchoolRepository schoolRepository;

    public School createStudent(School school) {
        school.setCreatedAt(new Date());
        return schoolRepository.save(school);

    }
}
