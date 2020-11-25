package com.zking.ERP.mapper;

import com.zking.ERP.model.orderdetail;

public interface orderdetailMapper {
    int deleteByPrimaryKey(Integer uuid);

    int insert(orderdetail record);

    int insertSelective(orderdetail record);

    orderdetail selectByPrimaryKey(Integer uuid);

    int updateByPrimaryKeySelective(orderdetail record);

    int updateByPrimaryKey(orderdetail record);
}