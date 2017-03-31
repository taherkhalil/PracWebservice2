package com.globalpay.ws.ca.dto;

public class StatusDetailsDTO {
	private int code;
	private String description;
	/**
	 * To find out difference between read and update operation. read = 01 and
	 * update = 02
	 */
	private String tranCde;

	public StatusDetailsDTO(int code, String description, String tranCde) {
		super();
		this.code = code;
		this.description = description;
		this.tranCde = tranCde;
	}

	public StatusDetailsDTO() {
		super();
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

	public String getTranCde() {
		return tranCde;
	}

	public void setTranCde(String tranCde) {
		this.tranCde = tranCde;
	}

}
