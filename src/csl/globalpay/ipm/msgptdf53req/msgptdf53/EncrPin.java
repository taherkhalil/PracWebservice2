/*
 * @(#)EncrPin.java
 * Created by CSL Studio (definition-schema) on 18/08/2016 05:17:02 PM
 */
package csl.globalpay.ipm.msgptdf53req.msgptdf53;
import java.io.IOException;

import com.comforte.csl.cslapi.CSLInputStream;
import com.comforte.csl.cslapi.CSLOutputStream;
import com.comforte.csl.xmlutils.CSLTypes;

/** <code>EncrPin</code>
 *  
 */
public class	EncrPin implements com.comforte.csl.cslapi.CSLStreamable
{
   /* Members */
   protected String pinValTerm;
   protected String pinEncryptTyp;
   protected EncrKeys encrKeys;

   /** <code>EncrPin</code>
    * Constructor
    * @param characterEncoding this is for setting strings with CSLBaseData
    * here we do not use it!
    */
   public EncrPin(String characterEncoding)
   {
      setPinValTerm(new String());
      setPinEncryptTyp(new String());
      setEncrKeys(new EncrKeys());
   }

   /** <code>EncrPin</code>
    *  Constructor
    */ 
   public EncrPin()
   {
      this(null);
   }
   /* getter and setter */

   /**
    * <code>
    * PinValTerm is a text String of1 bytes.
    * </code>
    */
   public String getPinValTerm()
   {
      return pinValTerm;
   }

   /**
    * <code>
    * PinValTerm is a text String of1 bytes.
    * </code>
    */
   public void setPinValTerm(String thePinValTerm)
   {
       pinValTerm = thePinValTerm;
   }

   /**
    * <code>
    * PinEncryptTyp is a text String of2 bytes.
    * </code>
    */
   public String getPinEncryptTyp()
   {
      return pinEncryptTyp;
   }

   /**
    * <code>
    * PinEncryptTyp is a text String of2 bytes.
    * </code>
    */
   public void setPinEncryptTyp(String thePinEncryptTyp)
   {
       pinEncryptTyp = thePinEncryptTyp;
   }

   /**
    * <code>
    * Name=ENCR-KEYS;
    * </code>
    */
   public EncrKeys getEncrKeys()
   {
      return encrKeys;
   }

   /**
    * <code>
    * Name=ENCR-KEYS;
    * </code>
    */
   public void setEncrKeys(EncrKeys theEncrKeys)
   {
       encrKeys = theEncrKeys;
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
      out.writeString(getPinValTerm(),1, CSLTypes.PICX);
      out.writeString(getPinEncryptTyp(),2, CSLTypes.PICX);
      getEncrKeys().write(out);
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
      setPinValTerm(in.readString(1));
      setPinEncryptTyp(in.readString(2));
      getEncrKeys().read(in);
   } 
}
