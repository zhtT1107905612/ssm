package com.javen.dao;

import com.javen.model.Staff;

import java.util.List;

public interface StaffMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Staff record);

    int insertSelective(Staff record);

    Staff selectByPrimaryKey(Integer id);

    List<Staff> selectStaff(Staff record);

    int updateByPrimaryKeySelective(Staff record);

    int updateByPrimaryKey(Staff record);
}