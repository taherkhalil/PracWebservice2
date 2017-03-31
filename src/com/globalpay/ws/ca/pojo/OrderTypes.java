package com.globalpay.ws.ca.pojo;

public enum OrderTypes {
	ORDERTYPE_PRDF("PRDF"), ORDERTYPE_PTDF("PTDF");

	private String orderType;

	OrderTypes(String ot) {
		orderType = ot;
	}

	public String getOrderType() {
		return orderType;
	}
	
}
