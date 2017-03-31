
/*
 * @(#)MsgPRDF5Reply2.java
 * Created by CSL Studio (message-schema) on 24/08/2016 10:54:43 AM

 */


package csl.globalpay.ipm.msgprdf5reply;
		
import java.io.IOException;

import com.comforte.csl.cslapi.CSLIOOptions;
import com.comforte.csl.cslapi.CSLInputStream;
import com.comforte.csl.cslapi.CSLOutputStream;

import csl.globalpay.ipm.msgprdf5reply.msgprdf.Msgprdf;


/**
 * <code>MsgPRDF5Reply</code>
 *
 * 
 */
public class MsgPRDF5Reply implements com.comforte.csl.cslapi.CSLLongMessageStreamable {

	/*
	 * attributes
	 */	
	 	protected Msgprdf msgprdf;

	private int ddlSize = 4444;
	
	/**
	 * <code>MsgPRDF5Reply</code>
	 * 
	 * @param characterEncoding this is for setting strings with CSLBaseData
	 */
	public MsgPRDF5Reply(String ce) {
	
	setMsgprdf(new  Msgprdf(ce));

		/*
		 * initialize selected input message fields with default values
		 */
				
	}
	
	/**
	 * <code>MsgPRDF5Reply</code>
	 * default encoding
	 */
	public MsgPRDF5Reply() {
		this(CSLIOOptions.ISO_8859_1); // 
	}	
	
	/*
	 * getter and setter
	 */


	
	/**
	 * <code>getMsgprdf</code>
	 * 
	 */	
	 public Msgprdf    getMsgprdf() { 
	 	return msgprdf;
	}

	
	/**
	 * <code>setMsgprdf</code>
	 * 
	 */	
	 public void setMsgprdf(Msgprdf theMsgprdf) { 
	 	msgprdf = theMsgprdf;
	}
	
	
	/**
	 * <code>write</code>
	 * 
	 * @param out
	 * @throws java.io.IOException, 
	 */
	public void write(CSLOutputStream out) throws IOException {
		/* write all attribute values into out */
			
	getMsgprdf().write(out);
		
	}

	/**
	 * <code>read</code>
	 * 
	 * @param in
	 * @throws java.io.IOException, 
	 */
	public void read(CSLInputStream in) throws IOException {
		/* read all attribute values*/
	
	getMsgprdf().read(in);
		
	}
	
	/**
	 * <code>getDdlSize</code>
	 *
	 */
	 public int	getDdlSize() {
	 	return ddlSize;
	 }

}
