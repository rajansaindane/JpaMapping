package com.rajan.mapping.JpaMapping.controller;

import com.rajan.mapping.JpaMapping.model.Student;
import com.rajan.mapping.JpaMapping.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by rajan on 7/7/17.
 */
@RestController
public class StudentController {

    @Autowired
    StudentRepo studentRepo;

    @PostMapping(value = "/saveStud")
    public ResponseEntity<?> save(@RequestBody Student student)
    {
        studentRepo.save(student);
        ResponseEntity<?> entity=ResponseEntity.ok("save");
        return entity;
    }

}
