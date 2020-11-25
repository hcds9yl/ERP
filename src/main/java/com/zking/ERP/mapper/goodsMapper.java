package com.zking.ERP.mapper;

import com.zking.ERP.model.goods;

public interface goodsMapper {
    int deleteByPrimaryKey(Integer uuid);

    int insert(goods record);

    int insertSelective(goods record);

    goods selectByPrimaryKey(Integer uuid);

    int updateByPrimaryKeySelective(goods record);

    int updateByPrimaryKey(goods record);
}