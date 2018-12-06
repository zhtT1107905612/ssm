package com.javen.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Staff {
    private Integer id;

    private String userName;

    private Integer salary;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date entryDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date departureDate;

    private Integer state;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", salary=" + salary +
                ", entryDate=" + entryDate +
                ", departureDate=" + departureDate +
                ", state=" + state +
                '}';
    }
}