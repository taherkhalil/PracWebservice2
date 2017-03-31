/*
 * @(#)WorkingKeys.java
 * Created by CSL Studio (definition-schema) on 18/08/2016 05:17:03 PM
 */
package csl.globalpay.ipm.msgptdf53req.msgptdf53;
import java.io.IOException;

import com.comforte.csl.cslapi.CSLInputStream;
import com.comforte.csl.cslapi.CSLOutputStream;
import com.comforte.csl.xmlutils.CSLTypes;

/** <code>WorkingKeys</code>
 *  
 */
public class	WorkingKeys implements com.comforte.csl.cslapi.CSLStreamable
{
   /* Members */
   protected String macKey;
   protected String pKey;

   /** <code>WorkingKeys</code>
    * Constructor
    * @param characterEncoding this is for setting strings with CSLBaseData
    * here we do not use it!
    */
   public WorkingKeys(String characterEncoding)
   {
      setMacKey(new String());
      setPKey(new String());
   }

   /** <code>WorkingKeys</code>
    *  Constructor
    */ 
   public WorkingKeys()
   {
      this(null);
   }
   /* getter and setter */

   /**
    * <code>
    * MacKey is a text String of16 bytes.
    * </code>
    */
   public String getMacKey()
   {
      return macKey;
   }

   /**
    * <code>
    * MacKey is a text String of16 bytes.
    * </code>
    */
   public void setMacKey(String theMacKey)
   {
       macKey = theMacKey;
   }

   /**
    * <code>
    * PKey is a text String of16 bytes.
    * </code>
    */
   public String getPKey()
   {
      return pKey;
   }

   /**
    * <code>
    * PKey is a text String of16 bytes.
    * </code>
    */
   public void setPKey(String thePKey)
   {
       pKey = thePKey;
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
      out.writeString(getMacKey(),16, CSLTypes.PICX);
      out.writeString(getPKey(),16, CSLTypes.PICX);
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
      setMacKey(in.readString(16));
      setPKey(in.readString(16));
   } 
}
