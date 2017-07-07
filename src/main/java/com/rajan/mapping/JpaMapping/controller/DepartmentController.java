package com.rajan.mapping.JpaMapping.controller;

import com.rajan.mapping.JpaMapping.model.Department;
import com.rajan.mapping.JpaMapping.repository.DepartmentRepo;
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
public class DepartmentController {

    @Autowired
    DepartmentRepo departmentRepo;

    @PostMapping(value = "/saveDept")
    public ResponseEntity<?> save(@RequestBody Department department)
    {
        departmentRepo.save(department);
        ResponseEntity<?> entity=ResponseEntity.ok("save");
        return entity;
    }

}
