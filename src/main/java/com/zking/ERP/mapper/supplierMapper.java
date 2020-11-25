package com.zking.ERP.mapper;

import com.zking.ERP.model.supplier;

public interface supplierMapper {
    int deleteByPrimaryKey(Integer uuid);

    int insert(supplier record);

    int insertSelective(supplier record);

    supplier selectByPrimaryKey(Integer uuid);

    int updateByPrimaryKeySelective(supplier record);

    int updateByPrimaryKey(supplier record);
}