package com.example.Employee.service;

import com.example.Employee.model.EmployeeBean;
import com.example.Employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public EmployeeBean addEmployee(EmployeeBean employeeBean) {
        employeeRepository.save(employeeBean);
        return employeeBean;
    }
}
