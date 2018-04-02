package com.ritamachado.cursomc.resources.exceptions;

import java.io.Serializable;

public class SandardError implements Serializable{

    private static final long serialVersionUID = 1L;

    private Integer status; //Http status of the error
    private String msg; //Error message
    private Long timeStamp; //Instant when the error occurred


    public SandardError(Integer status, String msg, Long timeStamp) {
        this.status = status;
        this.msg = msg;
        this.timeStamp = timeStamp;
    }

    public Integer getStatus() {
        return status;
    }

    public SandardError setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public SandardError setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public Long getTimeStamp() {
        return timeStamp;
    }

    public SandardError setTimeStamp(Long timeStamp) {
        this.timeStamp = timeStamp;
        return this;
    }
}
