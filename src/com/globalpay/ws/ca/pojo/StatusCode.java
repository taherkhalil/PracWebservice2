package com.globalpay.ws.ca.pojo;

public enum StatusCode {
	QUEUED(0), INPROGRESS(1), ERROR(2), COMPLETED(3), SUCCESS(4), FAILED(5), DUPLICATE(
			6), SUCCESS_WITH_MSG(7);

	private int status;

	StatusCode(int st) {
		status = st;
	}

	public int getStatus() {
		return status;
	}
}
