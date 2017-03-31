package com.globalpay.ws.ca.exception;

import java.net.SocketException;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.globalpay.ws.ca.beans.ErrorCode;
import com.globalpay.ws.ca.beans.UpdateMerchantResponse;
import com.globalpay.ws.ca.util.Constant;

@Provider
public class GenericExceptionMapper implements ExceptionMapper<Exception> {

	private final static org.slf4j.Logger logger = LoggerFactory
			.getLogger(GenericExceptionMapper.class);
	@Context
	private HttpServletRequest request;
	@Autowired
	private UpdateMerchantResponse merchantResponse;

	@Override
	public Response toResponse(Exception ex) {
		
		String requestID = (String) request.getAttribute(Constant.REQUEST_ID
				.getConstantValue());
		String userID = (String) request.getAttribute(Constant.USER_ID
				.getConstantValue());
		// String correlationID = (String) request
		// .getAttribute(Constant.CORRELATION_ID.getConstantValue());

		merchantResponse.setRequestID(requestID);
		merchantResponse.setUserId(userID);
		// merchantResponse.setCorrelationId(correlationID);

		if (ex instanceof ConnectionFailedException) {
			logger.error("ConnectionFailedException : ", ex);
			merchantResponse.setCode(ErrorCode.ERROR_CONNECTION_FAILED
					.getError());
			merchantResponse.setDescription(ex.getMessage());

		} else if (ex instanceof ConnectionFileInvalidException) {
			logger.error("ConnectionFileInvalidException : ", ex);
			merchantResponse.setCode(ErrorCode.ERROR_CONNECTION_FILE_INVALID
					.getError());
			merchantResponse.setDescription(ex.getMessage());

		} else if (ex instanceof InvalidRequestException) {
			logger.error("InvalidRequestException : ", ex);
			merchantResponse.setCode(ErrorCode.ERROR_PARM_INVALID.getError());
			merchantResponse.setDescription(ex.getMessage());

		} else if (ex instanceof MandatoryFieldNotFoundException) {
			logger.error("MandatoryFieldNotFoundException : ", ex);
			merchantResponse.setCode(ErrorCode.ERROR_MANDATORY_FIELD_MISSING
					.getError());
			merchantResponse.setDescription(ex.getMessage());
		}

		else if (ex instanceof RetailerNotFoundException) {
			logger.error("RetailerNotFoundException : ", ex);
			merchantResponse.setCode(ErrorCode.ERROR_MERCHANT_NOT_FOUND
					.getError());
			merchantResponse.setDescription(ex.getMessage());
		}

		else if (ex instanceof SocketException) {
			logger.error("SocketException : ", ex);
			merchantResponse.setCode(ErrorCode.ERROR_SOCKET_CONNECTION
					.getError());
			merchantResponse.setDescription(ex.getMessage());
		} else if (ex instanceof NoBufferSpaceException) {
			logger.error("NoBufferSpaceException : ", ex);
			merchantResponse.setCode(ErrorCode.ERROR_NO_BFR_SPC.getError());
			merchantResponse.setDescription(ex.getMessage());
		} else if (ex instanceof NoCBSpaceException) {
			logger.error("NoCBSpaceException : ", ex);
			merchantResponse.setCode(ErrorCode.ERROR_NO_CB_SPACE.getError());
			merchantResponse.setDescription(ex.getMessage());
		} else if (ex instanceof NoIOBufSpaceException) {
			logger.error("NoIOBufSpaceException : ", ex);
			merchantResponse
					.setCode(ErrorCode.ERROR_NO_IO_BUF_SPACE.getError());
			merchantResponse.setDescription(ex.getMessage());
		} else if (ex instanceof NoIOCBSpaceException) {
			logger.error("NoIOCBSpaceException : ", ex);
			merchantResponse.setCode(ErrorCode.ERROR_NO_IO_CB_SPACE.getError());
			merchantResponse.setDescription(ex.getMessage());
		} else if (ex instanceof NoIOPhysMemException) {
			logger.error("NoIOPhysMemException : ", ex);
			merchantResponse.setCode(ErrorCode.ERROR_NO_IO_PHYS_MEM.getError());
			merchantResponse.setDescription(ex.getMessage());
		} else if (ex instanceof NoPhysMemException) {
			logger.error("NoPhysMemException : ", ex);
			merchantResponse.setCode(ErrorCode.ERROR_NO_PHYS_MEM.getError());
			merchantResponse.setDescription(ex.getMessage());
		} else if (ex instanceof NoPoolSpaceException) {
			logger.error("NoPoolSpaceException : ", ex);
			merchantResponse.setCode(ErrorCode.ERROR_NO_POOL_SPACE.getError());
			merchantResponse.setDescription(ex.getMessage());
		} else if (ex instanceof RetailerFileException) {
			logger.error("RetailerFileException : ", ex);
			merchantResponse.setCode(ErrorCode.ERROR_RETAILER_FILE.getError());
			merchantResponse.setDescription(ex.getMessage());
		} else if (ex instanceof StatusTimeoutException) {
			logger.error("Status Timeout exception : ", ex);

			merchantResponse.setCode(ErrorCode.ERROR_TIMEDOUT.getError());
			merchantResponse.setDescription(ex.getMessage());
		} else {
			logger.error("Exception occurred :", ex);
			merchantResponse.setCode(ErrorCode.ERROR_EXCEPTION.getError());
			merchantResponse.setDescription("Exception got while executing");
		}

		return Response.status(200).entity(merchantResponse).build();
	}

}
