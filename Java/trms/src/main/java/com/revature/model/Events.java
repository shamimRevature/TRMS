package com.revature.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "events")
public class Events {

    @Id
    @Column(name = "event_id")
    private int eventId;

    @Column(name ="event_name")
    private String eventName;

    @Column(name ="req_gra", columnDefinition = "numeric(12,2)")
    private double cutOffGPA;

    @Column(name ="req_letter")
    private char cutOffLetter;

    @Column(name ="req_number")
    private int cutOffNumber;

    @Column(name ="fund_ratio", columnDefinition = "numeric(12,2)")
    private double fundRadio;

    public Events() {
    }

    public Events(int eventId, String name, double cutOffGPA, char cutOffLetter, int cutOffNumber, double fundRadio) {
        this.eventId = eventId;
        this.eventName = name;
        this.cutOffGPA = cutOffGPA;
        this.cutOffLetter = cutOffLetter;
        this.cutOffNumber = cutOffNumber;
        this.fundRadio = fundRadio;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public String getName() {
        return eventName;
    }

    public void setName(String name) {
        this.eventName = name;
    }

    public double getCutOffGPA() {
        return cutOffGPA;
    }

    public void setCutOffGPA(double cutOffGPA) {
        this.cutOffGPA = cutOffGPA;
    }

    public char getCutOffLetter() {
        return cutOffLetter;
    }

    public void setCutOffLetter(char cutOffLetter) {
        this.cutOffLetter = cutOffLetter;
    }

    public int getCutOffNumber() {
        return cutOffNumber;
    }

    public void setCutOffNumber(int cutOffNumber) {
        this.cutOffNumber = cutOffNumber;
    }

    public double getFundRadio() {
        return fundRadio;
    }

    public void setFundRadio(double fundRadio) {
        this.fundRadio = fundRadio;
    }

    @Override
    public String toString() {
        return "Events{" +
                "eventId=" + eventId +
                ", name='" + eventName + '\'' +
                ", cutOffGPA=" + cutOffGPA +
                ", cutOffLetter=" + cutOffLetter +
                ", cutOffNumber=" + cutOffNumber +
                ", fundRadio=" + fundRadio +
                '}';
    }
}//end
