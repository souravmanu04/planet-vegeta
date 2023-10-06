package com.example.Employee.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Employee")
public class EmployeeBean{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String name;
    String address;
    int age;
}