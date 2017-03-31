/*
 * @(#)ClerkTots.java
 * Created by CSL Studio (definition-schema) on 18/08/2016 05:17:03 PM
 */
package csl.globalpay.ipm.msgptdf53reply.msgptdf53;
import java.io.IOException;

import com.comforte.csl.cslapi.CSLInputStream;
import com.comforte.csl.cslapi.CSLOutputStream;

/** <code>ClerkTots</code>
 *  
 */
public class	ClerkTots implements com.comforte.csl.cslapi.CSLStreamable
{
   /* Members */
   protected Short dbCnt;
   protected Long dbAmt;
   protected Short crCnt;
   protected Long crAmt;
   protected Short adjCnt;
   protected Long adjAmt;
   protected Short cashCnt;
   protected Long cashAmt;
   protected Short chkCnt;

   /** <code>ClerkTots</code>
    * Constructor
    * @param characterEncoding this is for setting strings with CSLBaseData
    * here we do not use it!
    */
   public ClerkTots(String characterEncoding)
   {
      setDbCnt(new Short((short)0));
      setDbAmt(new Long((long)0));
      setCrCnt(new Short((short)0));
      setCrAmt(new Long((long)0));
      setAdjCnt(new Short((short)0));
      setAdjAmt(new Long((long)0));
      setCashCnt(new Short((short)0));
      setCashAmt(new Long((long)0));
      setChkCnt(new Short((short)0));
   }

   /** <code>ClerkTots</code>
    *  Constructor
    */ 
   public ClerkTots()
   {
      this(null);
   }
   /* getter and setter */

   /**
    * <code>
    * Name=DB-CNT;CSL Type=cslShort;
    * </code>
    */
   public Short getDbCnt()
   {
      return dbCnt;
   }

   /**
    * <code>
    * Name=DB-CNT;CSL Type=cslShort;
    * </code>
    */
   public void setDbCnt(Short theDbCnt)
   {
       dbCnt = theDbCnt;
   }

   /**
    * <code>
    * Name=DB-AMT;CSL Type=cslLong;
    * </code>
    */
   public Long getDbAmt()
   {
      return dbAmt;
   }

   /**
    * <code>
    * Name=DB-AMT;CSL Type=cslLong;
    * </code>
    */
   public void setDbAmt(Long theDbAmt)
   {
       dbAmt = theDbAmt;
   }

   /**
    * <code>
    * Name=CR-CNT;CSL Type=cslShort;
    * </code>
    */
   public Short getCrCnt()
   {
      return crCnt;
   }

   /**
    * <code>
    * Name=CR-CNT;CSL Type=cslShort;
    * </code>
    */
   public void setCrCnt(Short theCrCnt)
   {
       crCnt = theCrCnt;
   }

   /**
    * <code>
    * Name=CR-AMT;CSL Type=cslLong;
    * </code>
    */
   public Long getCrAmt()
   {
      return crAmt;
   }

   /**
    * <code>
    * Name=CR-AMT;CSL Type=cslLong;
    * </code>
    */
   public void setCrAmt(Long theCrAmt)
   {
       crAmt = theCrAmt;
   }

   /**
    * <code>
    * Name=ADJ-CNT;CSL Type=cslShort;
    * </code>
    */
   public Short getAdjCnt()
   {
      return adjCnt;
   }

   /**
    * <code>
    * Name=ADJ-CNT;CSL Type=cslShort;
    * </code>
    */
   public void setAdjCnt(Short theAdjCnt)
   {
       adjCnt = theAdjCnt;
   }

   /**
    * <code>
    * Name=ADJ-AMT;CSL Type=cslLong;
    * </code>
    */
   public Long getAdjAmt()
   {
      return adjAmt;
   }

   /**
    * <code>
    * Name=ADJ-AMT;CSL Type=cslLong;
    * </code>
    */
   public void setAdjAmt(Long theAdjAmt)
   {
       adjAmt = theAdjAmt;
   }

   /**
    * <code>
    * Name=CASH-CNT;CSL Type=cslShort;
    * </code>
    */
   public Short getCashCnt()
   {
      return cashCnt;
   }

   /**
    * <code>
    * Name=CASH-CNT;CSL Type=cslShort;
    * </code>
    */
   public void setCashCnt(Short theCashCnt)
   {
       cashCnt = theCashCnt;
   }

   /**
    * <code>
    * Name=CASH-AMT;CSL Type=cslLong;
    * </code>
    */
   public Long getCashAmt()
   {
      return cashAmt;
   }

   /**
    * <code>
    * Name=CASH-AMT;CSL Type=cslLong;
    * </code>
    */
   public void setCashAmt(Long theCashAmt)
   {
       cashAmt = theCashAmt;
   }

   /**
    * <code>
    * Name=CHK-CNT;CSL Type=cslShort;
    * </code>
    */
   public Short getChkCnt()
   {
      return chkCnt;
   }

   /**
    * <code>
    * Name=CHK-CNT;CSL Type=cslShort;
    * </code>
    */
   public void setChkCnt(Short theChkCnt)
   {
       chkCnt = theChkCnt;
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
      out.writeShort(getDbCnt().shortValue());
      out.writeLong(getDbAmt().longValue());
      out.writeShort(getCrCnt().shortValue());
      out.writeLong(getCrAmt().longValue());
      out.writeShort(getAdjCnt().shortValue());
      out.writeLong(getAdjAmt().longValue());
      out.writeShort(getCashCnt().shortValue());
      out.writeLong(getCashAmt().longValue());
      out.writeShort(getChkCnt().shortValue());
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
      setDbCnt(new Short(in.readShort()));
      setDbAmt(new Long(in.readLong()));
      setCrCnt(new Short(in.readShort()));
      setCrAmt(new Long(in.readLong()));
      setAdjCnt(new Short(in.readShort()));
      setAdjAmt(new Long(in.readLong()));
      setCashCnt(new Short(in.readShort()));
      setCashAmt(new Long(in.readLong()));
      setChkCnt(new Short(in.readShort()));
   } 
}
