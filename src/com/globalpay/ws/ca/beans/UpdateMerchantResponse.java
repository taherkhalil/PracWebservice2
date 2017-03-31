package com.globalpay.ws.ca.beans;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.stereotype.Component;

@Component
@XmlRootElement
public class UpdateMerchantResponse {
	private String requestID;
	private int code;
	private String description;
	private String userId;
//	private String correlationId;

	public UpdateMerchantResponse() {
		super();
	}

	public String getRequestID() {
		return requestID;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	// public String getCorrelationId() {
	// return correlationId;
	// }
	//
	// public void setCorrelationId(String correlationId) {
	// this.correlationId = correlationId;
	// }

	public void setRequestID(String requestID) {
		this.requestID = requestID;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
