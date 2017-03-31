package com.globalpay.ws.ca.webservice;

import java.net.SocketException;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.globalpay.ws.ca.beans.UpdateMerchantInfo;
import com.globalpay.ws.ca.beans.UpdateMerchantResponse;
import com.globalpay.ws.ca.dto.MerchantInfoDTO;
import com.globalpay.ws.ca.dto.StatusDetailsDTO;
import com.globalpay.ws.ca.exception.ConnectionFailedException;
import com.globalpay.ws.ca.exception.ConnectionFileInvalidException;
import com.globalpay.ws.ca.exception.MandatoryFieldNotFoundException;
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
import com.globalpay.ws.ca.service.GNAPService;
import com.globalpay.ws.ca.util.Constant;
import com.globalpay.ws.ca.util.Utility;

@Path("/merchant")
public class Base24Service {
	private final static org.slf4j.Logger logger = LoggerFactory
			.getLogger(Base24Service.class);

	@Autowired
	GNAPService gnapService;

	@Context
	private HttpServletRequest request;

	@GET
	public String hello() {
		logger.debug("Base24Service updateMerchantInfo method started");
		return "Hello Merchant";
	}

	@PUT
	@Produces("application/json")
	@Consumes("application/json")
	public Response updateMerchantInfo(UpdateMerchantInfo updateMerchantInfo)
			throws MandatoryFieldNotFoundException, SocketException,
			RetailerNotFoundException, NoBufferSpaceException,
			NoCBSpaceException, NoIOCBSpaceException, NoIOBufSpaceException,
			NoIOPhysMemException, NoPoolSpaceException, StatusTimeoutException,
			RetailerFileException, NoPhysMemException,
			ConnectionFailedException, ConnectionFileInvalidException,
			Exception {

		logger.debug("updateMerchantInfo method started");

		UpdateMerchantResponse merchantResponse = new UpdateMerchantResponse();

		/**
		 * As discussed with Neela, For the fields/ logging requirement, we
		 * will pass the requestId, userId, correlation id.. you should not have
		 * any check on these, but just log these fields in your logs
		 * (irrespective of whether they are populated or not), and send back in
		 * response.
		 */
		String requestID = updateMerchantInfo.getRequestId();
		String userID = updateMerchantInfo.getUserId();

		// if (requestID != null) {
		merchantResponse.setRequestID(requestID);
		request.setAttribute(Constant.REQUEST_ID.getConstantValue(), requestID);
		logger.info("Request Id : " + requestID);
		// }
		// if (userID != null) {
		merchantResponse.setUserId(userID);
		request.setAttribute(Constant.USER_ID.getConstantValue(), userID);
		logger.info("User Id : " + userID);
		// }

		// Start - Fix for Retailer Id + FIID 
		/*String validatedMerchant = Utility.validateMerchant(updateMerchantInfo
				.getMerchantInfo().getMerchantId());*/
		String validatedRetailerId = Utility.validateRetailer(updateMerchantInfo
				.getMerchantInfo().getRetailerId());
		// End - Fix for Retailer Id + FIID 

		updateMerchantInfo.getMerchantInfo().setRetailerId(validatedRetailerId);
		MerchantInfoDTO merchantDTO = Utility.mapDTO(updateMerchantInfo);
		//
		if (merchantDTO != null) {

			StatusDetailsDTO statusDetails = gnapService
					.updateMerchantInfo(merchantDTO);
			merchantResponse.setCode(statusDetails.getCode());

			merchantResponse.setDescription(statusDetails.getDescription());

		}
		// gnapService.processPRDF(mod, record);
		// }
		logger.debug(" updateMerchantInfo method end");
		return Response.status(200).entity(merchantResponse).build();

	}

}