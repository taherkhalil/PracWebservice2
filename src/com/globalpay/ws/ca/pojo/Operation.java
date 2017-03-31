package com.globalpay.ws.ca.pojo;

public enum Operation {
	OPCODE_ADD("add"), OPCODE_UPDATE("update"), OPCODE_NONE("none");

	private String operation;

	Operation(String op) {
		operation = op;
	}

	public String getOperation() {
		return operation;
	}

}
