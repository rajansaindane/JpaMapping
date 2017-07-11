package com.rajan.mapping.JpaMapping.dao;

import com.rajan.mapping.JpaMapping.repository.StudentJdbcRepo;
import com.rajan.mapping.JpaMapping.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by rajan on 11/7/17.
 */
@Repository
public class StudentDao implements StudentJdbcRepo {
@Autowired
    JdbcTemplate jdbcTemplate;


    @Override
    public List<Map<String, Object>> getinfo(Integer id) {
        String sql="select a.id,a.name,a.city,b.dept_name from student a,department b where a.department_id=b.id and b.id=?";
        List<Map<String, Object>> list=jdbcTemplate.queryForList(sql,new Object[]{id});
        return list;
    }
}
