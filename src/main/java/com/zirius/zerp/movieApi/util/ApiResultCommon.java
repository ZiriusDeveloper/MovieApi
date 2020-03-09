package com.zirius.zerp.movieApi.util;

import java.io.Serializable;

public class ApiResultCommon implements Serializable {

    private static final long serialVersionUID = 1L;

    private String status;
    private Object result;
    private String msg;
	
	public String getMessage() {
		return msg;
	}
	public void setMessage(String msg) {
		this.msg = msg;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Object getData() {
		return result;
	}
	public void setData(Object result) {
		this.result = result;
	}
	
   
    
}