package com.javen.service.impl;

import com.javen.dao.StaffMapper;
import com.javen.dao.TurnoverMapper;

import com.javen.model.Staff;
import com.javen.model.Turnover;
import com.javen.mybatis.Page;
import com.javen.service.MainService;

import com.nh.micro.mybatis.plugin.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("mainService")
public class MainServiceImpl implements MainService {
    @Resource
    private StaffMapper staffMapper;

    @Resource
    private TurnoverMapper turnoverMapper;

    public List<Staff> queryStaff(Staff bo) {
        return this.staffMapper.selectStaff(bo);
    }

    public Staff queryStaffById(Staff bo) {
        return this.staffMapper.selectByPrimaryKey(bo.getId());
    }

    public void addStaff(Staff bo) {
         this.staffMapper.insertSelective(bo);
    }

    public void updateStaff(Staff bo) {
        this.staffMapper.updateByPrimaryKeySelective(bo);
    }

    public List<Turnover> queryThrowable(Turnover bo) {
        Page<Turnover> page = new Page<Turnover>();
        page.setPageSize(2);
        page.setPageNum(0);
        List<Turnover> list =  turnoverMapper.selectTurnover(bo,page);
        System.out.println(list);
        System.out.println("===============" +page.getTotal());
        return list;
    }

    public Turnover queryThrowableById(Turnover bo) {
        return null;
    }

    public void addThrowable(Turnover bo) {

    }

    public void updateThrowable(Turnover bo) {

    }
}
