package com.zking.ERP.mapper;

import com.zking.ERP.model.empRole;

public interface empRoleMapper {
    int insert(empRole record);

    int insertSelective(empRole record);
}