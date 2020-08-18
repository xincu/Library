package com.mapper;

import com.entity.book;

public interface bookMapper {
    int deleteByPrimaryKey(Long bookId);

    int insert(book record);

    int insertSelective(book record);

    book selectByPrimaryKey(Long bookId);

    int updateByPrimaryKeySelective(book record);

    int updateByPrimaryKey(book record);
}