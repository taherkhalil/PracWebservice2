package com.globalpay.ws.ca.pojo;

import java.util.Date;

public class MossOrder {
	
	private String orderRefNo;
	private String b24Data;
	private StatusCode orderStatus;
	private Date createDate;
	private Date updateDate;
	private Date completeDate;
	private String statusMsg;
	
	public String getOrderRefNo() {
		return orderRefNo;
	}
	public void setOrderRefNo(String orderRefNo) {
		this.orderRefNo = orderRefNo;
	}
	public String getB24Data() {
		return b24Data;
	}
	public void setB24Data(String b24Data) {
		this.b24Data = b24Data;
	}
	public StatusCode getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(StatusCode orderStatus) {
		this.orderStatus = orderStatus;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public Date getCompleteDate() {
		return completeDate;
	}
	public void setCompleteDate(Date completeDate) {
		this.completeDate = completeDate;
	}
	public String getStatusMsg() {
		return statusMsg;
	}
	public void setStatusMsg(String statusMsg) {
		this.statusMsg = statusMsg;
	}

}
