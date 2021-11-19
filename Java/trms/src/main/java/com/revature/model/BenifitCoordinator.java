package com.revature.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "benifit_co")
public class BenifitCoordinator {

    @Id
    @Column(name = "ben_id")
    private int benId;

    @Column(name = "emp_id")
    private int empId;

    @Column(name = "emp_name")
    private String benName;

    public BenifitCoordinator() {
    }

    public BenifitCoordinator(int benId, int empId, String benName) {
        this.benId = benId;
        this.empId = empId;
        this.benName = benName;
    }

    public int getBenId() {
        return benId;
    }

    public void setBenId(int benId) {
        this.benId = benId;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getBenName() {
        return benName;
    }

    public void setBenName(String benName) {
        this.benName = benName;
    }

    @Override
    public String toString() {
        return "BenifitCoordinator{" +
                "benId=" + benId +
                ", empId=" + empId +
                ", benName='" + benName + '\'' +
                '}';
    }
}
