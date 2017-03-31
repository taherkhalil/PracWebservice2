
/*
* @(#)SvcPTDF53_0818.java
 * Created by CSL Studio (java-service-schema) on 18/08/2016 05:17:03 PM

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
 * <code>SvcPTDF53_0818</code>
 *
 * 
 */
 	
	public class SvcPTDF53_0818 extends CSLService {
	/*
	 * default values for
	 * pathmon, system, server
	 */
	final public static String PATHMON = "$FIL4";
	final public static String SYSTEM = "\\GPDEV";
	final public static String SERVER = "SERVER-PTD";

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
       pathmon = "$FIL4";
       serverclass = "SERVER-PTD";
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
	 * <code>SvcPTDF53_0818</code>
	 * 
	 * @param connection
	 * @throws  com.comforte.csl.cslapi.CSLException,
	 *			java.io.IOException	
	 */
	public SvcPTDF53_0818
	(CSLConnection connection)
	throws CSLException, IOException {

		super(connection);

		setPathmon(PATHMON);
		setSystem(SYSTEM);
		setServer(SERVER);

		setTmfMode(TRANSACTION_MODE);
	}

	/**
	 * <code>SvcPTDF53_0818</code>
	 * 
	 * @param localTransaction
	 * @throws  com.comforte.csl.cslapi.CSLException,
	 *			java.io.IOException	
	 */
	public SvcPTDF53_0818
	(CSLLocalTransaction localTransaction)
	throws CSLException, IOException {

		super(localTransaction);

		setPathmon(PATHMON);
		setSystem(SYSTEM);
		setServer(SERVER);

		setTmfMode(TRANSACTION_MODE);
	}

	/**
	 * <code>SvcPTDF53_0818</code>
	 * 
	 * @param path
	 * @throws  com.comforte.csl.cslapi.CSLException,
	 *			java.io.IOException	
	 */
	public SvcPTDF53_0818
	()
	throws CSLException, IOException {

		this(null,null,null);

	}

	/**
	 * <code>SvcPTDF53_0818</code>
	 * 
	 * @param path
	 * @throws  com.comforte.csl.cslapi.CSLException,
	 *			java.io.IOException	
	 */
	public SvcPTDF53_0818
	(String path)
	throws CSLException, IOException {

		this(path,null,null);

	}

	/**
	 * <code>SvcPTDF53_0818</code>
	 * 
	 * @param path
	 * @param user
	 * @param password
	 * @throws  com.comforte.csl.cslapi.CSLException,
	 *			java.io.IOException	
	 */
	public SvcPTDF53_0818
	(String path, String user, String password)
	throws CSLException, IOException {

		super(path,user,password);

		setPathmon(PATHMON);
		setSystem(SYSTEM);
		setServer(SERVER);

		setTmfMode(TRANSACTION_MODE);
	}
	
	
	/**
	 * <code>opDoPTDF53</code>
	 * 
	 * @param request
	 * @return
	 * @throws java.io.IOException, 
	 *         javax.resource.ResourceException,
	 *         com.comforte.csl.cslapi.CSLException
	 *         com.comforte.csl.service.ServiceException
	 */

	

	public csl.globalpay.ipm.msgptdf53reply.MsgPTDF53Reply opDoPTDF53
	(csl.globalpay.ipm.msgptdf53req.MsgPTDF53Req request)
	throws IOException, CSLException, ServiceException {

	csl.globalpay.ipm.msgptdf53reply.MsgPTDF53Reply reply = new csl.globalpay.ipm.msgptdf53reply.MsgPTDF53Reply();

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
		//setErrorEvaluationValues("0");
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
			
					serviceException = new ServiceException(e, new csl.globalpay.ipm.msgptdf53reply.MsgPTDF53Reply());
				
			throw serviceException;
		}

		return reply;
	}
	/**
	* <code>opDoPTDF53</code>
	* @param pathwayServerClass
	* @param request
	* @return
	* @throws java.io.IOException, 
	*         javax.resource.ResourceException,
	*         com.comforte.csl.cslapi.CSLException
	*         com.comforte.csl.service.ServiceException
	*/
	public csl.globalpay.ipm.msgptdf53reply.MsgPTDF53Reply opDoPTDF53
	(PathwayServerClass pathwayServerClass, csl.globalpay.ipm.msgptdf53req.MsgPTDF53Req request)
	throws IOException, CSLException, ServiceException {
	csl.globalpay.ipm.msgptdf53reply.MsgPTDF53Reply reply = new csl.globalpay.ipm.msgptdf53reply.MsgPTDF53Reply();
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
			//setErrorEvaluationValues("0");
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
	
			serviceException = new ServiceException(e, new csl.globalpay.ipm.msgptdf53reply.MsgPTDF53Reply());
		
	throw serviceException;
	}
	return reply;
	}


}

