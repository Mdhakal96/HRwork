package com.example.hrwork.service;

import com.example.hrwork.entity.Department;
import com.example.hrwork.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentServiceImplement  implements DepartmentService{

    @Autowired
    private DepartmentRepository departmentRepository;
    @Override
    public Department createDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> getAllDepartment() {
        return departmentRepository.findAll();
    }

    @Override
    public Department updateDepartment(Department department) {

        Department updateDep = departmentRepository.findById(department.getDep_id()).orElse(null);
        if(updateDep != null){
            updateDep.setDep_id(department.getDep_id());
            updateDep.setDep_name(department.getDep_name());
            updateDep.setDep_code(department.getDep_code());
            departmentRepository.save(updateDep);
            return updateDep;

        }
        return  null;
    }

    @Override
    public void deleteDepartment(Long id) {

        departmentRepository.deleteById(id);

    }

    @Override
    public Optional<Department> getDepartmentById(Long id) {
        return departmentRepository.findById(id);
    }
}
