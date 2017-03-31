package com.globalpay.ws.ca.dao;

import java.io.IOException;
import java.io.InputStream;
import java.net.SocketException;
import java.net.URL;

import org.slf4j.LoggerFactory;

import com.comforte.csl.cslapi.CSLConnection;
import com.comforte.csl.cslapi.CSLException;
import com.comforte.csl.cslapi.CSLSession;
import com.comforte.csl.service.ServiceException;
import com.globalpay.ws.ca.beans.ConnectionTypes;
import com.globalpay.ws.ca.beans.MsgHeaderInfo;
import com.globalpay.ws.ca.beans.StatusCode;
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
import com.globalpay.ws.ca.generatedb24classes.BASE24;
import com.globalpay.ws.ca.generatedb24classes.CurrentConnection;
import com.globalpay.ws.ca.util.Constant;
import com.globalpay.ws.ca.util.Utility;

import csl.globalpay.ipm.SvcPRDF5_0824;
import csl.globalpay.ipm.msgprdf5reply.MsgPRDF5Reply;
import csl.globalpay.ipm.msgprdf5req.MsgPRDF5Req;
import csl.globalpay.ipm.msgprdf5req.msgprdf.ErrStatus;
import csl.globalpay.ipm.msgprdf5req.msgprdf.LastFm;
import csl.globalpay.ipm.msgprdf5req.msgprdf.MsgHeader;
import csl.globalpay.ipm.msgprdf5req.msgprdf.Msgprdf;
import csl.globalpay.ipm.msgprdf5req.msgprdf.PrdfRecImage;
import csl.globalpay.ipm.msgprdf5req.msgprdf.RecImage;
import csl.globalpay.ipm.msgprdf5req.msgprdf.Rkey;
import csl.globalpay.ipm.msgprdf5req.msgprdf.UserData;

public class B24interface {
	private final static org.slf4j.Logger logger = LoggerFactory
			.getLogger(B24interface.class);

	private static CSLConnection connect = null;
	private static MsgHeaderInfo msgHeader = new MsgHeaderInfo();
	private static int failoverThreshold = 1; 
	private boolean flag = true;

	private static CSLConnection getConnectionInstance()
			throws ConnectionFileInvalidException, ConnectionFailedException {
		logger.debug("B24interface getConnectionInstance method started");

		try {
			String currentConnection = readCurrentConnection();
			// if (currentConnection != null
			// && currentConnection.trim().length() > 0) {

			String connectionFile = getConnectionFile(currentConnection);
			logger.debug("B24interface trying to connect to CSL");
			connect = new CSLConnection(connectionFile);

			logger.info("Succesfully estabilished connection with  "
					+ currentConnection);
			// } else {
			// logger.error("The connection file contains an invalid connection option");
			// throw new Exception(
			// "The connection file contains an invalid connection option");
			// }
		} catch (CSLException e) {

			logger.error("Connection failed : " + e.getMessage());
			throw new ConnectionFailedException("Connection failed : "
					+ e.getMessage());
		}
		logger.debug("B24interface getConnectionInstance method end");
		return connect;
	}

	private static String readCurrentConnection()
			throws ConnectionFileInvalidException {
		logger.debug("B24interface readCurrentConnection method started");

		InputStream in = Thread.currentThread().getContextClassLoader()
				.getResourceAsStream("/CurrentConnection.xml");

		CurrentConnection currentConnection = Utility.parseRecord(in,
				CurrentConnection.class);
		
		// Start - VERACODE scan fix for Improper Resource Shutdown or Release (CWE ID 404)(1 flaw)
				try {
					if (in != null) {
						in.close();
						logger.debug("Inputstream closed successfully");
					}
				} catch (IOException e) {
					logger.error("Error closing Inputstream.");
					//e.printStackTrace();
				}
		// End - VERACODE scan fix for Improper Resource Shutdown or Release (CWE ID 404)(1 flaw)

		failoverThreshold = currentConnection.getFailoverThreshold();
		logger.debug("Failoverthreshold --"  + failoverThreshold);
		
		if (currentConnection != null && currentConnection.getCurrent() != null
				&& currentConnection.getCurrent().trim().length() > 0) {
			logger.info("Current connection is "
					+ currentConnection.getCurrent());
			logger.debug("B24interface readCurrentConnection method end");
			return currentConnection.getCurrent();
		} else {
			throw new ConnectionFileInvalidException(
					"The connection file contains an invalid connection option - '"
							+ currentConnection
							+ "', valid options are sccgp and mccgp.");
		}

	}

	private static String getConnectionFile(String currentConnection) {
		logger.debug("B24interface getConnectionFile method started");
		
		String connectionFile = "";

		InputStream msgHdr = Thread.currentThread().getContextClassLoader()
				.getResourceAsStream("/MsgHeader.xml");
		BASE24 base24 = Utility.parseRecord(msgHdr, BASE24.class);
		
		// Start - VERACODE scan fix for Improper Resource Shutdown or Release (CWE ID 404)(1 flaw)
		try {
			if (msgHdr != null)
				msgHdr.close();
			logger.debug("Inputstream closed successfully");
		} catch (IOException e) {
			logger.error("Error closing Inputstream.");
			//e.printStackTrace();
		}
		// End - VERACODE scan fix for Improper Resource Shutdown or Release (CWE ID 404)(1 flaw)

		if (ConnectionTypes.CONNECTIONTYPE_SCCGP.getConnectionType()
				.equalsIgnoreCase(currentConnection)) {
			logger.info("The connection file contains connection option - '"
					+ currentConnection + "'");
			URL url = Thread.currentThread().getContextClassLoader()
					.getResource("/sccgp.INI");
			connectionFile = url.getPath();
			BASE24.MSGHEADER.SCCGP sccgp = base24.getMSGHEADER().getSCCGP();
			msgHeader.setBrch(Utility.validateString(sccgp.getBRCH()));
			logger.info("SCCGP BRNCH ---> "+sccgp.getBRCH());
			msgHeader.setErrcde(new Integer(sccgp.getERRCDE()).shortValue());
			msgHeader.setErrsubcde(new Integer(sccgp.getERRSUBCDE())
					.shortValue());
			msgHeader.setFiid(Utility.validateString(sccgp.getFIID() + ""));
			msgHeader.setFrmtcde(Utility.validateString(String.valueOf(sccgp.getFRMTCDE())));
			msgHeader
					.setLconfname(Utility.validateString(sccgp.getLCONFNAME()));
			msgHeader.setLn(Utility.validateString(sccgp.getLN()));
			msgHeader
					.setOmfaudit(new Integer(sccgp.getOMFAUDIT()).shortValue());
			msgHeader.setPathmon(Utility.validateString(sccgp.getPATHMON()));
			msgHeader
					.setPinserver(Utility.validateString(sccgp.getPINSERVER()));
			msgHeader
					.setPtdserver(Utility.validateString(sccgp.getPTDSERVER()));
			msgHeader
					.setRdfserver(Utility.validateString(sccgp.getRDFSERVER()));
			msgHeader.setRegn(Utility.validateString(sccgp.getREGN()));
			msgHeader.setReplcde(sccgp.getREPLCDE());
			msgHeader.setSiteprodind(sccgp.getSITEPRODIND().toString());
			logger.info("sccgp SITEPRODIND() ---> "+sccgp.getSITEPRODIND());
			msgHeader.setTermid(Utility.validateString(sccgp.getTERMID()));
			msgHeader.setUsergrp(new Integer(sccgp.getUSERGRP()).shortValue());
			msgHeader.setUsernum(sccgp.getUSERNUM());
			msgHeader.setSystem(Utility.validateString(sccgp.getSYSTEM()));

		} else if (ConnectionTypes.CONNECTIONTYPE_MCCGP.getConnectionType()
				.equalsIgnoreCase(currentConnection)) {

			logger.info("The connection file contains connection option - '"
					+ currentConnection + "'");
			URL url = Thread.currentThread().getContextClassLoader()
					.getResource("/mccgp.INI");
			connectionFile = url.getPath();

			BASE24.MSGHEADER.MCCGP mccgp = base24.getMSGHEADER().getMCCGP();

			msgHeader.setBrch(Utility.validateString(mccgp.getBRCH()));
			msgHeader.setErrcde(new Integer(mccgp.getERRCDE()).shortValue());
			msgHeader.setErrsubcde(new Integer(mccgp.getERRSUBCDE())
					.shortValue());
			msgHeader.setFiid(Utility.validateString(mccgp.getFIID() + ""));
			msgHeader.setFrmtcde(Utility.validateString(mccgp.getFRMTCDE()));
			msgHeader
					.setLconfname(Utility.validateString(mccgp.getLCONFNAME()));
			msgHeader.setLn(Utility.validateString(mccgp.getLN()));
			msgHeader
					.setOmfaudit(new Integer(mccgp.getOMFAUDIT()).shortValue());
			msgHeader.setPathmon(Utility.validateString(mccgp.getPATHMON()));
			msgHeader
					.setPinserver(Utility.validateString(mccgp.getPINSERVER()));
			msgHeader
					.setPtdserver(Utility.validateString(mccgp.getPTDSERVER()));
			msgHeader
					.setRdfserver(Utility.validateString(mccgp.getRDFSERVER()));
			msgHeader.setRegn(Utility.validateString(mccgp.getREGN()));
			msgHeader.setReplcde(mccgp.getREPLCDE());
			msgHeader.setSiteprodind(mccgp.getSITEPRODIND().toString());
			msgHeader.setTermid(Utility.validateString(mccgp.getTERMID()));
			msgHeader.setUsergrp(new Integer(mccgp.getUSERGRP()).shortValue());
			msgHeader.setUsernum(mccgp.getUSERNUM());
			msgHeader.setSystem(Utility.validateString(mccgp.getSYSTEM()));

		} else {
			logger.info("The connection file contains an invalid connection option - '"
					+ currentConnection
					+ "', valid options are sccgp and mccgp.");

			// connectionFile = "";
		}
		logger.debug("The Connection File path is : " + connectionFile);
		logger.debug("B24interface getConnectionFile method end");
		return connectionFile;
	}

	public MsgPRDF5Reply updatePRDF(MsgPRDF5Req prdfReq)
			throws ConnectionFailedException, SocketException,
			RetailerFileException, StatusTimeoutException,
			NoPoolSpaceException, NoPhysMemException, NoIOPhysMemException,
			NoIOCBSpaceException, NoIOBufSpaceException,
			ConnectionFileInvalidException, RetailerNotFoundException,
			NoBufferSpaceException, NoCBSpaceException {
		logger.debug("update PRDFRecord method start");
		logger.debug("updatePRDF RetailerId: "+ prdfReq.getMsgprdf().getRecImage().getPrdfRecImage().getRkey().getRetailerId() 
				+ " RetailerFIID: " + prdfReq.getMsgprdf().getMsgHeader().getUserData().getFiid());
		
		CSLSession session = null;
		MsgPRDF5Reply prdfReply = null;
		try {
			connect = getConnectionInstance();
			/*session = new CSLSession(connect);

			session.beginSession();*/
			
			logger.info("Going to begin session for update");
			flag = true;
			session = getSession(connect,0);
			
			logger.info("Session started for update");

			SvcPRDF5_0824 svc = new SvcPRDF5_0824(connect);
			svc.setServer(msgHeader.getRdfserver());
			svc.setPathmon(msgHeader.getPathmon());
			svc.setSystem(msgHeader.getSystem());

			prdfReq.getMsgprdf().getMsgHeader()
					.setApplCde(Constant.APPL_CDE.getConstantValue());
			prdfReq.getMsgprdf().getMsgHeader()
					.setTranCde(Constant.UPDATE_TRAN_CDE.getConstantValue());

			logger.debug("updating PRDF record into B24 for retailer ID : "
					+ prdfReq.getMsgprdf().getRecImage().getPrdfRecImage()
							.getRkey().getRetailerId()
					+ " for usergrp "
					+ prdfReq.getMsgprdf().getMsgHeader().getUserData()
							.getUserGrp()
					+ " and usernum "
					+ prdfReq.getMsgprdf().getMsgHeader().getUserData()
							.getUserNum()
					 + " and retailerIdFiid " + prdfReq.getMsgprdf().getMsgHeader().getUserData().getFiid());

			prdfReply = svc.opDoPRDF5(prdfReq);

			logger.info("updated PRDF record into B24 for retailer ID : "
					+ prdfReq.getMsgprdf().getRecImage().getPrdfRecImage()
							.getRkey().getRetailerId());

			if (prdfReply != null) {

				logger.debug(" We got response from update operation");
				Short errorCode = prdfReply.getMsgprdf().getMsgHeader()
						.getErrStatus().getErrCde();
				logger.info("Response text"
						+ prdfReply.getMsgprdf().getMsgHeader().getErrTxt()
						+ "Response Code " + errorCode);

				logger.debug("***************************After updated data for Merchant or Retailer "
						+ prdfReply.getMsgprdf().getRecImage()
								.getPrdfRecImage().getRkey().getRetailerId()
						+ " and retailerIdFiid " + prdfReq.getMsgprdf().getMsgHeader().getUserData().getFiid()
						+ "*****");
				logger.debug("prdfReply add1 object : "
						+ prdfReply.getMsgprdf().getRecImage()
								.getPrdfRecImage().getRetailer().getAddr());
				logger.debug("prdfReply add2 object : "
						+ prdfReply.getMsgprdf().getRecImage()
								.getPrdfRecImage().getRetailer().getAddrExt());
				logger.debug("prdfReply city object : "
						+ prdfReply.getMsgprdf().getRecImage()
								.getPrdfRecImage().getRetailer().getCity());
				logger.debug("prdfReply cntry object : "
						+ prdfReq.getMsgprdf().getRecImage().getPrdfRecImage()
								.getRetailer().getCntry());
				logger.debug("prdfReply zip object : "
						+ prdfReply.getMsgprdf().getRecImage()
								.getPrdfRecImage().getRetailer().getPostalCde());
				logger.debug("prdfReply state object : "
						+ prdfReply.getMsgprdf().getRecImage()
								.getPrdfRecImage().getRetailer().getSt());
				logger.debug("prdfReply cntry object : "
						+ prdfReply.getMsgprdf().getRecImage()
								.getPrdfRecImage().getRetailer().getCntry());
				logger.debug("prdfReply AftHrsPhone object : "
						+ prdfReply.getMsgprdf().getRecImage()
								.getPrdfRecImage().getRetailer()
								.getAftHrsPhone());
				logger.debug("prdfReply ChkRtgGrp object : "
						+ prdfReply.getMsgprdf().getRecImage()
								.getPrdfRecImage().getChkRtgGrp());
				logger.debug("prdfReply ChkMrchntId object : "
						+ prdfReply.getMsgprdf().getRecImage()
								.getPrdfRecImage().getChkMrchntId());
				logger.debug("prdfReply after setting name object : "
						+ prdfReply.getMsgprdf().getRecImage()
								.getPrdfRecImage().getRetailer().getName());
				logger.debug("prdfReply phone object : "
						+ prdfReply.getMsgprdf().getRecImage()
								.getPrdfRecImage().getRetailer().getPhone());

				if (StatusCode.STATUS_SUCCESS.getStatusCode() == errorCode) {
				} else if (StatusCode.STATUS_NOT_FOUND.getStatusCode() == errorCode) {
					throw new RetailerNotFoundException(prdfReply.getMsgprdf()
							.getMsgHeader().getErrTxt());
				} else if (StatusCode.STATUS_NO_BFR_SPC.getStatusCode() == errorCode) {
					throw new NoBufferSpaceException(prdfReply.getMsgprdf()
							.getMsgHeader().getErrTxt());
				} else if (StatusCode.STATUS_NO_CB_SPACE.getStatusCode() == errorCode) {
					throw new NoCBSpaceException(prdfReply.getMsgprdf()
							.getMsgHeader().getErrTxt());
				} else if (StatusCode.STATUS_NO_IO_BUF_SPACE.getStatusCode() == errorCode) {
					throw new NoIOBufSpaceException(prdfReply.getMsgprdf()
							.getMsgHeader().getErrTxt());
				} else if (StatusCode.STATUS_NO_IO_CB_SPACE.getStatusCode() == errorCode) {
					throw new NoIOCBSpaceException(prdfReply.getMsgprdf()
							.getMsgHeader().getErrTxt());
				} else if (StatusCode.STATUS_NO_IO_PHYS_MEM.getStatusCode() == errorCode) {
					throw new NoIOPhysMemException(prdfReply.getMsgprdf()
							.getMsgHeader().getErrTxt());
				} else if (StatusCode.STATUS_NO_PHYS_MEM.getStatusCode() == errorCode) {
					throw new NoPhysMemException(prdfReply.getMsgprdf()
							.getMsgHeader().getErrTxt());
				} else if (StatusCode.STATUS_NO_POOL_SPACE.getStatusCode() == errorCode) {
					throw new NoPoolSpaceException(prdfReply.getMsgprdf()
							.getMsgHeader().getErrTxt());
				} else if (StatusCode.STATUS_TIMEDOUT.getStatusCode() == errorCode) {
					throw new StatusTimeoutException(prdfReply.getMsgprdf()
							.getMsgHeader().getErrTxt());

				} else {
					throw new RetailerFileException(prdfReply.getMsgprdf()
							.getMsgHeader().getErrTxt());
				}

			} else {
				logger.debug(" We didnt get response from update operation");
			}
		} catch (SocketException e1) {
			logger.error("Socket Connection : " + e1);
			throw new SocketException("Socket Connection : " + e1);
		} catch (IOException | CSLException | /*
											 * ConnectionFailedException |
											 */ServiceException e) {
			logger.error("Connection failed : " + e.getMessage());
			throw new ConnectionFailedException("Connection failed : "
					+ e.getMessage());
		} finally {
			logger.debug("session finished");
			if (session !=null && session.isAlive()) {
				session.finishSession();
			}
		}
		return prdfReply;

	}

	public MsgPRDF5Reply readRetailer(String retailerId, String retailerFiid)
			throws RetailerNotFoundException, NoBufferSpaceException,
			NoCBSpaceException, NoIOCBSpaceException, NoIOBufSpaceException,
			NoIOPhysMemException, NoPoolSpaceException, StatusTimeoutException,
			RetailerFileException, NoPhysMemException, SocketException,
			ConnectionFailedException, ConnectionFileInvalidException {
		logger.debug("ReadPRDFRecord  method start  ");
		logger.debug("ReadPRDFRecord  RetailerId: "+ retailerId + " RetailerFIID: " + retailerFiid);
		
		CSLSession session = null;

		MsgPRDF5Reply prdfReply = null;
		try {
			connect = getConnectionInstance();
			logger.info("Now trying to fetch session object");
//			session = new CSLSession(connect);
			
//			session.beginSession();
			
			logger.info("Going to begin session for read");
			flag = true;
			session = getSession(connect,0);
			logger.info("Session started for read");
			
			SvcPRDF5_0824 svc = new SvcPRDF5_0824(connect);
			svc.setServer(msgHeader.getRdfserver());
			svc.setPathmon(msgHeader.getPathmon());
			svc.setSystem(msgHeader.getSystem());

			MsgPRDF5Req prdfReq = new MsgPRDF5Req();
			Msgprdf msgprdf = new Msgprdf();
			MsgHeader hdr = new MsgHeader();

			hdr.setApplCde(Constant.APPL_CDE.getConstantValue());
			hdr.setTranCde(Constant.READ_TRAN_CDE.getConstantValue());

			hdr.setReplCde(msgHeader.getReplcde().shortValue());
			hdr.setTermId(msgHeader.getTermid());
			hdr.setOmfAudit("" + msgHeader.getOmfaudit());
			hdr.setFrmtCde(msgHeader.getFrmtcde());
			hdr.setLconfName(msgHeader.getLconfname());
			hdr.setSiteProdInd(msgHeader.getSiteprodind());
			hdr.setErrNum("");
			hdr.setErrTxt("");

			// // ERROR Status
			ErrStatus errStatus = new ErrStatus();
			errStatus.setErrCde(msgHeader.getErrcde());
			errStatus.setErrSubCde(msgHeader.getErrsubcde());
			hdr.setErrStatus(errStatus);

			// User Data
			UserData userData = new UserData();
			userData.setLn(msgHeader.getLn());
			// Start - Fix for Retailer Id + FIID 
			/*userData.setFiid(msgHeader.getFiid());*/
			userData.setFiid(retailerFiid);
			// StEndart - Fix for Retailer Id + FIID 
			userData.setRegn(msgHeader.getRegn());
			userData.setBrch(msgHeader.getBrch());
			userData.setUserGrp(msgHeader.getUsergrp());
			userData.setUserNum(new Integer(msgHeader.getUsernum()));
			hdr.setUserData(userData);

			// Last FM
			LastFm lastFm = new LastFm();
			// lastFm.setFiller(theFiller);
			lastFm.setFmTimestamp("");
			lastFm.setFmUserGrp(msgHeader.getUsergrp());
			lastFm.setFmUserNum(new Integer(msgHeader.getUsernum()));
			lastFm.setStaNum("");
			lastFm.setUpdtTyp("");

			RecImage recImage = new RecImage();
			PrdfRecImage prdfRecImage = new PrdfRecImage();
			Rkey rkey = new Rkey();
			// Start - Fix for Retailer Id + FIID 
			/*rkey.setFiid(msgHeader.getFiid());*/
			rkey.setFiid(retailerFiid);
			rkey.setRetailerId(retailerId);
			// End - Fix for Retailer Id + FIID 

			prdfRecImage.setRkey(rkey);
			recImage.setPrdfRecImage(prdfRecImage);
			msgprdf.setMsgHeader(hdr);
			msgprdf.setLastFm(lastFm);
			msgprdf.setRecImage(recImage);
			prdfReq.setMsgprdf(msgprdf);
			logger.debug("Reading Retailer record from B24 for retailer ID "
					+ rkey.getRetailerId()
					+ " for usergrp "
					+ prdfReq.getMsgprdf().getMsgHeader().getUserData()
							.getUserGrp()
					+ " and usernum "
					+ prdfReq.getMsgprdf().getMsgHeader().getUserData()
							.getUserNum()
				    + " and retailerIdFiid " + prdfReq.getMsgprdf().getMsgHeader().getUserData().getFiid());

			prdfReply = svc.opDoPRDF5(prdfReq);
			logger.info("Read Retailer record from B24 completed for retailer ID "
					+ rkey.getRetailerId());

			if (prdfReply != null) {
				logger.debug("We got response from read operation");

				Short errorCode = prdfReply.getMsgprdf().getMsgHeader()
						.getErrStatus().getErrCde();

				logger.info("Response text"
						+ prdfReply.getMsgprdf().getMsgHeader().getErrTxt()
						+ "Response Code " + errorCode);
				logger.debug("*****Read Data for Retailer "
						+ prdfReply.getMsgprdf().getRecImage()
								.getPrdfRecImage().getRkey().getRetailerId()
						+ " and retailerIdFiid " + prdfReq.getMsgprdf().getMsgHeader().getUserData().getFiid()
						+ "*****");
				logger.debug("prdfReply add1 object : "
						+ prdfReply.getMsgprdf().getRecImage()
								.getPrdfRecImage().getRetailer().getAddr());
				logger.debug("prdfReply add2 object : "
						+ prdfReply.getMsgprdf().getRecImage()
								.getPrdfRecImage().getRetailer().getAddrExt());
				logger.debug("prdfReply city object : "
						+ prdfReply.getMsgprdf().getRecImage()
								.getPrdfRecImage().getRetailer().getCity());
				logger.debug("prdfReply cntry object : "
						+ prdfReq.getMsgprdf().getRecImage().getPrdfRecImage()
								.getRetailer().getCntry());
				logger.debug("prdfReply zip object : "
						+ prdfReply.getMsgprdf().getRecImage()
								.getPrdfRecImage().getRetailer().getPostalCde());
				logger.debug("prdfReply state object : "
						+ prdfReply.getMsgprdf().getRecImage()
								.getPrdfRecImage().getRetailer().getSt());
				logger.debug("prdfReply cntry object : "
						+ prdfReply.getMsgprdf().getRecImage()
								.getPrdfRecImage().getRetailer().getCntry());
				logger.debug("prdfReply AftHrsPhone object : "
						+ prdfReply.getMsgprdf().getRecImage()
								.getPrdfRecImage().getRetailer()
								.getAftHrsPhone());
				logger.debug("prdfReply ChkRtgGrp object : "
						+ prdfReply.getMsgprdf().getRecImage()
								.getPrdfRecImage().getChkRtgGrp());
				logger.debug("prdfReply ChkMrchntId object : "
						+ prdfReply.getMsgprdf().getRecImage()
								.getPrdfRecImage().getChkMrchntId());
				logger.debug("prdfReply after setting name object : "
						+ prdfReply.getMsgprdf().getRecImage()
								.getPrdfRecImage().getRetailer().getName());
				logger.debug("prdfReply phone object : "
						+ prdfReply.getMsgprdf().getRecImage()
								.getPrdfRecImage().getRetailer().getPhone());

				if (StatusCode.STATUS_SUCCESS.getStatusCode() == errorCode) {
				} else if (StatusCode.STATUS_NOT_FOUND.getStatusCode() == errorCode) {
					throw new RetailerNotFoundException(prdfReply.getMsgprdf()
							.getMsgHeader().getErrTxt());
				} else if (StatusCode.STATUS_NO_BFR_SPC.getStatusCode() == errorCode) {
					throw new NoBufferSpaceException(prdfReply.getMsgprdf()
							.getMsgHeader().getErrTxt());
				} else if (StatusCode.STATUS_NO_CB_SPACE.getStatusCode() == errorCode) {
					throw new NoCBSpaceException(prdfReply.getMsgprdf()
							.getMsgHeader().getErrTxt());
				} else if (StatusCode.STATUS_NO_IO_BUF_SPACE.getStatusCode() == errorCode) {
					throw new NoIOBufSpaceException(prdfReply.getMsgprdf()
							.getMsgHeader().getErrTxt());
				} else if (StatusCode.STATUS_NO_IO_CB_SPACE.getStatusCode() == errorCode) {
					throw new NoIOCBSpaceException(prdfReply.getMsgprdf()
							.getMsgHeader().getErrTxt());
				} else if (StatusCode.STATUS_NO_IO_PHYS_MEM.getStatusCode() == errorCode) {
					throw new NoIOPhysMemException(prdfReply.getMsgprdf()
							.getMsgHeader().getErrTxt());
				} else if (StatusCode.STATUS_NO_PHYS_MEM.getStatusCode() == errorCode) {
					throw new NoPhysMemException(prdfReply.getMsgprdf()
							.getMsgHeader().getErrTxt());
				} else if (StatusCode.STATUS_NO_POOL_SPACE.getStatusCode() == errorCode) {
					throw new NoPoolSpaceException(prdfReply.getMsgprdf()
							.getMsgHeader().getErrTxt());
				} else if (StatusCode.STATUS_TIMEDOUT.getStatusCode() == errorCode) {
					throw new StatusTimeoutException(prdfReply.getMsgprdf()
							.getMsgHeader().getErrTxt());

				} else {
					throw new RetailerFileException(prdfReply.getMsgprdf()
							.getMsgHeader().getErrTxt());
				}

			} else {
				logger.debug(" We didnt get any response from read operation");
				throw new ConnectionFailedException();
			}

		} catch (SocketException e1) {
			logger.error("Socket Connection : " + e1);
			throw new SocketException("Socket Connection : " + e1);
		} catch (IOException | CSLException | ConnectionFailedException
				| ServiceException e) {
			logger.error("Connection failed : " + e.getMessage());
			throw new ConnectionFailedException("Connection failed : "
					+ e.getMessage());
		} /*
		 * catch (Exception e1) { e1.printStackTrace(); }
		 */finally {
			logger.debug("session finished");
			if (session !=null && session.isAlive()) {
				session.finishSession();
			}
		}
		return prdfReply;
	}
	
	private CSLSession getSession(CSLConnection connect,int count ) throws SocketException, ConnectionFailedException, ConnectionFileInvalidException {

		CSLSession session = null;
		try {
			session = new CSLSession(connect);
			session.beginSession();
		} catch (SocketException e1) {
			count++;
			logger.debug("count -- "+count);
			if(count<failoverThreshold){
				logger.debug("as count is less than "+failoverThreshold+" so inside if");
				getSession(connect, count);
				return session;
			}else if(count >=failoverThreshold && count < failoverThreshold*2 ){
				logger.debug("Now inside else");
				if(flag){
					logger.debug("get mccgp connect object");
					connect = getConnectionUsingMccgp();
					flag= false;
				}
				logger.debug("Now will try to connect with mccgp");
				getSession(connect, count);
				logger.debug("session started successfully with mccgp");				
				
				return session;
			}
			logger.error("Socket Connection : " + e1);
			throw new SocketException("Socket Connection : " + e1);
		} catch (IOException | CSLException e) {
			logger.error("Connection failed : " + e.getMessage());
			throw new ConnectionFailedException("Connection failed : "
					+ e.getMessage());
		}


		return session;
	}


private static CSLConnection getConnectionUsingMccgp()
			throws ConnectionFileInvalidException, ConnectionFailedException {
		logger.debug("B24interface getConnectionUsingMccgp method started");

		try {

			String connectionFile = getConnectionFile("mccgp");
			logger.debug("B24interface trying to connect to CSL");
			connect = new CSLConnection(connectionFile);

			logger.info("Succesfully estabilished connection with  mccgp");
		} catch (CSLException e) {

			logger.error("Connection failed : " + e.getMessage());
			throw new ConnectionFailedException("Connection failed : "
					+ e.getMessage());
		}
		logger.debug("B24interface getConnectionInstance method end");
		return connect;
	}

}
