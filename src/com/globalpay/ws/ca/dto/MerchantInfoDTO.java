package com.globalpay.ws.ca.dto;

import java.util.List;

public class MerchantInfoDTO {

	private String merchantId;
	// Start - Fix for Retailer Id + FIID 
		private String retailerId;
		private String retailerFiid;
		// End - Fix for Retailer Id + FIID
	private List<PhoneNumberDTO> phoneNumbers;
	private List<NameDTO> names;
	private List<AddressDTO> addresses;

	public String getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public List<PhoneNumberDTO> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(List<PhoneNumberDTO> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	public List<NameDTO> getNames() {
		return names;
	}

	public void setNames(List<NameDTO> names) {
		this.names = names;
	}

	public List<AddressDTO> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<AddressDTO> addresses) {
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
}
