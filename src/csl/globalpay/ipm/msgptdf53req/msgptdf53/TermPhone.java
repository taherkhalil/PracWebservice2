/*
 * @(#)TermPhone.java
 * Created by CSL Studio (definition-schema) on 18/08/2016 05:17:02 PM
 */
package csl.globalpay.ipm.msgptdf53req.msgptdf53;
import java.io.IOException;

import com.comforte.csl.cslapi.CSLInputStream;
import com.comforte.csl.cslapi.CSLOutputStream;
import com.comforte.csl.xmlutils.CSLTypes;

/** <code>TermPhone</code>
 *  
 */
public class	TermPhone implements com.comforte.csl.cslapi.CSLStreamable
{
   /* Members */
   protected String num;
   protected String baudRate;

   /** <code>TermPhone</code>
    * Constructor
    * @param characterEncoding this is for setting strings with CSLBaseData
    * here we do not use it!
    */
   public TermPhone(String characterEncoding)
   {
      setNum(new String());
      setBaudRate(new String());
   }

   /** <code>TermPhone</code>
    *  Constructor
    */ 
   public TermPhone()
   {
      this(null);
   }
   /* getter and setter */

   /**
    * <code>
    * Num is a text String of20 bytes.
    * </code>
    */
   public String getNum()
   {
      return num;
   }

   /**
    * <code>
    * Num is a text String of20 bytes.
    * </code>
    */
   public void setNum(String theNum)
   {
       num = theNum;
   }

   /**
    * <code>
    * BaudRate is a numeric String of
							2 digits with 0 decimal places.
    * </code>
    */
   public String getBaudRate()
   {
      return baudRate;
   }

   /**
    * <code>
    * BaudRate is a numeric String of
							2 digits with 0 decimal places.
    * </code>
    */
   public void setBaudRate(String theBaudRate)
   {
       baudRate = theBaudRate;
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
      out.writeString(getNum(),20, CSLTypes.PICX);
      help1 =
        com.comforte.csl.model.Util.convertNumStringFromDisplayToTransferFormat(getBaudRate(), 2, 0, 0);
      out.writeString(help1, help1.length());
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
      setNum(in.readString(20));
      help1 = in.readString(2);
      help2 =
         com.comforte.csl.model.Util.convertNumStringFromTransferToDisplayFormat(help1, 2, 0, 0);
      setBaudRate(help2);
   } 
}
