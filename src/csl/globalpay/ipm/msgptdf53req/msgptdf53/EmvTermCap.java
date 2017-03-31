/*
 * @(#)EmvTermCap.java
 * Created by CSL Studio (definition-schema) on 18/08/2016 05:17:02 PM
 */
package csl.globalpay.ipm.msgptdf53req.msgptdf53;
import java.io.IOException;

import com.comforte.csl.cslapi.CSLInputStream;
import com.comforte.csl.cslapi.CSLOutputStream;
import com.comforte.csl.xmlutils.CSLTypes;

/** <code>EmvTermCap</code>
 *  
 */
public class	EmvTermCap implements com.comforte.csl.cslapi.CSLStreamable
{
   /* Members */
   protected String crdDataInput;
   protected String cvm;
   protected String sec;

   /** <code>EmvTermCap</code>
    * Constructor
    * @param characterEncoding this is for setting strings with CSLBaseData
    * here we do not use it!
    */
   public EmvTermCap(String characterEncoding)
   {
      setCrdDataInput(new String());
      setCvm(new String());
      setSec(new String());
   }

   /** <code>EmvTermCap</code>
    *  Constructor
    */ 
   public EmvTermCap()
   {
      this(null);
   }
   /* getter and setter */

   /**
    * <code>
    * CrdDataInput is a text String of1 bytes.
    * </code>
    */
   public String getCrdDataInput()
   {
      return crdDataInput;
   }

   /**
    * <code>
    * CrdDataInput is a text String of1 bytes.
    * </code>
    */
   public void setCrdDataInput(String theCrdDataInput)
   {
       crdDataInput = theCrdDataInput;
   }

   /**
    * <code>
    * Cvm is a text String of1 bytes.
    * </code>
    */
   public String getCvm()
   {
      return cvm;
   }

   /**
    * <code>
    * Cvm is a text String of1 bytes.
    * </code>
    */
   public void setCvm(String theCvm)
   {
       cvm = theCvm;
   }

   /**
    * <code>
    * Sec is a text String of1 bytes.
    * </code>
    */
   public String getSec()
   {
      return sec;
   }

   /**
    * <code>
    * Sec is a text String of1 bytes.
    * </code>
    */
   public void setSec(String theSec)
   {
       sec = theSec;
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
      out.writeString(getCrdDataInput(),1, CSLTypes.PICX);
      out.writeString(getCvm(),1, CSLTypes.PICX);
      out.writeString(getSec(),1, CSLTypes.PICX);
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
      setCrdDataInput(in.readString(1));
      setCvm(in.readString(1));
      setSec(in.readString(1));
   } 
}
