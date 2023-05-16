package com.example.hrwork.service;

import com.example.hrwork.entity.Employee;

import java.util.List;

public interface EmployeeService {

    //Create
    Employee createEmployee(Employee employee);

    // Get all, read

    List<Employee> getAllEmployee();

    //Update

    Employee updateEmployee(Employee employee);

    //Delete

    void deleteEmployee(Long id);

    // get employee by id

    Employee getEmpById(Long id);

}
