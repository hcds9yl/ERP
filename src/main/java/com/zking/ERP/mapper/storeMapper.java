package com.zking.ERP.mapper;

import com.zking.ERP.model.store;

public interface storeMapper {
    int deleteByPrimaryKey(Integer uuid);

    int insert(store record);

    int insertSelective(store record);

    store selectByPrimaryKey(Integer uuid);

    int updateByPrimaryKeySelective(store record);

    int updateByPrimaryKey(store record);
}