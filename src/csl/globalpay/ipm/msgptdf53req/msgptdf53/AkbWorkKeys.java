/*
 * @(#)AkbWorkKeys.java
 * Created by CSL Studio (definition-schema) on 18/08/2016 05:17:03 PM
 */
package csl.globalpay.ipm.msgptdf53req.msgptdf53;
import java.io.IOException;

import com.comforte.csl.cslapi.CSLInputStream;
import com.comforte.csl.cslapi.CSLOutputStream;
import com.comforte.csl.xmlutils.CSLTypes;

/** <code>AkbWorkKeys</code>
 *  
 */
public class	AkbWorkKeys implements com.comforte.csl.cslapi.CSLStreamable
{
   /* Members */
   protected String oldWorkPin;
   protected String oldWorkMac;
   protected String forceKeyChng;
   protected String filler;

   /** <code>AkbWorkKeys</code>
    * Constructor
    * @param characterEncoding this is for setting strings with CSLBaseData
    * here we do not use it!
    */
   public AkbWorkKeys(String characterEncoding)
   {
      setOldWorkPin(new String());
      setOldWorkMac(new String());
      setForceKeyChng(new String());
      setFiller(new String());
   }

   /** <code>AkbWorkKeys</code>
    *  Constructor
    */ 
   public AkbWorkKeys()
   {
      this(null);
   }
   /* getter and setter */

   /**
    * <code>
    * OldWorkPin is a text String of48 bytes.
    * </code>
    */
   public String getOldWorkPin()
   {
      return oldWorkPin;
   }

   /**
    * <code>
    * OldWorkPin is a text String of48 bytes.
    * </code>
    */
   public void setOldWorkPin(String theOldWorkPin)
   {
       oldWorkPin = theOldWorkPin;
   }

   /**
    * <code>
    * OldWorkMac is a text String of48 bytes.
    * </code>
    */
   public String getOldWorkMac()
   {
      return oldWorkMac;
   }

   /**
    * <code>
    * OldWorkMac is a text String of48 bytes.
    * </code>
    */
   public void setOldWorkMac(String theOldWorkMac)
   {
       oldWorkMac = theOldWorkMac;
   }

   /**
    * <code>
    * ForceKeyChng is a text String of1 bytes.
    * </code>
    */
   public String getForceKeyChng()
   {
      return forceKeyChng;
   }

   /**
    * <code>
    * ForceKeyChng is a text String of1 bytes.
    * </code>
    */
   public void setForceKeyChng(String theForceKeyChng)
   {
       forceKeyChng = theForceKeyChng;
   }

   /**
    * <code>
    * Name=FILLER;CSL Type=cslString;
    * </code>
    */
   public String getFiller()
   {
      return filler;
   }

   /**
    * <code>
    * Name=FILLER;CSL Type=cslString;
    * </code>
    */
   public void setFiller(String theFiller)
   {
       filler = theFiller;
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
      out.writeString(getOldWorkPin(),48, CSLTypes.PICX);
      out.writeString(getOldWorkMac(),48, CSLTypes.PICX);
      out.writeString(getForceKeyChng(),1, CSLTypes.PICX);
      out.writeString(getFiller(),7, CSLTypes.PICX);
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
      setOldWorkPin(in.readString(48));
      setOldWorkMac(in.readString(48));
      setForceKeyChng(in.readString(1));
      setFiller(in.readString(7));
   } 
}
