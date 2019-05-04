package com.zirius.zerp.movieApi.api;

public class Error {

    int status ;
    String error ;
	String description ;

	public Error() { }

    public int getStatus() {
		return status;
	}
	public Error setStatus(int status) {
		this.status = status;
		return this ;
	}
	public String getError() {
		return error;
	}
	public Error setError(String error) {
		this.error = error;
		return this ;
	}
	public String getDescription() {
		return description;
	}
	public Error setDescription(String description) {
		this.description = description;
		return this ;
	}
	
}