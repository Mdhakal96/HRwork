package com.example.hrwork.service;

import com.example.hrwork.entity.Department;

import java.util.List;
import java.util.Optional;

public interface DepartmentService {

    Department createDepartment(Department department);  // Create ko lagi
    List<Department> getAllDepartment();  // Read

    Department updateDepartment(Department department);  //Update

    void deleteDepartment(Long id);   // Delete

    Optional<Department> getDepartmentById(Long id);  // get department by id


}
