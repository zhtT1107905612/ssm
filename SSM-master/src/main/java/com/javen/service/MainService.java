package com.javen.service;

import com.javen.model.Staff;

import java.util.List;

public interface MainService {
    public List<Staff> queryStaff(Staff bo)throws Exception;

    public void addStaff(Staff bo) throws Exception;
}
