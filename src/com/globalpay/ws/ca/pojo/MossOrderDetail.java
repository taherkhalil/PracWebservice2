package com.globalpay.ws.ca.pojo;

public class MossOrderDetail extends MossOrder {
	private String keyID;
	private String orderType;
	private String template;
	private String templateTID;
	private String templateRID;
	private String templateFIID;
	private String action;
	
	public String getKeyID() {
		return keyID;
	}
	public void setKeyID(String keyID) {
		this.keyID = keyID;
	}
	public String getOrderType() {
		return orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	public String getTemplate() {
		return template;
	}
	public void setTemplate(String template) {
		this.template = template;
	}
	public String getTemplateTID() {
		return templateTID;
	}
	public void setTemplateTID(String templateTID) {
		this.templateTID = templateTID;
	}
	public String getTemplateRID() {
		return templateRID;
	}
	public void setTemplateRID(String templateRID) {
		this.templateRID = templateRID;
	}
	public String getTemplateFIID() {
		return templateFIID;
	}
	public void setTemplateFIID(String templateFIID) {
		this.templateFIID = templateFIID;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}

}
