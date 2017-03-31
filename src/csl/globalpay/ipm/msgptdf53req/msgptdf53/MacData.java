/*
 * @(#)MacData.java
 * Created by CSL Studio (definition-schema) on 18/08/2016 05:17:02 PM
 */
package csl.globalpay.ipm.msgptdf53req.msgptdf53;
import java.io.IOException;

import com.comforte.csl.cslapi.CSLInputStream;
import com.comforte.csl.cslapi.CSLOutputStream;
import com.comforte.csl.xmlutils.CSLTypes;

/** <code>MacData</code>
 *  
 */
public class	MacData implements com.comforte.csl.cslapi.CSLStreamable
{
   /* Members */
   protected String userFld5;
   protected String macEncryptTyp;
   protected EncrKeys2 encrKeys2;

   /** <code>MacData</code>
    * Constructor
    * @param characterEncoding this is for setting strings with CSLBaseData
    * here we do not use it!
    */
   public MacData(String characterEncoding)
   {
      setUserFld5(new String());
      setMacEncryptTyp(new String());
      setEncrKeys2(new EncrKeys2());
   }

   /** <code>MacData</code>
    *  Constructor
    */ 
   public MacData()
   {
      this(null);
   }
   /* getter and setter */

   /**
    * <code>
    * UserFld5 is a text String of1 bytes.
    * </code>
    */
   public String getUserFld5()
   {
      return userFld5;
   }

   /**
    * <code>
    * UserFld5 is a text String of1 bytes.
    * </code>
    */
   public void setUserFld5(String theUserFld5)
   {
       userFld5 = theUserFld5;
   }

   /**
    * <code>
    * MacEncryptTyp is a text String of2 bytes.
    * </code>
    */
   public String getMacEncryptTyp()
   {
      return macEncryptTyp;
   }

   /**
    * <code>
    * MacEncryptTyp is a text String of2 bytes.
    * </code>
    */
   public void setMacEncryptTyp(String theMacEncryptTyp)
   {
       macEncryptTyp = theMacEncryptTyp;
   }

   /**
    * <code>
    * Name=ENCR-KEYS;
    * </code>
    */
   public EncrKeys2 getEncrKeys2()
   {
      return encrKeys2;
   }

   /**
    * <code>
    * Name=ENCR-KEYS;
    * </code>
    */
   public void setEncrKeys2(EncrKeys2 theEncrKeys2)
   {
       encrKeys2 = theEncrKeys2;
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
      out.writeString(getUserFld5(),1, CSLTypes.PICX);
      out.writeString(getMacEncryptTyp(),2, CSLTypes.PICX);
      getEncrKeys2().write(out);
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
      setUserFld5(in.readString(1));
      setMacEncryptTyp(in.readString(2));
      getEncrKeys2().read(in);
   } 
}
