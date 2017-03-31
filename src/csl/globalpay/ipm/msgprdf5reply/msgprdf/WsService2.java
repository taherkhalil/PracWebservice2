/*
 * @(#)WsService2.java
 * Created by CSL Studio (definition-schema) on 24/08/2016 10:54:43 AM
 */
package csl.globalpay.ipm.msgprdf5reply.msgprdf;
import java.io.IOException;

import com.comforte.csl.cslapi.CSLInputStream;
import com.comforte.csl.cslapi.CSLOutputStream;
import com.comforte.csl.xmlutils.CSLTypes;

/** <code>WsService2</code>
 *  
 */
public class	WsService2 implements com.comforte.csl.cslapi.CSLStreamable
{
   /* Members */
   protected String wsTyp2;
   protected String wsDftCaptureFlg2;
   protected String wsHitNneg2;
   protected String wsOverridePro2;
   protected Integer wsTranLimit2;
   protected String wsTypx2;
   protected String wsAltFiid2;
   protected String wsAltMerchantId2;
   protected String filler;

   /** <code>WsService2</code>
    * Constructor
    * @param characterEncoding this is for setting strings with CSLBaseData
    * here we do not use it!
    */
   public WsService2(String characterEncoding)
   {
      setWsTyp2(new String());
      setWsDftCaptureFlg2(new String());
      setWsHitNneg2(new String());
      setWsOverridePro2(new String());
      setWsTranLimit2(new Integer(0));
      setWsTypx2(new String());
      setWsAltFiid2(new String());
      setWsAltMerchantId2(new String());
      setFiller(new String());
   }

   /** <code>WsService2</code>
    *  Constructor
    */ 
   public WsService2()
   {
      this(null);
   }
   /* getter and setter */

   /**
    * <code>
    * WsTyp2 is a text String of2 bytes.
    * </code>
    */
   public String getWsTyp2()
   {
      return wsTyp2;
   }

   /**
    * <code>
    * WsTyp2 is a text String of2 bytes.
    * </code>
    */
   public void setWsTyp2(String theWsTyp2)
   {
       wsTyp2 = theWsTyp2;
   }

   /**
    * <code>
    * WsDftCaptureFlg2 is a text String of1 bytes.
    * </code>
    */
   public String getWsDftCaptureFlg2()
   {
      return wsDftCaptureFlg2;
   }

   /**
    * <code>
    * WsDftCaptureFlg2 is a text String of1 bytes.
    * </code>
    */
   public void setWsDftCaptureFlg2(String theWsDftCaptureFlg2)
   {
       wsDftCaptureFlg2 = theWsDftCaptureFlg2;
   }

   /**
    * <code>
    * WsHitNneg2 is a text String of1 bytes.
    * </code>
    */
   public String getWsHitNneg2()
   {
      return wsHitNneg2;
   }

   /**
    * <code>
    * WsHitNneg2 is a text String of1 bytes.
    * </code>
    */
   public void setWsHitNneg2(String theWsHitNneg2)
   {
       wsHitNneg2 = theWsHitNneg2;
   }

   /**
    * <code>
    * WsOverridePro2 is a text String of16 bytes.
    * </code>
    */
   public String getWsOverridePro2()
   {
      return wsOverridePro2;
   }

   /**
    * <code>
    * WsOverridePro2 is a text String of16 bytes.
    * </code>
    */
   public void setWsOverridePro2(String theWsOverridePro2)
   {
       wsOverridePro2 = theWsOverridePro2;
   }

   /**
    * <code>
    * Name=WS-TRAN-LIMIT2;CSL Type=cslInteger;
    * </code>
    */
   public Integer getWsTranLimit2()
   {
      return wsTranLimit2;
   }

   /**
    * <code>
    * Name=WS-TRAN-LIMIT2;CSL Type=cslInteger;
    * </code>
    */
   public void setWsTranLimit2(Integer theWsTranLimit2)
   {
       wsTranLimit2 = theWsTranLimit2;
   }

   /**
    * <code>
    * WsTypx2 is a text String of16 bytes.
    * </code>
    */
   public String getWsTypx2()
   {
      return wsTypx2;
   }

   /**
    * <code>
    * WsTypx2 is a text String of16 bytes.
    * </code>
    */
   public void setWsTypx2(String theWsTypx2)
   {
       wsTypx2 = theWsTypx2;
   }

   /**
    * <code>
    * WsAltFiid2 is a text String of4 bytes.
    * </code>
    */
   public String getWsAltFiid2()
   {
      return wsAltFiid2;
   }

   /**
    * <code>
    * WsAltFiid2 is a text String of4 bytes.
    * </code>
    */
   public void setWsAltFiid2(String theWsAltFiid2)
   {
       wsAltFiid2 = theWsAltFiid2;
   }

   /**
    * <code>
    * WsAltMerchantId2 is a text String of15 bytes.
    * </code>
    */
   public String getWsAltMerchantId2()
   {
      return wsAltMerchantId2;
   }

   /**
    * <code>
    * WsAltMerchantId2 is a text String of15 bytes.
    * </code>
    */
   public void setWsAltMerchantId2(String theWsAltMerchantId2)
   {
       wsAltMerchantId2 = theWsAltMerchantId2;
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
      out.writeString(getWsTyp2(),2, CSLTypes.PICX);
      out.writeString(getWsDftCaptureFlg2(),1, CSLTypes.PICX);
      out.writeString(getWsHitNneg2(),1, CSLTypes.PICX);
      out.writeString(getWsOverridePro2(),16, CSLTypes.PICX);
      out.writeInt(getWsTranLimit2().intValue());
      out.writeString(getWsTypx2(),16, CSLTypes.PICX);
      out.writeString(getWsAltFiid2(),4, CSLTypes.PICX);
      out.writeString(getWsAltMerchantId2(),15, CSLTypes.PICX);
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
      setWsTyp2(in.readString(2));
      setWsDftCaptureFlg2(in.readString(1));
      setWsHitNneg2(in.readString(1));
      setWsOverridePro2(in.readString(16));
      setWsTranLimit2(new Integer(in.readInt()));
      setWsTypx2(in.readString(16));
      setWsAltFiid2(in.readString(4));
      setWsAltMerchantId2(in.readString(15));
      setFiller(in.readString(1));
   } 
}
