
/*
 * @(#)MsgPTDF53Req2.java
 * Created by CSL Studio (message-schema) on 18/08/2016 05:17:03 PM

 */


package csl.globalpay.ipm.msgptdf53req;
		
import java.io.IOException;

import com.comforte.csl.cslapi.CSLIOOptions;
import com.comforte.csl.cslapi.CSLInputStream;
import com.comforte.csl.cslapi.CSLOutputStream;

import csl.globalpay.ipm.msgptdf53req.msgptdf53.Msgptdf53;


/**
 * <code>MsgPTDF53Req</code>
 *
 * 
 */
public class MsgPTDF53Req implements com.comforte.csl.cslapi.CSLLongMessageStreamable {

	/*
	 * attributes
	 */	
	 	protected Msgptdf53 msgptdf53;

	private int ddlSize = 4324;
	
	/**
	 * <code>MsgPTDF53Req</code>
	 * 
	 * @param characterEncoding this is for setting strings with CSLBaseData
	 */
	public MsgPTDF53Req(String ce) {
	
	setMsgptdf53(new  Msgptdf53(ce));

		/*
		 * initialize selected input message fields with default values
		 */
				
	}
	
	/**
	 * <code>MsgPTDF53Req</code>
	 * default encoding
	 */
	public MsgPTDF53Req() {
		this(CSLIOOptions.ISO_8859_1); // 
	}	
	
	/*
	 * getter and setter
	 */


	
	/**
	 * <code>getMsgptdf53</code>
	 * 
	 */	
	 public Msgptdf53    getMsgptdf53() { 
	 	return msgptdf53;
	}

	
	/**
	 * <code>setMsgptdf53</code>
	 * 
	 */	
	 public void setMsgptdf53(Msgptdf53 theMsgptdf53) { 
	 	msgptdf53 = theMsgptdf53;
	}
	
	
	/**
	 * <code>write</code>
	 * 
	 * @param out
	 * @throws java.io.IOException, 
	 */
	public void write(CSLOutputStream out) throws IOException {
		/* write all attribute values into out */
			
	getMsgptdf53().write(out);
		
	}

	/**
	 * <code>read</code>
	 * 
	 * @param in
	 * @throws java.io.IOException, 
	 */
	public void read(CSLInputStream in) throws IOException {
		/* read all attribute values*/
	
	getMsgptdf53().read(in);
		
	}
	
	/**
	 * <code>getDdlSize</code>
	 *
	 */
	 public int	getDdlSize() {
	 	return ddlSize;
	 }

}
