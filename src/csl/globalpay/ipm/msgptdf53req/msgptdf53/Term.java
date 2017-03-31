/*
 * @(#)Term.java
 * Created by CSL Studio (definition-schema) on 18/08/2016 05:17:02 PM
 */
package csl.globalpay.ipm.msgptdf53req.msgptdf53;
import java.io.IOException;

import com.comforte.csl.cslapi.CSLInputStream;
import com.comforte.csl.cslapi.CSLOutputStream;

/** <code>Term</code>
 *  
 */
public class	Term implements com.comforte.csl.cslapi.CSLStreamable
{
   /* Members */
   protected Integer dat;
   protected Integer tim;

   /** <code>Term</code>
    * Constructor
    * @param characterEncoding this is for setting strings with CSLBaseData
    * here we do not use it!
    */
   public Term(String characterEncoding)
   {
      setDat(new Integer(0));
      setTim(new Integer(0));
   }

   /** <code>Term</code>
    *  Constructor
    */ 
   public Term()
   {
      this(null);
   }
   /* getter and setter */

   /**
    * <code>
    * Name=DAT;CSL Type=cslInteger;
    * </code>
    */
   public Integer getDat()
   {
      return dat;
   }

   /**
    * <code>
    * Name=DAT;CSL Type=cslInteger;
    * </code>
    */
   public void setDat(Integer theDat)
   {
       dat = theDat;
   }

   /**
    * <code>
    * Name=TIM;CSL Type=cslInteger;
    * </code>
    */
   public Integer getTim()
   {
      return tim;
   }

   /**
    * <code>
    * Name=TIM;CSL Type=cslInteger;
    * </code>
    */
   public void setTim(Integer theTim)
   {
       tim = theTim;
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
      out.writeInt(getDat().intValue());
      out.writeInt(getTim().intValue());
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
      setDat(new Integer(in.readInt()));
      setTim(new Integer(in.readInt()));
   } 
}
