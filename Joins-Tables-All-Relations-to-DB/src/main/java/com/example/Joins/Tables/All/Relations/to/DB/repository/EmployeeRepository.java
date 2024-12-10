package com.example.Joins.Tables.All.Relations.to.DB.repository;

import com.example.Joins.Tables.All.Relations.to.DB.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    @Query("SELECT e FROM Employee e " +
            "JOIN e.department d " +
            "JOIN e.address a " +
            "WHERE d.name = :departmentName AND a.zipCode = :zipCode")
    List<Employee> findEmployeesByDepartmentAndAddress(@Param("departmentName") String departmentName, @Param("zipCode") String zipCode);

    @Query("SELECT e FROM Employee e " +
            "JOIN e.missions m " +
            "WHERE m.name = :missionName")
    List<Employee> findEmployeesByMission(@Param("missionName") String missionName);

    @Query(value = "SELECT e.*, d.name AS department_name, a.street_name, a.zip_code, m.name AS mission_name " +
            "FROM employee e " +
            "JOIN department d ON e.department_id = d.id " +
            "JOIN address a ON e.address_id = a.id " +
            "JOIN employee_mission em ON e.id = em.employee_id " +
            "JOIN mission m ON em.mission_id = m.id " +
            "WHERE d.name = :departmentName AND a.zip_code = :zipCode AND m.name = :missionName", nativeQuery = true)
    List<Object[]> findEmployeesWithDetails(@Param("departmentName") String departmentName,
                                            @Param("zipCode") String zipCode,
                                            @Param("missionName") String missionName);
}
