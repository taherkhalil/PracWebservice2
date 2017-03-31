/*
 * @(#)UserData.java
 * Created by CSL Studio (definition-schema) on 18/08/2016 05:17:03 PM
 */
package csl.globalpay.ipm.msgptdf53reply.msgptdf53;
import java.io.IOException;

import com.comforte.csl.cslapi.CSLInputStream;
import com.comforte.csl.cslapi.CSLOutputStream;
import com.comforte.csl.xmlutils.CSLTypes;

/** <code>UserData</code>
 *  
 */
public class	UserData implements com.comforte.csl.cslapi.CSLStreamable
{
   /* Members */
   protected String ln;
   protected String fiid;
   protected String regn;
   protected String brch;
   protected Short userGrp;
   protected Integer userNum;

   /** <code>UserData</code>
    * Constructor
    * @param characterEncoding this is for setting strings with CSLBaseData
    * here we do not use it!
    */
   public UserData(String characterEncoding)
   {
      setLn(new String());
      setFiid(new String());
      setRegn(new String());
      setBrch(new String());
      setUserGrp(new Short((short)0));
      setUserNum(new Integer(0));
   }

   /** <code>UserData</code>
    *  Constructor
    */ 
   public UserData()
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
    * Regn is a text String of4 bytes.
    * </code>
    */
   public String getRegn()
   {
      return regn;
   }

   /**
    * <code>
    * Regn is a text String of4 bytes.
    * </code>
    */
   public void setRegn(String theRegn)
   {
       regn = theRegn;
   }

   /**
    * <code>
    * Brch is a text String of4 bytes.
    * </code>
    */
   public String getBrch()
   {
      return brch;
   }

   /**
    * <code>
    * Brch is a text String of4 bytes.
    * </code>
    */
   public void setBrch(String theBrch)
   {
       brch = theBrch;
   }

   /**
    * <code>
    * Name=USER-GRP;CSL Type=cslShort;
    * </code>
    */
   public Short getUserGrp()
   {
      return userGrp;
   }

   /**
    * <code>
    * Name=USER-GRP;CSL Type=cslShort;
    * </code>
    */
   public void setUserGrp(Short theUserGrp)
   {
       userGrp = theUserGrp;
   }

   /**
    * <code>
    * Name=USER-NUM;CSL Type=cslInteger;
    * </code>
    */
   public Integer getUserNum()
   {
      return userNum;
   }

   /**
    * <code>
    * Name=USER-NUM;CSL Type=cslInteger;
    * </code>
    */
   public void setUserNum(Integer theUserNum)
   {
       userNum = theUserNum;
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
      out.writeString(getRegn(),4, CSLTypes.PICX);
      out.writeString(getBrch(),4, CSLTypes.PICX);
      out.writeShort(getUserGrp().shortValue());
      out.writeInt(getUserNum().intValue());
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
      setRegn(in.readString(4));
      setBrch(in.readString(4));
      setUserGrp(new Short(in.readShort()));
      setUserNum(new Integer(in.readInt()));
   } 
}
