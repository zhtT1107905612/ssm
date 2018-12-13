package com.javen.service;

import com.javen.model.Staff;
import com.javen.model.Turnover;

import java.util.List;

public interface MainService {
    public List<Staff> queryStaff(Staff bo);

    public Staff queryStaffById(Staff bo);

    public void addStaff(Staff bo) throws Exception;

    public void updateStaff(Staff bo);

    public List<Turnover> queryThrowable(Turnover bo);

    public Turnover queryThrowableById(Turnover bo);

    public void addThrowable(Turnover bo);

    public void updateThrowable(Turnover bo);
}
