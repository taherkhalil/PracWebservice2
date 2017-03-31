/*
 * @(#)DailyDc.java
 * Created by CSL Studio (definition-schema) on 18/08/2016 05:17:02 PM
 */
package csl.globalpay.ipm.msgptdf53req.msgptdf53;
import java.io.IOException;

import com.comforte.csl.cslapi.CSLInputStream;
import com.comforte.csl.cslapi.CSLOutputStream;

/** <code>DailyDc</code>
 *  
 */
public class	DailyDc implements com.comforte.csl.cslapi.CSLStreamable
{
   /* Members */
   protected Short dbCnt;
   protected Long db;
   protected Short crCnt;
   protected Long cr;
   protected Short adjCnt;
   protected Long adj;

   /** <code>DailyDc</code>
    * Constructor
    * @param characterEncoding this is for setting strings with CSLBaseData
    * here we do not use it!
    */
   public DailyDc(String characterEncoding)
   {
      setDbCnt(new Short((short)0));
      setDb(new Long((long)0));
      setCrCnt(new Short((short)0));
      setCr(new Long((long)0));
      setAdjCnt(new Short((short)0));
      setAdj(new Long((long)0));
   }

   /** <code>DailyDc</code>
    *  Constructor
    */ 
   public DailyDc()
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
    * Name=DB;CSL Type=cslLong;
    * </code>
    */
   public Long getDb()
   {
      return db;
   }

   /**
    * <code>
    * Name=DB;CSL Type=cslLong;
    * </code>
    */
   public void setDb(Long theDb)
   {
       db = theDb;
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
    * Name=CR;CSL Type=cslLong;
    * </code>
    */
   public Long getCr()
   {
      return cr;
   }

   /**
    * <code>
    * Name=CR;CSL Type=cslLong;
    * </code>
    */
   public void setCr(Long theCr)
   {
       cr = theCr;
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
    * Name=ADJ;CSL Type=cslLong;
    * </code>
    */
   public Long getAdj()
   {
      return adj;
   }

   /**
    * <code>
    * Name=ADJ;CSL Type=cslLong;
    * </code>
    */
   public void setAdj(Long theAdj)
   {
       adj = theAdj;
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
      out.writeLong(getDb().longValue());
      out.writeShort(getCrCnt().shortValue());
      out.writeLong(getCr().longValue());
      out.writeShort(getAdjCnt().shortValue());
      out.writeLong(getAdj().longValue());
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
      setDb(new Long(in.readLong()));
      setCrCnt(new Short(in.readShort()));
      setCr(new Long(in.readLong()));
      setAdjCnt(new Short(in.readShort()));
      setAdj(new Long(in.readLong()));
   } 
}
