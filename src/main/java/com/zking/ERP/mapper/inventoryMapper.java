package com.zking.ERP.mapper;

import com.zking.ERP.model.inventory;

public interface inventoryMapper {
    int deleteByPrimaryKey(Integer uuid);

    int insert(inventory record);

    int insertSelective(inventory record);

    inventory selectByPrimaryKey(Integer uuid);

    int updateByPrimaryKeySelective(inventory record);

    int updateByPrimaryKey(inventory record);
}