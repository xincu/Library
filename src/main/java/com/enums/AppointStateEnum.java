package com.enums;

public enum AppointStateEnum {
     SUCCESS(1,"预约成功"),NO_NUMBER(0,"库存不足") ,REPETI(-1,"重复预约") ,INNER(-2,"系统异常");
    private  int state ;
     private   String stateInfo;

    AppointStateEnum(int state, String stateInfo) {
        this.state = state;
        this.stateInfo = stateInfo;
    }
/*不允许使用set方法构造对象 ，仅提供get方法*/
    public int getState() {
        return state;
    }

    public String getStateInfo() {
        return stateInfo;
    }
    public static AppointStateEnum stateOf(int index) {
        for (AppointStateEnum state : values()) {
            if (state.getState() == index) {
                return state;
            }
        }
        return null;
    }
}
