/*
 * @(#)TermOwner.java
 * Created by CSL Studio (definition-schema) on 18/08/2016 05:17:03 PM
 */
package csl.globalpay.ipm.msgptdf53reply.msgptdf53;
import java.io.IOException;

import com.comforte.csl.cslapi.CSLInputStream;
import com.comforte.csl.cslapi.CSLOutputStream;
import com.comforte.csl.xmlutils.CSLTypes;

/** <code>TermOwner</code>
 *  
 */
public class	TermOwner implements com.comforte.csl.cslapi.CSLStreamable
{
   /* Members */
   protected String ln;
   protected String fiid;
   protected String retailerGrp;
   protected String retailerRegn;
   protected String retailerId;

   /** <code>TermOwner</code>
    * Constructor
    * @param characterEncoding this is for setting strings with CSLBaseData
    * here we do not use it!
    */
   public TermOwner(String characterEncoding)
   {
      setLn(new String());
      setFiid(new String());
      setRetailerGrp(new String());
      setRetailerRegn(new String());
      setRetailerId(new String());
   }

   /** <code>TermOwner</code>
    *  Constructor
    */ 
   public TermOwner()
   {
      this(null);
   }
   /* getter and setter */

   /**
    * <code>
    * Ln is a text String of4 bytes.
    * </code>
    */
   public String getLn()
   {
      return ln;
   }

   /**
    * <code>
    * Ln is a text String of4 bytes.
    * </code>
    */
   public void setLn(String theLn)
   {
       ln = theLn;
   }

   /**
    * <code>
    * Fiid is a text String of4 bytes.
    * </code>
    */
   public String getFiid()
   {
      return fiid;
   }

   /**
    * <code>
    * Fiid is a text String of4 bytes.
    * </code>
    */
   public void setFiid(String theFiid)
   {
       fiid = theFiid;
   }

   /**
    * <code>
    * RetailerGrp is a text String of6 bytes.
    * </code>
    */
   public String getRetailerGrp()
   {
      return retailerGrp;
   }

   /**
    * <code>
    * RetailerGrp is a text String of6 bytes.
    * </code>
    */
   public void setRetailerGrp(String theRetailerGrp)
   {
       retailerGrp = theRetailerGrp;
   }

   /**
    * <code>
    * RetailerRegn is a text String of2 bytes.
    * </code>
    */
   public String getRetailerRegn()
   {
      return retailerRegn;
   }

   /**
    * <code>
    * RetailerRegn is a text String of2 bytes.
    * </code>
    */
   public void setRetailerRegn(String theRetailerRegn)
   {
       retailerRegn = theRetailerRegn;
   }

   /**
    * <code>
    * RetailerId is a text String of19 bytes.
    * </code>
    */
   public String getRetailerId()
   {
      return retailerId;
   }

   /**
    * <code>
    * RetailerId is a text String of19 bytes.
    * </code>
    */
   public void setRetailerId(String theRetailerId)
   {
       retailerId = theRetailerId;
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
      out.writeString(getLn(),4, CSLTypes.PICX);
      out.writeString(getFiid(),4, CSLTypes.PICX);
      out.writeString(getRetailerGrp(),6, CSLTypes.PICX);
      out.writeString(getRetailerRegn(),2, CSLTypes.PICX);
      out.writeString(getRetailerId(),19, CSLTypes.PICX);
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
      setLn(in.readString(4));
      setFiid(in.readString(4));
      setRetailerGrp(in.readString(6));
      setRetailerRegn(in.readString(2));
      setRetailerId(in.readString(19));
   } 
}
