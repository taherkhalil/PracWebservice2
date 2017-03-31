/*
 * @(#)Ptdfdef.java
 * Created by CSL Studio (definition-schema) on 18/08/2016 05:17:03 PM
 */
package csl.globalpay.ipm.msgptdf53reply.msgptdf53;
import java.io.IOException;

import com.comforte.csl.cslapi.CSLInputStream;
import com.comforte.csl.cslapi.CSLOutputStream;
import com.comforte.csl.xmlutils.CSLTypes;

/** <code>Ptdfdef</code>
 *  
 */
public class	Ptdfdef implements com.comforte.csl.cslapi.CSLStreamable
{
   /* Members */
   protected String termId;
   protected Short trxnInFlight;
   protected String relNum;
   protected String rttn;
   protected String dhProNam;
   protected String userFld1;
   protected String loadFilNam;
   protected Short logRtCde;
   protected String termNamLoc;
   protected TermCitySt termCitySt;
   protected String cntryCde;
   protected TermOwner termOwner;
   protected String termOwnerNam;
   protected String termGrp;
   protected String termSicCde;
   protected String termTyp;
   protected SrvRep srvRep;
   protected String pinPadChar;
   protected EncrPin encrPin;
   protected MacData macData;
   protected AkbMac akbMac;
   protected String mlDpcNum;
   protected String crncyCde;
   protected String mlReconlEnt;
   protected Short timOfst;
   protected Short preAuthHld;
   protected Integer preAuthDftAmt;
   protected String dfltChkId;
   protected String dfltTc;
   protected Short apprvCdeLgth;
   protected String deactivateFlg;
   protected String reconcileMode;
   protected Short crdsRet;
   protected Short numSrv;
   protected java.util.Vector srv;
   protected String akbPinMasKey2;
   protected String akbPinMasKey3;
   protected String akbMacMasKey2;
   protected String akbMacMasKey3;
   protected String akbKden000Key1;
   protected String akbKden000Key2;
   protected String akbKden000Key3;
   protected String akbKden000Mac;
   protected String akbPunn0i0Key1;
   protected String akbPunn0i0Key2;
   protected String akbPunn0i0Key3;
   protected String akbPunn0i0Mac;
   protected String akbLeftover;
   protected Short adjLmtCnt;
   protected Long adjLmtAmt;
   protected Short returnLmtCnt;
   protected Long returnLmtAmt;
   protected String userFld9;
   protected String userFld6;
   protected String custBalDspy;
   protected String termProto;
   protected Short languageInd;
   protected String clerkId;
   protected Integer begTranCntlNum;
   protected Integer endTranCntlNum;
   protected String billingInfo;
   protected Short clerkFlag;
   protected LastFm2 lastFm2;
   protected java.util.Vector allowedTrans;
   protected String termCutoverTc;
   protected String balSupport;
   protected Short numShifts;
   protected Term term;
   protected Short batchCutoverCnt;
   protected String postalCde;
   protected TermPhone termPhone;
   protected String mKeyChkValue;
   protected String masKeyChkValue;
   protected String rteGrp;
   protected String mailPoSicCde;
   protected String cityExt;
   protected String completeTrack2Data;
   protected Fil fil;
   protected String logTotals;
   protected StaticRpqFields staticRpqFields;
   protected Afs afs;
   protected String keyLgth;
   protected Long tranSeqNum;
   protected PostDat postDat;
   protected Integer lastSetlDat;
   protected Short lastSetlTim;
   protected ClerkTots clerkTots;
   protected Long creditDailyTotal;
   protected Batch batch;
   protected BatchDc batchDc;
   protected Shift shift;
   protected ShiftDc shiftDc;
   protected Daily daily;
   protected DailyDc dailyDc;
   protected CurNet curNet;
   protected CurNetDc curNetDc;
   protected PreNet preNet;
   protected PreNetDc preNetDc;
   protected LastTran lastTran;
   protected Short numBatches;
   protected Short shiftNum;
   protected Short batchNum;
   protected Short seqNum;
   protected String tknBuf;
   protected String delPtdfFlg;
   protected String balFlg;
   protected AkbWorkKeys akbWorkKeys;
   protected String waitConfirmFlg;
   protected WorkingKeys workingKeys;
   protected String macPendingFlg;
   protected String pinPendingFlg;
   protected String fldPendingFlg;
   protected DynamicRpqFields dynamicRpqFields;
   protected java.util.Vector srvTotals;
   protected String workPin2;
   protected String workMac2;
   protected String workPinMac;
   protected String workMacMac;
   protected String oldPinMac;
   protected String oldMacMac;
   protected String oldFldMac;
   protected String termPinKey;
   protected String termOldPinKey;
   protected String termMacKey;
   protected String termOldMacKey;
   protected String termFldKey;
   protected String termOldFldKey;
   protected String lastForceKeyChng;
   protected String termFldCheck;
   protected String termOldFldCheck;
   protected String filler;

   /** <code>Ptdfdef</code>
    * Constructor
    * @param characterEncoding this is for setting strings with CSLBaseData
    * here we do not use it!
    */
   public Ptdfdef(String characterEncoding)
   {
      setTermId(new String());
      setTrxnInFlight(new Short((short)0));
      setRelNum(new String());
      setRttn(new String());
      setDhProNam(new String());
      setUserFld1(new String());
      setLoadFilNam(new String());
      setLogRtCde(new Short((short)0));
      setTermNamLoc(new String());
      setTermCitySt(new TermCitySt());
      setCntryCde(new String());
      setTermOwner(new TermOwner());
      setTermOwnerNam(new String());
      setTermGrp(new String());
      setTermSicCde(new String());
      setTermTyp(new String());
      setSrvRep(new SrvRep());
      setPinPadChar(new String());
      setEncrPin(new EncrPin());
      setMacData(new MacData());
      setAkbMac(new AkbMac());
      setMlDpcNum(new String());
      setCrncyCde(new String());
      setMlReconlEnt(new String());
      setTimOfst(new Short((short)0));
      setPreAuthHld(new Short((short)0));
      setPreAuthDftAmt(new Integer(0));
      setDfltChkId(new String());
      setDfltTc(new String());
      setApprvCdeLgth(new Short((short)0));
      setDeactivateFlg(new String());
      setReconcileMode(new String());
      setCrdsRet(new Short((short)0));
      setNumSrv(new Short((short)0));
       srv = new java.util.Vector();
      {
         int maxIndex = 20;
         for (int i=0; i < maxIndex; i++) {
            addSrv(new Srv());
         }
      }
      setAkbPinMasKey2(new String());
      setAkbPinMasKey3(new String());
      setAkbMacMasKey2(new String());
      setAkbMacMasKey3(new String());
      setAkbKden000Key1(new String());
      setAkbKden000Key2(new String());
      setAkbKden000Key3(new String());
      setAkbKden000Mac(new String());
      setAkbPunn0i0Key1(new String());
      setAkbPunn0i0Key2(new String());
      setAkbPunn0i0Key3(new String());
      setAkbPunn0i0Mac(new String());
      setAkbLeftover(new String());
      setAdjLmtCnt(new Short((short)0));
      setAdjLmtAmt(new Long((long)0));
      setReturnLmtCnt(new Short((short)0));
      setReturnLmtAmt(new Long((long)0));
      setUserFld9(new String());
      setUserFld6(new String());
      setCustBalDspy(new String());
      setTermProto(new String());
      setLanguageInd(new Short((short)0));
      setClerkId(new String());
      setBegTranCntlNum(new Integer(0));
      setEndTranCntlNum(new Integer(0));
      setBillingInfo(new String());
      setClerkFlag(new Short((short)0));
      setLastFm2(new LastFm2());
       allowedTrans = new java.util.Vector();
      {
         int maxIndex = 30;
         for (int i=0; i < maxIndex; i++) {
            addAllowedTrans(new String());
         }
      }
      setTermCutoverTc(new String());
      setBalSupport(new String());
      setNumShifts(new Short((short)0));
      setTerm(new Term());
      setBatchCutoverCnt(new Short((short)0));
      setPostalCde(new String());
      setTermPhone(new TermPhone());
      setMKeyChkValue(new String());
      setMasKeyChkValue(new String());
      setRteGrp(new String());
      setMailPoSicCde(new String());
      setCityExt(new String());
      setCompleteTrack2Data(new String());
      setFil(new Fil());
      setLogTotals(new String());
      setStaticRpqFields(new StaticRpqFields());
      setAfs(new Afs());
      setKeyLgth(new String());
      setTranSeqNum(new Long((long)0));
      setPostDat(new PostDat());
      setLastSetlDat(new Integer(0));
      setLastSetlTim(new Short((short)0));
      setClerkTots(new ClerkTots());
      setCreditDailyTotal(new Long((long)0));
      setBatch(new Batch());
      setBatchDc(new BatchDc());
      setShift(new Shift());
      setShiftDc(new ShiftDc());
      setDaily(new Daily());
      setDailyDc(new DailyDc());
      setCurNet(new CurNet());
      setCurNetDc(new CurNetDc());
      setPreNet(new PreNet());
      setPreNetDc(new PreNetDc());
      setLastTran(new LastTran());
      setNumBatches(new Short((short)0));
      setShiftNum(new Short((short)0));
      setBatchNum(new Short((short)0));
      setSeqNum(new Short((short)0));
      setTknBuf(new String());
      setDelPtdfFlg(new String());
      setBalFlg(new String());
      setAkbWorkKeys(new AkbWorkKeys());
      setWaitConfirmFlg(new String());
      setWorkingKeys(new WorkingKeys());
      setMacPendingFlg(new String());
      setPinPendingFlg(new String());
      setFldPendingFlg(new String());
      setDynamicRpqFields(new DynamicRpqFields());
       srvTotals = new java.util.Vector();
      {
         int maxIndex = 20;
         for (int i=0; i < maxIndex; i++) {
            addSrvTotals(new SrvTotals());
         }
      }
      setWorkPin2(new String());
      setWorkMac2(new String());
      setWorkPinMac(new String());
      setWorkMacMac(new String());
      setOldPinMac(new String());
      setOldMacMac(new String());
      setOldFldMac(new String());
      setTermPinKey(new String());
      setTermOldPinKey(new String());
      setTermMacKey(new String());
      setTermOldMacKey(new String());
      setTermFldKey(new String());
      setTermOldFldKey(new String());
      setLastForceKeyChng(new String());
      setTermFldCheck(new String());
      setTermOldFldCheck(new String());
      setFiller(new String());
   }

   /** <code>Ptdfdef</code>
    *  Constructor
    */ 
   public Ptdfdef()
   {
      this(null);
   }
   /* getter and setter */

   /**
    * <code>
    * TermId is a text String of16 bytes.
    * </code>
    */
   public String getTermId()
   {
      return termId;
   }

   /**
    * <code>
    * TermId is a text String of16 bytes.
    * </code>
    */
   public void setTermId(String theTermId)
   {
       termId = theTermId;
   }

   /**
    * <code>
    * Name=TRXN-IN-FLIGHT;CSL Type=cslShort;
    * </code>
    */
   public Short getTrxnInFlight()
   {
      return trxnInFlight;
   }

   /**
    * <code>
    * Name=TRXN-IN-FLIGHT;CSL Type=cslShort;
    * </code>
    */
   public void setTrxnInFlight(Short theTrxnInFlight)
   {
       trxnInFlight = theTrxnInFlight;
   }

   /**
    * <code>
    * RelNum is a numeric String of
							2 digits with 0 decimal places.
    * </code>
    */
   public String getRelNum()
   {
      return relNum;
   }

   /**
    * <code>
    * RelNum is a numeric String of
							2 digits with 0 decimal places.
    * </code>
    */
   public void setRelNum(String theRelNum)
   {
       relNum = theRelNum;
   }

   /**
    * <code>
    * Rttn is a numeric String of
							11 digits with 0 decimal places.
    * </code>
    */
   public String getRttn()
   {
      return rttn;
   }

   /**
    * <code>
    * Rttn is a numeric String of
							11 digits with 0 decimal places.
    * </code>
    */
   public void setRttn(String theRttn)
   {
       rttn = theRttn;
   }

   /**
    * <code>
    * DhProNam is a text String of16 bytes.
    * </code>
    */
   public String getDhProNam()
   {
      return dhProNam;
   }

   /**
    * <code>
    * DhProNam is a text String of16 bytes.
    * </code>
    */
   public void setDhProNam(String theDhProNam)
   {
       dhProNam = theDhProNam;
   }

   /**
    * <code>
    * UserFld1 is a numeric String of
							2 digits with 0 decimal places.
    * </code>
    */
   public String getUserFld1()
   {
      return userFld1;
   }

   /**
    * <code>
    * UserFld1 is a numeric String of
							2 digits with 0 decimal places.
    * </code>
    */
   public void setUserFld1(String theUserFld1)
   {
       userFld1 = theUserFld1;
   }

   /**
    * <code>
    * LoadFilNam is a text String of25 bytes.
    * </code>
    */
   public String getLoadFilNam()
   {
      return loadFilNam;
   }

   /**
    * <code>
    * LoadFilNam is a text String of25 bytes.
    * </code>
    */
   public void setLoadFilNam(String theLoadFilNam)
   {
       loadFilNam = theLoadFilNam;
   }

   /**
    * <code>
    * Name=LOG-RT-CDE;CSL Type=cslShort;
    * </code>
    */
   public Short getLogRtCde()
   {
      return logRtCde;
   }

   /**
    * <code>
    * Name=LOG-RT-CDE;CSL Type=cslShort;
    * </code>
    */
   public void setLogRtCde(Short theLogRtCde)
   {
       logRtCde = theLogRtCde;
   }

   /**
    * <code>
    * TermNamLoc is a text String of25 bytes.
    * </code>
    */
   public String getTermNamLoc()
   {
      return termNamLoc;
   }

   /**
    * <code>
    * TermNamLoc is a text String of25 bytes.
    * </code>
    */
   public void setTermNamLoc(String theTermNamLoc)
   {
       termNamLoc = theTermNamLoc;
   }

   /**
    * <code>
    * Name=TERM-CITY-ST;
    * </code>
    */
   public TermCitySt getTermCitySt()
   {
      return termCitySt;
   }

   /**
    * <code>
    * Name=TERM-CITY-ST;
    * </code>
    */
   public void setTermCitySt(TermCitySt theTermCitySt)
   {
       termCitySt = theTermCitySt;
   }

   /**
    * <code>
    * CntryCde is a text String of2 bytes.
    * </code>
    */
   public String getCntryCde()
   {
      return cntryCde;
   }

   /**
    * <code>
    * CntryCde is a text String of2 bytes.
    * </code>
    */
   public void setCntryCde(String theCntryCde)
   {
       cntryCde = theCntryCde;
   }

   /**
    * <code>
    * Name=TERM-OWNER;
    * </code>
    */
   public TermOwner getTermOwner()
   {
      return termOwner;
   }

   /**
    * <code>
    * Name=TERM-OWNER;
    * </code>
    */
   public void setTermOwner(TermOwner theTermOwner)
   {
       termOwner = theTermOwner;
   }

   /**
    * <code>
    * TermOwnerNam is a text String of25 bytes.
    * </code>
    */
   public String getTermOwnerNam()
   {
      return termOwnerNam;
   }

   /**
    * <code>
    * TermOwnerNam is a text String of25 bytes.
    * </code>
    */
   public void setTermOwnerNam(String theTermOwnerNam)
   {
       termOwnerNam = theTermOwnerNam;
   }

   /**
    * <code>
    * TermGrp is a text String of4 bytes.
    * </code>
    */
   public String getTermGrp()
   {
      return termGrp;
   }

   /**
    * <code>
    * TermGrp is a text String of4 bytes.
    * </code>
    */
   public void setTermGrp(String theTermGrp)
   {
       termGrp = theTermGrp;
   }

   /**
    * <code>
    * TermSicCde is a numeric String of
							4 digits with 0 decimal places.
    * </code>
    */
   public String getTermSicCde()
   {
      return termSicCde;
   }

   /**
    * <code>
    * TermSicCde is a numeric String of
							4 digits with 0 decimal places.
    * </code>
    */
   public void setTermSicCde(String theTermSicCde)
   {
       termSicCde = theTermSicCde;
   }

   /**
    * <code>
    * TermTyp is a text String of2 bytes.
    * </code>
    */
   public String getTermTyp()
   {
      return termTyp;
   }

   /**
    * <code>
    * TermTyp is a text String of2 bytes.
    * </code>
    */
   public void setTermTyp(String theTermTyp)
   {
       termTyp = theTermTyp;
   }

   /**
    * <code>
    * Name=SRV-REP;
    * </code>
    */
   public SrvRep getSrvRep()
   {
      return srvRep;
   }

   /**
    * <code>
    * Name=SRV-REP;
    * </code>
    */
   public void setSrvRep(SrvRep theSrvRep)
   {
       srvRep = theSrvRep;
   }

   /**
    * <code>
    * PinPadChar is a text String of1 bytes.
    * </code>
    */
   public String getPinPadChar()
   {
      return pinPadChar;
   }

   /**
    * <code>
    * PinPadChar is a text String of1 bytes.
    * </code>
    */
   public void setPinPadChar(String thePinPadChar)
   {
       pinPadChar = thePinPadChar;
   }

   /**
    * <code>
    * Name=ENCR-PIN;
    * </code>
    */
   public EncrPin getEncrPin()
   {
      return encrPin;
   }

   /**
    * <code>
    * Name=ENCR-PIN;
    * </code>
    */
   public void setEncrPin(EncrPin theEncrPin)
   {
       encrPin = theEncrPin;
   }

   /**
    * <code>
    * Name=MAC-DATA;
    * </code>
    */
   public MacData getMacData()
   {
      return macData;
   }

   /**
    * <code>
    * Name=MAC-DATA;
    * </code>
    */
   public void setMacData(MacData theMacData)
   {
       macData = theMacData;
   }

   /**
    * <code>
    * Name=AKB-MAC;
    * </code>
    */
   public AkbMac getAkbMac()
   {
      return akbMac;
   }

   /**
    * <code>
    * Name=AKB-MAC;
    * </code>
    */
   public void setAkbMac(AkbMac theAkbMac)
   {
       akbMac = theAkbMac;
   }

   /**
    * <code>
    * MlDpcNum is a text String of2 bytes.
    * </code>
    */
   public String getMlDpcNum()
   {
      return mlDpcNum;
   }

   /**
    * <code>
    * MlDpcNum is a text String of2 bytes.
    * </code>
    */
   public void setMlDpcNum(String theMlDpcNum)
   {
       mlDpcNum = theMlDpcNum;
   }

   /**
    * <code>
    * CrncyCde is a numeric String of
							3 digits with 0 decimal places.
    * </code>
    */
   public String getCrncyCde()
   {
      return crncyCde;
   }

   /**
    * <code>
    * CrncyCde is a numeric String of
							3 digits with 0 decimal places.
    * </code>
    */
   public void setCrncyCde(String theCrncyCde)
   {
       crncyCde = theCrncyCde;
   }

   /**
    * <code>
    * MlReconlEnt is a text String of1 bytes.
    * </code>
    */
   public String getMlReconlEnt()
   {
      return mlReconlEnt;
   }

   /**
    * <code>
    * MlReconlEnt is a text String of1 bytes.
    * </code>
    */
   public void setMlReconlEnt(String theMlReconlEnt)
   {
       mlReconlEnt = theMlReconlEnt;
   }

   /**
    * <code>
    * Name=TIM-OFST;CSL Type=cslShort;
    * </code>
    */
   public Short getTimOfst()
   {
      return timOfst;
   }

   /**
    * <code>
    * Name=TIM-OFST;CSL Type=cslShort;
    * </code>
    */
   public void setTimOfst(Short theTimOfst)
   {
       timOfst = theTimOfst;
   }

   /**
    * <code>
    * Name=PRE-AUTH-HLD;CSL Type=cslShort;
    * </code>
    */
   public Short getPreAuthHld()
   {
      return preAuthHld;
   }

   /**
    * <code>
    * Name=PRE-AUTH-HLD;CSL Type=cslShort;
    * </code>
    */
   public void setPreAuthHld(Short thePreAuthHld)
   {
       preAuthHld = thePreAuthHld;
   }

   /**
    * <code>
    * Name=PRE-AUTH-DFT-AMT;CSL Type=cslInteger;
    * </code>
    */
   public Integer getPreAuthDftAmt()
   {
      return preAuthDftAmt;
   }

   /**
    * <code>
    * Name=PRE-AUTH-DFT-AMT;CSL Type=cslInteger;
    * </code>
    */
   public void setPreAuthDftAmt(Integer thePreAuthDftAmt)
   {
       preAuthDftAmt = thePreAuthDftAmt;
   }

   /**
    * <code>
    * DfltChkId is a text String of2 bytes.
    * </code>
    */
   public String getDfltChkId()
   {
      return dfltChkId;
   }

   /**
    * <code>
    * DfltChkId is a text String of2 bytes.
    * </code>
    */
   public void setDfltChkId(String theDfltChkId)
   {
       dfltChkId = theDfltChkId;
   }

   /**
    * <code>
    * DfltTc is a numeric String of
							2 digits with 0 decimal places.
    * </code>
    */
   public String getDfltTc()
   {
      return dfltTc;
   }

   /**
    * <code>
    * DfltTc is a numeric String of
							2 digits with 0 decimal places.
    * </code>
    */
   public void setDfltTc(String theDfltTc)
   {
       dfltTc = theDfltTc;
   }

   /**
    * <code>
    * Name=APPRV-CDE-LGTH;CSL Type=cslShort;
    * </code>
    */
   public Short getApprvCdeLgth()
   {
      return apprvCdeLgth;
   }

   /**
    * <code>
    * Name=APPRV-CDE-LGTH;CSL Type=cslShort;
    * </code>
    */
   public void setApprvCdeLgth(Short theApprvCdeLgth)
   {
       apprvCdeLgth = theApprvCdeLgth;
   }

   /**
    * <code>
    * DeactivateFlg is a text String of1 bytes.
    * </code>
    */
   public String getDeactivateFlg()
   {
      return deactivateFlg;
   }

   /**
    * <code>
    * DeactivateFlg is a text String of1 bytes.
    * </code>
    */
   public void setDeactivateFlg(String theDeactivateFlg)
   {
       deactivateFlg = theDeactivateFlg;
   }

   /**
    * <code>
    * ReconcileMode is a text String of1 bytes.
    * </code>
    */
   public String getReconcileMode()
   {
      return reconcileMode;
   }

   /**
    * <code>
    * ReconcileMode is a text String of1 bytes.
    * </code>
    */
   public void setReconcileMode(String theReconcileMode)
   {
       reconcileMode = theReconcileMode;
   }

   /**
    * <code>
    * Name=CRDS-RET;CSL Type=cslShort;
    * </code>
    */
   public Short getCrdsRet()
   {
      return crdsRet;
   }

   /**
    * <code>
    * Name=CRDS-RET;CSL Type=cslShort;
    * </code>
    */
   public void setCrdsRet(Short theCrdsRet)
   {
       crdsRet = theCrdsRet;
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
    * Name=SRV;
    * </code>
    */
   public Srv[] getSrv()
   {
       Srv[] retval = new Srv[srv.size()];
       srv.copyInto(retval);
      return retval; 
   }

   /**
    * <code>
    * Name=SRV;
    * </code>
    */
   public void setSrv(Srv[] values)
   {
       srv = new java.util.Vector(values.length);
      for (int i=0; i < values.length; i++) {
         addSrv(values[i]);
      }
   }

   /**
    * <code>
    * Name=SRV;
    * </code>
    */
   public Srv getSrv(int i)
   {
      return (Srv)srv.elementAt(i);
   }

   /**
    * <code>
    * Name=SRV;
    * </code>
    */
   public void setSrv(int i, Srv value)
   {
       srv.setElementAt(value, i);
   }

   /**
    * <code>
    * Name=SRV;
    * </code>
    */
   public void addSrv(Srv value)
   {
       srv.addElement(value);
   }

   /**
    * <code>
    * Name=SRV;
    * </code>
    */
   public void removeSrv(Srv value)
   {
       srv.removeElement(value);
   }

   /**
    * <code>
    * AkbPinMasKey2 is a text String of16 bytes.
    * </code>
    */
   public String getAkbPinMasKey2()
   {
      return akbPinMasKey2;
   }

   /**
    * <code>
    * AkbPinMasKey2 is a text String of16 bytes.
    * </code>
    */
   public void setAkbPinMasKey2(String theAkbPinMasKey2)
   {
       akbPinMasKey2 = theAkbPinMasKey2;
   }

   /**
    * <code>
    * AkbPinMasKey3 is a text String of16 bytes.
    * </code>
    */
   public String getAkbPinMasKey3()
   {
      return akbPinMasKey3;
   }

   /**
    * <code>
    * AkbPinMasKey3 is a text String of16 bytes.
    * </code>
    */
   public void setAkbPinMasKey3(String theAkbPinMasKey3)
   {
       akbPinMasKey3 = theAkbPinMasKey3;
   }

   /**
    * <code>
    * AkbMacMasKey2 is a text String of16 bytes.
    * </code>
    */
   public String getAkbMacMasKey2()
   {
      return akbMacMasKey2;
   }

   /**
    * <code>
    * AkbMacMasKey2 is a text String of16 bytes.
    * </code>
    */
   public void setAkbMacMasKey2(String theAkbMacMasKey2)
   {
       akbMacMasKey2 = theAkbMacMasKey2;
   }

   /**
    * <code>
    * AkbMacMasKey3 is a text String of16 bytes.
    * </code>
    */
   public String getAkbMacMasKey3()
   {
      return akbMacMasKey3;
   }

   /**
    * <code>
    * AkbMacMasKey3 is a text String of16 bytes.
    * </code>
    */
   public void setAkbMacMasKey3(String theAkbMacMasKey3)
   {
       akbMacMasKey3 = theAkbMacMasKey3;
   }

   /**
    * <code>
    * AkbKden000Key1 is a text String of16 bytes.
    * </code>
    */
   public String getAkbKden000Key1()
   {
      return akbKden000Key1;
   }

   /**
    * <code>
    * AkbKden000Key1 is a text String of16 bytes.
    * </code>
    */
   public void setAkbKden000Key1(String theAkbKden000Key1)
   {
       akbKden000Key1 = theAkbKden000Key1;
   }

   /**
    * <code>
    * AkbKden000Key2 is a text String of16 bytes.
    * </code>
    */
   public String getAkbKden000Key2()
   {
      return akbKden000Key2;
   }

   /**
    * <code>
    * AkbKden000Key2 is a text String of16 bytes.
    * </code>
    */
   public void setAkbKden000Key2(String theAkbKden000Key2)
   {
       akbKden000Key2 = theAkbKden000Key2;
   }

   /**
    * <code>
    * AkbKden000Key3 is a text String of16 bytes.
    * </code>
    */
   public String getAkbKden000Key3()
   {
      return akbKden000Key3;
   }

   /**
    * <code>
    * AkbKden000Key3 is a text String of16 bytes.
    * </code>
    */
   public void setAkbKden000Key3(String theAkbKden000Key3)
   {
       akbKden000Key3 = theAkbKden000Key3;
   }

   /**
    * <code>
    * AkbKden000Mac is a text String of16 bytes.
    * </code>
    */
   public String getAkbKden000Mac()
   {
      return akbKden000Mac;
   }

   /**
    * <code>
    * AkbKden000Mac is a text String of16 bytes.
    * </code>
    */
   public void setAkbKden000Mac(String theAkbKden000Mac)
   {
       akbKden000Mac = theAkbKden000Mac;
   }

   /**
    * <code>
    * AkbPunn0i0Key1 is a text String of16 bytes.
    * </code>
    */
   public String getAkbPunn0i0Key1()
   {
      return akbPunn0i0Key1;
   }

   /**
    * <code>
    * AkbPunn0i0Key1 is a text String of16 bytes.
    * </code>
    */
   public void setAkbPunn0i0Key1(String theAkbPunn0i0Key1)
   {
       akbPunn0i0Key1 = theAkbPunn0i0Key1;
   }

   /**
    * <code>
    * AkbPunn0i0Key2 is a text String of16 bytes.
    * </code>
    */
   public String getAkbPunn0i0Key2()
   {
      return akbPunn0i0Key2;
   }

   /**
    * <code>
    * AkbPunn0i0Key2 is a text String of16 bytes.
    * </code>
    */
   public void setAkbPunn0i0Key2(String theAkbPunn0i0Key2)
   {
       akbPunn0i0Key2 = theAkbPunn0i0Key2;
   }

   /**
    * <code>
    * AkbPunn0i0Key3 is a text String of16 bytes.
    * </code>
    */
   public String getAkbPunn0i0Key3()
   {
      return akbPunn0i0Key3;
   }

   /**
    * <code>
    * AkbPunn0i0Key3 is a text String of16 bytes.
    * </code>
    */
   public void setAkbPunn0i0Key3(String theAkbPunn0i0Key3)
   {
       akbPunn0i0Key3 = theAkbPunn0i0Key3;
   }

   /**
    * <code>
    * AkbPunn0i0Mac is a text String of16 bytes.
    * </code>
    */
   public String getAkbPunn0i0Mac()
   {
      return akbPunn0i0Mac;
   }

   /**
    * <code>
    * AkbPunn0i0Mac is a text String of16 bytes.
    * </code>
    */
   public void setAkbPunn0i0Mac(String theAkbPunn0i0Mac)
   {
       akbPunn0i0Mac = theAkbPunn0i0Mac;
   }

   /**
    * <code>
    * AkbLeftover is a text String of8 bytes.
    * </code>
    */
   public String getAkbLeftover()
   {
      return akbLeftover;
   }

   /**
    * <code>
    * AkbLeftover is a text String of8 bytes.
    * </code>
    */
   public void setAkbLeftover(String theAkbLeftover)
   {
       akbLeftover = theAkbLeftover;
   }

   /**
    * <code>
    * Name=ADJ-LMT-CNT;CSL Type=cslShort;
    * </code>
    */
   public Short getAdjLmtCnt()
   {
      return adjLmtCnt;
   }

   /**
    * <code>
    * Name=ADJ-LMT-CNT;CSL Type=cslShort;
    * </code>
    */
   public void setAdjLmtCnt(Short theAdjLmtCnt)
   {
       adjLmtCnt = theAdjLmtCnt;
   }

   /**
    * <code>
    * Name=ADJ-LMT-AMT;CSL Type=cslLong;
    * </code>
    */
   public Long getAdjLmtAmt()
   {
      return adjLmtAmt;
   }

   /**
    * <code>
    * Name=ADJ-LMT-AMT;CSL Type=cslLong;
    * </code>
    */
   public void setAdjLmtAmt(Long theAdjLmtAmt)
   {
       adjLmtAmt = theAdjLmtAmt;
   }

   /**
    * <code>
    * Name=RETURN-LMT-CNT;CSL Type=cslShort;
    * </code>
    */
   public Short getReturnLmtCnt()
   {
      return returnLmtCnt;
   }

   /**
    * <code>
    * Name=RETURN-LMT-CNT;CSL Type=cslShort;
    * </code>
    */
   public void setReturnLmtCnt(Short theReturnLmtCnt)
   {
       returnLmtCnt = theReturnLmtCnt;
   }

   /**
    * <code>
    * Name=RETURN-LMT-AMT;CSL Type=cslLong;
    * </code>
    */
   public Long getReturnLmtAmt()
   {
      return returnLmtAmt;
   }

   /**
    * <code>
    * Name=RETURN-LMT-AMT;CSL Type=cslLong;
    * </code>
    */
   public void setReturnLmtAmt(Long theReturnLmtAmt)
   {
       returnLmtAmt = theReturnLmtAmt;
   }

   /**
    * <code>
    * UserFld9 is a text String of1 bytes.
    * </code>
    */
   public String getUserFld9()
   {
      return userFld9;
   }

   /**
    * <code>
    * UserFld9 is a text String of1 bytes.
    * </code>
    */
   public void setUserFld9(String theUserFld9)
   {
       userFld9 = theUserFld9;
   }

   /**
    * <code>
    * UserFld6 is a text String of1 bytes.
    * </code>
    */
   public String getUserFld6()
   {
      return userFld6;
   }

   /**
    * <code>
    * UserFld6 is a text String of1 bytes.
    * </code>
    */
   public void setUserFld6(String theUserFld6)
   {
       userFld6 = theUserFld6;
   }

   /**
    * <code>
    * CustBalDspy is a numeric String of
							1 digits with 0 decimal places.
    * </code>
    */
   public String getCustBalDspy()
   {
      return custBalDspy;
   }

   /**
    * <code>
    * CustBalDspy is a numeric String of
							1 digits with 0 decimal places.
    * </code>
    */
   public void setCustBalDspy(String theCustBalDspy)
   {
       custBalDspy = theCustBalDspy;
   }

   /**
    * <code>
    * TermProto is a text String of1 bytes.
    * </code>
    */
   public String getTermProto()
   {
      return termProto;
   }

   /**
    * <code>
    * TermProto is a text String of1 bytes.
    * </code>
    */
   public void setTermProto(String theTermProto)
   {
       termProto = theTermProto;
   }

   /**
    * <code>
    * Name=LANGUAGE-IND;CSL Type=cslShort;
    * </code>
    */
   public Short getLanguageInd()
   {
      return languageInd;
   }

   /**
    * <code>
    * Name=LANGUAGE-IND;CSL Type=cslShort;
    * </code>
    */
   public void setLanguageInd(Short theLanguageInd)
   {
       languageInd = theLanguageInd;
   }

   /**
    * <code>
    * ClerkId is a text String of6 bytes.
    * </code>
    */
   public String getClerkId()
   {
      return clerkId;
   }

   /**
    * <code>
    * ClerkId is a text String of6 bytes.
    * </code>
    */
   public void setClerkId(String theClerkId)
   {
       clerkId = theClerkId;
   }

   /**
    * <code>
    * Name=BEG-TRAN-CNTL-NUM;CSL Type=cslInteger;
    * </code>
    */
   public Integer getBegTranCntlNum()
   {
      return begTranCntlNum;
   }

   /**
    * <code>
    * Name=BEG-TRAN-CNTL-NUM;CSL Type=cslInteger;
    * </code>
    */
   public void setBegTranCntlNum(Integer theBegTranCntlNum)
   {
       begTranCntlNum = theBegTranCntlNum;
   }

   /**
    * <code>
    * Name=END-TRAN-CNTL-NUM;CSL Type=cslInteger;
    * </code>
    */
   public Integer getEndTranCntlNum()
   {
      return endTranCntlNum;
   }

   /**
    * <code>
    * Name=END-TRAN-CNTL-NUM;CSL Type=cslInteger;
    * </code>
    */
   public void setEndTranCntlNum(Integer theEndTranCntlNum)
   {
       endTranCntlNum = theEndTranCntlNum;
   }

   /**
    * <code>
    * BillingInfo is a text String of10 bytes.
    * </code>
    */
   public String getBillingInfo()
   {
      return billingInfo;
   }

   /**
    * <code>
    * BillingInfo is a text String of10 bytes.
    * </code>
    */
   public void setBillingInfo(String theBillingInfo)
   {
       billingInfo = theBillingInfo;
   }

   /**
    * <code>
    * Name=CLERK-FLAG;CSL Type=cslShort;
    * </code>
    */
   public Short getClerkFlag()
   {
      return clerkFlag;
   }

   /**
    * <code>
    * Name=CLERK-FLAG;CSL Type=cslShort;
    * </code>
    */
   public void setClerkFlag(Short theClerkFlag)
   {
       clerkFlag = theClerkFlag;
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
    * AllowedTrans is a text String of1 bytes.
    * </code>
    */
   public String[] getAllowedTrans()
   {
       String[] retval = new String[allowedTrans.size()];
       allowedTrans.copyInto(retval);
      return retval; 
   }

   /**
    * <code>
    * AllowedTrans is a text String of1 bytes.
    * </code>
    */
   public void setAllowedTrans(String[] values)
   {
       allowedTrans = new java.util.Vector(values.length);
      for (int i=0; i < values.length; i++) {
         addAllowedTrans(values[i]);
      }
   }

   /**
    * <code>
    * AllowedTrans is a text String of1 bytes.
    * </code>
    */
   public String getAllowedTrans(int i)
   {
      return (String)allowedTrans.elementAt(i);
   }

   /**
    * <code>
    * AllowedTrans is a text String of1 bytes.
    * </code>
    */
   public void setAllowedTrans(int i, String value)
   {
       allowedTrans.setElementAt(value, i);
   }

   /**
    * <code>
    * AllowedTrans is a text String of1 bytes.
    * </code>
    */
   public void addAllowedTrans(String value)
   {
       allowedTrans.addElement(value);
   }

   /**
    * <code>
    * AllowedTrans is a text String of1 bytes.
    * </code>
    */
   public void removeAllowedTrans(String value)
   {
       allowedTrans.removeElement(value);
   }

   /**
    * <code>
    * TermCutoverTc is a numeric String of
							1 digits with 0 decimal places.
    * </code>
    */
   public String getTermCutoverTc()
   {
      return termCutoverTc;
   }

   /**
    * <code>
    * TermCutoverTc is a numeric String of
							1 digits with 0 decimal places.
    * </code>
    */
   public void setTermCutoverTc(String theTermCutoverTc)
   {
       termCutoverTc = theTermCutoverTc;
   }

   /**
    * <code>
    * BalSupport is a numeric String of
							1 digits with 0 decimal places.
    * </code>
    */
   public String getBalSupport()
   {
      return balSupport;
   }

   /**
    * <code>
    * BalSupport is a numeric String of
							1 digits with 0 decimal places.
    * </code>
    */
   public void setBalSupport(String theBalSupport)
   {
       balSupport = theBalSupport;
   }

   /**
    * <code>
    * Name=NUM-SHIFTS;CSL Type=cslShort;
    * </code>
    */
   public Short getNumShifts()
   {
      return numShifts;
   }

   /**
    * <code>
    * Name=NUM-SHIFTS;CSL Type=cslShort;
    * </code>
    */
   public void setNumShifts(Short theNumShifts)
   {
       numShifts = theNumShifts;
   }

   /**
    * <code>
    * Name=TERM;
    * </code>
    */
   public Term getTerm()
   {
      return term;
   }

   /**
    * <code>
    * Name=TERM;
    * </code>
    */
   public void setTerm(Term theTerm)
   {
       term = theTerm;
   }

   /**
    * <code>
    * Name=BATCH-CUTOVER-CNT;CSL Type=cslShort;
    * </code>
    */
   public Short getBatchCutoverCnt()
   {
      return batchCutoverCnt;
   }

   /**
    * <code>
    * Name=BATCH-CUTOVER-CNT;CSL Type=cslShort;
    * </code>
    */
   public void setBatchCutoverCnt(Short theBatchCutoverCnt)
   {
       batchCutoverCnt = theBatchCutoverCnt;
   }

   /**
    * <code>
    * PostalCde is a text String of10 bytes.
    * </code>
    */
   public String getPostalCde()
   {
      return postalCde;
   }

   /**
    * <code>
    * PostalCde is a text String of10 bytes.
    * </code>
    */
   public void setPostalCde(String thePostalCde)
   {
       postalCde = thePostalCde;
   }

   /**
    * <code>
    * Name=TERM-PHONE;
    * </code>
    */
   public TermPhone getTermPhone()
   {
      return termPhone;
   }

   /**
    * <code>
    * Name=TERM-PHONE;
    * </code>
    */
   public void setTermPhone(TermPhone theTermPhone)
   {
       termPhone = theTermPhone;
   }

   /**
    * <code>
    * MKeyChkValue is a text String of3 bytes.
    * </code>
    */
   public String getMKeyChkValue()
   {
      return mKeyChkValue;
   }

   /**
    * <code>
    * MKeyChkValue is a text String of3 bytes.
    * </code>
    */
   public void setMKeyChkValue(String theMKeyChkValue)
   {
       mKeyChkValue = theMKeyChkValue;
   }

   /**
    * <code>
    * MasKeyChkValue is a text String of3 bytes.
    * </code>
    */
   public String getMasKeyChkValue()
   {
      return masKeyChkValue;
   }

   /**
    * <code>
    * MasKeyChkValue is a text String of3 bytes.
    * </code>
    */
   public void setMasKeyChkValue(String theMasKeyChkValue)
   {
       masKeyChkValue = theMasKeyChkValue;
   }

   /**
    * <code>
    * RteGrp is a text String of11 bytes.
    * </code>
    */
   public String getRteGrp()
   {
      return rteGrp;
   }

   /**
    * <code>
    * RteGrp is a text String of11 bytes.
    * </code>
    */
   public void setRteGrp(String theRteGrp)
   {
       rteGrp = theRteGrp;
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
    * CityExt is a text String of5 bytes.
    * </code>
    */
   public String getCityExt()
   {
      return cityExt;
   }

   /**
    * <code>
    * CityExt is a text String of5 bytes.
    * </code>
    */
   public void setCityExt(String theCityExt)
   {
       cityExt = theCityExt;
   }

   /**
    * <code>
    * CompleteTrack2Data is a text String of1 bytes.
    * </code>
    */
   public String getCompleteTrack2Data()
   {
      return completeTrack2Data;
   }

   /**
    * <code>
    * CompleteTrack2Data is a text String of1 bytes.
    * </code>
    */
   public void setCompleteTrack2Data(String theCompleteTrack2Data)
   {
       completeTrack2Data = theCompleteTrack2Data;
   }

   /**
    * <code>
    * Name=FIL;
    * </code>
    */
   public Fil getFil()
   {
      return fil;
   }

   /**
    * <code>
    * Name=FIL;
    * </code>
    */
   public void setFil(Fil theFil)
   {
       fil = theFil;
   }

   /**
    * <code>
    * LogTotals is a text String of1 bytes.
    * </code>
    */
   public String getLogTotals()
   {
      return logTotals;
   }

   /**
    * <code>
    * LogTotals is a text String of1 bytes.
    * </code>
    */
   public void setLogTotals(String theLogTotals)
   {
       logTotals = theLogTotals;
   }

   /**
    * <code>
    * Name=STATIC-RPQ-FIELDS;
    * </code>
    */
   public StaticRpqFields getStaticRpqFields()
   {
      return staticRpqFields;
   }

   /**
    * <code>
    * Name=STATIC-RPQ-FIELDS;
    * </code>
    */
   public void setStaticRpqFields(StaticRpqFields theStaticRpqFields)
   {
       staticRpqFields = theStaticRpqFields;
   }

   /**
    * <code>
    * Name=AFS;
    * </code>
    */
   public Afs getAfs()
   {
      return afs;
   }

   /**
    * <code>
    * Name=AFS;
    * </code>
    */
   public void setAfs(Afs theAfs)
   {
       afs = theAfs;
   }

   /**
    * <code>
    * KeyLgth is a text String of1 bytes.
    * </code>
    */
   public String getKeyLgth()
   {
      return keyLgth;
   }

   /**
    * <code>
    * KeyLgth is a text String of1 bytes.
    * </code>
    */
   public void setKeyLgth(String theKeyLgth)
   {
       keyLgth = theKeyLgth;
   }

   /**
    * <code>
    * Name=TRAN-SEQ-NUM;CSL Type=cslLong;
    * </code>
    */
   public Long getTranSeqNum()
   {
      return tranSeqNum;
   }

   /**
    * <code>
    * Name=TRAN-SEQ-NUM;CSL Type=cslLong;
    * </code>
    */
   public void setTranSeqNum(Long theTranSeqNum)
   {
       tranSeqNum = theTranSeqNum;
   }

   /**
    * <code>
    * Name=POST-DAT;
    * </code>
    */
   public PostDat getPostDat()
   {
      return postDat;
   }

   /**
    * <code>
    * Name=POST-DAT;
    * </code>
    */
   public void setPostDat(PostDat thePostDat)
   {
       postDat = thePostDat;
   }

   /**
    * <code>
    * Name=LAST-SETL-DAT;CSL Type=cslInteger;
    * </code>
    */
   public Integer getLastSetlDat()
   {
      return lastSetlDat;
   }

   /**
    * <code>
    * Name=LAST-SETL-DAT;CSL Type=cslInteger;
    * </code>
    */
   public void setLastSetlDat(Integer theLastSetlDat)
   {
       lastSetlDat = theLastSetlDat;
   }

   /**
    * <code>
    * Name=LAST-SETL-TIM;CSL Type=cslShort;
    * </code>
    */
   public Short getLastSetlTim()
   {
      return lastSetlTim;
   }

   /**
    * <code>
    * Name=LAST-SETL-TIM;CSL Type=cslShort;
    * </code>
    */
   public void setLastSetlTim(Short theLastSetlTim)
   {
       lastSetlTim = theLastSetlTim;
   }

   /**
    * <code>
    * Name=CLERK-TOTS;
    * </code>
    */
   public ClerkTots getClerkTots()
   {
      return clerkTots;
   }

   /**
    * <code>
    * Name=CLERK-TOTS;
    * </code>
    */
   public void setClerkTots(ClerkTots theClerkTots)
   {
       clerkTots = theClerkTots;
   }

   /**
    * <code>
    * Name=CREDIT-DAILY-TOTAL;CSL Type=cslLong;
    * </code>
    */
   public Long getCreditDailyTotal()
   {
      return creditDailyTotal;
   }

   /**
    * <code>
    * Name=CREDIT-DAILY-TOTAL;CSL Type=cslLong;
    * </code>
    */
   public void setCreditDailyTotal(Long theCreditDailyTotal)
   {
       creditDailyTotal = theCreditDailyTotal;
   }

   /**
    * <code>
    * Name=BATCH;
    * </code>
    */
   public Batch getBatch()
   {
      return batch;
   }

   /**
    * <code>
    * Name=BATCH;
    * </code>
    */
   public void setBatch(Batch theBatch)
   {
       batch = theBatch;
   }

   /**
    * <code>
    * Name=BATCH-DC;
    * </code>
    */
   public BatchDc getBatchDc()
   {
      return batchDc;
   }

   /**
    * <code>
    * Name=BATCH-DC;
    * </code>
    */
   public void setBatchDc(BatchDc theBatchDc)
   {
       batchDc = theBatchDc;
   }

   /**
    * <code>
    * Name=SHIFT;
    * </code>
    */
   public Shift getShift()
   {
      return shift;
   }

   /**
    * <code>
    * Name=SHIFT;
    * </code>
    */
   public void setShift(Shift theShift)
   {
       shift = theShift;
   }

   /**
    * <code>
    * Name=SHIFT-DC;
    * </code>
    */
   public ShiftDc getShiftDc()
   {
      return shiftDc;
   }

   /**
    * <code>
    * Name=SHIFT-DC;
    * </code>
    */
   public void setShiftDc(ShiftDc theShiftDc)
   {
       shiftDc = theShiftDc;
   }

   /**
    * <code>
    * Name=DAILY;
    * </code>
    */
   public Daily getDaily()
   {
      return daily;
   }

   /**
    * <code>
    * Name=DAILY;
    * </code>
    */
   public void setDaily(Daily theDaily)
   {
       daily = theDaily;
   }

   /**
    * <code>
    * Name=DAILY-DC;
    * </code>
    */
   public DailyDc getDailyDc()
   {
      return dailyDc;
   }

   /**
    * <code>
    * Name=DAILY-DC;
    * </code>
    */
   public void setDailyDc(DailyDc theDailyDc)
   {
       dailyDc = theDailyDc;
   }

   /**
    * <code>
    * Name=CUR-NET;
    * </code>
    */
   public CurNet getCurNet()
   {
      return curNet;
   }

   /**
    * <code>
    * Name=CUR-NET;
    * </code>
    */
   public void setCurNet(CurNet theCurNet)
   {
       curNet = theCurNet;
   }

   /**
    * <code>
    * Name=CUR-NET-DC;
    * </code>
    */
   public CurNetDc getCurNetDc()
   {
      return curNetDc;
   }

   /**
    * <code>
    * Name=CUR-NET-DC;
    * </code>
    */
   public void setCurNetDc(CurNetDc theCurNetDc)
   {
       curNetDc = theCurNetDc;
   }

   /**
    * <code>
    * Name=PRE-NET;
    * </code>
    */
   public PreNet getPreNet()
   {
      return preNet;
   }

   /**
    * <code>
    * Name=PRE-NET;
    * </code>
    */
   public void setPreNet(PreNet thePreNet)
   {
       preNet = thePreNet;
   }

   /**
    * <code>
    * Name=PRE-NET-DC;
    * </code>
    */
   public PreNetDc getPreNetDc()
   {
      return preNetDc;
   }

   /**
    * <code>
    * Name=PRE-NET-DC;
    * </code>
    */
   public void setPreNetDc(PreNetDc thePreNetDc)
   {
       preNetDc = thePreNetDc;
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
    * Name=NUM-BATCHES;CSL Type=cslShort;
    * </code>
    */
   public Short getNumBatches()
   {
      return numBatches;
   }

   /**
    * <code>
    * Name=NUM-BATCHES;CSL Type=cslShort;
    * </code>
    */
   public void setNumBatches(Short theNumBatches)
   {
       numBatches = theNumBatches;
   }

   /**
    * <code>
    * Name=SHIFT-NUM;CSL Type=cslShort;
    * </code>
    */
   public Short getShiftNum()
   {
      return shiftNum;
   }

   /**
    * <code>
    * Name=SHIFT-NUM;CSL Type=cslShort;
    * </code>
    */
   public void setShiftNum(Short theShiftNum)
   {
       shiftNum = theShiftNum;
   }

   /**
    * <code>
    * Name=BATCH-NUM;CSL Type=cslShort;
    * </code>
    */
   public Short getBatchNum()
   {
      return batchNum;
   }

   /**
    * <code>
    * Name=BATCH-NUM;CSL Type=cslShort;
    * </code>
    */
   public void setBatchNum(Short theBatchNum)
   {
       batchNum = theBatchNum;
   }

   /**
    * <code>
    * Name=SEQ-NUM;CSL Type=cslShort;
    * </code>
    */
   public Short getSeqNum()
   {
      return seqNum;
   }

   /**
    * <code>
    * Name=SEQ-NUM;CSL Type=cslShort;
    * </code>
    */
   public void setSeqNum(Short theSeqNum)
   {
       seqNum = theSeqNum;
   }

   /**
    * <code>
    * TknBuf is a text String of450 bytes.
    * </code>
    */
   public String getTknBuf()
   {
      return tknBuf;
   }

   /**
    * <code>
    * TknBuf is a text String of450 bytes.
    * </code>
    */
   public void setTknBuf(String theTknBuf)
   {
       tknBuf = theTknBuf;
   }

   /**
    * <code>
    * DelPtdfFlg is a text String of1 bytes.
    * </code>
    */
   public String getDelPtdfFlg()
   {
      return delPtdfFlg;
   }

   /**
    * <code>
    * DelPtdfFlg is a text String of1 bytes.
    * </code>
    */
   public void setDelPtdfFlg(String theDelPtdfFlg)
   {
       delPtdfFlg = theDelPtdfFlg;
   }

   /**
    * <code>
    * BalFlg is a text String of1 bytes.
    * </code>
    */
   public String getBalFlg()
   {
      return balFlg;
   }

   /**
    * <code>
    * BalFlg is a text String of1 bytes.
    * </code>
    */
   public void setBalFlg(String theBalFlg)
   {
       balFlg = theBalFlg;
   }

   /**
    * <code>
    * Name=AKB-WORK-KEYS;
    * </code>
    */
   public AkbWorkKeys getAkbWorkKeys()
   {
      return akbWorkKeys;
   }

   /**
    * <code>
    * Name=AKB-WORK-KEYS;
    * </code>
    */
   public void setAkbWorkKeys(AkbWorkKeys theAkbWorkKeys)
   {
       akbWorkKeys = theAkbWorkKeys;
   }

   /**
    * <code>
    * WaitConfirmFlg is a text String of1 bytes.
    * </code>
    */
   public String getWaitConfirmFlg()
   {
      return waitConfirmFlg;
   }

   /**
    * <code>
    * WaitConfirmFlg is a text String of1 bytes.
    * </code>
    */
   public void setWaitConfirmFlg(String theWaitConfirmFlg)
   {
       waitConfirmFlg = theWaitConfirmFlg;
   }

   /**
    * <code>
    * Name=WORKING-KEYS;
    * </code>
    */
   public WorkingKeys getWorkingKeys()
   {
      return workingKeys;
   }

   /**
    * <code>
    * Name=WORKING-KEYS;
    * </code>
    */
   public void setWorkingKeys(WorkingKeys theWorkingKeys)
   {
       workingKeys = theWorkingKeys;
   }

   /**
    * <code>
    * MacPendingFlg is a text String of1 bytes.
    * </code>
    */
   public String getMacPendingFlg()
   {
      return macPendingFlg;
   }

   /**
    * <code>
    * MacPendingFlg is a text String of1 bytes.
    * </code>
    */
   public void setMacPendingFlg(String theMacPendingFlg)
   {
       macPendingFlg = theMacPendingFlg;
   }

   /**
    * <code>
    * PinPendingFlg is a text String of1 bytes.
    * </code>
    */
   public String getPinPendingFlg()
   {
      return pinPendingFlg;
   }

   /**
    * <code>
    * PinPendingFlg is a text String of1 bytes.
    * </code>
    */
   public void setPinPendingFlg(String thePinPendingFlg)
   {
       pinPendingFlg = thePinPendingFlg;
   }

   /**
    * <code>
    * FldPendingFlg is a text String of1 bytes.
    * </code>
    */
   public String getFldPendingFlg()
   {
      return fldPendingFlg;
   }

   /**
    * <code>
    * FldPendingFlg is a text String of1 bytes.
    * </code>
    */
   public void setFldPendingFlg(String theFldPendingFlg)
   {
       fldPendingFlg = theFldPendingFlg;
   }

   /**
    * <code>
    * Name=DYNAMIC-RPQ-FIELDS;
    * </code>
    */
   public DynamicRpqFields getDynamicRpqFields()
   {
      return dynamicRpqFields;
   }

   /**
    * <code>
    * Name=DYNAMIC-RPQ-FIELDS;
    * </code>
    */
   public void setDynamicRpqFields(DynamicRpqFields theDynamicRpqFields)
   {
       dynamicRpqFields = theDynamicRpqFields;
   }

   /**
    * <code>
    * Name=SRV-TOTALS;
    * </code>
    */
   public SrvTotals[] getSrvTotals()
   {
       SrvTotals[] retval = new SrvTotals[srvTotals.size()];
       srvTotals.copyInto(retval);
      return retval; 
   }

   /**
    * <code>
    * Name=SRV-TOTALS;
    * </code>
    */
   public void setSrvTotals(SrvTotals[] values)
   {
       srvTotals = new java.util.Vector(values.length);
      for (int i=0; i < values.length; i++) {
         addSrvTotals(values[i]);
      }
   }

   /**
    * <code>
    * Name=SRV-TOTALS;
    * </code>
    */
   public SrvTotals getSrvTotals(int i)
   {
      return (SrvTotals)srvTotals.elementAt(i);
   }

   /**
    * <code>
    * Name=SRV-TOTALS;
    * </code>
    */
   public void setSrvTotals(int i, SrvTotals value)
   {
       srvTotals.setElementAt(value, i);
   }

   /**
    * <code>
    * Name=SRV-TOTALS;
    * </code>
    */
   public void addSrvTotals(SrvTotals value)
   {
       srvTotals.addElement(value);
   }

   /**
    * <code>
    * Name=SRV-TOTALS;
    * </code>
    */
   public void removeSrvTotals(SrvTotals value)
   {
       srvTotals.removeElement(value);
   }

   /**
    * <code>
    * WorkPin2 is a text String of32 bytes.
    * </code>
    */
   public String getWorkPin2()
   {
      return workPin2;
   }

   /**
    * <code>
    * WorkPin2 is a text String of32 bytes.
    * </code>
    */
   public void setWorkPin2(String theWorkPin2)
   {
       workPin2 = theWorkPin2;
   }

   /**
    * <code>
    * WorkMac2 is a text String of32 bytes.
    * </code>
    */
   public String getWorkMac2()
   {
      return workMac2;
   }

   /**
    * <code>
    * WorkMac2 is a text String of32 bytes.
    * </code>
    */
   public void setWorkMac2(String theWorkMac2)
   {
       workMac2 = theWorkMac2;
   }

   /**
    * <code>
    * WorkPinMac is a text String of16 bytes.
    * </code>
    */
   public String getWorkPinMac()
   {
      return workPinMac;
   }

   /**
    * <code>
    * WorkPinMac is a text String of16 bytes.
    * </code>
    */
   public void setWorkPinMac(String theWorkPinMac)
   {
       workPinMac = theWorkPinMac;
   }

   /**
    * <code>
    * WorkMacMac is a text String of16 bytes.
    * </code>
    */
   public String getWorkMacMac()
   {
      return workMacMac;
   }

   /**
    * <code>
    * WorkMacMac is a text String of16 bytes.
    * </code>
    */
   public void setWorkMacMac(String theWorkMacMac)
   {
       workMacMac = theWorkMacMac;
   }

   /**
    * <code>
    * OldPinMac is a text String of16 bytes.
    * </code>
    */
   public String getOldPinMac()
   {
      return oldPinMac;
   }

   /**
    * <code>
    * OldPinMac is a text String of16 bytes.
    * </code>
    */
   public void setOldPinMac(String theOldPinMac)
   {
       oldPinMac = theOldPinMac;
   }

   /**
    * <code>
    * OldMacMac is a text String of16 bytes.
    * </code>
    */
   public String getOldMacMac()
   {
      return oldMacMac;
   }

   /**
    * <code>
    * OldMacMac is a text String of16 bytes.
    * </code>
    */
   public void setOldMacMac(String theOldMacMac)
   {
       oldMacMac = theOldMacMac;
   }

   /**
    * <code>
    * OldFldMac is a text String of16 bytes.
    * </code>
    */
   public String getOldFldMac()
   {
      return oldFldMac;
   }

   /**
    * <code>
    * OldFldMac is a text String of16 bytes.
    * </code>
    */
   public void setOldFldMac(String theOldFldMac)
   {
       oldFldMac = theOldFldMac;
   }

   /**
    * <code>
    * TermPinKey is a text String of16 bytes.
    * </code>
    */
   public String getTermPinKey()
   {
      return termPinKey;
   }

   /**
    * <code>
    * TermPinKey is a text String of16 bytes.
    * </code>
    */
   public void setTermPinKey(String theTermPinKey)
   {
       termPinKey = theTermPinKey;
   }

   /**
    * <code>
    * TermOldPinKey is a text String of16 bytes.
    * </code>
    */
   public String getTermOldPinKey()
   {
      return termOldPinKey;
   }

   /**
    * <code>
    * TermOldPinKey is a text String of16 bytes.
    * </code>
    */
   public void setTermOldPinKey(String theTermOldPinKey)
   {
       termOldPinKey = theTermOldPinKey;
   }

   /**
    * <code>
    * TermMacKey is a text String of16 bytes.
    * </code>
    */
   public String getTermMacKey()
   {
      return termMacKey;
   }

   /**
    * <code>
    * TermMacKey is a text String of16 bytes.
    * </code>
    */
   public void setTermMacKey(String theTermMacKey)
   {
       termMacKey = theTermMacKey;
   }

   /**
    * <code>
    * TermOldMacKey is a text String of16 bytes.
    * </code>
    */
   public String getTermOldMacKey()
   {
      return termOldMacKey;
   }

   /**
    * <code>
    * TermOldMacKey is a text String of16 bytes.
    * </code>
    */
   public void setTermOldMacKey(String theTermOldMacKey)
   {
       termOldMacKey = theTermOldMacKey;
   }

   /**
    * <code>
    * TermFldKey is a text String of32 bytes.
    * </code>
    */
   public String getTermFldKey()
   {
      return termFldKey;
   }

   /**
    * <code>
    * TermFldKey is a text String of32 bytes.
    * </code>
    */
   public void setTermFldKey(String theTermFldKey)
   {
       termFldKey = theTermFldKey;
   }

   /**
    * <code>
    * TermOldFldKey is a text String of32 bytes.
    * </code>
    */
   public String getTermOldFldKey()
   {
      return termOldFldKey;
   }

   /**
    * <code>
    * TermOldFldKey is a text String of32 bytes.
    * </code>
    */
   public void setTermOldFldKey(String theTermOldFldKey)
   {
       termOldFldKey = theTermOldFldKey;
   }

   /**
    * <code>
    * LastForceKeyChng is a text String of8 bytes.
    * </code>
    */
   public String getLastForceKeyChng()
   {
      return lastForceKeyChng;
   }

   /**
    * <code>
    * LastForceKeyChng is a text String of8 bytes.
    * </code>
    */
   public void setLastForceKeyChng(String theLastForceKeyChng)
   {
       lastForceKeyChng = theLastForceKeyChng;
   }

   /**
    * <code>
    * TermFldCheck is a text String of6 bytes.
    * </code>
    */
   public String getTermFldCheck()
   {
      return termFldCheck;
   }

   /**
    * <code>
    * TermFldCheck is a text String of6 bytes.
    * </code>
    */
   public void setTermFldCheck(String theTermFldCheck)
   {
       termFldCheck = theTermFldCheck;
   }

   /**
    * <code>
    * TermOldFldCheck is a text String of6 bytes.
    * </code>
    */
   public String getTermOldFldCheck()
   {
      return termOldFldCheck;
   }

   /**
    * <code>
    * TermOldFldCheck is a text String of6 bytes.
    * </code>
    */
   public void setTermOldFldCheck(String theTermOldFldCheck)
   {
       termOldFldCheck = theTermOldFldCheck;
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
      out.writeString(getTermId(),16, CSLTypes.PICX);
      out.writeShort(getTrxnInFlight().shortValue());
      help1 =
        com.comforte.csl.model.Util.convertNumStringFromDisplayToTransferFormat(getRelNum(), 2, 0, 0);
      out.writeString(help1, help1.length());
      help1 =
        com.comforte.csl.model.Util.convertNumStringFromDisplayToTransferFormat(getRttn(), 11, 0, 0);
      out.writeString(help1, help1.length());
      out.writeString(getDhProNam(),16, CSLTypes.PICX);
      help1 =
        com.comforte.csl.model.Util.convertNumStringFromDisplayToTransferFormat(getUserFld1(), 2, 0, 0);
      out.writeString(help1, help1.length());
      out.writeString(getLoadFilNam(),25, CSLTypes.PICX);
      out.writeShort(getLogRtCde().shortValue());
      out.writeString(getTermNamLoc(),25, CSLTypes.PICX);
      getTermCitySt().write(out);
      out.writeString(getCntryCde(),2, CSLTypes.PICX);
      getTermOwner().write(out);
      out.writeString(getTermOwnerNam(),25, CSLTypes.PICX);
      out.writeString(getTermGrp(),4, CSLTypes.PICX);
      help1 =
        com.comforte.csl.model.Util.convertNumStringFromDisplayToTransferFormat(getTermSicCde(), 4, 0, 0);
      out.writeString(help1, help1.length());
      out.writeString(getTermTyp(),2, CSLTypes.PICX);
      getSrvRep().write(out);
      out.writeString(getPinPadChar(),1, CSLTypes.PICX);
      getEncrPin().write(out);
      getMacData().write(out);
      getAkbMac().write(out);
      out.writeString(getMlDpcNum(),2, CSLTypes.PICX);
      help1 =
        com.comforte.csl.model.Util.convertNumStringFromDisplayToTransferFormat(getCrncyCde(), 3, 0, 0);
      out.writeString(help1, help1.length());
      out.writeString(getMlReconlEnt(),1, CSLTypes.PICX);
      out.writeShort(getTimOfst().shortValue());
      out.writeShort(getPreAuthHld().shortValue());
      out.writeInt(getPreAuthDftAmt().intValue());
      out.writeString(getDfltChkId(),2, CSLTypes.PICX);
      help1 =
        com.comforte.csl.model.Util.convertNumStringFromDisplayToTransferFormat(getDfltTc(), 2, 0, 0);
      out.writeString(help1, help1.length());
      out.writeShort(getApprvCdeLgth().shortValue());
      out.writeString(getDeactivateFlg(),1, CSLTypes.PICX);
      out.writeString(getReconcileMode(),1, CSLTypes.PICX);
      out.writeShort(getCrdsRet().shortValue());
      out.writeShort(getNumSrv().shortValue());
      {
         int maxIndex = 20;
         int index = 0;
         java.util.Enumeration objects = srv.elements(); 
         while (objects.hasMoreElements()) {
            if (index >= maxIndex) break; // write no more than max
            Srv toWrite = (Srv) objects.nextElement();
            toWrite.write(out);
            index++;
         }
      }
      out.writeString(getAkbPinMasKey2(),16, CSLTypes.PICX);
      out.writeString(getAkbPinMasKey3(),16, CSLTypes.PICX);
      out.writeString(getAkbMacMasKey2(),16, CSLTypes.PICX);
      out.writeString(getAkbMacMasKey3(),16, CSLTypes.PICX);
      out.writeString(getAkbKden000Key1(),16, CSLTypes.PICX);
      out.writeString(getAkbKden000Key2(),16, CSLTypes.PICX);
      out.writeString(getAkbKden000Key3(),16, CSLTypes.PICX);
      out.writeString(getAkbKden000Mac(),16, CSLTypes.PICX);
      out.writeString(getAkbPunn0i0Key1(),16, CSLTypes.PICX);
      out.writeString(getAkbPunn0i0Key2(),16, CSLTypes.PICX);
      out.writeString(getAkbPunn0i0Key3(),16, CSLTypes.PICX);
      out.writeString(getAkbPunn0i0Mac(),16, CSLTypes.PICX);
      out.writeString(getAkbLeftover(),8, CSLTypes.PICX);
      out.writeShort(getAdjLmtCnt().shortValue());
      out.writeLong(getAdjLmtAmt().longValue());
      out.writeShort(getReturnLmtCnt().shortValue());
      out.writeLong(getReturnLmtAmt().longValue());
      out.writeString(getUserFld9(),1, CSLTypes.PICX);
      out.writeString(getUserFld6(),1, CSLTypes.PICX);
      help1 =
        com.comforte.csl.model.Util.convertNumStringFromDisplayToTransferFormat(getCustBalDspy(), 1, 0, 0);
      out.writeString(help1, help1.length());
      out.writeString(getTermProto(),1, CSLTypes.PICX);
      out.writeShort(getLanguageInd().shortValue());
      out.writeString(getClerkId(),6, CSLTypes.PICX);
      out.writeInt(getBegTranCntlNum().intValue());
      out.writeInt(getEndTranCntlNum().intValue());
      out.writeString(getBillingInfo(),10, CSLTypes.PICX);
      out.writeShort(getClerkFlag().shortValue());
      getLastFm2().write(out);
      {
         int maxIndex = 30;
         int index = 0;
         java.util.Enumeration objects = allowedTrans.elements(); 
         while (objects.hasMoreElements()) {
            if (index >= maxIndex) break; // write no more than max
            String toWrite = (String) objects.nextElement();
         out.writeString(toWrite, 1, CSLTypes.PICX);
            index++;
         }
      }
      help1 =
        com.comforte.csl.model.Util.convertNumStringFromDisplayToTransferFormat(getTermCutoverTc(), 1, 0, 0);
      out.writeString(help1, help1.length());
      help1 =
        com.comforte.csl.model.Util.convertNumStringFromDisplayToTransferFormat(getBalSupport(), 1, 0, 0);
      out.writeString(help1, help1.length());
      out.writeShort(getNumShifts().shortValue());
      getTerm().write(out);
      out.writeShort(getBatchCutoverCnt().shortValue());
      out.writeString(getPostalCde(),10, CSLTypes.PICX);
      getTermPhone().write(out);
      out.writeString(getMKeyChkValue(),3, CSLTypes.PICX);
      out.writeString(getMasKeyChkValue(),3, CSLTypes.PICX);
      out.writeString(getRteGrp(),11, CSLTypes.PICX);
      help1 =
        com.comforte.csl.model.Util.convertNumStringFromDisplayToTransferFormat(getMailPoSicCde(), 4, 0, 0);
      out.writeString(help1, help1.length());
      out.writeString(getCityExt(),5, CSLTypes.PICX);
      out.writeString(getCompleteTrack2Data(),1, CSLTypes.PICX);
      getFil().write(out);
      out.writeString(getLogTotals(),1, CSLTypes.PICX);
      getStaticRpqFields().write(out);
      getAfs().write(out);
      out.writeString(getKeyLgth(),1, CSLTypes.PICX);
      out.writeLong(getTranSeqNum().longValue());
      getPostDat().write(out);
      out.writeInt(getLastSetlDat().intValue());
      out.writeShort(getLastSetlTim().shortValue());
      getClerkTots().write(out);
      out.writeLong(getCreditDailyTotal().longValue());
      getBatch().write(out);
      getBatchDc().write(out);
      getShift().write(out);
      getShiftDc().write(out);
      getDaily().write(out);
      getDailyDc().write(out);
      getCurNet().write(out);
      getCurNetDc().write(out);
      getPreNet().write(out);
      getPreNetDc().write(out);
      getLastTran().write(out);
      out.writeShort(getNumBatches().shortValue());
      out.writeShort(getShiftNum().shortValue());
      out.writeShort(getBatchNum().shortValue());
      out.writeShort(getSeqNum().shortValue());
      out.writeString(getTknBuf(),450, CSLTypes.PICX);
      out.writeString(getDelPtdfFlg(),1, CSLTypes.PICX);
      out.writeString(getBalFlg(),1, CSLTypes.PICX);
      getAkbWorkKeys().write(out);
      out.writeString(getWaitConfirmFlg(),1, CSLTypes.PICX);
      getWorkingKeys().write(out);
      out.writeString(getMacPendingFlg(),1, CSLTypes.PICX);
      out.writeString(getPinPendingFlg(),1, CSLTypes.PICX);
      out.writeString(getFldPendingFlg(),1, CSLTypes.PICX);
      getDynamicRpqFields().write(out);
      {
         int maxIndex = 20;
         int index = 0;
         java.util.Enumeration objects = srvTotals.elements(); 
         while (objects.hasMoreElements()) {
            if (index >= maxIndex) break; // write no more than max
            SrvTotals toWrite = (SrvTotals) objects.nextElement();
            toWrite.write(out);
            index++;
         }
      }
      out.writeString(getWorkPin2(),32, CSLTypes.PICX);
      out.writeString(getWorkMac2(),32, CSLTypes.PICX);
      out.writeString(getWorkPinMac(),16, CSLTypes.PICX);
      out.writeString(getWorkMacMac(),16, CSLTypes.PICX);
      out.writeString(getOldPinMac(),16, CSLTypes.PICX);
      out.writeString(getOldMacMac(),16, CSLTypes.PICX);
      out.writeString(getOldFldMac(),16, CSLTypes.PICX);
      out.writeString(getTermPinKey(),16, CSLTypes.PICX);
      out.writeString(getTermOldPinKey(),16, CSLTypes.PICX);
      out.writeString(getTermMacKey(),16, CSLTypes.PICX);
      out.writeString(getTermOldMacKey(),16, CSLTypes.PICX);
      out.writeString(getTermFldKey(),32, CSLTypes.PICX);
      out.writeString(getTermOldFldKey(),32, CSLTypes.PICX);
      out.writeString(getLastForceKeyChng(),8, CSLTypes.PICX);
      out.writeString(getTermFldCheck(),6, CSLTypes.PICX);
      out.writeString(getTermOldFldCheck(),6, CSLTypes.PICX);
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
      setTermId(in.readString(16));
      setTrxnInFlight(new Short(in.readShort()));
      help1 = in.readString(2);
      help2 =
         com.comforte.csl.model.Util.convertNumStringFromTransferToDisplayFormat(help1, 2, 0, 0);
      setRelNum(help2);
      help1 = in.readString(11);
      help2 =
         com.comforte.csl.model.Util.convertNumStringFromTransferToDisplayFormat(help1, 11, 0, 0);
      setRttn(help2);
      setDhProNam(in.readString(16));
      help1 = in.readString(2);
      help2 =
         com.comforte.csl.model.Util.convertNumStringFromTransferToDisplayFormat(help1, 2, 0, 0);
      setUserFld1(help2);
      setLoadFilNam(in.readString(25));
      setLogRtCde(new Short(in.readShort()));
      setTermNamLoc(in.readString(25));
      getTermCitySt().read(in);
      setCntryCde(in.readString(2));
      getTermOwner().read(in);
      setTermOwnerNam(in.readString(25));
      setTermGrp(in.readString(4));
      help1 = in.readString(4);
      help2 =
         com.comforte.csl.model.Util.convertNumStringFromTransferToDisplayFormat(help1, 4, 0, 0);
      setTermSicCde(help2);
      setTermTyp(in.readString(2));
      getSrvRep().read(in);
      setPinPadChar(in.readString(1));
      getEncrPin().read(in);
      getMacData().read(in);
      getAkbMac().read(in);
      setMlDpcNum(in.readString(2));
      help1 = in.readString(3);
      help2 =
         com.comforte.csl.model.Util.convertNumStringFromTransferToDisplayFormat(help1, 3, 0, 0);
      setCrncyCde(help2);
      setMlReconlEnt(in.readString(1));
      setTimOfst(new Short(in.readShort()));
      setPreAuthHld(new Short(in.readShort()));
      setPreAuthDftAmt(new Integer(in.readInt()));
      setDfltChkId(in.readString(2));
      help1 = in.readString(2);
      help2 =
         com.comforte.csl.model.Util.convertNumStringFromTransferToDisplayFormat(help1, 2, 0, 0);
      setDfltTc(help2);
      setApprvCdeLgth(new Short(in.readShort()));
      setDeactivateFlg(in.readString(1));
      setReconcileMode(in.readString(1));
      setCrdsRet(new Short(in.readShort()));
      setNumSrv(new Short(in.readShort()));
      {
         int maxIndex = 20;
         int index = 0;
       srv = new java.util.Vector();
         while (index < maxIndex) {
            Srv toRead = new Srv();
            toRead.read(in);
            addSrv(toRead); 
            index++;
         }
      }
      setAkbPinMasKey2(in.readString(16));
      setAkbPinMasKey3(in.readString(16));
      setAkbMacMasKey2(in.readString(16));
      setAkbMacMasKey3(in.readString(16));
      setAkbKden000Key1(in.readString(16));
      setAkbKden000Key2(in.readString(16));
      setAkbKden000Key3(in.readString(16));
      setAkbKden000Mac(in.readString(16));
      setAkbPunn0i0Key1(in.readString(16));
      setAkbPunn0i0Key2(in.readString(16));
      setAkbPunn0i0Key3(in.readString(16));
      setAkbPunn0i0Mac(in.readString(16));
      setAkbLeftover(in.readString(8));
      setAdjLmtCnt(new Short(in.readShort()));
      setAdjLmtAmt(new Long(in.readLong()));
      setReturnLmtCnt(new Short(in.readShort()));
      setReturnLmtAmt(new Long(in.readLong()));
      setUserFld9(in.readString(1));
      setUserFld6(in.readString(1));
      help1 = in.readString(1);
      help2 =
         com.comforte.csl.model.Util.convertNumStringFromTransferToDisplayFormat(help1, 1, 0, 0);
      setCustBalDspy(help2);
      setTermProto(in.readString(1));
      setLanguageInd(new Short(in.readShort()));
      setClerkId(in.readString(6));
      setBegTranCntlNum(new Integer(in.readInt()));
      setEndTranCntlNum(new Integer(in.readInt()));
      setBillingInfo(in.readString(10));
      setClerkFlag(new Short(in.readShort()));
      getLastFm2().read(in);
      {
         int maxIndex = 30;
         int index = 0;
       allowedTrans = new java.util.Vector();
         while (index < maxIndex) {
            String toRead = null;
            toRead = in.readString(1);
            addAllowedTrans(toRead); 
            index++;
         }
      }
      help1 = in.readString(1);
      help2 =
         com.comforte.csl.model.Util.convertNumStringFromTransferToDisplayFormat(help1, 1, 0, 0);
      setTermCutoverTc(help2);
      help1 = in.readString(1);
      help2 =
         com.comforte.csl.model.Util.convertNumStringFromTransferToDisplayFormat(help1, 1, 0, 0);
      setBalSupport(help2);
      setNumShifts(new Short(in.readShort()));
      getTerm().read(in);
      setBatchCutoverCnt(new Short(in.readShort()));
      setPostalCde(in.readString(10));
      getTermPhone().read(in);
      setMKeyChkValue(in.readString(3));
      setMasKeyChkValue(in.readString(3));
      setRteGrp(in.readString(11));
      help1 = in.readString(4);
      help2 =
         com.comforte.csl.model.Util.convertNumStringFromTransferToDisplayFormat(help1, 4, 0, 0);
      setMailPoSicCde(help2);
      setCityExt(in.readString(5));
      setCompleteTrack2Data(in.readString(1));
      getFil().read(in);
      setLogTotals(in.readString(1));
      getStaticRpqFields().read(in);
      getAfs().read(in);
      setKeyLgth(in.readString(1));
      setTranSeqNum(new Long(in.readLong()));
      getPostDat().read(in);
      setLastSetlDat(new Integer(in.readInt()));
      setLastSetlTim(new Short(in.readShort()));
      getClerkTots().read(in);
      setCreditDailyTotal(new Long(in.readLong()));
      getBatch().read(in);
      getBatchDc().read(in);
      getShift().read(in);
      getShiftDc().read(in);
      getDaily().read(in);
      getDailyDc().read(in);
      getCurNet().read(in);
      getCurNetDc().read(in);
      getPreNet().read(in);
      getPreNetDc().read(in);
      getLastTran().read(in);
      setNumBatches(new Short(in.readShort()));
      setShiftNum(new Short(in.readShort()));
      setBatchNum(new Short(in.readShort()));
      setSeqNum(new Short(in.readShort()));
      setTknBuf(in.readString(450));
      setDelPtdfFlg(in.readString(1));
      setBalFlg(in.readString(1));
      getAkbWorkKeys().read(in);
      setWaitConfirmFlg(in.readString(1));
      getWorkingKeys().read(in);
      setMacPendingFlg(in.readString(1));
      setPinPendingFlg(in.readString(1));
      setFldPendingFlg(in.readString(1));
      getDynamicRpqFields().read(in);
      {
         int maxIndex = 20;
         int index = 0;
       srvTotals = new java.util.Vector();
         while (index < maxIndex) {
            SrvTotals toRead = new SrvTotals();
            toRead.read(in);
            addSrvTotals(toRead); 
            index++;
         }
      }
      setWorkPin2(in.readString(32));
      setWorkMac2(in.readString(32));
      setWorkPinMac(in.readString(16));
      setWorkMacMac(in.readString(16));
      setOldPinMac(in.readString(16));
      setOldMacMac(in.readString(16));
      setOldFldMac(in.readString(16));
      setTermPinKey(in.readString(16));
      setTermOldPinKey(in.readString(16));
      setTermMacKey(in.readString(16));
      setTermOldMacKey(in.readString(16));
      setTermFldKey(in.readString(32));
      setTermOldFldKey(in.readString(32));
      setLastForceKeyChng(in.readString(8));
      setTermFldCheck(in.readString(6));
      setTermOldFldCheck(in.readString(6));
      setFiller(in.readString(8));
   } 
}
