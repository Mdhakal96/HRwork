package com.example.hrwork.controller;

import com.example.hrwork.entity.Employee;
import com.example.hrwork.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("employess")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public Employee savedAllEmp(@RequestBody Employee employee){
        return employeeService.createEmployee(employee);
    }
    @GetMapping
    public List<Employee> getAllEmp(){
        return employeeService.getAllEmployee();
    }
    @DeleteMapping("{id}")
    public void  deleteEmp(@PathVariable Long id){
        employeeService.deleteEmployee(id);
    }


}
