/*
 * @(#)FldData.java
 * Created by CSL Studio (definition-schema) on 18/08/2016 05:17:02 PM
 */
package csl.globalpay.ipm.msgptdf53req.msgptdf53;
import java.io.IOException;

import com.comforte.csl.cslapi.CSLInputStream;
import com.comforte.csl.cslapi.CSLOutputStream;
import com.comforte.csl.xmlutils.CSLTypes;

/** <code>FldData</code>
 *  
 */
public class	FldData implements com.comforte.csl.cslapi.CSLStreamable
{
   /* Members */
   protected String fldEncryptTyp;
   protected String fldMasKey;

   /** <code>FldData</code>
    * Constructor
    * @param characterEncoding this is for setting strings with CSLBaseData
    * here we do not use it!
    */
   public FldData(String characterEncoding)
   {
      setFldEncryptTyp(new String());
      setFldMasKey(new String());
   }

   /** <code>FldData</code>
    *  Constructor
    */ 
   public FldData()
   {
      this(null);
   }
   /* getter and setter */

   /**
    * <code>
    * FldEncryptTyp is a text String of2 bytes.
    * </code>
    */
   public String getFldEncryptTyp()
   {
      return fldEncryptTyp;
   }

   /**
    * <code>
    * FldEncryptTyp is a text String of2 bytes.
    * </code>
    */
   public void setFldEncryptTyp(String theFldEncryptTyp)
   {
       fldEncryptTyp = theFldEncryptTyp;
   }

   /**
    * <code>
    * FldMasKey is a text String of16 bytes.
    * </code>
    */
   public String getFldMasKey()
   {
      return fldMasKey;
   }

   /**
    * <code>
    * FldMasKey is a text String of16 bytes.
    * </code>
    */
   public void setFldMasKey(String theFldMasKey)
   {
       fldMasKey = theFldMasKey;
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
      out.writeString(getFldEncryptTyp(),2, CSLTypes.PICX);
      out.writeString(getFldMasKey(),16, CSLTypes.PICX);
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
      setFldEncryptTyp(in.readString(2));
      setFldMasKey(in.readString(16));
   } 
}
