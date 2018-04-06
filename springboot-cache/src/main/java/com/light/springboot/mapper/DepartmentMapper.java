package com.light.springboot.mapper;

import com.light.springboot.domain.Department;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DepartmentMapper {

	void insert(Department department);

    Department getById(Integer id);
	
	void update(Department department);
	
	void deleteById(Integer id);
}