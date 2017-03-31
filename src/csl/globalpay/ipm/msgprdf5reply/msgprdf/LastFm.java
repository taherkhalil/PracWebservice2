/*
 * @(#)LastFm.java
 * Created by CSL Studio (definition-schema) on 24/08/2016 10:54:43 AM
 */
package csl.globalpay.ipm.msgprdf5reply.msgprdf;
import java.io.IOException;

import com.comforte.csl.cslapi.CSLInputStream;
import com.comforte.csl.cslapi.CSLOutputStream;
import com.comforte.csl.xmlutils.CSLTypes;

/** <code>LastFm</code>
 *  
 */
public class	LastFm implements com.comforte.csl.cslapi.CSLStreamable
{
   /* Members */
   protected String fmTimestamp;
   protected Short fmUserGrp;
   protected Integer fmUserNum;
   protected String updtTyp;
   protected String staNum;
   protected String filler;

   /** <code>LastFm</code>
    * Constructor
    * @param characterEncoding this is for setting strings with CSLBaseData
    * here we do not use it!
    */
   public LastFm(String characterEncoding)
   {
      setFmTimestamp(new String());
      setFmUserGrp(new Short((short)0));
      setFmUserNum(new Integer(0));
      setUpdtTyp(new String());
      setStaNum(new String());
      setFiller(new String());
   }

   /** <code>LastFm</code>
    *  Constructor
    */ 
   public LastFm()
   {
      this(null);
   }
   /* getter and setter */

   /**
    * <code>
    * FmTimestamp is a text String of16 bytes.
    * </code>
    */
   public String getFmTimestamp()
   {
      return fmTimestamp;
   }

   /**
    * <code>
    * FmTimestamp is a text String of16 bytes.
    * </code>
    */
   public void setFmTimestamp(String theFmTimestamp)
   {
       fmTimestamp = theFmTimestamp;
   }

   /**
    * <code>
    * Name=FM-USER-GRP;CSL Type=cslShort;
    * </code>
    */
   public Short getFmUserGrp()
   {
      return fmUserGrp;
   }

   /**
    * <code>
    * Name=FM-USER-GRP;CSL Type=cslShort;
    * </code>
    */
   public void setFmUserGrp(Short theFmUserGrp)
   {
       fmUserGrp = theFmUserGrp;
   }

   /**
    * <code>
    * Name=FM-USER-NUM;CSL Type=cslInteger;
    * </code>
    */
   public Integer getFmUserNum()
   {
      return fmUserNum;
   }

   /**
    * <code>
    * Name=FM-USER-NUM;CSL Type=cslInteger;
    * </code>
    */
   public void setFmUserNum(Integer theFmUserNum)
   {
       fmUserNum = theFmUserNum;
   }

   /**
    * <code>
    * UpdtTyp is a text String of1 bytes.
    * </code>
    */
   public String getUpdtTyp()
   {
      return updtTyp;
   }

   /**
    * <code>
    * UpdtTyp is a text String of1 bytes.
    * </code>
    */
   public void setUpdtTyp(String theUpdtTyp)
   {
       updtTyp = theUpdtTyp;
   }

   /**
    * <code>
    * StaNum is a text String of4 bytes.
    * </code>
    */
   public String getStaNum()
   {
      return staNum;
   }

   /**
    * <code>
    * StaNum is a text String of4 bytes.
    * </code>
    */
   public void setStaNum(String theStaNum)
   {
       staNum = theStaNum;
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
      out.writeString(getFmTimestamp(),16, CSLTypes.PICX);
      out.writeShort(getFmUserGrp().shortValue());
      out.writeInt(getFmUserNum().intValue());
      out.writeString(getUpdtTyp(),1, CSLTypes.PICX);
      out.writeString(getStaNum(),4, CSLTypes.PICX);
      out.writeString(getFiller(),1, CSLTypes.PICX);
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
      setFmTimestamp(in.readString(16));
      setFmUserGrp(new Short(in.readShort()));
      setFmUserNum(new Integer(in.readInt()));
      setUpdtTyp(in.readString(1));
      setStaNum(in.readString(4));
      setFiller(in.readString(1));
   } 
}
