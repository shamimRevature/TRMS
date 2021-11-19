package com.revature.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "supervisor")
public class Supervisor {

    @Id
    @Column(name = "sup_id")
    private int superId;

    @Column(name = "emp_id ")
    private int empId;

    @Column(name = "sup_name")
    private String superName;

    public Supervisor() {
    }

    public Supervisor(int superId, int empId, String superName) {
        this.superId = superId;
        this.empId = empId;
        this.superName = superName;
    }

    public int getSuperId() {
        return superId;
    }

    public void setSuperId(int superId) {
        this.superId = superId;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getSuperName() {
        return superName;
    }

    public void setSuperName(String superName) {
        this.superName = superName;
    }

    @Override
    public String toString() {
        return "Supervisor{" +
                "superId=" + superId +
                ", empId=" + empId +
                ", superName='" + superName + '\'' +
                '}';
    }
}
