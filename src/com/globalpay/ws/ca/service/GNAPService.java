package com.globalpay.ws.ca.service;

import java.net.SocketException;
import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.globalpay.ws.ca.beans.StatusCode;
import com.globalpay.ws.ca.dao.B24interface;
import com.globalpay.ws.ca.dto.MerchantInfoDTO;
import com.globalpay.ws.ca.dto.StatusDetailsDTO;
import com.globalpay.ws.ca.exception.ConnectionFailedException;
import com.globalpay.ws.ca.exception.ConnectionFileInvalidException;
import com.globalpay.ws.ca.exception.NoBufferSpaceException;
import com.globalpay.ws.ca.exception.NoCBSpaceException;
import com.globalpay.ws.ca.exception.NoIOBufSpaceException;
import com.globalpay.ws.ca.exception.NoIOCBSpaceException;
import com.globalpay.ws.ca.exception.NoIOPhysMemException;
import com.globalpay.ws.ca.exception.NoPhysMemException;
import com.globalpay.ws.ca.exception.NoPoolSpaceException;
import com.globalpay.ws.ca.exception.RetailerFileException;
import com.globalpay.ws.ca.exception.RetailerNotFoundException;
import com.globalpay.ws.ca.exception.StatusTimeoutException;
import com.globalpay.ws.ca.util.Constant;
import com.globalpay.ws.ca.util.ObjectMapper;
import com.globalpay.ws.ca.util.Utility;

import csl.globalpay.ipm.msgprdf5reply.MsgPRDF5Reply;
import csl.globalpay.ipm.msgprdf5req.MsgPRDF5Req;

@Service("gnapService")
public class GNAPService {
	private final static org.slf4j.Logger logger = LoggerFactory
			.getLogger(GNAPService.class);

	public StatusDetailsDTO updateMerchantInfo(MerchantInfoDTO merchantDTO)
			throws Exception {
		logger.debug("updateMerchantInfo method started");
		B24interface b24interface = new B24interface();
		StatusDetailsDTO statusDetails = new StatusDetailsDTO();

		MsgPRDF5Reply prdfReply = null;
		// Start - Fix for Retailer Id + FIID 
		//prdfReply = getPRDFTemplate(merchantDTO.getMerchantId());
		prdfReply = getPRDFTemplate(merchantDTO.getRetailerId(), merchantDTO.getRetailerFiid());
		// End - Fix for Retailer Id + FIID
		
		// Test Header
		if (prdfReply != null) {

			Short errorCode = prdfReply.getMsgprdf().getMsgHeader()
					.getErrStatus().getErrCde();

			if (StatusCode.STATUS_SUCCESS.getStatusCode() == errorCode) {
				MsgPRDF5Req req = copyPRDFReplyToReq(prdfReply);

				req = processB24XMLReq(merchantDTO, req);
				if (req != null) {
					MsgPRDF5Reply prdfReply2 = b24interface.updatePRDF(req);
					if (prdfReply2 != null) {

						if (StatusCode.STATUS_SUCCESS.getStatusCode() == errorCode) {
							Short updateCode = prdfReply2.getMsgprdf()
									.getMsgHeader().getErrStatus().getErrCde();
							statusDetails.setCode(updateCode);
							statusDetails
									.setDescription("Retailer is successfully updated");
							// statusDetails.setTranCde(prdfReply.getMsgprdf().getMsgHeader()
							// .getTranCde());
						}
					} else {
						throw new Exception(prdfReply.getMsgprdf()
								.getMsgHeader().getErrTxt());
					}
				}
			}
		}
		logger.debug("update Merchant info method end");

		return statusDetails;
	}

	private MsgPRDF5Reply getPRDFTemplate(String retailerId, String retailerFiid) throws SocketException,
			RetailerNotFoundException, NoBufferSpaceException,
			NoCBSpaceException, NoIOCBSpaceException, NoIOBufSpaceException,
			NoIOPhysMemException, NoPoolSpaceException, StatusTimeoutException,
			RetailerFileException, NoPhysMemException,
			ConnectionFailedException, ConnectionFileInvalidException {
		logger.debug("getPRDFTemplate");
		B24interface b24 = new B24interface();

		// Start - Fix for Retailer Id + FIID 
		MsgPRDF5Reply prdfReply = b24.readRetailer(retailerId, retailerFiid);
		// End - Fix for Retailer Id + FIID 

		return prdfReply;
	}

	public MsgPRDF5Req copyPRDFReplyToReq(MsgPRDF5Reply prdfReply) {
		MsgPRDF5Req prdfRequest = null;
		logger.debug("copyPRDFReplyToReq method start");
		if (prdfReply != null) {
			logger.debug("start copying of PRDF reply to PRDF request");
			prdfRequest = ObjectMapper.map(prdfReply, MsgPRDF5Req.class);
			logger.debug("completed copy of PRDF reply to PRDF request");

			if (prdfRequest != null) {
				for (int i = 0; i <= 2; i++) {

					short ltTran = prdfReply.getMsgprdf().getRecImage()
							.getPrdfRecImage().getLastTran().getLtTimestamp(i);

					prdfRequest.getMsgprdf().getRecImage().getPrdfRecImage()
							.getLastTran().setLtTimestamp(i, ltTran);

				}
				for (int i = 0; i <= 2; i++) {

					short fmTran = prdfReply.getMsgprdf().getRecImage()
							.getPrdfRecImage().getLastFm2().getFmTimestamp(i);

					prdfRequest.getMsgprdf().getRecImage().getPrdfRecImage()
							.getLastFm2().setFmTimestamp(i, fmTran);

				}
				// ADMINTRANS
				for (int i = 0; i <= 30 - 1; i++) {

					String adminTrans = prdfReply.getMsgprdf().getRecImage()
							.getPrdfRecImage().getAdminTrans(i);
					prdfRequest.getMsgprdf().getRecImage().getPrdfRecImage()
							.setAdminTrans(i, adminTrans);

				}

				// SRVINFODATA // //
				for (int i = 0; i <= 1410 - 1; i++) {

					String srvInfo = prdfReply.getMsgprdf().getRecImage()
							.getPrdfRecImage().getSrvInfo().getSrvInfoData(i);
					prdfRequest.getMsgprdf().getRecImage().getPrdfRecImage()
							.getSrvInfo().setSrvInfoData(i, srvInfo);

				}
				for (int i = 0; i <= 15 - 1; i++) {

					csl.globalpay.ipm.msgprdf5reply.msgprdf.WsService1 wsService1 = prdfReply
							.getMsgprdf().getRecImage().getWsService()
							.getWsService1(i);
					csl.globalpay.ipm.msgprdf5req.msgprdf.WsService1 svcReq = ObjectMapper
							.map(wsService1,
									csl.globalpay.ipm.msgprdf5req.msgprdf.WsService1.class);
					prdfRequest.getMsgprdf().getRecImage().getWsService()
							.setWsService1(i, svcReq);
				}

				for (int i = 0; i <= 15 - 1; i++) {

					csl.globalpay.ipm.msgprdf5reply.msgprdf.WsService2 wsService2 = prdfReply
							.getMsgprdf().getRecImage().getWsService()
							.getWsService2(i);
					csl.globalpay.ipm.msgprdf5req.msgprdf.WsService2 svcReq = ObjectMapper
							.map(wsService2,
									csl.globalpay.ipm.msgprdf5req.msgprdf.WsService2.class);
					prdfRequest.getMsgprdf().getRecImage().getWsService()
							.setWsService2(i, svcReq);

				}
			}

		}
		return prdfRequest;
	}

	public MsgPRDF5Req processB24XMLReq(MerchantInfoDTO merchantDTO,
			MsgPRDF5Req prdfReq) {
		logger.debug("start copying request object into PRDF request");

		// req.getMsgprdf()
		// .getRecImage()
		// .getWsService()
		// .setWsService1(
		// (WsService1[]) record.getPRDFRECORD().getWSSERVICE()
		// .getWSSERVICE1().toArray());
		List<com.globalpay.ws.ca.dto.AddressDTO> addressList = merchantDTO
				.getAddresses();
		List<com.globalpay.ws.ca.dto.NameDTO> namesList = merchantDTO
				.getNames();
		List<com.globalpay.ws.ca.dto.PhoneNumberDTO> phoneNumberList = merchantDTO
				.getPhoneNumbers();

		if (prdfReq != null) {
			// Start - Fix for Retailer Id + FIID 
			/*logger.debug("MerchantDTO object : "
					+ Utility.validateString(merchantDTO.getMerchantId()));*/
			logger.debug("MerchantDTO object RetailerId: "
					+ Utility.validateString(merchantDTO.getRetailerId()
					+ " RetailerFIID: " + Utility.validateString(merchantDTO.getRetailerFiid())));

			/*if (Utility.validateString(merchantDTO.getMerchantId()).length() > 0) {
				prdfReq.getMsgprdf().getRecImage().getPrdfRecImage().getRkey()
						.setRetailerId(merchantDTO.getMerchantId());

			}*/
			if (Utility.validateString(merchantDTO.getRetailerId()).length() > 0) {
				prdfReq.getMsgprdf().getRecImage().getPrdfRecImage().getRkey()
						.setRetailerId(merchantDTO.getRetailerId());

			}
			// End - Fix for Retailer Id + FIID  

			if (addressList != null && addressList.size() > 0) {
				com.globalpay.ws.ca.dto.AddressDTO dbaAddress = addressList
						.get(0);
				if (Constant.DBA_ADDRESS.getConstantValue().equalsIgnoreCase(
						dbaAddress.getFieldType().trim())) {

					logger.debug("******************************MerchantDTO add1 object : "
							+ Utility.validateString(dbaAddress.getAddress1()));
					logger.debug("MerchantDTO add2 object : "
							+ Utility.validateString(dbaAddress.getAddress2()));
					logger.debug("MerchantDTO city object : "
							+ Utility.validateString(dbaAddress.getCity()));
					logger.debug("MerchantDTO cntry object : "
							+ Utility.validateString(dbaAddress.getCountry()));
					logger.debug("MerchantDTO zip object : "
							+ Utility.validateString(dbaAddress.getZip()));
					logger.debug("MerchantDTO state object : "
							+ Utility.validateString(dbaAddress.getState()));

					if (Utility.validateString(dbaAddress.getAddress1())
							.length() > 0) {
						prdfReq.getMsgprdf().getRecImage().getPrdfRecImage()
								.getRetailer()
								.setAddr(dbaAddress.getAddress1().toUpperCase());
					}

					if (Utility.validateString(dbaAddress.getAddress2())
							.length() > 0) {
						prdfReq.getMsgprdf().getRecImage().getPrdfRecImage()
								.getRetailer()
								.setAddrExt(dbaAddress.getAddress2().toUpperCase());
					}

					if (Utility.validateString(dbaAddress.getCity()).length() > 0) {
						prdfReq.getMsgprdf().getRecImage().getPrdfRecImage()
								.getRetailer().setCity(dbaAddress.getCity().toUpperCase());

					}

					if (Utility.validateString(dbaAddress.getCountry())
							.length() > 0) {
						prdfReq.getMsgprdf().getRecImage().getPrdfRecImage()
								.getRetailer()
								.setCntry(dbaAddress.getCountry().toUpperCase());
					}

					if (Utility.validateString(dbaAddress.getZip()).length() > 0) {
						prdfReq.getMsgprdf().getRecImage().getPrdfRecImage()
								.getRetailer()
								.setPostalCde(dbaAddress.getZip());
					}

					if (Utility.validateString(dbaAddress.getState()).length() > 0) {
						prdfReq.getMsgprdf().getRecImage().getPrdfRecImage()
								.getRetailer().setSt(dbaAddress.getState().toUpperCase());
					}

					if (Utility.validateString(dbaAddress.getEmailAddress1())
							.length() > 0) {
						String email = dbaAddress.getEmailAddress1();
						String first = "";
						String second = "";
						String third = "";
						if (email != null) {

							if (email.trim().length() >= 20) {
								first = email.substring(0, 20);
							} else {
								first = email.substring(0, email.length());
							}

							if (email.trim().length() >= 21) {
								if (email.trim().length() >= 31) {
									second = email.substring(20, 31);
								} else {
									second = email
											.substring(20, email.length());
								}
							}
							if (email.trim().length() >= 31) {
								if (email.trim().length() >= 40) {
									third = email.substring(31, 40);
								} else {
									third = email.substring(31, email.length());
								}

							}

							if (first != null & first.trim().length() > 0) {

								prdfReq.getMsgprdf().getRecImage()
										.getPrdfRecImage().getRetailer()
										.setAftHrsPhone(first.toUpperCase());
								prdfReq.getMsgprdf().getRecImage()
										.getPrdfRecImage().setChkRtgGrp(second.toUpperCase());
								prdfReq.getMsgprdf().getRecImage()
										.getPrdfRecImage()
										.setChkMrchntId(third.toUpperCase());
							}
							// if (second != null & second.trim().length() > 0)
							// {
							// prdfReq.getMsgprdf().getRecImage()
							// .getPrdfRecImage().setChkRtgGrp(second);
							// }
							// if (third != null & third.trim().length() > 0) {
							// prdfReq.getMsgprdf().getRecImage()
							// .getPrdfRecImage()
							// .setChkMrchntId(third);
							// }
						}

					}

					logger.debug("prdfReq add1 object : "
							+ prdfReq.getMsgprdf().getRecImage()
									.getPrdfRecImage().getRetailer().getAddr());
					logger.debug("prdfReq add2 object : "
							+ prdfReq.getMsgprdf().getRecImage()
									.getPrdfRecImage().getRetailer()
									.getAddrExt());
					logger.debug("prdfReq city object : "
							+ prdfReq.getMsgprdf().getRecImage()
									.getPrdfRecImage().getRetailer().getCity());
					logger.debug("prdfReq cntry object : "
							+ prdfReq.getMsgprdf().getRecImage()
									.getPrdfRecImage().getRetailer().getCntry());
					logger.debug("prdfReq zip object : "
							+ prdfReq.getMsgprdf().getRecImage()
									.getPrdfRecImage().getRetailer()
									.getPostalCde());
					logger.debug("prdfReq state object : "
							+ prdfReq.getMsgprdf().getRecImage()
									.getPrdfRecImage().getRetailer().getSt());
					logger.debug("prdfReq cntry object : "
							+ prdfReq.getMsgprdf().getRecImage()
									.getPrdfRecImage().getRetailer().getCntry());
					logger.debug("prdfReq AftHrsPhone object : "
							+ prdfReq.getMsgprdf().getRecImage()
									.getPrdfRecImage().getRetailer()
									.getAftHrsPhone());
					logger.debug("prdfReq ChkRtgGrp object : "
							+ prdfReq.getMsgprdf().getRecImage()
									.getPrdfRecImage().getChkRtgGrp());
					logger.debug("prdfReq ChkMrchntId object : "
							+ prdfReq.getMsgprdf().getRecImage()
									.getPrdfRecImage().getChkMrchntId());

				}
			}
			if (namesList != null && namesList.size() > 0) {

				com.globalpay.ws.ca.dto.NameDTO dbaName = namesList.get(0);
				if (Constant.DBA_NAME.getConstantValue().equalsIgnoreCase(
						dbaName.getFieldType().trim())) {

					logger.debug("MerchantDTO name object : "
							+ Utility.validateString(dbaName.getName()));
					logger.debug("prdfReq before setting name object : "
							+ prdfReq.getMsgprdf().getRecImage()
									.getPrdfRecImage().getRetailer().getName());
					if (Utility.validateString(dbaName.getName()).length() > 0) {
						prdfReq.getMsgprdf().getRecImage().getPrdfRecImage()
								.getRetailer().setName(dbaName.getName().toUpperCase());
					}

					logger.debug("prdfReq after setting name object : "
							+ prdfReq.getMsgprdf().getRecImage()
									.getPrdfRecImage().getRetailer().getName());

				}
			}
			if (phoneNumberList != null && phoneNumberList.size() > 0) {
				com.globalpay.ws.ca.dto.PhoneNumberDTO dbaPhoneNumber = phoneNumberList
						.get(0);
				if (Constant.DBA_PHONE_NUMBER.getConstantValue()
						.equalsIgnoreCase(dbaPhoneNumber.getFieldType().trim())) {
					logger.debug("MerchantDTO phone object : "
							+ Utility.validateString(dbaPhoneNumber
									.getPhoneNumber()));

					if (Utility.validateString(dbaPhoneNumber.getPhoneNumber())
							.length() > 0) {
						prdfReq.getMsgprdf().getRecImage().getPrdfRecImage()
								.getRetailer()
								.setPhone(dbaPhoneNumber.getPhoneNumber());
					}

					logger.debug("prdfReq phone object : "
							+ prdfReq.getMsgprdf().getRecImage()
									.getPrdfRecImage().getRetailer().getPhone());
				}
			}

		}

		return prdfReq;
	}

}
