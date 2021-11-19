package com.revature.repositories;

import com.revature.model.Employee;

import java.util.List;

public interface EmployeeRepo {

    public Employee addEmployee(Employee a);
    public List<Employee> getAllEmployees();
    public Employee getEmployee(int id);
    public Employee updateEmployee(Employee change);
    public Employee deleteEmployee(int id);


}
