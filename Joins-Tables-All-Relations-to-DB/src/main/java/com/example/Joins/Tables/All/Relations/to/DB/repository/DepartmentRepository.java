package com.example.Joins.Tables.All.Relations.to.DB.repository;

import com.example.Joins.Tables.All.Relations.to.DB.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {
}
