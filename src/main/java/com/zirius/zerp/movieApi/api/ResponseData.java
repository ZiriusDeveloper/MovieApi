package com.zirius.zerp.movieApi.api;

import com.google.gson.Gson;

public class ResponseData {

	int responseCode ;
	String status ;
	Object data  = null ;
	Error error = null ;

	public int getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(int responseCode) {
		this.responseCode = responseCode;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public Error getError() {
		return error;
	}
	
	public ResponseData setError(Error error) {
		this.error = error;
		return this ;
	}

	public ResponseData setInternalError(){
		this.error = new Error() ;
		this.getError().setStatus( 500);
		this.getError().setError( "Internal Error");
		this.getError().setDescription("Internal Error");
		return this ;
	}

	public String toJson() {
		Gson gson = new Gson() ;
		return gson.toJson(this);
	}

}