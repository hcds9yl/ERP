package com.zking.ERP.mapper;

import com.zking.ERP.model.goodstype;

public interface goodstypeMapper {
    int deleteByPrimaryKey(Integer uuid);

    int insert(goodstype record);

    int insertSelective(goodstype record);

    goodstype selectByPrimaryKey(Integer uuid);

    int updateByPrimaryKeySelective(goodstype record);

    int updateByPrimaryKey(goodstype record);
}