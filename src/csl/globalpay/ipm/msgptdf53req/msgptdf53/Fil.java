/*
 * @(#)Fil.java
 * Created by CSL Studio (definition-schema) on 18/08/2016 05:17:02 PM
 */
package csl.globalpay.ipm.msgptdf53req.msgptdf53;
import java.io.IOException;

import com.comforte.csl.cslapi.CSLInputStream;
import com.comforte.csl.cslapi.CSLOutputStream;
import com.comforte.csl.xmlutils.CSLTypes;

/** <code>Fil</code>
 *  
 */
public class	Fil implements com.comforte.csl.cslapi.CSLStreamable
{
   /* Members */
   protected FldData fldData;
   protected String interacFlg;

   /** <code>Fil</code>
    * Constructor
    * @param characterEncoding this is for setting strings with CSLBaseData
    * here we do not use it!
    */
   public Fil(String characterEncoding)
   {
      setFldData(new FldData());
      setInteracFlg(new String());
   }

   /** <code>Fil</code>
    *  Constructor
    */ 
   public Fil()
   {
      this(null);
   }
   /* getter and setter */

   /**
    * <code>
    * Name=FLD-DATA;
    * </code>
    */
   public FldData getFldData()
   {
      return fldData;
   }

   /**
    * <code>
    * Name=FLD-DATA;
    * </code>
    */
   public void setFldData(FldData theFldData)
   {
       fldData = theFldData;
   }

   /**
    * <code>
    * InteracFlg is a text String of2 bytes.
    * </code>
    */
   public String getInteracFlg()
   {
      return interacFlg;
   }

   /**
    * <code>
    * InteracFlg is a text String of2 bytes.
    * </code>
    */
   public void setInteracFlg(String theInteracFlg)
   {
       interacFlg = theInteracFlg;
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
      getFldData().write(out);
      out.writeString(getInteracFlg(),2, CSLTypes.PICX);
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
      getFldData().read(in);
      setInteracFlg(in.readString(2));
   } 
}
