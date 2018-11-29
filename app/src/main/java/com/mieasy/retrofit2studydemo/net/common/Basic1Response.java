package com.mieasy.retrofit2studydemo.net.common;

/**
 *
 */
public class Basic1Response<T> {

    private String code;
//    private String message;
    private T reportList;
//    private boolean error;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public T getReportList() {
        return reportList;
    }

    public void setReportList(T reportList) {
        this.reportList = reportList;
    }

    //    public T getResults() {
//        return results;
//    }
//
//    public void setResults(T results) {
//        this.results = results;
//    }

//    public boolean isError() {
//        return error;
//    }
//
//    public void setError(boolean error) {
//        this.error = error;
//    }

//    public int getCode() {
//        return code;
//    }
//
//    public void setCode(int code) {
//        this.code = code;
//    }

//    public String getMessage() {
//        return message;
//    }
//
//    public void setMessage(String message) {
//        this.message = message;
//    }
}
