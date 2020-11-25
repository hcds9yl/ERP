package com.zking.ERP.mapper;

import com.zking.ERP.model.role;

public interface roleMapper {
    int deleteByPrimaryKey(Integer uuid);

    int insert(role record);

    int insertSelective(role record);

    role selectByPrimaryKey(Integer uuid);

    int updateByPrimaryKeySelective(role record);

    int updateByPrimaryKey(role record);
}