/*
 * @(#)WsService1.java
 * Created by CSL Studio (definition-schema) on 24/08/2016 10:54:43 AM
 */
package csl.globalpay.ipm.msgprdf5req.msgprdf;
import java.io.IOException;

import com.comforte.csl.cslapi.CSLInputStream;
import com.comforte.csl.cslapi.CSLOutputStream;
import com.comforte.csl.xmlutils.CSLTypes;

/** <code>WsService1</code>
 *  
 */
public class	WsService1 implements com.comforte.csl.cslapi.CSLStreamable
{
   /* Members */
   protected String wsTyp;
   protected String wsDftCaptureFlg;
   protected String wsHitNneg;
   protected String wsOverridePro;
   protected Integer wsTranLimit;
   protected String wsTypx;
   protected String wsAltFiid;
   protected String wsAltMerchantId;
   protected String filler;

   /** <code>WsService1</code>
    * Constructor
    * @param characterEncoding this is for setting strings with CSLBaseData
    * here we do not use it!
    */
   public WsService1(String characterEncoding)
   {
      setWsTyp(new String());
      setWsDftCaptureFlg(new String());
      setWsHitNneg(new String());
      setWsOverridePro(new String());
      setWsTranLimit(new Integer(0));
      setWsTypx(new String());
      setWsAltFiid(new String());
      setWsAltMerchantId(new String());
      setFiller(new String());
   }

   /** <code>WsService1</code>
    *  Constructor
    */ 
   public WsService1()
   {
      this(null);
   }
   /* getter and setter */

   /**
    * <code>
    * WsTyp is a text String of2 bytes.
    * </code>
    */
   public String getWsTyp()
   {
      return wsTyp;
   }

   /**
    * <code>
    * WsTyp is a text String of2 bytes.
    * </code>
    */
   public void setWsTyp(String theWsTyp)
   {
       wsTyp = theWsTyp;
   }

   /**
    * <code>
    * WsDftCaptureFlg is a text String of1 bytes.
    * </code>
    */
   public String getWsDftCaptureFlg()
   {
      return wsDftCaptureFlg;
   }

   /**
    * <code>
    * WsDftCaptureFlg is a text String of1 bytes.
    * </code>
    */
   public void setWsDftCaptureFlg(String theWsDftCaptureFlg)
   {
       wsDftCaptureFlg = theWsDftCaptureFlg;
   }

   /**
    * <code>
    * WsHitNneg is a text String of1 bytes.
    * </code>
    */
   public String getWsHitNneg()
   {
      return wsHitNneg;
   }

   /**
    * <code>
    * WsHitNneg is a text String of1 bytes.
    * </code>
    */
   public void setWsHitNneg(String theWsHitNneg)
   {
       wsHitNneg = theWsHitNneg;
   }

   /**
    * <code>
    * WsOverridePro is a text String of16 bytes.
    * </code>
    */
   public String getWsOverridePro()
   {
      return wsOverridePro;
   }

   /**
    * <code>
    * WsOverridePro is a text String of16 bytes.
    * </code>
    */
   public void setWsOverridePro(String theWsOverridePro)
   {
       wsOverridePro = theWsOverridePro;
   }

   /**
    * <code>
    * Name=WS-TRAN-LIMIT;CSL Type=cslInteger;
    * </code>
    */
   public Integer getWsTranLimit()
   {
      return wsTranLimit;
   }

   /**
    * <code>
    * Name=WS-TRAN-LIMIT;CSL Type=cslInteger;
    * </code>
    */
   public void setWsTranLimit(Integer theWsTranLimit)
   {
       wsTranLimit = theWsTranLimit;
   }

   /**
    * <code>
    * WsTypx is a text String of16 bytes.
    * </code>
    */
   public String getWsTypx()
   {
      return wsTypx;
   }

   /**
    * <code>
    * WsTypx is a text String of16 bytes.
    * </code>
    */
   public void setWsTypx(String theWsTypx)
   {
       wsTypx = theWsTypx;
   }

   /**
    * <code>
    * WsAltFiid is a text String of4 bytes.
    * </code>
    */
   public String getWsAltFiid()
   {
      return wsAltFiid;
   }

   /**
    * <code>
    * WsAltFiid is a text String of4 bytes.
    * </code>
    */
   public void setWsAltFiid(String theWsAltFiid)
   {
       wsAltFiid = theWsAltFiid;
   }

   /**
    * <code>
    * WsAltMerchantId is a text String of15 bytes.
    * </code>
    */
   public String getWsAltMerchantId()
   {
      return wsAltMerchantId;
   }

   /**
    * <code>
    * WsAltMerchantId is a text String of15 bytes.
    * </code>
    */
   public void setWsAltMerchantId(String theWsAltMerchantId)
   {
       wsAltMerchantId = theWsAltMerchantId;
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
      out.writeString(getWsTyp(),2, CSLTypes.PICX);
      out.writeString(getWsDftCaptureFlg(),1, CSLTypes.PICX);
      out.writeString(getWsHitNneg(),1, CSLTypes.PICX);
      out.writeString(getWsOverridePro(),16, CSLTypes.PICX);
      out.writeInt(getWsTranLimit().intValue());
      out.writeString(getWsTypx(),16, CSLTypes.PICX);
      out.writeString(getWsAltFiid(),4, CSLTypes.PICX);
      out.writeString(getWsAltMerchantId(),15, CSLTypes.PICX);
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
      setWsTyp(in.readString(2));
      setWsDftCaptureFlg(in.readString(1));
      setWsHitNneg(in.readString(1));
      setWsOverridePro(in.readString(16));
      setWsTranLimit(new Integer(in.readInt()));
      setWsTypx(in.readString(16));
      setWsAltFiid(in.readString(4));
      setWsAltMerchantId(in.readString(15));
      setFiller(in.readString(1));
   } 
}
