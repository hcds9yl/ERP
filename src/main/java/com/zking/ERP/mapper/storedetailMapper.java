package com.zking.ERP.mapper;

import com.zking.ERP.model.storedetail;

public interface storedetailMapper {
    int deleteByPrimaryKey(Integer uuid);

    int insert(storedetail record);

    int insertSelective(storedetail record);

    storedetail selectByPrimaryKey(Integer uuid);

    int updateByPrimaryKeySelective(storedetail record);

    int updateByPrimaryKey(storedetail record);
}