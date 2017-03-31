/*
 * @(#)SrvInfo.java
 * Created by CSL Studio (definition-schema) on 24/08/2016 10:54:43 AM
 */
package csl.globalpay.ipm.msgprdf5reply.msgprdf;
import java.io.IOException;

import com.comforte.csl.cslapi.CSLInputStream;
import com.comforte.csl.cslapi.CSLOutputStream;
import com.comforte.csl.xmlutils.CSLTypes;

/** <code>SrvInfo</code>
 *  
 */
public class	SrvInfo implements com.comforte.csl.cslapi.CSLStreamable
{
   /* Members */
   protected java.util.Vector srvInfoData;

   /** <code>SrvInfo</code>
    * Constructor
    * @param characterEncoding this is for setting strings with CSLBaseData
    * here we do not use it!
    */
   public SrvInfo(String characterEncoding)
   {
       srvInfoData = new java.util.Vector();
      {
         int maxIndex = 1410;
         for (int i=0; i < maxIndex; i++) {
            addSrvInfoData(new String());
         }
      }
   }

   /** <code>SrvInfo</code>
    *  Constructor
    */ 
   public SrvInfo()
   {
      this(null);
   }
   /* getter and setter */

   /**
    * <code>
    * SrvInfoData is a text String of1 bytes.
    * </code>
    */
   public String[] getSrvInfoData()
   {
       String[] retval = new String[srvInfoData.size()];
       srvInfoData.copyInto(retval);
      return retval; 
   }

   /**
    * <code>
    * SrvInfoData is a text String of1 bytes.
    * </code>
    */
   public void setSrvInfoData(String[] values)
   {
       srvInfoData = new java.util.Vector(values.length);
      for (int i=0; i < values.length; i++) {
         addSrvInfoData(values[i]);
      }
   }

   /**
    * <code>
    * SrvInfoData is a text String of1 bytes.
    * </code>
    */
   public String getSrvInfoData(int i)
   {
      return (String)srvInfoData.elementAt(i);
   }

   /**
    * <code>
    * SrvInfoData is a text String of1 bytes.
    * </code>
    */
   public void setSrvInfoData(int i, String value)
   {
       srvInfoData.setElementAt(value, i);
   }

   /**
    * <code>
    * SrvInfoData is a text String of1 bytes.
    * </code>
    */
   public void addSrvInfoData(String value)
   {
       srvInfoData.addElement(value);
   }

   /**
    * <code>
    * SrvInfoData is a text String of1 bytes.
    * </code>
    */
   public void removeSrvInfoData(String value)
   {
       srvInfoData.removeElement(value);
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
         int maxIndex = 1410;
         int index = 0;
         java.util.Enumeration objects = srvInfoData.elements(); 
         while (objects.hasMoreElements()) {
            if (index >= maxIndex) break; // write no more than max
            String toWrite = (String) objects.nextElement();
         out.writeString(toWrite, 1, CSLTypes.PICX);
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
      {
         int maxIndex = 1410;
         int index = 0;
       srvInfoData = new java.util.Vector();
         while (index < maxIndex) {
            String toRead = null;
            toRead = in.readString(1);
            addSrvInfoData(toRead); 
            index++;
         }
      }
   } 
}
