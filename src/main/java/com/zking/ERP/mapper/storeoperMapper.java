package com.zking.ERP.mapper;

import com.zking.ERP.model.storeoper;

public interface storeoperMapper {
    int deleteByPrimaryKey(Integer uuid);

    int insert(storeoper record);

    int insertSelective(storeoper record);

    storeoper selectByPrimaryKey(Integer uuid);

    int updateByPrimaryKeySelective(storeoper record);

    int updateByPrimaryKey(storeoper record);
}