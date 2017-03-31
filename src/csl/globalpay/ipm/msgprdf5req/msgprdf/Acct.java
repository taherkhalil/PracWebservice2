/*
 * @(#)Acct.java
 * Created by CSL Studio (definition-schema) on 24/08/2016 10:54:43 AM
 */
package csl.globalpay.ipm.msgprdf5req.msgprdf;
import java.io.IOException;

import com.comforte.csl.cslapi.CSLInputStream;
import com.comforte.csl.cslapi.CSLOutputStream;
import com.comforte.csl.xmlutils.CSLTypes;

/** <code>Acct</code>
 *  
 */
public class	Acct implements com.comforte.csl.cslapi.CSLStreamable
{
   /* Members */
   protected String acctNum;

   /** <code>Acct</code>
    * Constructor
    * @param characterEncoding this is for setting strings with CSLBaseData
    * here we do not use it!
    */
   public Acct(String characterEncoding)
   {
      setAcctNum(new String());
   }

   /** <code>Acct</code>
    *  Constructor
    */ 
   public Acct()
   {
      this(null);
   }
   /* getter and setter */

   /**
    * <code>
    * AcctNum is a text String of19 bytes.
    * </code>
    */
   public String getAcctNum()
   {
      return acctNum;
   }

   /**
    * <code>
    * AcctNum is a text String of19 bytes.
    * </code>
    */
   public void setAcctNum(String theAcctNum)
   {
       acctNum = theAcctNum;
   }

   /** <code>write</code>
    * @param out
    * @throws java.io.IOException,
    */
   public void write(CSLOutputStream out) throws IOException
   {
      /* write all attribute values into out */
      String help1 = null;
      String help2 = null;
      out.writeString(getAcctNum(),19, CSLTypes.PICX);
   }

   /** <code>read</code>
    * @param in
    * @throws java.io.IOException
    */
   public void read(CSLInputStream in) throws IOException
   {
      /* read all attribute values*/
      String help1 = null;
      String help2 = null;
      setAcctNum(in.readString(19));
   } 
}
