/*
 * @(#)AkbMac.java
 * Created by CSL Studio (definition-schema) on 18/08/2016 05:17:02 PM
 */
package csl.globalpay.ipm.msgptdf53req.msgptdf53;
import java.io.IOException;

import com.comforte.csl.cslapi.CSLInputStream;
import com.comforte.csl.cslapi.CSLOutputStream;
import com.comforte.csl.xmlutils.CSLTypes;

/** <code>AkbMac</code>
 *  
 */
public class	AkbMac implements com.comforte.csl.cslapi.CSLStreamable
{
   /* Members */
   protected String akbPinMac;
   protected String akbMacMac;

   /** <code>AkbMac</code>
    * Constructor
    * @param characterEncoding this is for setting strings with CSLBaseData
    * here we do not use it!
    */
   public AkbMac(String characterEncoding)
   {
      setAkbPinMac(new String());
      setAkbMacMac(new String());
   }

   /** <code>AkbMac</code>
    *  Constructor
    */ 
   public AkbMac()
   {
      this(null);
   }
   /* getter and setter */

   /**
    * <code>
    * AkbPinMac is a text String of16 bytes.
    * </code>
    */
   public String getAkbPinMac()
   {
      return akbPinMac;
   }

   /**
    * <code>
    * AkbPinMac is a text String of16 bytes.
    * </code>
    */
   public void setAkbPinMac(String theAkbPinMac)
   {
       akbPinMac = theAkbPinMac;
   }

   /**
    * <code>
    * AkbMacMac is a text String of16 bytes.
    * </code>
    */
   public String getAkbMacMac()
   {
      return akbMacMac;
   }

   /**
    * <code>
    * AkbMacMac is a text String of16 bytes.
    * </code>
    */
   public void setAkbMacMac(String theAkbMacMac)
   {
       akbMacMac = theAkbMacMac;
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
      out.writeString(getAkbPinMac(),16, CSLTypes.PICX);
      out.writeString(getAkbMacMac(),16, CSLTypes.PICX);
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
      setAkbPinMac(in.readString(16));
      setAkbMacMac(in.readString(16));
   } 
}
