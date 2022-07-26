package com.kavinskarasu.demo.repositry;

import com.kavinskarasu.demo.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {

    public  Department findByDepartmentName(String departmentName);



}
