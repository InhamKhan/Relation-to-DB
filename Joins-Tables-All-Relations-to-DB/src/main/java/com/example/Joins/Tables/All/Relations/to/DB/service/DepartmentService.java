package com.example.Joins.Tables.All.Relations.to.DB.service;
import com.example.Joins.Tables.All.Relations.to.DB.models.Department;

import java.util.List;

public interface DepartmentService {
    List<Department> getAllDepartments();
    Department getDepartmentById(Integer id);
    Department createDepartment(Department department);
    Department updateDepartment(Integer id, Department department);
    void deleteDepartment(Integer id);
}
