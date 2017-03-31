/*
 * @(#)MerchActivityRpt.java
 * Created by CSL Studio (definition-schema) on 24/08/2016 10:54:43 AM
 */
package csl.globalpay.ipm.msgprdf5req.msgprdf;
import java.io.IOException;

import com.comforte.csl.cslapi.CSLInputStream;
import com.comforte.csl.cslapi.CSLOutputStream;
import com.comforte.csl.xmlutils.CSLTypes;

/** <code>MerchActivityRpt</code>
 *  
 */
public class	MerchActivityRpt implements com.comforte.csl.cslapi.CSLStreamable
{
   /* Members */
   protected String prntLoc;
   protected String rptCreationFlg;
   protected String periodicFileRet;

   /** <code>MerchActivityRpt</code>
    * Constructor
    * @param characterEncoding this is for setting strings with CSLBaseData
    * here we do not use it!
    */
   public MerchActivityRpt(String characterEncoding)
   {
      setPrntLoc(new String());
      setRptCreationFlg(new String());
      setPeriodicFileRet(new String());
   }

   /** <code>MerchActivityRpt</code>
    *  Constructor
    */ 
   public MerchActivityRpt()
   {
      this(null);
   }
   /* getter and setter */

   /**
    * <code>
    * PrntLoc is a text String of16 bytes.
    * </code>
    */
   public String getPrntLoc()
   {
      return prntLoc;
   }

   /**
    * <code>
    * PrntLoc is a text String of16 bytes.
    * </code>
    */
   public void setPrntLoc(String thePrntLoc)
   {
       prntLoc = thePrntLoc;
   }

   /**
    * <code>
    * RptCreationFlg is a text String of1 bytes.
    * </code>
    */
   public String getRptCreationFlg()
   {
      return rptCreationFlg;
   }

   /**
    * <code>
    * RptCreationFlg is a text String of1 bytes.
    * </code>
    */
   public void setRptCreationFlg(String theRptCreationFlg)
   {
       rptCreationFlg = theRptCreationFlg;
   }

   /**
    * <code>
    * PeriodicFileRet is a text String of3 bytes.
    * </code>
    */
   public String getPeriodicFileRet()
   {
      return periodicFileRet;
   }

   /**
    * <code>
    * PeriodicFileRet is a text String of3 bytes.
    * </code>
    */
   public void setPeriodicFileRet(String thePeriodicFileRet)
   {
       periodicFileRet = thePeriodicFileRet;
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
      out.writeString(getPrntLoc(),16, CSLTypes.PICX);
      out.writeString(getRptCreationFlg(),1, CSLTypes.PICX);
      out.writeString(getPeriodicFileRet(),3, CSLTypes.PICX);
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
      setPrntLoc(in.readString(16));
      setRptCreationFlg(in.readString(1));
      setPeriodicFileRet(in.readString(3));
   } 
}
