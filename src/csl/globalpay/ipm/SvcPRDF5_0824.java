
/*
* @(#)SvcPRDF5_0824.java
 * Created by CSL Studio (java-service-schema) on 24/08/2016 10:54:43 AM

*/  		


package csl.globalpay.ipm;

	
import java.io.IOException;

import com.comforte.csl.cslapi.CSLConnection;
import com.comforte.csl.cslapi.CSLErrorException;
import com.comforte.csl.cslapi.CSLException;
import com.comforte.csl.service.CSLLocalTransaction;
import com.comforte.csl.service.CSLService;
import com.comforte.csl.service.ServiceException;


/**
 * <code>SvcPRDF5_0824</code>
 *
 * 
 */
 	
	public class SvcPRDF5_0824 extends CSLService {
	/*
	 * default values for
	 * pathmon, system, server
	 */
	final public static String PATHMON = "$CSLP";
	final public static String SYSTEM = "\\GPDEV";
	final public static String SERVER = "SERVER-RDF";

	/*
	 * default TMF values
	 */
	final public static String 	TRANSACTION_VALUES = "";		
	final public static short	TRANSACTION_MODE = CSLService.NO_TMF;
					

	/**
	* <code>PathwayServerClass.java</code>
	*/
	   public class PathwayServerClass
   {
     String system;
     String pathmon;
     String serverclass;
     public PathwayServerClass()
     {
       system = "\\GPDEV";
       pathmon = "$CSLP";
       serverclass = "SERVER-RDF";
     }
     public String getSystem ()
     {
       return system; 
			}
     public void setSystem (String value)
     {
       system = value; 
			}
     public String getPathmon ()
     {
       return pathmon; 
			}
     public void setPathmon (String value)
     {
       pathmon = value; 
			}
     public String getServerClass ()
     {
       return serverclass; 
			}
     public void setServerClass (String value)
     {
       serverclass = value; 
			}
   }

	/**
	 * <code>SvcPRDF5_0824</code>
	 * 
	 * @param connection
	 * @throws  com.comforte.csl.cslapi.CSLException,
	 *			java.io.IOException	
	 */
	public SvcPRDF5_0824
	(CSLConnection connection)
	throws CSLException, IOException {

		super(connection);

		setPathmon(PATHMON);
		setSystem(SYSTEM);
		setServer(SERVER);

		setTmfMode(TRANSACTION_MODE);
	}

	/**
	 * <code>SvcPRDF5_0824</code>
	 * 
	 * @param localTransaction
	 * @throws  com.comforte.csl.cslapi.CSLException,
	 *			java.io.IOException	
	 */
	public SvcPRDF5_0824
	(CSLLocalTransaction localTransaction)
	throws CSLException, IOException {

		super(localTransaction);

		setPathmon(PATHMON);
		setSystem(SYSTEM);
		setServer(SERVER);

		setTmfMode(TRANSACTION_MODE);
	}

	/**
	 * <code>SvcPRDF5_0824</code>
	 * 
	 * @param path
	 * @throws  com.comforte.csl.cslapi.CSLException,
	 *			java.io.IOException	
	 */
	public SvcPRDF5_0824
	()
	throws CSLException, IOException {

		this(null,null,null);

	}

	/**
	 * <code>SvcPRDF5_0824</code>
	 * 
	 * @param path
	 * @throws  com.comforte.csl.cslapi.CSLException,
	 *			java.io.IOException	
	 */
	public SvcPRDF5_0824
	(String path)
	throws CSLException, IOException {

		this(path,null,null);

	}

	/**
	 * <code>SvcPRDF5_0824</code>
	 * 
	 * @param path
	 * @param user
	 * @param password
	 * @throws  com.comforte.csl.cslapi.CSLException,
	 *			java.io.IOException	
	 */
	public SvcPRDF5_0824
	(String path, String user, String password)
	throws CSLException, IOException {

		super(path,user,password);

		setPathmon(PATHMON);
		setSystem(SYSTEM);
		setServer(SERVER);

		setTmfMode(TRANSACTION_MODE);
	}
	
	
	/**
	 * <code>opDoPRDF5</code>
	 * 
	 * @param request
	 * @return
	 * @throws java.io.IOException, 
	 *         javax.resource.ResourceException,
	 *         com.comforte.csl.cslapi.CSLException
	 *         com.comforte.csl.service.ServiceException
	 */

	

	public csl.globalpay.ipm.msgprdf5reply.MsgPRDF5Reply opDoPRDF5
	(csl.globalpay.ipm.msgprdf5req.MsgPRDF5Req request)
	throws IOException, CSLException, ServiceException {

	csl.globalpay.ipm.msgprdf5reply.MsgPRDF5Reply reply = new csl.globalpay.ipm.msgprdf5reply.MsgPRDF5Reply();

		/*
		 * do some specific settings in request
		 */
			
		 
		/*
		 * TMF settings
		 */				 
		
		setTmfMode(TRANSACTION_MODE);
		setTmfValues(TRANSACTION_VALUES);
			
		/*
		 * EVALUATION settings
		 */
		//Getting error so comforte's team suggested below change 
		//setErrorEvaluationMode(CSLService.ERROR_EVALUATION);
		//setErrorEvaluationValues("00");
		setErrorEvaluationMode(CSLService.NO_ERROR_EVALUATION);
		/*
		 * send the request
		 */
		

		try { 
			execute(request,reply,getPathmon(),getSystem(),getServer());
		} catch (CSLErrorException e) {
			/*
			 * do some error handling
			 */
			ServiceException serviceException = null; 
			
					serviceException = new ServiceException(e, new csl.globalpay.ipm.msgprdf5reply.MsgPRDF5Reply());
			
			throw serviceException;
		}

		return reply;
	}
	/**
	* <code>opDoPRDF5</code>
	* @param pathwayServerClass
	* @param request
	* @return
	* @throws java.io.IOException, 
	*         javax.resource.ResourceException,
	*         com.comforte.csl.cslapi.CSLException
	*         com.comforte.csl.service.ServiceException
	*/
	public csl.globalpay.ipm.msgprdf5reply.MsgPRDF5Reply opDoPRDF5
	(PathwayServerClass pathwayServerClass, csl.globalpay.ipm.msgprdf5req.MsgPRDF5Req request)
	throws IOException, CSLException, ServiceException {
	csl.globalpay.ipm.msgprdf5reply.MsgPRDF5Reply reply = new csl.globalpay.ipm.msgprdf5reply.MsgPRDF5Reply();
	/*
	* do some specific settings in request
	*/
		
	/*
	* TMF settings
	*/				 
	
			setTmfMode(TRANSACTION_MODE);
			setTmfValues(TRANSACTION_VALUES);
		
	/*
	* EVALUATION settings
	*/
	
			//setErrorEvaluationMode(CSLService.ERROR_EVALUATION);
			//setErrorEvaluationValues("00");
			setErrorEvaluationMode(CSLService.NO_ERROR_EVALUATION);
	/*
	* send the request
	*/
		try { 
	execute(request,reply,pathwayServerClass.getPathmon(), pathwayServerClass.getSystem(), pathwayServerClass.getServerClass());
	} catch (CSLErrorException e) {
	/*
	* do some error handling
	*/
	ServiceException serviceException = null; 
	
			serviceException = new ServiceException(e, new csl.globalpay.ipm.msgprdf5reply.MsgPRDF5Reply());
		
	throw serviceException;
	}
	return reply;
	}


}

