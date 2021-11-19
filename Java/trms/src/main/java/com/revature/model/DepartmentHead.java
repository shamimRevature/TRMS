package com.revature.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "deptment_head")
public class DepartmentHead {

    @Id
    @Column(name = "dep_h_id")
    private int depHeadId;

    @Column(name = "emp_id")
    private int empId;

    @Column(name = "dep_h_name")
    private String depHeadName;

    @Column(name = "department")
    private String department;

    public DepartmentHead() {
    }

    public DepartmentHead(int depHeadId, int empId, String depHeadName, String department) {
        this.depHeadId = depHeadId;
        this.empId = empId;
        this.depHeadName = depHeadName;
        this.department = department;
    }

    public int getDepHeadId() {
        return depHeadId;
    }

    public void setDepHeadId(int depHeadId) {
        this.depHeadId = depHeadId;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getDepHeadName() {
        return depHeadName;
    }

    public void setDepHeadName(String depHeadName) {
        this.depHeadName = depHeadName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "DepartmentHead{" +
                "depHeadId=" + depHeadId +
                ", empId=" + empId +
                ", depHeadName='" + depHeadName + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
