package com.mieasy.retrofit2studydemo.module;


public class BaseEntity<T> {
    private static String SUCCESS_CODE="1";//成功的code
    private String code;
//    private String msg;
    private T reportList;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public boolean isSuccess(){
        return getCode()==SUCCESS_CODE;
    }
//    public int getCode() {
//        return code;
//    }
//
//    public void setCode(int code) {
//        this.code = code;
//    }
//
//    public String getMsg() {
//        return msg;
//    }
//
//    public void setMsg(String msg) {
//        this.msg = msg;
//    }

//    public T getData() {
//        return data;
//    }
//
//    public void setData(T data) {
//        this.data = data;
//    }


    public T getReportList() {
        return reportList;
    }

    public void setReportList(T reportList) {
        this.reportList = reportList;
    }
}
