package com.example.Employee.controller;

import com.example.Employee.model.EmployeeBean;
import com.example.Employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    @PostMapping("/add")
    public ResponseEntity<EmployeeBean> saveEmployee(@RequestBody EmployeeBean employee) throws Exception{
        EmployeeBean employeeSavedToDB = this.employeeService.addEmployee(employee);
        return new ResponseEntity<EmployeeBean>(employeeSavedToDB, HttpStatus.CREATED);
    }
}