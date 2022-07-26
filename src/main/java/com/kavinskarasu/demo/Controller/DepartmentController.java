package com.kavinskarasu.demo.Controller;


import com.kavinskarasu.demo.entity.Department;
import com.kavinskarasu.demo.repositry.DepartmentRepository;
import com.kavinskarasu.demo.service.DepartmentService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;
   private final  Logger LOGGER= LoggerFactory.getLogger(DepartmentController.class);

    @PostMapping("/department")
    public Department saveDepartMent(@Valid  @RequestBody Department department) {
           LOGGER.info("save departemnet");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/departments")
    public List<Department> fetchDepartmentList() {
        LOGGER.info("fetchDepartment");
        return departmentService.fetchDepartment();
    }

    @GetMapping("/departments/{id}")
    public Department fetchDepartment(@PathVariable("id") Long departmentId) {
        return departmentService.fetchDepartmentById(departmentId);
    }

    @DeleteMapping("/departments/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long departmentId) {
        LOGGER.info("Delete Departmnet");
        departmentService.deleteDepartmentById(departmentId);
        return "Department Deleted Successfully";
    }

//    @PutMapping("/departments/{id}")
//    public Department updateDepartment(Long DepartmentId, Department department) {
//        return departmentService.updateDepaetment(DepartmentId, department);
//    }


//@GetMapping("/departments/name/{name}")
//    public Department fetchDepartmentByName(@PathVariable("name") String DepartmentName){
//return departmentService.fetchDepartmentByName(DepartmentName);
//    }
}