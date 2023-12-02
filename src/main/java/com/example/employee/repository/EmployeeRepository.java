package com.example.employee.repository;

import com.example.employee.model.Employee;
import java.util.*;

public interface EmployeeRepository {
    ArrayList<Employee> getEmployees();

    Employee addEmployees(Employee employee);

    Employee getEmployeeById(int employeeId);

    Employee updateEmployeeById(int employeeId,Employee employee);

    void deleteEmployeeById(int employeeId);
}