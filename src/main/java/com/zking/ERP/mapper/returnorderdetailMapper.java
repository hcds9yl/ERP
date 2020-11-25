package com.zking.ERP.mapper;

import com.zking.ERP.model.returnorderdetail;

public interface returnorderdetailMapper {
    int deleteByPrimaryKey(Integer uuid);

    int insert(returnorderdetail record);

    int insertSelective(returnorderdetail record);

    returnorderdetail selectByPrimaryKey(Integer uuid);

    int updateByPrimaryKeySelective(returnorderdetail record);

    int updateByPrimaryKey(returnorderdetail record);
}