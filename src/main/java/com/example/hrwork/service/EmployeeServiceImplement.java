package com.example.hrwork.service;

import com.example.hrwork.entity.Employee;
import com.example.hrwork.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class EmployeeServiceImplement implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public Employee createEmployee(Employee employee) {
        Employee savedEmp = employeeRepository.save(employee);
        if(savedEmp != null){
            System.out.println("Employee saved successfully");
        }
        return savedEmp;
    }

    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        Employee updateEmp = employeeRepository.findById(employee.getEmp_id()).orElse(null);
        if(updateEmp != null){
            updateEmp.setEmp_id(employee.getEmp_id());
            updateEmp.setFirst_name(employee.getFirst_name());
            updateEmp.setLast_name(employee.getLast_name());
            updateEmp.setDob(employee.getDob());
            updateEmp.setHiredate(employee.getHiredate());
            employeeRepository.save(updateEmp);
            return updateEmp;

        }
        return  null;
    }

    @Override
    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);

    }

    @Override
    public Employee getEmpById(Long id) {
        Optional<Employee> optionalUser = employeeRepository.findById(id);
        return optionalUser.get();
    }
}
