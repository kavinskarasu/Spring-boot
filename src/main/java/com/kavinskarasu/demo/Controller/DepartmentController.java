package com.kavinskarasu.demo.Controller;

import com.kavinskarasu.demo.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class DepartmentController {
    @Autowired
    private  DepartmentService departmentService;

    @PostMapping("/departments")
         public   Department saveDepartMent(@RequestBody Department department){

return departmentService.saveDepartment(department);
         }

}
