/*
 * @(#)RecImage.java
 * Created by CSL Studio (definition-schema) on 24/08/2016 10:54:43 AM
 */
package csl.globalpay.ipm.msgprdf5reply.msgprdf;
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
   protected PrdfRecImage prdfRecImage;
   protected String panImage;
   protected WsService wsService;
   protected Short wsNumSrvAfterCompression;
   protected Short wsNumSrv;
   protected Short wsNumSrv2;
   protected String leftover;

   /** <code>RecImage</code>
    * Constructor
    * @param characterEncoding this is for setting strings with CSLBaseData
    * here we do not use it!
    */
   public RecImage(String characterEncoding)
   {
      setPrdfRecImage(new PrdfRecImage());
      setPanImage(new String());
      setWsService(new WsService());
      setWsNumSrvAfterCompression(new Short((short)0));
      setWsNumSrv(new Short((short)0));
      setWsNumSrv2(new Short((short)0));
      setLeftover(new String());
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
    * Name=PRDF-REC-IMAGE;
    * </code>
    */
   public PrdfRecImage getPrdfRecImage()
   {
      return prdfRecImage;
   }

   /**
    * <code>
    * Name=PRDF-REC-IMAGE;
    * </code>
    */
   public void setPrdfRecImage(PrdfRecImage thePrdfRecImage)
   {
       prdfRecImage = thePrdfRecImage;
   }

   /**
    * <code>
    * PanImage is a text String of28 bytes.
    * </code>
    */
   public String getPanImage()
   {
      return panImage;
   }

   /**
    * <code>
    * PanImage is a text String of28 bytes.
    * </code>
    */
   public void setPanImage(String thePanImage)
   {
       panImage = thePanImage;
   }

   /**
    * <code>
    * Name=WS-SERVICE;
    * </code>
    */
   public WsService getWsService()
   {
      return wsService;
   }

   /**
    * <code>
    * Name=WS-SERVICE;
    * </code>
    */
   public void setWsService(WsService theWsService)
   {
       wsService = theWsService;
   }

   /**
    * <code>
    * Name=WS-NUM-SRV-AFTER-COMPRESSION;CSL Type=cslShort;
    * </code>
    */
   public Short getWsNumSrvAfterCompression()
   {
      return wsNumSrvAfterCompression;
   }

   /**
    * <code>
    * Name=WS-NUM-SRV-AFTER-COMPRESSION;CSL Type=cslShort;
    * </code>
    */
   public void setWsNumSrvAfterCompression(Short theWsNumSrvAfterCompression)
   {
       wsNumSrvAfterCompression = theWsNumSrvAfterCompression;
   }

   /**
    * <code>
    * Name=WS-NUM-SRV;CSL Type=cslShort;
    * </code>
    */
   public Short getWsNumSrv()
   {
      return wsNumSrv;
   }

   /**
    * <code>
    * Name=WS-NUM-SRV;CSL Type=cslShort;
    * </code>
    */
   public void setWsNumSrv(Short theWsNumSrv)
   {
       wsNumSrv = theWsNumSrv;
   }

   /**
    * <code>
    * Name=WS-NUM-SRV2;CSL Type=cslShort;
    * </code>
    */
   public Short getWsNumSrv2()
   {
      return wsNumSrv2;
   }

   /**
    * <code>
    * Name=WS-NUM-SRV2;CSL Type=cslShort;
    * </code>
    */
   public void setWsNumSrv2(Short theWsNumSrv2)
   {
       wsNumSrv2 = theWsNumSrv2;
   }

   /**
    * <code>
    * Leftover is a text String of540 bytes.
    * </code>
    */
   public String getLeftover()
   {
      return leftover;
   }

   /**
    * <code>
    * Leftover is a text String of540 bytes.
    * </code>
    */
   public void setLeftover(String theLeftover)
   {
       leftover = theLeftover;
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
      getPrdfRecImage().write(out);
      out.writeString(getPanImage(),28, CSLTypes.PICX);
      getWsService().write(out);
      out.writeShort(getWsNumSrvAfterCompression().shortValue());
      out.writeShort(getWsNumSrv().shortValue());
      out.writeShort(getWsNumSrv2().shortValue());
      out.writeString(getLeftover(),540, CSLTypes.PICX);
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
      getPrdfRecImage().read(in);
      setPanImage(in.readString(28));
      getWsService().read(in);
      setWsNumSrvAfterCompression(new Short(in.readShort()));
      setWsNumSrv(new Short(in.readShort()));
      setWsNumSrv2(new Short(in.readShort()));
      setLeftover(in.readString(540));
   } 
}
