package com.dto;

/*所有请求都会返回Result<T>对象,用于封装json对象*/
public class Result<T> {

    private boolean success;
    private T data;
    private String error;

    /*用于表达失败时的构造器*/
    public Result(boolean success, String error) {
        this.success = success;
        this.error = error;
    }

    /*用于表示成功时的构造器*/
    public Result(boolean success, T data) {
        this.success = success;
        this.data = data;
    }

    public Result() {
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setError(String error) {
        this.error = error;
    }

    public boolean isSuccess() {
        return success;
    }

    public T getData() {
        return data;
    }

    public String getError() {
        return error;
    }
}
