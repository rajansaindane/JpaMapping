package com.rajan.mapping.JpaMapping.controller;

import com.rajan.mapping.JpaMapping.dao.StudentDao;
import com.rajan.mapping.JpaMapping.model.Student;
import com.rajan.mapping.JpaMapping.repository.StudentJdbcRepo;
import com.rajan.mapping.JpaMapping.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * Created by rajan on 7/7/17.
 */
@RestController
public class StudentController {

    @Autowired
    StudentDao studentDao;
    @Autowired
    StudentRepo studentRepo;

    @PostMapping(value = "/saveStud")
    public ResponseEntity<?> save(@RequestBody Student student)
    {
        studentRepo.save(student);
        ResponseEntity<?> entity=ResponseEntity.ok("save");
        return entity;
    }
    //get data from dept_id referance
    @GetMapping(value = "/getData/{id}")
    public  ResponseEntity<?> get(@PathVariable Integer id)
    {
       List<Student> students= studentRepo.findByDepartmentId(id);
        ResponseEntity<?> entity=ResponseEntity.ok(students);
        return entity;
    }


    @GetMapping(value = "/getJdbc/{id}")
    public ResponseEntity<?>getJdbc(@PathVariable Integer id)
    {
        List<Map<String,Object>> list=studentDao.getinfo(id);
        ResponseEntity<List<Map<String,Object>>> entity=ResponseEntity.ok(list);
        return entity;
    }


}
