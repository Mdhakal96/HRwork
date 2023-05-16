package com.example.hrwork.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long emp_id;
    @Column
    private String first_name;
    @Column
    private String last_name;
    @Column
    private LocalDate dob;
    @Column
    private LocalDate hiredate;

//    @ManyToOne
//    @JoinColumn
//    private Department department;
//
//    @ManyToOne
//    @JoinColumn
//    private Address address;





}
