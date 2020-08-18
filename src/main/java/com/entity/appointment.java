package com.entity;

import java.util.Date;

public class appointment extends appointmentKey {
    private Date appointTime;

    public Date getAppointTime() {
        return appointTime;
    }

    public void setAppointTime(Date appointTime) {
        this.appointTime = appointTime;
    }
}