package com.javen.service.impl;

import com.javen.dao.StaffMapper;
import com.javen.model.Staff;
import com.javen.service.MainService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("mainService")
public class MainServiceImpl implements MainService {
    @Resource
    private StaffMapper staffMapper;

    public List<Staff> queryStaff(Staff bo) {
        return this.staffMapper.selectStaff(bo);
    }

    public void addStaff(Staff bo) {
         this.staffMapper.insertSelective(bo);
    }
}
