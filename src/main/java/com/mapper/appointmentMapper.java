package com.mapper;

import com.entity.appointment;
import com.entity.appointmentKey;

public interface appointmentMapper {
    int deleteByPrimaryKey(appointmentKey key);

    int insert(appointment record);

    int insertSelective(appointment record);

    appointment selectByPrimaryKey(appointmentKey key);

    int updateByPrimaryKeySelective(appointment record);

    int updateByPrimaryKey(appointment record);
}