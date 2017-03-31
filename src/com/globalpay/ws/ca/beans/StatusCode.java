package com.globalpay.ws.ca.beans;

public enum StatusCode {

	STATUS_SUCCESS(0), STATUS_NOT_FOUND(11), STATUS_NO_BFR_SPC(31), STATUS_NO_POOL_SPACE(
			32), STATUS_NO_IO_BUF_SPACE(33), STATUS_NO_CB_SPACE(34), STATUS_NO_IO_CB_SPACE(
			35), STATUS_NO_PHYS_MEM(36), STATUS_NO_IO_PHYS_MEM(37), STATUS_TIMEDOUT(
			40);

	private int statusCode;

	public int getStatusCode() {
		return statusCode;
	}

	private StatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

}
