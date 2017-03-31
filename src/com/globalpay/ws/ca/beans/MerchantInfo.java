package com.globalpay.ws.ca.beans;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
@XmlRootElement
public class MerchantInfo {

	private String merchantId;
	// Start - Fix for Retailer Id + FIID 
	private String retailerId;
	private String retailerFiid;
	// End - Fix for Retailer Id + FIID 
	private List<PhoneNumber> phoneNumbers;
	private List<Name> names;
	private List<Address> addresses;

	public MerchantInfo() {
		super();
	}

	public String getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public List<PhoneNumber> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(List<PhoneNumber> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	public List<Name> getNames() {
		return names;
	}

	public void setNames(List<Name> names) {
		this.names = names;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	// Start - Fix for Retailer Id + FIID 
	public String getRetailerId() {
		return retailerId;
	}

	public void setRetailerId(String retailerId) {
		this.retailerId = retailerId;
	}

	public String getRetailerFiid() {
		return retailerFiid;
	}

	public void setRetailerFiid(String retailerFiid) {
		this.retailerFiid = retailerFiid;
	}
	// End - Fix for Retailer Id + FIID
	
	@Override
	public String toString() {
		return super.toString();
	}

}
