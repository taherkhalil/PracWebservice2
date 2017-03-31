package com.globalpay.ws.ca.beans;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
@XmlRootElement
public class UpdateMerchantInfo {
	private String requestId;
	private String userId;
	// private String correlationId;
	private MerchantInfo merchantInfo;
	private List<Equipments> equipments;

	public List<Equipments> getEquipments() {
		return equipments;
	}

	public void setEquipments(List<Equipments> equipments) {
		this.equipments = equipments;
	}

	public UpdateMerchantInfo() {
		super();
	}

	// public String getCorrelationId() {
	// return correlationId;
	// }
	//
	// public void setCorrelationId(String correlationId) {
	// this.correlationId = correlationId;
	// }

	public String getRequestId() {
		return requestId;
	}

	//
	// public List<String> getTerminalID() {
	// return terminalID;
	// }
	//
	// public void setTerminalID(List<String> terminalID) {
	// this.terminalID = terminalID;
	// }

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public MerchantInfo getMerchantInfo() {
		return merchantInfo;
	}

	public void setMerchantInfo(MerchantInfo merchantInfo) {
		this.merchantInfo = merchantInfo;
	}

}
