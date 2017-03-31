/*
 * @(#)ErrorInfo.java
 * Created by CSL Studio (definition-schema) on 18/08/2016 05:17:03 PM
 */
package csl.globalpay.ipm.msgptdf53reply.msgptdf53;
import java.io.IOException;

import com.comforte.csl.cslapi.CSLInputStream;
import com.comforte.csl.cslapi.CSLOutputStream;

/** <code>ErrorInfo</code>
 *  
 */
public class	ErrorInfo implements com.comforte.csl.cslapi.CSLStreamable
{
   /* Members */
   protected String overlayNum;
   protected String errCnt;
   protected java.util.Vector scnTbl;

   /** <code>ErrorInfo</code>
    * Constructor
    * @param characterEncoding this is for setting strings with CSLBaseData
    * here we do not use it!
    */
   public ErrorInfo(String characterEncoding)
   {
      setOverlayNum(new String());
      setErrCnt(new String());
       scnTbl = new java.util.Vector();
      {
         int maxIndex = 45;
         for (int i=0; i < maxIndex; i++) {
            addScnTbl(new ScnTbl());
         }
      }
   }

   /** <code>ErrorInfo</code>
    *  Constructor
    */ 
   public ErrorInfo()
   {
      this(null);
   }
   /* getter and setter */

   /**
    * <code>
    * OverlayNum is a numeric String of
							2 digits with 0 decimal places.
    * </code>
    */
   public String getOverlayNum()
   {
      return overlayNum;
   }

   /**
    * <code>
    * OverlayNum is a numeric String of
							2 digits with 0 decimal places.
    * </code>
    */
   public void setOverlayNum(String theOverlayNum)
   {
       overlayNum = theOverlayNum;
   }

   /**
    * <code>
    * ErrCnt is a numeric String of
							2 digits with 0 decimal places.
    * </code>
    */
   public String getErrCnt()
   {
      return errCnt;
   }

   /**
    * <code>
    * ErrCnt is a numeric String of
							2 digits with 0 decimal places.
    * </code>
    */
   public void setErrCnt(String theErrCnt)
   {
       errCnt = theErrCnt;
   }

   /**
    * <code>
    * Name=SCN-TBL;
    * </code>
    */
   public ScnTbl[] getScnTbl()
   {
       ScnTbl[] retval = new ScnTbl[scnTbl.size()];
       scnTbl.copyInto(retval);
      return retval; 
   }

   /**
    * <code>
    * Name=SCN-TBL;
    * </code>
    */
   public void setScnTbl(ScnTbl[] values)
   {
       scnTbl = new java.util.Vector(values.length);
      for (int i=0; i < values.length; i++) {
         addScnTbl(values[i]);
      }
   }

   /**
    * <code>
    * Name=SCN-TBL;
    * </code>
    */
   public ScnTbl getScnTbl(int i)
   {
      return (ScnTbl)scnTbl.elementAt(i);
   }

   /**
    * <code>
    * Name=SCN-TBL;
    * </code>
    */
   public void setScnTbl(int i, ScnTbl value)
   {
       scnTbl.setElementAt(value, i);
   }

   /**
    * <code>
    * Name=SCN-TBL;
    * </code>
    */
   public void addScnTbl(ScnTbl value)
   {
       scnTbl.addElement(value);
   }

   /**
    * <code>
    * Name=SCN-TBL;
    * </code>
    */
   public void removeScnTbl(ScnTbl value)
   {
       scnTbl.removeElement(value);
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
        com.comforte.csl.model.Util.convertNumStringFromDisplayToTransferFormat(getOverlayNum(), 2, 0, 0);
      out.writeString(help1, help1.length());
      help1 =
        com.comforte.csl.model.Util.convertNumStringFromDisplayToTransferFormat(getErrCnt(), 2, 0, 0);
      out.writeString(help1, help1.length());
      {
         int maxIndex = 45;
         int index = 0;
         java.util.Enumeration objects = scnTbl.elements(); 
         while (objects.hasMoreElements()) {
            if (index >= maxIndex) break; // write no more than max
            ScnTbl toWrite = (ScnTbl) objects.nextElement();
            toWrite.write(out);
            index++;
         }
      }
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
      setOverlayNum(help2);
      help1 = in.readString(2);
      help2 =
         com.comforte.csl.model.Util.convertNumStringFromTransferToDisplayFormat(help1, 2, 0, 0);
      setErrCnt(help2);
      {
         int maxIndex = 45;
         int index = 0;
       scnTbl = new java.util.Vector();
         while (index < maxIndex) {
            ScnTbl toRead = new ScnTbl();
            toRead.read(in);
            addScnTbl(toRead); 
            index++;
         }
      }
   } 
}
