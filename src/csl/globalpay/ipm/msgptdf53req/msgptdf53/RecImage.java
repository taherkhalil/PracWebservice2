/*
 * @(#)RecImage.java
 * Created by CSL Studio (definition-schema) on 18/08/2016 05:17:03 PM
 */
package csl.globalpay.ipm.msgptdf53req.msgptdf53;
import java.io.IOException;

import com.comforte.csl.cslapi.CSLInputStream;
import com.comforte.csl.cslapi.CSLOutputStream;
import com.comforte.csl.xmlutils.CSLTypes;

/** <code>RecImage</code>
 *  
 */
public class	RecImage implements com.comforte.csl.cslapi.CSLStreamable
{
   /* Members */
   protected String saveKey;
   protected ErrorInfo errorInfo;
   protected java.util.Vector tranIPos;
   protected String funcKey;
   protected String scrnAccessInfoLn;
   protected String lkCompPkg;
   protected String lkDataPkg;
   protected String tablePkg;
   protected Ptdfdef ptdfdef;
   protected String filler;
   protected String reserved1;
   protected String reserved2;
   protected String reserved3;
   protected String noCvmReqd;
   protected String reserved4;
   protected String reserved5;
   protected String combndDataAuth;
   protected String reserved6;
   protected String wsDebitDailyLmt;
   protected String keyEntry;
   protected String magStripe;
   protected String icContacts;
   protected String plaintextPin;
   protected String enciphrPinOnl;
   protected String signature;
   protected String enciphrPinOffl;
   protected String staticDataAuth;
   protected String dynDataAuth;
   protected String cardCapture;
   protected String readNextKey;

   /** <code>RecImage</code>
    * Constructor
    * @param characterEncoding this is for setting strings with CSLBaseData
    * here we do not use it!
    */
   public RecImage(String characterEncoding)
   {
      setSaveKey(new String());
      setErrorInfo(new ErrorInfo());
       tranIPos = new java.util.Vector();
      {
         int maxIndex = 45;
         for (int i=0; i < maxIndex; i++) {
            addTranIPos(new String());
         }
      }
      setFuncKey(new String());
      setScrnAccessInfoLn(new String());
      setLkCompPkg(new String());
      setLkDataPkg(new String());
      setTablePkg(new String());
      setPtdfdef(new Ptdfdef());
      setFiller(new String());
      setReserved1(new String());
      setReserved2(new String());
      setReserved3(new String());
      setNoCvmReqd(new String());
      setReserved4(new String());
      setReserved5(new String());
      setCombndDataAuth(new String());
      setReserved6(new String());
      setWsDebitDailyLmt(new String());
      setKeyEntry(new String());
      setMagStripe(new String());
      setIcContacts(new String());
      setPlaintextPin(new String());
      setEnciphrPinOnl(new String());
      setSignature(new String());
      setEnciphrPinOffl(new String());
      setStaticDataAuth(new String());
      setDynDataAuth(new String());
      setCardCapture(new String());
      setReadNextKey(new String());
   }

   /** <code>RecImage</code>
    *  Constructor
    */ 
   public RecImage()
   {
      this(null);
   }
   /* getter and setter */

   /**
    * <code>
    * SaveKey is a text String of4 bytes.
    * </code>
    */
   public String getSaveKey()
   {
      return saveKey;
   }

   /**
    * <code>
    * SaveKey is a text String of4 bytes.
    * </code>
    */
   public void setSaveKey(String theSaveKey)
   {
       saveKey = theSaveKey;
   }

   /**
    * <code>
    * Name=ERROR-INFO;
    * </code>
    */
   public ErrorInfo getErrorInfo()
   {
      return errorInfo;
   }

   /**
    * <code>
    * Name=ERROR-INFO;
    * </code>
    */
   public void setErrorInfo(ErrorInfo theErrorInfo)
   {
       errorInfo = theErrorInfo;
   }

   /**
    * <code>
    * TranIPos is a numeric String of
							2 digits with 0 decimal places.
    * </code>
    */
   public String[] getTranIPos()
   {
       String[] retval = new String[tranIPos.size()];
       tranIPos.copyInto(retval);
      return retval; 
   }

   /**
    * <code>
    * TranIPos is a numeric String of
							2 digits with 0 decimal places.
    * </code>
    */
   public void setTranIPos(String[] values)
   {
       tranIPos = new java.util.Vector(values.length);
      for (int i=0; i < values.length; i++) {
         addTranIPos(values[i]);
      }
   }

   /**
    * <code>
    * TranIPos is a numeric String of
							2 digits with 0 decimal places.
    * </code>
    */
   public String getTranIPos(int i)
   {
      return (String)tranIPos.elementAt(i);
   }

   /**
    * <code>
    * TranIPos is a numeric String of
							2 digits with 0 decimal places.
    * </code>
    */
   public void setTranIPos(int i, String value)
   {
       tranIPos.setElementAt(value, i);
   }

   /**
    * <code>
    * TranIPos is a numeric String of
							2 digits with 0 decimal places.
    * </code>
    */
   public void addTranIPos(String value)
   {
       tranIPos.addElement(value);
   }

   /**
    * <code>
    * TranIPos is a numeric String of
							2 digits with 0 decimal places.
    * </code>
    */
   public void removeTranIPos(String value)
   {
       tranIPos.removeElement(value);
   }

   /**
    * <code>
    * FuncKey is a text String of2 bytes.
    * </code>
    */
   public String getFuncKey()
   {
      return funcKey;
   }

   /**
    * <code>
    * FuncKey is a text String of2 bytes.
    * </code>
    */
   public void setFuncKey(String theFuncKey)
   {
       funcKey = theFuncKey;
   }

   /**
    * <code>
    * ScrnAccessInfoLn is a text String of288 bytes.
    * </code>
    */
   public String getScrnAccessInfoLn()
   {
      return scrnAccessInfoLn;
   }

   /**
    * <code>
    * ScrnAccessInfoLn is a text String of288 bytes.
    * </code>
    */
   public void setScrnAccessInfoLn(String theScrnAccessInfoLn)
   {
       scrnAccessInfoLn = theScrnAccessInfoLn;
   }

   /**
    * <code>
    * LkCompPkg is a text String of22 bytes.
    * </code>
    */
   public String getLkCompPkg()
   {
      return lkCompPkg;
   }

   /**
    * <code>
    * LkCompPkg is a text String of22 bytes.
    * </code>
    */
   public void setLkCompPkg(String theLkCompPkg)
   {
       lkCompPkg = theLkCompPkg;
   }

   /**
    * <code>
    * LkDataPkg is a text String of194 bytes.
    * </code>
    */
   public String getLkDataPkg()
   {
      return lkDataPkg;
   }

   /**
    * <code>
    * LkDataPkg is a text String of194 bytes.
    * </code>
    */
   public void setLkDataPkg(String theLkDataPkg)
   {
       lkDataPkg = theLkDataPkg;
   }

   /**
    * <code>
    * TablePkg is a text String of98 bytes.
    * </code>
    */
   public String getTablePkg()
   {
      return tablePkg;
   }

   /**
    * <code>
    * TablePkg is a text String of98 bytes.
    * </code>
    */
   public void setTablePkg(String theTablePkg)
   {
       tablePkg = theTablePkg;
   }

   /**
    * <code>
    * Name=PTDFDEF;
    * </code>
    */
   public Ptdfdef getPtdfdef()
   {
      return ptdfdef;
   }

   /**
    * <code>
    * Name=PTDFDEF;
    * </code>
    */
   public void setPtdfdef(Ptdfdef thePtdfdef)
   {
       ptdfdef = thePtdfdef;
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

   /**
    * <code>
    * Reserved1 is a text String of1 bytes.
    * </code>
    */
   public String getReserved1()
   {
      return reserved1;
   }

   /**
    * <code>
    * Reserved1 is a text String of1 bytes.
    * </code>
    */
   public void setReserved1(String theReserved1)
   {
       reserved1 = theReserved1;
   }

   /**
    * <code>
    * Reserved2 is a text String of1 bytes.
    * </code>
    */
   public String getReserved2()
   {
      return reserved2;
   }

   /**
    * <code>
    * Reserved2 is a text String of1 bytes.
    * </code>
    */
   public void setReserved2(String theReserved2)
   {
       reserved2 = theReserved2;
   }

   /**
    * <code>
    * Reserved3 is a text String of1 bytes.
    * </code>
    */
   public String getReserved3()
   {
      return reserved3;
   }

   /**
    * <code>
    * Reserved3 is a text String of1 bytes.
    * </code>
    */
   public void setReserved3(String theReserved3)
   {
       reserved3 = theReserved3;
   }

   /**
    * <code>
    * NoCvmReqd is a text String of1 bytes.
    * </code>
    */
   public String getNoCvmReqd()
   {
      return noCvmReqd;
   }

   /**
    * <code>
    * NoCvmReqd is a text String of1 bytes.
    * </code>
    */
   public void setNoCvmReqd(String theNoCvmReqd)
   {
       noCvmReqd = theNoCvmReqd;
   }

   /**
    * <code>
    * Reserved4 is a text String of1 bytes.
    * </code>
    */
   public String getReserved4()
   {
      return reserved4;
   }

   /**
    * <code>
    * Reserved4 is a text String of1 bytes.
    * </code>
    */
   public void setReserved4(String theReserved4)
   {
       reserved4 = theReserved4;
   }

   /**
    * <code>
    * Reserved5 is a text String of1 bytes.
    * </code>
    */
   public String getReserved5()
   {
      return reserved5;
   }

   /**
    * <code>
    * Reserved5 is a text String of1 bytes.
    * </code>
    */
   public void setReserved5(String theReserved5)
   {
       reserved5 = theReserved5;
   }

   /**
    * <code>
    * CombndDataAuth is a text String of1 bytes.
    * </code>
    */
   public String getCombndDataAuth()
   {
      return combndDataAuth;
   }

   /**
    * <code>
    * CombndDataAuth is a text String of1 bytes.
    * </code>
    */
   public void setCombndDataAuth(String theCombndDataAuth)
   {
       combndDataAuth = theCombndDataAuth;
   }

   /**
    * <code>
    * Reserved6 is a text String of1 bytes.
    * </code>
    */
   public String getReserved6()
   {
      return reserved6;
   }

   /**
    * <code>
    * Reserved6 is a text String of1 bytes.
    * </code>
    */
   public void setReserved6(String theReserved6)
   {
       reserved6 = theReserved6;
   }

   /**
    * <code>
    * WsDebitDailyLmt is a text String of16 bytes.
    * </code>
    */
   public String getWsDebitDailyLmt()
   {
      return wsDebitDailyLmt;
   }

   /**
    * <code>
    * WsDebitDailyLmt is a text String of16 bytes.
    * </code>
    */
   public void setWsDebitDailyLmt(String theWsDebitDailyLmt)
   {
       wsDebitDailyLmt = theWsDebitDailyLmt;
   }

   /**
    * <code>
    * KeyEntry is a text String of1 bytes.
    * </code>
    */
   public String getKeyEntry()
   {
      return keyEntry;
   }

   /**
    * <code>
    * KeyEntry is a text String of1 bytes.
    * </code>
    */
   public void setKeyEntry(String theKeyEntry)
   {
       keyEntry = theKeyEntry;
   }

   /**
    * <code>
    * MagStripe is a text String of1 bytes.
    * </code>
    */
   public String getMagStripe()
   {
      return magStripe;
   }

   /**
    * <code>
    * MagStripe is a text String of1 bytes.
    * </code>
    */
   public void setMagStripe(String theMagStripe)
   {
       magStripe = theMagStripe;
   }

   /**
    * <code>
    * IcContacts is a text String of1 bytes.
    * </code>
    */
   public String getIcContacts()
   {
      return icContacts;
   }

   /**
    * <code>
    * IcContacts is a text String of1 bytes.
    * </code>
    */
   public void setIcContacts(String theIcContacts)
   {
       icContacts = theIcContacts;
   }

   /**
    * <code>
    * PlaintextPin is a text String of1 bytes.
    * </code>
    */
   public String getPlaintextPin()
   {
      return plaintextPin;
   }

   /**
    * <code>
    * PlaintextPin is a text String of1 bytes.
    * </code>
    */
   public void setPlaintextPin(String thePlaintextPin)
   {
       plaintextPin = thePlaintextPin;
   }

   /**
    * <code>
    * EnciphrPinOnl is a text String of1 bytes.
    * </code>
    */
   public String getEnciphrPinOnl()
   {
      return enciphrPinOnl;
   }

   /**
    * <code>
    * EnciphrPinOnl is a text String of1 bytes.
    * </code>
    */
   public void setEnciphrPinOnl(String theEnciphrPinOnl)
   {
       enciphrPinOnl = theEnciphrPinOnl;
   }

   /**
    * <code>
    * Signature is a text String of1 bytes.
    * </code>
    */
   public String getSignature()
   {
      return signature;
   }

   /**
    * <code>
    * Signature is a text String of1 bytes.
    * </code>
    */
   public void setSignature(String theSignature)
   {
       signature = theSignature;
   }

   /**
    * <code>
    * EnciphrPinOffl is a text String of1 bytes.
    * </code>
    */
   public String getEnciphrPinOffl()
   {
      return enciphrPinOffl;
   }

   /**
    * <code>
    * EnciphrPinOffl is a text String of1 bytes.
    * </code>
    */
   public void setEnciphrPinOffl(String theEnciphrPinOffl)
   {
       enciphrPinOffl = theEnciphrPinOffl;
   }

   /**
    * <code>
    * StaticDataAuth is a text String of1 bytes.
    * </code>
    */
   public String getStaticDataAuth()
   {
      return staticDataAuth;
   }

   /**
    * <code>
    * StaticDataAuth is a text String of1 bytes.
    * </code>
    */
   public void setStaticDataAuth(String theStaticDataAuth)
   {
       staticDataAuth = theStaticDataAuth;
   }

   /**
    * <code>
    * DynDataAuth is a text String of1 bytes.
    * </code>
    */
   public String getDynDataAuth()
   {
      return dynDataAuth;
   }

   /**
    * <code>
    * DynDataAuth is a text String of1 bytes.
    * </code>
    */
   public void setDynDataAuth(String theDynDataAuth)
   {
       dynDataAuth = theDynDataAuth;
   }

   /**
    * <code>
    * CardCapture is a text String of1 bytes.
    * </code>
    */
   public String getCardCapture()
   {
      return cardCapture;
   }

   /**
    * <code>
    * CardCapture is a text String of1 bytes.
    * </code>
    */
   public void setCardCapture(String theCardCapture)
   {
       cardCapture = theCardCapture;
   }

   /**
    * <code>
    * ReadNextKey is a text String of16 bytes.
    * </code>
    */
   public String getReadNextKey()
   {
      return readNextKey;
   }

   /**
    * <code>
    * ReadNextKey is a text String of16 bytes.
    * </code>
    */
   public void setReadNextKey(String theReadNextKey)
   {
       readNextKey = theReadNextKey;
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
      out.writeString(getSaveKey(),4, CSLTypes.PICX);
      getErrorInfo().write(out);
      {
         int maxIndex = 45;
         int index = 0;
         java.util.Enumeration objects = tranIPos.elements(); 
         while (objects.hasMoreElements()) {
            if (index >= maxIndex) break; // write no more than max
            String toWrite = (String) objects.nextElement();
         help1 =
            com.comforte.csl.model.Util.convertNumStringFromDisplayToTransferFormat(toWrite, 2, 0, 0);
         out.writeString(help1, help1.length());
            index++;
         }
      }
      out.writeString(getFuncKey(),2, CSLTypes.PICX);
      out.writeString(getScrnAccessInfoLn(),288, CSLTypes.PICX);
      out.writeString(getLkCompPkg(),22, CSLTypes.PICX);
      out.writeString(getLkDataPkg(),194, CSLTypes.PICX);
      out.writeString(getTablePkg(),98, CSLTypes.PICX);
      getPtdfdef().write(out);
      out.writeString(getFiller(),2, CSLTypes.PICX);
      out.writeString(getReserved1(),1, CSLTypes.PICX);
      out.writeString(getReserved2(),1, CSLTypes.PICX);
      out.writeString(getReserved3(),1, CSLTypes.PICX);
      out.writeString(getNoCvmReqd(),1, CSLTypes.PICX);
      out.writeString(getReserved4(),1, CSLTypes.PICX);
      out.writeString(getReserved5(),1, CSLTypes.PICX);
      out.writeString(getCombndDataAuth(),1, CSLTypes.PICX);
      out.writeString(getReserved6(),1, CSLTypes.PICX);
      out.writeString(getWsDebitDailyLmt(),16, CSLTypes.PICX);
      out.writeString(getKeyEntry(),1, CSLTypes.PICX);
      out.writeString(getMagStripe(),1, CSLTypes.PICX);
      out.writeString(getIcContacts(),1, CSLTypes.PICX);
      out.writeString(getPlaintextPin(),1, CSLTypes.PICX);
      out.writeString(getEnciphrPinOnl(),1, CSLTypes.PICX);
      out.writeString(getSignature(),1, CSLTypes.PICX);
      out.writeString(getEnciphrPinOffl(),1, CSLTypes.PICX);
      out.writeString(getStaticDataAuth(),1, CSLTypes.PICX);
      out.writeString(getDynDataAuth(),1, CSLTypes.PICX);
      out.writeString(getCardCapture(),1, CSLTypes.PICX);
      out.writeString(getReadNextKey(),16, CSLTypes.PICX);
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
      setSaveKey(in.readString(4));
      getErrorInfo().read(in);
      {
         int maxIndex = 45;
         int index = 0;
       tranIPos = new java.util.Vector();
         while (index < maxIndex) {
            String toRead = null;
            help1 = in.readString(2);
            toRead =
                com.comforte.csl.model.Util.convertNumStringFromTransferToDisplayFormat(help1, 2, 0, 0);
            addTranIPos(toRead); 
            index++;
         }
      }
      setFuncKey(in.readString(2));
      setScrnAccessInfoLn(in.readString(288));
      setLkCompPkg(in.readString(22));
      setLkDataPkg(in.readString(194));
      setTablePkg(in.readString(98));
      getPtdfdef().read(in);
      setFiller(in.readString(2));
      setReserved1(in.readString(1));
      setReserved2(in.readString(1));
      setReserved3(in.readString(1));
      setNoCvmReqd(in.readString(1));
      setReserved4(in.readString(1));
      setReserved5(in.readString(1));
      setCombndDataAuth(in.readString(1));
      setReserved6(in.readString(1));
      setWsDebitDailyLmt(in.readString(16));
      setKeyEntry(in.readString(1));
      setMagStripe(in.readString(1));
      setIcContacts(in.readString(1));
      setPlaintextPin(in.readString(1));
      setEnciphrPinOnl(in.readString(1));
      setSignature(in.readString(1));
      setEnciphrPinOffl(in.readString(1));
      setStaticDataAuth(in.readString(1));
      setDynDataAuth(in.readString(1));
      setCardCapture(in.readString(1));
      setReadNextKey(in.readString(16));
   } 
}
