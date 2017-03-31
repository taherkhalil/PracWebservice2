package com.globalpay.ws.ca.pojo;

public class StatusResponse {

	private StatusCode status;
	private String details;
	
	public StatusCode getStatus() {
		return status;
	}
	public void setStatus(StatusCode status) {
		this.status = status;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}

}
