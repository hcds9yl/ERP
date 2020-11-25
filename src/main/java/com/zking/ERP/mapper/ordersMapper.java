package com.zking.ERP.mapper;

import com.zking.ERP.model.orders;

public interface ordersMapper {
    int deleteByPrimaryKey(Integer uuid);

    int insert(orders record);

    int insertSelective(orders record);

    orders selectByPrimaryKey(Integer uuid);

    int updateByPrimaryKeySelective(orders record);

    int updateByPrimaryKey(orders record);
}