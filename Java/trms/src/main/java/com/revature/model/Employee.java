package com.revature.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @Column(name = "emp_id")
    private int empId;

    @Column(name = "emp_name")
    private String empName;

    @Column(name = "supervisor_id")
    private int supervisorId;

    private String department;

    @Column(name = "fund_eligable")
    private int fundAvailable;

    public Employee() {
    }

    public Employee(int empId, String empName, int supervisor_id, String department, int fundAvailable) {
        this.empId = empId;
        this.empName = empName;
        this.supervisorId = supervisor_id;
        this.department = department;
        this.fundAvailable = fundAvailable;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getSupervisor_id() {
        return supervisorId;
    }

    public void setSupervisor_id(int supervisor_id) {
        this.supervisorId = supervisor_id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getFundAvailable() {
        return fundAvailable;
    }

    public void setFundAvailable(int fundAvailable) {
        this.fundAvailable = fundAvailable;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", supervisor_id=" + supervisorId +
                ", department='" + department + '\'' +
                ", fundAvailable=" + fundAvailable +
                '}';
    }
}
