package com.zking.ERP.mapper;

import com.zking.ERP.model.emp;

import java.awt.print.Book;
import java.util.List;

public interface empMapper {
    int deleteByPrimaryKey(Integer uuid);

    int insert(emp record);

    int insertSelective(emp record);

    emp selectByPrimaryKey(Integer uuid);

    List<Book> queryBookPager(Book book);

    int updateByPrimaryKeySelective(emp record);

    int updateByPrimaryKey(emp record);
}