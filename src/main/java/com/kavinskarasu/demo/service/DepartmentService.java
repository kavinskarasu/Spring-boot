package com.kavinskarasu.demo.service;


import com.kavinskarasu.demo.entity.Department;

import java.util.List;

public interface DepartmentService {

    public Department saveDepartment(Department department);


    List<Department> fetchDepartment();

    Department fetchDepartmentById(Long departmentId);

    void deleteDepartmentById(Long departmentId);
}
