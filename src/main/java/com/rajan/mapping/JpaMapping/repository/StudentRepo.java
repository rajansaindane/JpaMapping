package com.rajan.mapping.JpaMapping.repository;

import com.rajan.mapping.JpaMapping.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by rajan on 7/7/17.
 */

public interface StudentRepo extends JpaRepository<Student,Integer> {

    List<Student> findByDepartmentId(Integer id);


}
