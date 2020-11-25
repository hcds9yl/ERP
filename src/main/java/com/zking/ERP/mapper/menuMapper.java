package com.zking.ERP.mapper;

import com.zking.ERP.model.menu;

public interface menuMapper {
    int deleteByPrimaryKey(Integer menuid);

    int insert(menu record);

    int insertSelective(menu record);

    menu selectByPrimaryKey(Integer menuid);

    int updateByPrimaryKeySelective(menu record);

    int updateByPrimaryKey(menu record);
}