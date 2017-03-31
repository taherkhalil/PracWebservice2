/*
 * @(#)Retailer.java
 * Created by CSL Studio (definition-schema) on 24/08/2016 10:54:43 AM
 */
package csl.globalpay.ipm.msgprdf5reply.msgprdf;
import java.io.IOException;

import com.comforte.csl.cslapi.CSLInputStream;
import com.comforte.csl.cslapi.CSLOutputStream;
import com.comforte.csl.xmlutils.CSLTypes;

/** <code>Retailer</code>
 *  
 */
public class	Retailer implements com.comforte.csl.cslapi.CSLStreamable
{
   /* Members */
   protected String name;
   protected String addr;
   protected String addrExt;
   protected String city;
   protected String cnty;
   protected String postalCde;
   protected String userFld2;
   protected String st;
   protected String cntry;
   protected String rttn;
   protected String userFld1;
   protected Acct acct;
   protected String phone;
   protected String aftHrsPhone;
   protected String srvEstNum;
   protected String sicCde;
   protected String rfrlPhone;
   protected String achCompanyId;

   /** <code>Retailer</code>
    * Constructor
    * @param characterEncoding this is for setting strings with CSLBaseData
    * here we do not use it!
    */
   public Retailer(String characterEncoding)
   {
      setName(new String());
      setAddr(new String());
      setAddrExt(new String());
      setCity(new String());
      setCnty(new String());
      setPostalCde(new String());
      setUserFld2(new String());
      setSt(new String());
      setCntry(new String());
      setRttn(new String());
      setUserFld1(new String());
      setAcct(new Acct());
      setPhone(new String());
      setAftHrsPhone(new String());
      setSrvEstNum(new String());
      setSicCde(new String());
      setRfrlPhone(new String());
      setAchCompanyId(new String());
   }

   /** <code>Retailer</code>
    *  Constructor
    */ 
   public Retailer()
   {
      this(null);
   }
   /* getter and setter */

   /**
    * <code>
    * Name is a text String of40 bytes.
    * </code>
    */
   public String getName()
   {
      return name;
   }

   /**
    * <code>
    * Name is a text String of40 bytes.
    * </code>
    */
   public void setName(String theName)
   {
       name = theName;
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
    * AddrExt is a text String of25 bytes.
    * </code>
    */
   public String getAddrExt()
   {
      return addrExt;
   }

   /**
    * <code>
    * AddrExt is a text String of25 bytes.
    * </code>
    */
   public void setAddrExt(String theAddrExt)
   {
       addrExt = theAddrExt;
   }

   /**
    * <code>
    * City is a text String of18 bytes.
    * </code>
    */
   public String getCity()
   {
      return city;
   }

   /**
    * <code>
    * City is a text String of18 bytes.
    * </code>
    */
   public void setCity(String theCity)
   {
       city = theCity;
   }

   /**
    * <code>
    * Cnty is a text String of3 bytes.
    * </code>
    */
   public String getCnty()
   {
      return cnty;
   }

   /**
    * <code>
    * Cnty is a text String of3 bytes.
    * </code>
    */
   public void setCnty(String theCnty)
   {
       cnty = theCnty;
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
    * UserFld2 is a text String of2 bytes.
    * </code>
    */
   public String getUserFld2()
   {
      return userFld2;
   }

   /**
    * <code>
    * UserFld2 is a text String of2 bytes.
    * </code>
    */
   public void setUserFld2(String theUserFld2)
   {
       userFld2 = theUserFld2;
   }

   /**
    * <code>
    * St is a text String of3 bytes.
    * </code>
    */
   public String getSt()
   {
      return st;
   }

   /**
    * <code>
    * St is a text String of3 bytes.
    * </code>
    */
   public void setSt(String theSt)
   {
       st = theSt;
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
    * UserFld1 is a text String of2 bytes.
    * </code>
    */
   public String getUserFld1()
   {
      return userFld1;
   }

   /**
    * <code>
    * UserFld1 is a text String of2 bytes.
    * </code>
    */
   public void setUserFld1(String theUserFld1)
   {
       userFld1 = theUserFld1;
   }

   /**
    * <code>
    * Name=ACCT;
    * </code>
    */
   public Acct getAcct()
   {
      return acct;
   }

   /**
    * <code>
    * Name=ACCT;
    * </code>
    */
   public void setAcct(Acct theAcct)
   {
       acct = theAcct;
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

   /**
    * <code>
    * AftHrsPhone is a text String of20 bytes.
    * </code>
    */
   public String getAftHrsPhone()
   {
      return aftHrsPhone;
   }

   /**
    * <code>
    * AftHrsPhone is a text String of20 bytes.
    * </code>
    */
   public void setAftHrsPhone(String theAftHrsPhone)
   {
       aftHrsPhone = theAftHrsPhone;
   }

   /**
    * <code>
    * SrvEstNum is a numeric String of
							10 digits with 0 decimal places.
    * </code>
    */
   public String getSrvEstNum()
   {
      return srvEstNum;
   }

   /**
    * <code>
    * SrvEstNum is a numeric String of
							10 digits with 0 decimal places.
    * </code>
    */
   public void setSrvEstNum(String theSrvEstNum)
   {
       srvEstNum = theSrvEstNum;
   }

   /**
    * <code>
    * SicCde is a numeric String of
							4 digits with 0 decimal places.
    * </code>
    */
   public String getSicCde()
   {
      return sicCde;
   }

   /**
    * <code>
    * SicCde is a numeric String of
							4 digits with 0 decimal places.
    * </code>
    */
   public void setSicCde(String theSicCde)
   {
       sicCde = theSicCde;
   }

   /**
    * <code>
    * RfrlPhone is a text String of20 bytes.
    * </code>
    */
   public String getRfrlPhone()
   {
      return rfrlPhone;
   }

   /**
    * <code>
    * RfrlPhone is a text String of20 bytes.
    * </code>
    */
   public void setRfrlPhone(String theRfrlPhone)
   {
       rfrlPhone = theRfrlPhone;
   }

   /**
    * <code>
    * AchCompanyId is a text String of10 bytes.
    * </code>
    */
   public String getAchCompanyId()
   {
      return achCompanyId;
   }

   /**
    * <code>
    * AchCompanyId is a text String of10 bytes.
    * </code>
    */
   public void setAchCompanyId(String theAchCompanyId)
   {
       achCompanyId = theAchCompanyId;
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
      out.writeString(getName(),40, CSLTypes.PICX);
      out.writeString(getAddr(),25, CSLTypes.PICX);
      out.writeString(getAddrExt(),25, CSLTypes.PICX);
      out.writeString(getCity(),18, CSLTypes.PICX);
      out.writeString(getCnty(),3, CSLTypes.PICX);
      out.writeString(getPostalCde(),10, CSLTypes.PICX);
      out.writeString(getUserFld2(),2, CSLTypes.PICX);
      out.writeString(getSt(),3, CSLTypes.PICX);
      out.writeString(getCntry(),2, CSLTypes.PICX);
      help1 =
        com.comforte.csl.model.Util.convertNumStringFromDisplayToTransferFormat(getRttn(), 11, 0, 0);
      out.writeString(help1, help1.length());
      out.writeString(getUserFld1(),2, CSLTypes.PICX);
      getAcct().write(out);
      out.writeString(getPhone(),20, CSLTypes.PICX);
      out.writeString(getAftHrsPhone(),20, CSLTypes.PICX);
      help1 =
        com.comforte.csl.model.Util.convertNumStringFromDisplayToTransferFormat(getSrvEstNum(), 10, 0, 0);
      out.writeString(help1, help1.length());
      help1 =
        com.comforte.csl.model.Util.convertNumStringFromDisplayToTransferFormat(getSicCde(), 4, 0, 0);
      out.writeString(help1, help1.length());
      out.writeString(getRfrlPhone(),20, CSLTypes.PICX);
      out.writeString(getAchCompanyId(),10, CSLTypes.PICX);
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
      setName(in.readString(40));
      setAddr(in.readString(25));
      setAddrExt(in.readString(25));
      setCity(in.readString(18));
      setCnty(in.readString(3));
      setPostalCde(in.readString(10));
      setUserFld2(in.readString(2));
      setSt(in.readString(3));
      setCntry(in.readString(2));
      help1 = in.readString(11);
      help2 =
         com.comforte.csl.model.Util.convertNumStringFromTransferToDisplayFormat(help1, 11, 0, 0);
      setRttn(help2);
      setUserFld1(in.readString(2));
      getAcct().read(in);
      setPhone(in.readString(20));
      setAftHrsPhone(in.readString(20));
      help1 = in.readString(10);
      help2 =
         com.comforte.csl.model.Util.convertNumStringFromTransferToDisplayFormat(help1, 10, 0, 0);
      setSrvEstNum(help2);
      help1 = in.readString(4);
      help2 =
         com.comforte.csl.model.Util.convertNumStringFromTransferToDisplayFormat(help1, 4, 0, 0);
      setSicCde(help2);
      setRfrlPhone(in.readString(20));
      setAchCompanyId(in.readString(10));
   } 
}
