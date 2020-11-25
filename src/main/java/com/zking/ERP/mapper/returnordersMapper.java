package com.zking.ERP.mapper;

import com.zking.ERP.model.returnorders;

public interface returnordersMapper {
    int deleteByPrimaryKey(Integer uuid);

    int insert(returnorders record);

    int insertSelective(returnorders record);

    returnorders selectByPrimaryKey(Integer uuid);

    int updateByPrimaryKeySelective(returnorders record);

    int updateByPrimaryKey(returnorders record);
}