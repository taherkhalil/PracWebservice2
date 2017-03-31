/*
 * @(#)StaticRpqFields.java
 * Created by CSL Studio (definition-schema) on 18/08/2016 05:17:03 PM
 */
package csl.globalpay.ipm.msgptdf53reply.msgptdf53;
import java.io.IOException;

import com.comforte.csl.cslapi.CSLInputStream;
import com.comforte.csl.cslapi.CSLOutputStream;
import com.comforte.csl.xmlutils.CSLTypes;

/** <code>StaticRpqFields</code>
 *  
 */
public class	StaticRpqFields implements com.comforte.csl.cslapi.CSLStreamable
{
   /* Members */
   protected String serialNumber;
   protected Long debitDailyLmt;
   protected Short staticVerNo;
   protected String eComFlg;
   protected String posCondCde;
   protected EmvTermCap emvTermCap;
   protected String termInputCapInd;
   protected String termAttendInd;
   protected String hostClose;
   protected String akbFldMasKey2;
   protected String akbFldMasKey3;
   protected String akbFldMac;
   protected String akbInd;
   protected String filler;

   /** <code>StaticRpqFields</code>
    * Constructor
    * @param characterEncoding this is for setting strings with CSLBaseData
    * here we do not use it!
    */
   public StaticRpqFields(String characterEncoding)
   {
      setSerialNumber(new String());
      setDebitDailyLmt(new Long((long)0));
      setStaticVerNo(new Short((short)0));
      setEComFlg(new String());
      setPosCondCde(new String());
      setEmvTermCap(new EmvTermCap());
      setTermInputCapInd(new String());
      setTermAttendInd(new String());
      setHostClose(new String());
      setAkbFldMasKey2(new String());
      setAkbFldMasKey3(new String());
      setAkbFldMac(new String());
      setAkbInd(new String());
      setFiller(new String());
   }

   /** <code>StaticRpqFields</code>
    *  Constructor
    */ 
   public StaticRpqFields()
   {
      this(null);
   }
   /* getter and setter */

   /**
    * <code>
    * SerialNumber is a text String of8 bytes.
    * </code>
    */
   public String getSerialNumber()
   {
      return serialNumber;
   }

   /**
    * <code>
    * SerialNumber is a text String of8 bytes.
    * </code>
    */
   public void setSerialNumber(String theSerialNumber)
   {
       serialNumber = theSerialNumber;
   }

   /**
    * <code>
    * Name=DEBIT-DAILY-LMT;CSL Type=cslLong;
    * </code>
    */
   public Long getDebitDailyLmt()
   {
      return debitDailyLmt;
   }

   /**
    * <code>
    * Name=DEBIT-DAILY-LMT;CSL Type=cslLong;
    * </code>
    */
   public void setDebitDailyLmt(Long theDebitDailyLmt)
   {
       debitDailyLmt = theDebitDailyLmt;
   }

   /**
    * <code>
    * Name=STATIC-VER-NO;CSL Type=cslShort;
    * </code>
    */
   public Short getStaticVerNo()
   {
      return staticVerNo;
   }

   /**
    * <code>
    * Name=STATIC-VER-NO;CSL Type=cslShort;
    * </code>
    */
   public void setStaticVerNo(Short theStaticVerNo)
   {
       staticVerNo = theStaticVerNo;
   }

   /**
    * <code>
    * EComFlg is a text String of1 bytes.
    * </code>
    */
   public String getEComFlg()
   {
      return eComFlg;
   }

   /**
    * <code>
    * EComFlg is a text String of1 bytes.
    * </code>
    */
   public void setEComFlg(String theEComFlg)
   {
       eComFlg = theEComFlg;
   }

   /**
    * <code>
    * PosCondCde is a text String of2 bytes.
    * </code>
    */
   public String getPosCondCde()
   {
      return posCondCde;
   }

   /**
    * <code>
    * PosCondCde is a text String of2 bytes.
    * </code>
    */
   public void setPosCondCde(String thePosCondCde)
   {
       posCondCde = thePosCondCde;
   }

   /**
    * <code>
    * Name=EMV-TERM-CAP;
    * </code>
    */
   public EmvTermCap getEmvTermCap()
   {
      return emvTermCap;
   }

   /**
    * <code>
    * Name=EMV-TERM-CAP;
    * </code>
    */
   public void setEmvTermCap(EmvTermCap theEmvTermCap)
   {
       emvTermCap = theEmvTermCap;
   }

   /**
    * <code>
    * TermInputCapInd is a text String of1 bytes.
    * </code>
    */
   public String getTermInputCapInd()
   {
      return termInputCapInd;
   }

   /**
    * <code>
    * TermInputCapInd is a text String of1 bytes.
    * </code>
    */
   public void setTermInputCapInd(String theTermInputCapInd)
   {
       termInputCapInd = theTermInputCapInd;
   }

   /**
    * <code>
    * TermAttendInd is a text String of1 bytes.
    * </code>
    */
   public String getTermAttendInd()
   {
      return termAttendInd;
   }

   /**
    * <code>
    * TermAttendInd is a text String of1 bytes.
    * </code>
    */
   public void setTermAttendInd(String theTermAttendInd)
   {
       termAttendInd = theTermAttendInd;
   }

   /**
    * <code>
    * HostClose is a text String of1 bytes.
    * </code>
    */
   public String getHostClose()
   {
      return hostClose;
   }

   /**
    * <code>
    * HostClose is a text String of1 bytes.
    * </code>
    */
   public void setHostClose(String theHostClose)
   {
       hostClose = theHostClose;
   }

   /**
    * <code>
    * AkbFldMasKey2 is a text String of16 bytes.
    * </code>
    */
   public String getAkbFldMasKey2()
   {
      return akbFldMasKey2;
   }

   /**
    * <code>
    * AkbFldMasKey2 is a text String of16 bytes.
    * </code>
    */
   public void setAkbFldMasKey2(String theAkbFldMasKey2)
   {
       akbFldMasKey2 = theAkbFldMasKey2;
   }

   /**
    * <code>
    * AkbFldMasKey3 is a text String of16 bytes.
    * </code>
    */
   public String getAkbFldMasKey3()
   {
      return akbFldMasKey3;
   }

   /**
    * <code>
    * AkbFldMasKey3 is a text String of16 bytes.
    * </code>
    */
   public void setAkbFldMasKey3(String theAkbFldMasKey3)
   {
       akbFldMasKey3 = theAkbFldMasKey3;
   }

   /**
    * <code>
    * AkbFldMac is a text String of16 bytes.
    * </code>
    */
   public String getAkbFldMac()
   {
      return akbFldMac;
   }

   /**
    * <code>
    * AkbFldMac is a text String of16 bytes.
    * </code>
    */
   public void setAkbFldMac(String theAkbFldMac)
   {
       akbFldMac = theAkbFldMac;
   }

   /**
    * <code>
    * AkbInd is a text String of1 bytes.
    * </code>
    */
   public String getAkbInd()
   {
      return akbInd;
   }

   /**
    * <code>
    * AkbInd is a text String of1 bytes.
    * </code>
    */
   public void setAkbInd(String theAkbInd)
   {
       akbInd = theAkbInd;
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
      out.writeString(getSerialNumber(),8, CSLTypes.PICX);
      out.writeLong(getDebitDailyLmt().longValue());
      out.writeShort(getStaticVerNo().shortValue());
      out.writeString(getEComFlg(),1, CSLTypes.PICX);
      out.writeString(getPosCondCde(),2, CSLTypes.PICX);
      getEmvTermCap().write(out);
      out.writeString(getTermInputCapInd(),1, CSLTypes.PICX);
      out.writeString(getTermAttendInd(),1, CSLTypes.PICX);
      out.writeString(getHostClose(),1, CSLTypes.PICX);
      out.writeString(getAkbFldMasKey2(),16, CSLTypes.PICX);
      out.writeString(getAkbFldMasKey3(),16, CSLTypes.PICX);
      out.writeString(getAkbFldMac(),16, CSLTypes.PICX);
      out.writeString(getAkbInd(),1, CSLTypes.PICX);
      out.writeString(getFiller(),8, CSLTypes.PICX);
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
      setSerialNumber(in.readString(8));
      setDebitDailyLmt(new Long(in.readLong()));
      setStaticVerNo(new Short(in.readShort()));
      setEComFlg(in.readString(1));
      setPosCondCde(in.readString(2));
      getEmvTermCap().read(in);
      setTermInputCapInd(in.readString(1));
      setTermAttendInd(in.readString(1));
      setHostClose(in.readString(1));
      setAkbFldMasKey2(in.readString(16));
      setAkbFldMasKey3(in.readString(16));
      setAkbFldMac(in.readString(16));
      setAkbInd(in.readString(1));
      setFiller(in.readString(8));
   } 
}
