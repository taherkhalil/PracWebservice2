/*
 * @(#)EncrKeys2.java
 * Created by CSL Studio (definition-schema) on 18/08/2016 05:17:03 PM
 */
package csl.globalpay.ipm.msgptdf53reply.msgptdf53;
import java.io.IOException;

import com.comforte.csl.cslapi.CSLInputStream;
import com.comforte.csl.cslapi.CSLOutputStream;
import com.comforte.csl.xmlutils.CSLTypes;

/** <code>EncrKeys</code>
 *  
 */
public class	EncrKeys2 implements com.comforte.csl.cslapi.CSLStreamable
{
   /* Members */
   protected String masKey;

   /** <code>EncrKeys</code>
    * Constructor
    * @param characterEncoding this is for setting strings with CSLBaseData
    * here we do not use it!
    */
   public EncrKeys2(String characterEncoding)
   {
      setMasKey(new String());
   }

   /** <code>EncrKeys</code>
    *  Constructor
    */ 
   public EncrKeys2()
   {
      this(null);
   }
   /* getter and setter */

   /**
    * <code>
    * MasKey is a text String of16 bytes.
    * </code>
    */
   public String getMasKey()
   {
      return masKey;
   }

   /**
    * <code>
    * MasKey is a text String of16 bytes.
    * </code>
    */
   public void setMasKey(String theMasKey)
   {
       masKey = theMasKey;
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
      out.writeString(getMasKey(),16, CSLTypes.PICX);
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
      setMasKey(in.readString(16));
   } 
}
