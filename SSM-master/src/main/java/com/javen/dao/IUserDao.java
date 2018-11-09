package com.javen.dao;

import com.javen.model.User;


public interface IUserDao {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    User selectUser(User record);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}