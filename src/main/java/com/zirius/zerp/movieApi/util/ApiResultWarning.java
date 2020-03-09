package com.zirius.zerp.movieApi.util;

import java.io.Serializable;

public class ApiResultWarning implements Serializable {

	private static final long serialVersionUID = 1L;

	private String status;
	private String result;

	 public ApiResultWarning() {

	}

	public String getMessage() {
		return result;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setMessage(String result) {
		this.result = result;
	}

}
