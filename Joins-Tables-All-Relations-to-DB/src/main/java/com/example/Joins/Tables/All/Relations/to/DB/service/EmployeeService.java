package com.example.Joins.Tables.All.Relations.to.DB.service;

import com.example.Joins.Tables.All.Relations.to.DB.models.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployees();
        Employee getEmployeeById(Integer id);
        Employee createEmployee(Employee employee);
        Employee updateEmployee(Integer id, Employee employee);
        void deleteEmployee(Integer id);
    }


