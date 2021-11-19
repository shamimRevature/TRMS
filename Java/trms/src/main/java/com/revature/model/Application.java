package com.revature.model;


import javax.persistence.*;

@Entity
@Table (name = "application")

public class Application {

    @Id
    @Column (name = "app_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int appId;

    @Column(name = "event_id")
    private int enventId;

    @Column(name = "emp_id")
    private int empId;

    @Column(name = "emp_name")
    private String empName;

    @Column(name = "start_date")
    private int eventStartDate;

    @Column(name = "end_date")
    private int eventEndDate;

    @Column(name = "event_cost")
    private int cost;

    @Column(name = "final_grade")
    private String gradingFormat;

    @Column(name = "urgent")
    private boolean urgent;

    @Column(name = "work_rel")
    private boolean workRelated ;

    @Column(name = "status")
    private int status_id;


    public Application() {
    }

    public Application(int appId, int enventId, String empName, int empId, int eventStartDate, int eventEndDate, int cost, String gradingFormat, boolean urgent, boolean workRelated, int status_id) {
        this.appId = appId;
        this.enventId = enventId;
        this.empName = empName;
        this.empId = empId;
        this.eventStartDate = eventStartDate;
        this.eventEndDate = eventEndDate;
        this.cost = cost;
        this.gradingFormat = gradingFormat;
        this.urgent = urgent;
        this.workRelated = workRelated;
        this.status_id = status_id;
    }

    public int getAppId() {
        return appId;
    }

    public void setAppId(int appId) {
        this.appId = appId;
    }

    public int getEnventId() {
        return enventId;
    }

    public void setEnventId(int enventId) {
        this.enventId = enventId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public int getEventStartDate() {
        return eventStartDate;
    }

    public void setEventStartDate(int eventStartDate) {
        this.eventStartDate = eventStartDate;
    }

    public int getEventEndDate() {
        return eventEndDate;
    }

    public void setEventEndDate(int eventEndDate) {
        this.eventEndDate = eventEndDate;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getGradingFormat() {
        return gradingFormat;
    }

    public void setGradingFormat(String gradingFormat) {
        this.gradingFormat = gradingFormat;
    }

    public boolean isUrgent() {
        return urgent;
    }

    public void setUrgent(boolean urgent) {
        this.urgent = urgent;
    }

    public boolean isWorkRelated() {
        return workRelated;
    }

    public void setWorkRelated(boolean workRelated) {
        this.workRelated = workRelated;
    }

    public int getStatus_id() {
        return status_id;
    }

    public void setStatus_id(int status_id) {
        this.status_id = status_id;
    }

    @Override
    public String toString() {
        return "Application{" +
                "appId=" + appId +
                ", enventId=" + enventId +
                ", empName='" + empName + '\'' +
                ", empId=" + empId +
                ", eventStartDate=" + eventStartDate +
                ", eventEndDate=" + eventEndDate +
                ", cost=" + cost +
                ", gradingFormat='" + gradingFormat + '\'' +
                ", urgent=" + urgent +
                ", workRelated=" + workRelated +
                ", status_id=" + status_id +
                '}';
    }
}//end
