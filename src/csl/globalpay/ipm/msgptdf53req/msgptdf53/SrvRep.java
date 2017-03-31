/*
 * @(#)SrvRep.java
 * Created by CSL Studio (definition-schema) on 18/08/2016 05:17:02 PM
 */
package csl.globalpay.ipm.msgptdf53req.msgptdf53;
import java.io.IOException;

import com.comforte.csl.cslapi.CSLInputStream;
import com.comforte.csl.cslapi.CSLOutputStream;
import com.comforte.csl.xmlutils.CSLTypes;

/** <code>SrvRep</code>
 *  
 */
public class	SrvRep implements com.comforte.csl.cslapi.CSLStreamable
{
   /* Members */
   protected String nam;
   protected String addr;
   protected String citySt;
   protected String cntry;
   protected String phone;

   /** <code>SrvRep</code>
    * Constructor
    * @param characterEncoding this is for setting strings with CSLBaseData
    * here we do not use it!
    */
   public SrvRep(String characterEncoding)
   {
      setNam(new String());
      setAddr(new String());
      setCitySt(new String());
      setCntry(new String());
      setPhone(new String());
   }

   /** <code>SrvRep</code>
    *  Constructor
    */ 
   public SrvRep()
   {
      this(null);
   }
   /* getter and setter */

   /**
    * <code>
    * Nam is a text String of25 bytes.
    * </code>
    */
   public String getNam()
   {
      return nam;
   }

   /**
    * <code>
    * Nam is a text String of25 bytes.
    * </code>
    */
   public void setNam(String theNam)
   {
       nam = theNam;
   }

   /**
    * <code>
    * Addr is a text String of25 bytes.
    * </code>
    */
   public String getAddr()
   {
      return addr;
   }

   /**
    * <code>
    * Addr is a text String of25 bytes.
    * </code>
    */
   public void setAddr(String theAddr)
   {
       addr = theAddr;
   }

   /**
    * <code>
    * CitySt is a text String of16 bytes.
    * </code>
    */
   public String getCitySt()
   {
      return citySt;
   }

   /**
    * <code>
    * CitySt is a text String of16 bytes.
    * </code>
    */
   public void setCitySt(String theCitySt)
   {
       citySt = theCitySt;
   }

   /**
    * <code>
    * Cntry is a text String of2 bytes.
    * </code>
    */
   public String getCntry()
   {
      return cntry;
   }

   /**
    * <code>
    * Cntry is a text String of2 bytes.
    * </code>
    */
   public void setCntry(String theCntry)
   {
       cntry = theCntry;
   }

   /**
    * <code>
    * Phone is a text String of20 bytes.
    * </code>
    */
   public String getPhone()
   {
      return phone;
   }

   /**
    * <code>
    * Phone is a text String of20 bytes.
    * </code>
    */
   public void setPhone(String thePhone)
   {
       phone = thePhone;
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
      out.writeString(getNam(),25, CSLTypes.PICX);
      out.writeString(getAddr(),25, CSLTypes.PICX);
      out.writeString(getCitySt(),16, CSLTypes.PICX);
      out.writeString(getCntry(),2, CSLTypes.PICX);
      out.writeString(getPhone(),20, CSLTypes.PICX);
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
      setNam(in.readString(25));
      setAddr(in.readString(25));
      setCitySt(in.readString(16));
      setCntry(in.readString(2));
      setPhone(in.readString(20));
   } 
}
