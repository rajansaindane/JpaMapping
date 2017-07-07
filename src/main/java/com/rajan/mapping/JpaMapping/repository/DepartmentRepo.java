package com.rajan.mapping.JpaMapping.repository;

import com.rajan.mapping.JpaMapping.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by rajan on 7/7/17.
 */

public interface DepartmentRepo extends JpaRepository<Department,Integer> {
}
