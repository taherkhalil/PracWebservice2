/*
 * @(#)DynamicRpqFields.java
 * Created by CSL Studio (definition-schema) on 18/08/2016 05:17:03 PM
 */
package csl.globalpay.ipm.msgptdf53req.msgptdf53;
import java.io.IOException;

import com.comforte.csl.cslapi.CSLInputStream;
import com.comforte.csl.cslapi.CSLOutputStream;
import com.comforte.csl.xmlutils.CSLTypes;

/** <code>DynamicRpqFields</code>
 *  
 */
public class	DynamicRpqFields implements com.comforte.csl.cslapi.CSLStreamable
{
   /* Members */
   protected String cbBatchNum;
   protected String pinpadId;
   protected Long debitDailyTotal;
   protected Short dynamicVerNo;

   /** <code>DynamicRpqFields</code>
    * Constructor
    * @param characterEncoding this is for setting strings with CSLBaseData
    * here we do not use it!
    */
   public DynamicRpqFields(String characterEncoding)
   {
      setCbBatchNum(new String());
      setPinpadId(new String());
      setDebitDailyTotal(new Long((long)0));
      setDynamicVerNo(new Short((short)0));
   }

   /** <code>DynamicRpqFields</code>
    *  Constructor
    */ 
   public DynamicRpqFields()
   {
      this(null);
   }
   /* getter and setter */

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
    * PinpadId is a text String of16 bytes.
    * </code>
    */
   public String getPinpadId()
   {
      return pinpadId;
   }

   /**
    * <code>
    * PinpadId is a text String of16 bytes.
    * </code>
    */
   public void setPinpadId(String thePinpadId)
   {
       pinpadId = thePinpadId;
   }

   /**
    * <code>
    * Name=DEBIT-DAILY-TOTAL;CSL Type=cslLong;
    * </code>
    */
   public Long getDebitDailyTotal()
   {
      return debitDailyTotal;
   }

   /**
    * <code>
    * Name=DEBIT-DAILY-TOTAL;CSL Type=cslLong;
    * </code>
    */
   public void setDebitDailyTotal(Long theDebitDailyTotal)
   {
       debitDailyTotal = theDebitDailyTotal;
   }

   /**
    * <code>
    * Name=DYNAMIC-VER-NO;CSL Type=cslShort;
    * </code>
    */
   public Short getDynamicVerNo()
   {
      return dynamicVerNo;
   }

   /**
    * <code>
    * Name=DYNAMIC-VER-NO;CSL Type=cslShort;
    * </code>
    */
   public void setDynamicVerNo(Short theDynamicVerNo)
   {
       dynamicVerNo = theDynamicVerNo;
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
      help1 =
        com.comforte.csl.model.Util.convertNumStringFromDisplayToTransferFormat(getCbBatchNum(), 2, 0, 0);
      out.writeString(help1, help1.length());
      out.writeString(getPinpadId(),16, CSLTypes.PICX);
      out.writeLong(getDebitDailyTotal().longValue());
      out.writeShort(getDynamicVerNo().shortValue());
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
      help1 = in.readString(2);
      help2 =
         com.comforte.csl.model.Util.convertNumStringFromTransferToDisplayFormat(help1, 2, 0, 0);
      setCbBatchNum(help2);
      setPinpadId(in.readString(16));
      setDebitDailyTotal(new Long(in.readLong()));
      setDynamicVerNo(new Short(in.readShort()));
   } 
}
