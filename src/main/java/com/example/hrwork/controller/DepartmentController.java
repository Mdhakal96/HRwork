package com.example.hrwork.controller;

import com.example.hrwork.entity.Department;
import com.example.hrwork.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departments/")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping
    public Department postDepartment(@RequestBody Department department){
        return departmentService.createDepartment(department);
    }

    @GetMapping
    public List<Department> getallDept(){
        return departmentService.getAllDepartment();
    }

    @DeleteMapping("{id}")
    public void deleteDept(@PathVariable Long id ){
        departmentService.deleteDepartment(id);

    }

    // Multiple values same time,
    @PostMapping("/multiple")

    public ResponseEntity<String> createDepartments(@RequestBody List<Department> departments) {
        return ResponseEntity.ok("Departments created successfully");
    }


}
