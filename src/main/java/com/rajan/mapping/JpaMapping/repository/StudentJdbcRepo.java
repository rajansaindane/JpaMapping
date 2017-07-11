package com.rajan.mapping.JpaMapping.repository;

import java.util.List;
import java.util.Map;

/**
 * Created by rajan on 11/7/17.
 */
public interface StudentJdbcRepo {
    List<Map<String,Object>> getinfo(Integer integer);
}
