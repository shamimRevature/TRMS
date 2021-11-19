package com.revature.service;

import com.revature.model.Employee;
import com.revature.repositories.DepartmentHeadRepo;
import com.revature.repositories.EmployeeRepo;

import java.util.List;

public class EmployeeServiceImp implements EmployeeService{


    EmployeeRepo er;

    public EmployeeServiceImp(EmployeeRepo er) {
        this.er = er;
    }

    @Override
    public Employee addEmployee(Employee e) {

        return er.addEmployee(e);
    }

    @Override
    public List<Employee> getAllEmployees() {

        return er.getAllEmployees();
    }

    @Override
    public Employee getEmployee(int id) {

        return er.getEmployee(id);
    }

    @Override
    public Employee updateEmployee(Employee change) {

        return er.updateEmployee(change);
    }

    @Override
    public Employee deleteEmployee(int id) {

        return er.deleteEmployee(id);
    }
}
