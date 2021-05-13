package com.prime.primenumber.pojo;

public class ErrorPOJO {
	
	String code;
	String errorMessage;
	
	public ErrorPOJO(String code, String errorMessage) {
		
		this.code = code;
		this.errorMessage = errorMessage;
		
	}
	public String getCode() {
		return code;
	}
	
	public String getErrorMessage() {
		return errorMessage;
	}

	
	

}
