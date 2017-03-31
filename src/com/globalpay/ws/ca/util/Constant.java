package com.globalpay.ws.ca.util;

public enum Constant {
	APPL_CDE("24"), READ_TRAN_CDE("01"), UPDATE_TRAN_CDE("02"), REQUEST_ID(
			"requestId"), USER_ID("userId"), CORRELATION_ID("correlationId"), DBA_PHONE_NUMBER(
			"dBAPhoneNumber"), DBA_NAME("dBAName"), DBA_ADDRESS("dBAAddress");

	private String constant;

	public String getConstantValue() {
		return constant;
	}

	Constant(String consta) {
		constant = consta;
	}
}
