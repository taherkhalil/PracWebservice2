/*
 * @(#)LastTran.java
 * Created by CSL Studio (definition-schema) on 18/08/2016 05:17:03 PM
 */
package csl.globalpay.ipm.msgptdf53reply.msgptdf53;
import java.io.IOException;

import com.comforte.csl.cslapi.CSLInputStream;
import com.comforte.csl.cslapi.CSLOutputStream;

/** <code>LastTran</code>
 *  
 */
public class	LastTran implements com.comforte.csl.cslapi.CSLStreamable
{
   /* Members */
   protected java.util.Vector ltTimestamp;
   protected Short nonstopId;
   protected Short proNum;

   /** <code>LastTran</code>
    * Constructor
    * @param characterEncoding this is for setting strings with CSLBaseData
    * here we do not use it!
    */
   public LastTran(String characterEncoding)
   {
       ltTimestamp = new java.util.Vector();
      {
         int maxIndex = 3;
         for (int i=0; i < maxIndex; i++) {
            addLtTimestamp(new Short((short)0));
         }
      }
      setNonstopId(new Short((short)0));
      setProNum(new Short((short)0));
   }

   /** <code>LastTran</code>
    *  Constructor
    */ 
   public LastTran()
   {
      this(null);
   }
   /* getter and setter */

   /**
    * <code>
    * Name=LT-TIMESTAMP;CSL Type=cslShort;
    * </code>
    */
   public Short[] getLtTimestamp()
   {
       Short[] retval = new Short[ltTimestamp.size()];
       ltTimestamp.copyInto(retval);
      return retval; 
   }

   /**
    * <code>
    * Name=LT-TIMESTAMP;CSL Type=cslShort;
    * </code>
    */
   public void setLtTimestamp(Short[] values)
   {
       ltTimestamp = new java.util.Vector(values.length);
      for (int i=0; i < values.length; i++) {
         addLtTimestamp(values[i]);
      }
   }

   /**
    * <code>
    * Name=LT-TIMESTAMP;CSL Type=cslShort;
    * </code>
    */
   public Short getLtTimestamp(int i)
   {
      return (Short)ltTimestamp.elementAt(i);
   }

   /**
    * <code>
    * Name=LT-TIMESTAMP;CSL Type=cslShort;
    * </code>
    */
   public void setLtTimestamp(int i, Short value)
   {
       ltTimestamp.setElementAt(value, i);
   }

   /**
    * <code>
    * Name=LT-TIMESTAMP;CSL Type=cslShort;
    * </code>
    */
   public void addLtTimestamp(Short value)
   {
       ltTimestamp.addElement(value);
   }

   /**
    * <code>
    * Name=LT-TIMESTAMP;CSL Type=cslShort;
    * </code>
    */
   public void removeLtTimestamp(Short value)
   {
       ltTimestamp.removeElement(value);
   }

   /**
    * <code>
    * Name=NONSTOP-ID;CSL Type=cslShort;
    * </code>
    */
   public Short getNonstopId()
   {
      return nonstopId;
   }

   /**
    * <code>
    * Name=NONSTOP-ID;CSL Type=cslShort;
    * </code>
    */
   public void setNonstopId(Short theNonstopId)
   {
       nonstopId = theNonstopId;
   }

   /**
    * <code>
    * Name=PRO-NUM;CSL Type=cslShort;
    * </code>
    */
   public Short getProNum()
   {
      return proNum;
   }

   /**
    * <code>
    * Name=PRO-NUM;CSL Type=cslShort;
    * </code>
    */
   public void setProNum(Short theProNum)
   {
       proNum = theProNum;
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
      {
         int maxIndex = 3;
         int index = 0;
         java.util.Enumeration objects = ltTimestamp.elements(); 
         while (objects.hasMoreElements()) {
            if (index >= maxIndex) break; // write no more than max
            Short toWrite = (Short) objects.nextElement();
         out.writeShort(toWrite.shortValue()); 
            index++;
         }
      }
      out.writeShort(getNonstopId().shortValue());
      out.writeShort(getProNum().shortValue());
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
      {
         int maxIndex = 3;
         int index = 0;
       ltTimestamp = new java.util.Vector();
         while (index < maxIndex) {
            Short toRead = null;
            toRead = new Short(in.readShort()); 
						            addLtTimestamp(toRead); 
            index++;
         }
      }
      setNonstopId(new Short(in.readShort()));
      setProNum(new Short(in.readShort()));
   } 
}
