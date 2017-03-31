/*
 * @(#)ScnTbl.java
 * Created by CSL Studio (definition-schema) on 18/08/2016 05:17:02 PM
 */
package csl.globalpay.ipm.msgptdf53req.msgptdf53;
import java.io.IOException;

import com.comforte.csl.cslapi.CSLInputStream;
import com.comforte.csl.cslapi.CSLOutputStream;

/** <code>ScnTbl</code>
 *  
 */
public class	ScnTbl implements com.comforte.csl.cslapi.CSLStreamable
{
   /* Members */
   protected String fldIdNum;
   protected String fldIndexNum;

   /** <code>ScnTbl</code>
    * Constructor
    * @param characterEncoding this is for setting strings with CSLBaseData
    * here we do not use it!
    */
   public ScnTbl(String characterEncoding)
   {
      setFldIdNum(new String());
      setFldIndexNum(new String());
   }

   /** <code>ScnTbl</code>
    *  Constructor
    */ 
   public ScnTbl()
   {
      this(null);
   }
   /* getter and setter */

   /**
    * <code>
    * FldIdNum is a numeric String of
							2 digits with 0 decimal places.
    * </code>
    */
   public String getFldIdNum()
   {
      return fldIdNum;
   }

   /**
    * <code>
    * FldIdNum is a numeric String of
							2 digits with 0 decimal places.
    * </code>
    */
   public void setFldIdNum(String theFldIdNum)
   {
       fldIdNum = theFldIdNum;
   }

   /**
    * <code>
    * FldIndexNum is a numeric String of
							2 digits with 0 decimal places.
    * </code>
    */
   public String getFldIndexNum()
   {
      return fldIndexNum;
   }

   /**
    * <code>
    * FldIndexNum is a numeric String of
							2 digits with 0 decimal places.
    * </code>
    */
   public void setFldIndexNum(String theFldIndexNum)
   {
       fldIndexNum = theFldIndexNum;
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
        com.comforte.csl.model.Util.convertNumStringFromDisplayToTransferFormat(getFldIdNum(), 2, 0, 0);
      out.writeString(help1, help1.length());
      help1 =
        com.comforte.csl.model.Util.convertNumStringFromDisplayToTransferFormat(getFldIndexNum(), 2, 0, 0);
      out.writeString(help1, help1.length());
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
      setFldIdNum(help2);
      help1 = in.readString(2);
      help2 =
         com.comforte.csl.model.Util.convertNumStringFromTransferToDisplayFormat(help1, 2, 0, 0);
      setFldIndexNum(help2);
   } 
}
