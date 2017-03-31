package com.globalpay.ws.ca.beans;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
@XmlRootElement
public class Equipments {
	private String terminalId;

	public Equipments() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getTerminalId() {
		return terminalId;
	}

	public void setTerminalId(String terminalId) {
		this.terminalId = terminalId;
	}

}
