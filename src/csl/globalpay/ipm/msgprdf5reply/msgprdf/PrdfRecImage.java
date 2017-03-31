/*
 * @(#)PrdfRecImage.java
 * Created by CSL Studio (definition-schema) on 24/08/2016 10:54:43 AM
 */
package csl.globalpay.ipm.msgprdf5reply.msgprdf;
import java.io.IOException;

import com.comforte.csl.cslapi.CSLInputStream;
import com.comforte.csl.cslapi.CSLOutputStream;
import com.comforte.csl.xmlutils.CSLTypes;

/** <code>PrdfRecImage</code>
 *  
 */
public class	PrdfRecImage implements com.comforte.csl.cslapi.CSLStreamable
{
   /* Members */
   protected Akey akey;
   protected Rkey rkey;
   protected Retailer retailer;
   protected String debitSupportFlg;
   protected Integer prePostDat;
   protected Integer curPostDat;
   protected Integer nxtPostDat;
   protected Short retailerBalAndCutvrStrt;
   protected Short retailerBalAndCutvrEnd;
   protected String retailerProg;
   protected String setl;
   protected String chkRtgGrp;
   protected String chkMrchntId;
   protected String panhAmtIncrPer;
   protected String mcAsgnId;
   protected String userFld6;
   protected LastTran lastTran;
   protected LastFm2 lastFm2;
   protected MerchActivityRpt merchActivityRpt;
   protected java.util.Vector adminTrans;
   protected String mailPoSicCde;
   protected String cbMovablePinpad;
   protected String visaCp;
   protected String visaCnp;
   protected String mobile;
   protected String mcdebit;
   protected String cbBatchNum;
   protected String cbType;
   protected String cbTotInq;
   protected String chkProvider;
   protected Short numSrv;
   protected Short numAltMrchnt;
   protected Short srvInfoLgth;
   protected SrvInfo srvInfo;

   /** <code>PrdfRecImage</code>
    * Constructor
    * @param characterEncoding this is for setting strings with CSLBaseData
    * here we do not use it!
    */
   public PrdfRecImage(String characterEncoding)
   {
      setAkey(new Akey());
      setRkey(new Rkey());
      setRetailer(new Retailer());
      setDebitSupportFlg(new String());
      setPrePostDat(new Integer(0));
      setCurPostDat(new Integer(0));
      setNxtPostDat(new Integer(0));
      setRetailerBalAndCutvrStrt(new Short((short)0));
      setRetailerBalAndCutvrEnd(new Short((short)0));
      setRetailerProg(new String());
      setSetl(new String());
      setChkRtgGrp(new String());
      setChkMrchntId(new String());
      setPanhAmtIncrPer(new String());
      setMcAsgnId(new String());
      setUserFld6(new String());
      setLastTran(new LastTran());
      setLastFm2(new LastFm2());
      setMerchActivityRpt(new MerchActivityRpt());
       adminTrans = new java.util.Vector();
      {
         int maxIndex = 30;
         for (int i=0; i < maxIndex; i++) {
            addAdminTrans(new String());
         }
      }
      setMailPoSicCde(new String());
      setCbMovablePinpad(new String());
      setVisaCp(new String());
      setVisaCnp(new String());
      setMobile(new String());
      setMcdebit(new String());
      setCbBatchNum(new String());
      setCbType(new String());
      setCbTotInq(new String());
      setChkProvider(new String());
      setNumSrv(new Short((short)0));
      setNumAltMrchnt(new Short((short)0));
      setSrvInfoLgth(new Short((short)0));
      setSrvInfo(new SrvInfo());
   }

   /** <code>PrdfRecImage</code>
    *  Constructor
    */ 
   public PrdfRecImage()
   {
      this(null);
   }
   /* getter and setter */

   /**
    * <code>
    * Name=AKEY;
    * </code>
    */
   public Akey getAkey()
   {
      return akey;
   }

   /**
    * <code>
    * Name=AKEY;
    * </code>
    */
   public void setAkey(Akey theAkey)
   {
       akey = theAkey;
   }

   /**
    * <code>
    * Name=RKEY;
    * </code>
    */
   public Rkey getRkey()
   {
      return rkey;
   }

   /**
    * <code>
    * Name=RKEY;
    * </code>
    */
   public void setRkey(Rkey theRkey)
   {
       rkey = theRkey;
   }

   /**
    * <code>
    * Name=RETAILER;
    * </code>
    */
   public Retailer getRetailer()
   {
      return retailer;
   }

   /**
    * <code>
    * Name=RETAILER;
    * </code>
    */
   public void setRetailer(Retailer theRetailer)
   {
       retailer = theRetailer;
   }

   /**
    * <code>
    * DebitSupportFlg is a text String of1 bytes.
    * </code>
    */
   public String getDebitSupportFlg()
   {
      return debitSupportFlg;
   }

   /**
    * <code>
    * DebitSupportFlg is a text String of1 bytes.
    * </code>
    */
   public void setDebitSupportFlg(String theDebitSupportFlg)
   {
       debitSupportFlg = theDebitSupportFlg;
   }

   /**
    * <code>
    * Name=PRE-POST-DAT;CSL Type=cslInteger;
    * </code>
    */
   public Integer getPrePostDat()
   {
      return prePostDat;
   }

   /**
    * <code>
    * Name=PRE-POST-DAT;CSL Type=cslInteger;
    * </code>
    */
   public void setPrePostDat(Integer thePrePostDat)
   {
       prePostDat = thePrePostDat;
   }

   /**
    * <code>
    * Name=CUR-POST-DAT;CSL Type=cslInteger;
    * </code>
    */
   public Integer getCurPostDat()
   {
      return curPostDat;
   }

   /**
    * <code>
    * Name=CUR-POST-DAT;CSL Type=cslInteger;
    * </code>
    */
   public void setCurPostDat(Integer theCurPostDat)
   {
       curPostDat = theCurPostDat;
   }

   /**
    * <code>
    * Name=NXT-POST-DAT;CSL Type=cslInteger;
    * </code>
    */
   public Integer getNxtPostDat()
   {
      return nxtPostDat;
   }

   /**
    * <code>
    * Name=NXT-POST-DAT;CSL Type=cslInteger;
    * </code>
    */
   public void setNxtPostDat(Integer theNxtPostDat)
   {
       nxtPostDat = theNxtPostDat;
   }

   /**
    * <code>
    * Name=RETAILER-BAL-AND-CUTVR-STRT;CSL Type=cslShort;
    * </code>
    */
   public Short getRetailerBalAndCutvrStrt()
   {
      return retailerBalAndCutvrStrt;
   }

   /**
    * <code>
    * Name=RETAILER-BAL-AND-CUTVR-STRT;CSL Type=cslShort;
    * </code>
    */
   public void setRetailerBalAndCutvrStrt(Short theRetailerBalAndCutvrStrt)
   {
       retailerBalAndCutvrStrt = theRetailerBalAndCutvrStrt;
   }

   /**
    * <code>
    * Name=RETAILER-BAL-AND-CUTVR-END;CSL Type=cslShort;
    * </code>
    */
   public Short getRetailerBalAndCutvrEnd()
   {
      return retailerBalAndCutvrEnd;
   }

   /**
    * <code>
    * Name=RETAILER-BAL-AND-CUTVR-END;CSL Type=cslShort;
    * </code>
    */
   public void setRetailerBalAndCutvrEnd(Short theRetailerBalAndCutvrEnd)
   {
       retailerBalAndCutvrEnd = theRetailerBalAndCutvrEnd;
   }

   /**
    * <code>
    * RetailerProg is a text String of1 bytes.
    * </code>
    */
   public String getRetailerProg()
   {
      return retailerProg;
   }

   /**
    * <code>
    * RetailerProg is a text String of1 bytes.
    * </code>
    */
   public void setRetailerProg(String theRetailerProg)
   {
       retailerProg = theRetailerProg;
   }

   /**
    * <code>
    * Setl is a numeric String of
							1 digits with 0 decimal places.
    * </code>
    */
   public String getSetl()
   {
      return setl;
   }

   /**
    * <code>
    * Setl is a numeric String of
							1 digits with 0 decimal places.
    * </code>
    */
   public void setSetl(String theSetl)
   {
       setl = theSetl;
   }

   /**
    * <code>
    * ChkRtgGrp is a text String of11 bytes.
    * </code>
    */
   public String getChkRtgGrp()
   {
      return chkRtgGrp;
   }

   /**
    * <code>
    * ChkRtgGrp is a text String of11 bytes.
    * </code>
    */
   public void setChkRtgGrp(String theChkRtgGrp)
   {
       chkRtgGrp = theChkRtgGrp;
   }

   /**
    * <code>
    * ChkMrchntId is a text String of15 bytes.
    * </code>
    */
   public String getChkMrchntId()
   {
      return chkMrchntId;
   }

   /**
    * <code>
    * ChkMrchntId is a text String of15 bytes.
    * </code>
    */
   public void setChkMrchntId(String theChkMrchntId)
   {
       chkMrchntId = theChkMrchntId;
   }

   /**
    * <code>
    * PanhAmtIncrPer is a text String of3 bytes.
    * </code>
    */
   public String getPanhAmtIncrPer()
   {
      return panhAmtIncrPer;
   }

   /**
    * <code>
    * PanhAmtIncrPer is a text String of3 bytes.
    * </code>
    */
   public void setPanhAmtIncrPer(String thePanhAmtIncrPer)
   {
       panhAmtIncrPer = thePanhAmtIncrPer;
   }

   /**
    * <code>
    * McAsgnId is a text String of6 bytes.
    * </code>
    */
   public String getMcAsgnId()
   {
      return mcAsgnId;
   }

   /**
    * <code>
    * McAsgnId is a text String of6 bytes.
    * </code>
    */
   public void setMcAsgnId(String theMcAsgnId)
   {
       mcAsgnId = theMcAsgnId;
   }

   /**
    * <code>
    * UserFld6 is a text String of5 bytes.
    * </code>
    */
   public String getUserFld6()
   {
      return userFld6;
   }

   /**
    * <code>
    * UserFld6 is a text String of5 bytes.
    * </code>
    */
   public void setUserFld6(String theUserFld6)
   {
       userFld6 = theUserFld6;
   }

   /**
    * <code>
    * Name=LAST-TRAN;
    * </code>
    */
   public LastTran getLastTran()
   {
      return lastTran;
   }

   /**
    * <code>
    * Name=LAST-TRAN;
    * </code>
    */
   public void setLastTran(LastTran theLastTran)
   {
       lastTran = theLastTran;
   }

   /**
    * <code>
    * Name=LAST-FM;
    * </code>
    */
   public LastFm2 getLastFm2()
   {
      return lastFm2;
   }

   /**
    * <code>
    * Name=LAST-FM;
    * </code>
    */
   public void setLastFm2(LastFm2 theLastFm2)
   {
       lastFm2 = theLastFm2;
   }

   /**
    * <code>
    * Name=MERCH-ACTIVITY-RPT;
    * </code>
    */
   public MerchActivityRpt getMerchActivityRpt()
   {
      return merchActivityRpt;
   }

   /**
    * <code>
    * Name=MERCH-ACTIVITY-RPT;
    * </code>
    */
   public void setMerchActivityRpt(MerchActivityRpt theMerchActivityRpt)
   {
       merchActivityRpt = theMerchActivityRpt;
   }

   /**
    * <code>
    * AdminTrans is a text String of1 bytes.
    * </code>
    */
   public String[] getAdminTrans()
   {
       String[] retval = new String[adminTrans.size()];
       adminTrans.copyInto(retval);
      return retval; 
   }

   /**
    * <code>
    * AdminTrans is a text String of1 bytes.
    * </code>
    */
   public void setAdminTrans(String[] values)
   {
       adminTrans = new java.util.Vector(values.length);
      for (int i=0; i < values.length; i++) {
         addAdminTrans(values[i]);
      }
   }

   /**
    * <code>
    * AdminTrans is a text String of1 bytes.
    * </code>
    */
   public String getAdminTrans(int i)
   {
      return (String)adminTrans.elementAt(i);
   }

   /**
    * <code>
    * AdminTrans is a text String of1 bytes.
    * </code>
    */
   public void setAdminTrans(int i, String value)
   {
       adminTrans.setElementAt(value, i);
   }

   /**
    * <code>
    * AdminTrans is a text String of1 bytes.
    * </code>
    */
   public void addAdminTrans(String value)
   {
       adminTrans.addElement(value);
   }

   /**
    * <code>
    * AdminTrans is a text String of1 bytes.
    * </code>
    */
   public void removeAdminTrans(String value)
   {
       adminTrans.removeElement(value);
   }

   /**
    * <code>
    * MailPoSicCde is a numeric String of
							4 digits with 0 decimal places.
    * </code>
    */
   public String getMailPoSicCde()
   {
      return mailPoSicCde;
   }

   /**
    * <code>
    * MailPoSicCde is a numeric String of
							4 digits with 0 decimal places.
    * </code>
    */
   public void setMailPoSicCde(String theMailPoSicCde)
   {
       mailPoSicCde = theMailPoSicCde;
   }

   /**
    * <code>
    * CbMovablePinpad is a text String of1 bytes.
    * </code>
    */
   public String getCbMovablePinpad()
   {
      return cbMovablePinpad;
   }

   /**
    * <code>
    * CbMovablePinpad is a text String of1 bytes.
    * </code>
    */
   public void setCbMovablePinpad(String theCbMovablePinpad)
   {
       cbMovablePinpad = theCbMovablePinpad;
   }

   /**
    * <code>
    * VisaCp is a text String of1 bytes.
    * </code>
    */
   public String getVisaCp()
   {
      return visaCp;
   }

   /**
    * <code>
    * VisaCp is a text String of1 bytes.
    * </code>
    */
   public void setVisaCp(String theVisaCp)
   {
       visaCp = theVisaCp;
   }

   /**
    * <code>
    * VisaCnp is a text String of1 bytes.
    * </code>
    */
   public String getVisaCnp()
   {
      return visaCnp;
   }

   /**
    * <code>
    * VisaCnp is a text String of1 bytes.
    * </code>
    */
   public void setVisaCnp(String theVisaCnp)
   {
       visaCnp = theVisaCnp;
   }

   /**
    * <code>
    * Mobile is a text String of1 bytes.
    * </code>
    */
   public String getMobile()
   {
      return mobile;
   }

   /**
    * <code>
    * Mobile is a text String of1 bytes.
    * </code>
    */
   public void setMobile(String theMobile)
   {
       mobile = theMobile;
   }

   /**
    * <code>
    * Mcdebit is a text String of1 bytes.
    * </code>
    */
   public String getMcdebit()
   {
      return mcdebit;
   }

   /**
    * <code>
    * Mcdebit is a text String of1 bytes.
    * </code>
    */
   public void setMcdebit(String theMcdebit)
   {
       mcdebit = theMcdebit;
   }

   /**
    * <code>
    * CbBatchNum is a numeric String of
							2 digits with 0 decimal places.
    * </code>
    */
   public String getCbBatchNum()
   {
      return cbBatchNum;
   }

   /**
    * <code>
    * CbBatchNum is a numeric String of
							2 digits with 0 decimal places.
    * </code>
    */
   public void setCbBatchNum(String theCbBatchNum)
   {
       cbBatchNum = theCbBatchNum;
   }

   /**
    * <code>
    * CbType is a text String of1 bytes.
    * </code>
    */
   public String getCbType()
   {
      return cbType;
   }

   /**
    * <code>
    * CbType is a text String of1 bytes.
    * </code>
    */
   public void setCbType(String theCbType)
   {
       cbType = theCbType;
   }

   /**
    * <code>
    * CbTotInq is a text String of1 bytes.
    * </code>
    */
   public String getCbTotInq()
   {
      return cbTotInq;
   }

   /**
    * <code>
    * CbTotInq is a text String of1 bytes.
    * </code>
    */
   public void setCbTotInq(String theCbTotInq)
   {
       cbTotInq = theCbTotInq;
   }

   /**
    * <code>
    * ChkProvider is a text String of1 bytes.
    * </code>
    */
   public String getChkProvider()
   {
      return chkProvider;
   }

   /**
    * <code>
    * ChkProvider is a text String of1 bytes.
    * </code>
    */
   public void setChkProvider(String theChkProvider)
   {
       chkProvider = theChkProvider;
   }

   /**
    * <code>
    * Name=NUM-SRV;CSL Type=cslShort;
    * </code>
    */
   public Short getNumSrv()
   {
      return numSrv;
   }

   /**
    * <code>
    * Name=NUM-SRV;CSL Type=cslShort;
    * </code>
    */
   public void setNumSrv(Short theNumSrv)
   {
       numSrv = theNumSrv;
   }

   /**
    * <code>
    * Name=NUM-ALT-MRCHNT;CSL Type=cslShort;
    * </code>
    */
   public Short getNumAltMrchnt()
   {
      return numAltMrchnt;
   }

   /**
    * <code>
    * Name=NUM-ALT-MRCHNT;CSL Type=cslShort;
    * </code>
    */
   public void setNumAltMrchnt(Short theNumAltMrchnt)
   {
       numAltMrchnt = theNumAltMrchnt;
   }

   /**
    * <code>
    * Name=SRV-INFO-LGTH;CSL Type=cslShort;
    * </code>
    */
   public Short getSrvInfoLgth()
   {
      return srvInfoLgth;
   }

   /**
    * <code>
    * Name=SRV-INFO-LGTH;CSL Type=cslShort;
    * </code>
    */
   public void setSrvInfoLgth(Short theSrvInfoLgth)
   {
       srvInfoLgth = theSrvInfoLgth;
   }

   /**
    * <code>
    * Name=SRV-INFO;
    * </code>
    */
   public SrvInfo getSrvInfo()
   {
      return srvInfo;
   }

   /**
    * <code>
    * Name=SRV-INFO;
    * </code>
    */
   public void setSrvInfo(SrvInfo theSrvInfo)
   {
       srvInfo = theSrvInfo;
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
      getAkey().write(out);
      getRkey().write(out);
      getRetailer().write(out);
      out.writeString(getDebitSupportFlg(),1, CSLTypes.PICX);
      out.writeInt(getPrePostDat().intValue());
      out.writeInt(getCurPostDat().intValue());
      out.writeInt(getNxtPostDat().intValue());
      out.writeShort(getRetailerBalAndCutvrStrt().shortValue());
      out.writeShort(getRetailerBalAndCutvrEnd().shortValue());
      out.writeString(getRetailerProg(),1, CSLTypes.PICX);
      help1 =
        com.comforte.csl.model.Util.convertNumStringFromDisplayToTransferFormat(getSetl(), 1, 0, 0);
      out.writeString(help1, help1.length());
      out.writeString(getChkRtgGrp(),11, CSLTypes.PICX);
      out.writeString(getChkMrchntId(),15, CSLTypes.PICX);
      out.writeString(getPanhAmtIncrPer(),3, CSLTypes.PICX);
      out.writeString(getMcAsgnId(),6, CSLTypes.PICX);
      out.writeString(getUserFld6(),5, CSLTypes.PICX);
      getLastTran().write(out);
      getLastFm2().write(out);
      getMerchActivityRpt().write(out);
      {
         int maxIndex = 30;
         int index = 0;
         java.util.Enumeration objects = adminTrans.elements(); 
         while (objects.hasMoreElements()) {
            if (index >= maxIndex) break; // write no more than max
            String toWrite = (String) objects.nextElement();
         out.writeString(toWrite, 1, CSLTypes.PICX);
            index++;
         }
      }
      help1 =
        com.comforte.csl.model.Util.convertNumStringFromDisplayToTransferFormat(getMailPoSicCde(), 4, 0, 0);
      out.writeString(help1, help1.length());
      out.writeString(getCbMovablePinpad(),1, CSLTypes.PICX);
      out.writeString(getVisaCp(),1, CSLTypes.PICX);
      out.writeString(getVisaCnp(),1, CSLTypes.PICX);
      out.writeString(getMobile(),1, CSLTypes.PICX);
      out.writeString(getMcdebit(),1, CSLTypes.PICX);
      help1 =
        com.comforte.csl.model.Util.convertNumStringFromDisplayToTransferFormat(getCbBatchNum(), 2, 0, 0);
      out.writeString(help1, help1.length());
      out.writeString(getCbType(),1, CSLTypes.PICX);
      out.writeString(getCbTotInq(),1, CSLTypes.PICX);
      out.writeString(getChkProvider(),1, CSLTypes.PICX);
      out.writeShort(getNumSrv().shortValue());
      out.writeShort(getNumAltMrchnt().shortValue());
      out.writeShort(getSrvInfoLgth().shortValue());
      getSrvInfo().write(out);
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
      getAkey().read(in);
      getRkey().read(in);
      getRetailer().read(in);
      setDebitSupportFlg(in.readString(1));
      setPrePostDat(new Integer(in.readInt()));
      setCurPostDat(new Integer(in.readInt()));
      setNxtPostDat(new Integer(in.readInt()));
      setRetailerBalAndCutvrStrt(new Short(in.readShort()));
      setRetailerBalAndCutvrEnd(new Short(in.readShort()));
      setRetailerProg(in.readString(1));
      help1 = in.readString(1);
      help2 =
         com.comforte.csl.model.Util.convertNumStringFromTransferToDisplayFormat(help1, 1, 0, 0);
      setSetl(help2);
      setChkRtgGrp(in.readString(11));
      setChkMrchntId(in.readString(15));
      setPanhAmtIncrPer(in.readString(3));
      setMcAsgnId(in.readString(6));
      setUserFld6(in.readString(5));
      getLastTran().read(in);
      getLastFm2().read(in);
      getMerchActivityRpt().read(in);
      {
         int maxIndex = 30;
         int index = 0;
       adminTrans = new java.util.Vector();
         while (index < maxIndex) {
            String toRead = null;
            toRead = in.readString(1);
            addAdminTrans(toRead); 
            index++;
         }
      }
      help1 = in.readString(4);
      help2 =
         com.comforte.csl.model.Util.convertNumStringFromTransferToDisplayFormat(help1, 4, 0, 0);
      setMailPoSicCde(help2);
      setCbMovablePinpad(in.readString(1));
      setVisaCp(in.readString(1));
      setVisaCnp(in.readString(1));
      setMobile(in.readString(1));
      setMcdebit(in.readString(1));
      help1 = in.readString(2);
      help2 =
         com.comforte.csl.model.Util.convertNumStringFromTransferToDisplayFormat(help1, 2, 0, 0);
      setCbBatchNum(help2);
      setCbType(in.readString(1));
      setCbTotInq(in.readString(1));
      setChkProvider(in.readString(1));
      setNumSrv(new Short(in.readShort()));
      setNumAltMrchnt(new Short(in.readShort()));
      setSrvInfoLgth(new Short(in.readShort()));
      getSrvInfo().read(in);
   } 
}
