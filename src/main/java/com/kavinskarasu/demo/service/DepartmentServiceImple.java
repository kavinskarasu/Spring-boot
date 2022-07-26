package com.kavinskarasu.demo.service;


import com.kavinskarasu.demo.entity.Department;
import com.kavinskarasu.demo.repositry.DepartmentRepository;
import com.kavinskarasu.demo.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Objects;


@Service
public class DepartmentServiceImple implements DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;
    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override

    public List<Department> fetchDepartment() {
        return departmentRepository.findAll();
    }

    @Override
    public Department fetchDepartmentById(Long departmentId) {

        return departmentRepository.findById(departmentId).get();
    }

    @Override
    public void deleteDepartmentById(Long departmentId) {
       departmentRepository.deleteById(departmentId);
    }

//    @Override
//    public Department updateDepaetment(Long departmentId, Department department) {
//        Department depDB=departmentRepository.findById(departmentId).get();
//        if(Objects.nonNull(department.getDepartmentName())&&!"".equalsIgnoreCase(department.getDepartmentName())){
//            depDB.setDepartmentName(department.getDepartmentName());
//        }
//        if(Objects.nonNull(department.getDepartmentAddress())&&!"".equalsIgnoreCase(department.getDepartmentAddress())){
//            depDB.setDepartmentAddress(department.getDepartmentAddress());
//        }
//        if(Objects.nonNull(department.getDepartmentCode())&&!"".equalsIgnoreCase(department.getDepartmentCode())){
//            depDB.setDepartmentCode(department.getDepartmentCode());
//        }
//        return departmentRepository.save(depDB);
//    }



    //@Override
//    public Department fetchDepartmentByName(String departmentName) {
//
//        return departmentRepository.findByDepartmentName(departmentName);
//    }


}
