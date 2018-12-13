package com.javen.dao;


import com.javen.model.Turnover;
import com.javen.mybatis.Page;

import java.util.List;

public interface TurnoverMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Turnover record);

    int insertSelective(Turnover record);

    Turnover selectByPrimaryKey(Long id);

    List<Turnover> selectTurnover(Turnover record, Page<Turnover> page);

    int updateByPrimaryKeySelective(Turnover record);

    int updateByPrimaryKey(Turnover record);
}