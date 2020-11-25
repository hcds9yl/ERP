package com.zking.ERP.mapper;

import com.zking.ERP.model.dep;

public interface depMapper {
    int deleteByPrimaryKey(Integer uuid);

    int insert(dep record);

    int insertSelective(dep record);

    dep selectByPrimaryKey(Integer uuid);

    int updateByPrimaryKeySelective(dep record);

    int updateByPrimaryKey(dep record);
}