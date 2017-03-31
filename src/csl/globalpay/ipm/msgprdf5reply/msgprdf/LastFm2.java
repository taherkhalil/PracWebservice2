/*
 * @(#)LastFm2.java
 * Created by CSL Studio (definition-schema) on 24/08/2016 10:54:43 AM
 */
package csl.globalpay.ipm.msgprdf5reply.msgprdf;
import java.io.IOException;

import com.comforte.csl.cslapi.CSLInputStream;
import com.comforte.csl.cslapi.CSLOutputStream;
import com.comforte.csl.xmlutils.CSLTypes;

/** <code>LastFm</code>
 *  
 */
public class	LastFm2 implements com.comforte.csl.cslapi.CSLStreamable
{
   /* Members */
   protected java.util.Vector fmTimestamp;
   protected Short fmUserGrp;
   protected Integer fmUserNum;
   protected String updtTyp;
   protected String staNum;
   protected String fill1;

   /** <code>LastFm</code>
    * Constructor
    * @param characterEncoding this is for setting strings with CSLBaseData
    * here we do not use it!
    */
   public LastFm2(String characterEncoding)
   {
       fmTimestamp = new java.util.Vector();
      {
         int maxIndex = 3;
         for (int i=0; i < maxIndex; i++) {
            addFmTimestamp(new Short((short)0));
         }
      }
      setFmUserGrp(new Short((short)0));
      setFmUserNum(new Integer(0));
      setUpdtTyp(new String());
      setStaNum(new String());
      setFill1(new String());
   }

   /** <code>LastFm</code>
    *  Constructor
    */ 
   public LastFm2()
   {
      this(null);
   }
   /* getter and setter */

   /**
    * <code>
    * Name=FM-TIMESTAMP;CSL Type=cslShort;
    * </code>
    */
   public Short[] getFmTimestamp()
   {
       Short[] retval = new Short[fmTimestamp.size()];
       fmTimestamp.copyInto(retval);
      return retval; 
   }

   /**
    * <code>
    * Name=FM-TIMESTAMP;CSL Type=cslShort;
    * </code>
    */
   public void setFmTimestamp(Short[] values)
   {
       fmTimestamp = new java.util.Vector(values.length);
      for (int i=0; i < values.length; i++) {
         addFmTimestamp(values[i]);
      }
   }

   /**
    * <code>
    * Name=FM-TIMESTAMP;CSL Type=cslShort;
    * </code>
    */
   public Short getFmTimestamp(int i)
   {
      return (Short)fmTimestamp.elementAt(i);
   }

   /**
    * <code>
    * Name=FM-TIMESTAMP;CSL Type=cslShort;
    * </code>
    */
   public void setFmTimestamp(int i, Short value)
   {
       fmTimestamp.setElementAt(value, i);
   }

   /**
    * <code>
    * Name=FM-TIMESTAMP;CSL Type=cslShort;
    * </code>
    */
   public void addFmTimestamp(Short value)
   {
       fmTimestamp.addElement(value);
   }

   /**
    * <code>
    * Name=FM-TIMESTAMP;CSL Type=cslShort;
    * </code>
    */
   public void removeFmTimestamp(Short value)
   {
       fmTimestamp.removeElement(value);
   }

   /**
    * <code>
    * Name=FM-USER-GRP;CSL Type=cslShort;
    * </code>
    */
   public Short getFmUserGrp()
   {
      return fmUserGrp;
   }

   /**
    * <code>
    * Name=FM-USER-GRP;CSL Type=cslShort;
    * </code>
    */
   public void setFmUserGrp(Short theFmUserGrp)
   {
       fmUserGrp = theFmUserGrp;
   }

   /**
    * <code>
    * Name=FM-USER-NUM;CSL Type=cslInteger;
    * </code>
    */
   public Integer getFmUserNum()
   {
      return fmUserNum;
   }

   /**
    * <code>
    * Name=FM-USER-NUM;CSL Type=cslInteger;
    * </code>
    */
   public void setFmUserNum(Integer theFmUserNum)
   {
       fmUserNum = theFmUserNum;
   }

   /**
    * <code>
    * UpdtTyp is a text String of1 bytes.
    * </code>
    */
   public String getUpdtTyp()
   {
      return updtTyp;
   }

   /**
    * <code>
    * UpdtTyp is a text String of1 bytes.
    * </code>
    */
   public void setUpdtTyp(String theUpdtTyp)
   {
       updtTyp = theUpdtTyp;
   }

   /**
    * <code>
    * StaNum is a text String of4 bytes.
    * </code>
    */
   public String getStaNum()
   {
      return staNum;
   }

   /**
    * <code>
    * StaNum is a text String of4 bytes.
    * </code>
    */
   public void setStaNum(String theStaNum)
   {
       staNum = theStaNum;
   }

   /**
    * <code>
    * Fill1 is a text String of1 bytes.
    * </code>
    */
   public String getFill1()
   {
      return fill1;
   }

   /**
    * <code>
    * Fill1 is a text String of1 bytes.
    * </code>
    */
   public void setFill1(String theFill1)
   {
       fill1 = theFill1;
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
         java.util.Enumeration objects = fmTimestamp.elements(); 
         while (objects.hasMoreElements()) {
            if (index >= maxIndex) break; // write no more than max
            Short toWrite = (Short) objects.nextElement();
         out.writeShort(toWrite.shortValue()); 
            index++;
         }
      }
      out.writeShort(getFmUserGrp().shortValue());
      out.writeInt(getFmUserNum().intValue());
      out.writeString(getUpdtTyp(),1, CSLTypes.PICX);
      out.writeString(getStaNum(),4, CSLTypes.PICX);
      out.writeString(getFill1(),1, CSLTypes.PICX);
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
       fmTimestamp = new java.util.Vector();
         while (index < maxIndex) {
            Short toRead = null;
            toRead = new Short(in.readShort()); 
						            addFmTimestamp(toRead); 
            index++;
         }
      }
      setFmUserGrp(new Short(in.readShort()));
      setFmUserNum(new Integer(in.readInt()));
      setUpdtTyp(in.readString(1));
      setStaNum(in.readString(4));
      setFill1(in.readString(1));
   } 
}
