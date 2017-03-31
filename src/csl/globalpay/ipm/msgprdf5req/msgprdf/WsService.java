/*
 * @(#)WsService.java
 * Created by CSL Studio (definition-schema) on 24/08/2016 10:54:43 AM
 */
package csl.globalpay.ipm.msgprdf5req.msgprdf;
import java.io.IOException;

import com.comforte.csl.cslapi.CSLInputStream;
import com.comforte.csl.cslapi.CSLOutputStream;

/** <code>WsService</code>
 *  
 */
public class	WsService implements com.comforte.csl.cslapi.CSLStreamable
{
   /* Members */
   protected java.util.Vector wsService1;
   protected java.util.Vector wsService2;

   /** <code>WsService</code>
    * Constructor
    * @param characterEncoding this is for setting strings with CSLBaseData
    * here we do not use it!
    */
   public WsService(String characterEncoding)
   {
       wsService1 = new java.util.Vector();
      {
         int maxIndex = 15;
         for (int i=0; i < maxIndex; i++) {
            addWsService1(new WsService1());
         }
      }
       wsService2 = new java.util.Vector();
      {
         int maxIndex = 15;
         for (int i=0; i < maxIndex; i++) {
            addWsService2(new WsService2());
         }
      }
   }

   /** <code>WsService</code>
    *  Constructor
    */ 
   public WsService()
   {
      this(null);
   }
   /* getter and setter */

   /**
    * <code>
    * Name=WS-SERVICE-1;
    * </code>
    */
   public WsService1[] getWsService1()
   {
       WsService1[] retval = new WsService1[wsService1.size()];
       wsService1.copyInto(retval);
      return retval; 
   }

   /**
    * <code>
    * Name=WS-SERVICE-1;
    * </code>
    */
   public void setWsService1(WsService1[] values)
   {
       wsService1 = new java.util.Vector(values.length);
      for (int i=0; i < values.length; i++) {
         addWsService1(values[i]);
      }
   }

   /**
    * <code>
    * Name=WS-SERVICE-1;
    * </code>
    */
   public WsService1 getWsService1(int i)
   {
      return (WsService1)wsService1.elementAt(i);
   }

   /**
    * <code>
    * Name=WS-SERVICE-1;
    * </code>
    */
   public void setWsService1(int i, WsService1 value)
   {
       wsService1.setElementAt(value, i);
   }

   /**
    * <code>
    * Name=WS-SERVICE-1;
    * </code>
    */
   public void addWsService1(WsService1 value)
   {
       wsService1.addElement(value);
   }

   /**
    * <code>
    * Name=WS-SERVICE-1;
    * </code>
    */
   public void removeWsService1(WsService1 value)
   {
       wsService1.removeElement(value);
   }

   /**
    * <code>
    * Name=WS-SERVICE-2;
    * </code>
    */
   public WsService2[] getWsService2()
   {
       WsService2[] retval = new WsService2[wsService2.size()];
       wsService2.copyInto(retval);
      return retval; 
   }

   /**
    * <code>
    * Name=WS-SERVICE-2;
    * </code>
    */
   public void setWsService2(WsService2[] values)
   {
       wsService2 = new java.util.Vector(values.length);
      for (int i=0; i < values.length; i++) {
         addWsService2(values[i]);
      }
   }

   /**
    * <code>
    * Name=WS-SERVICE-2;
    * </code>
    */
   public WsService2 getWsService2(int i)
   {
      return (WsService2)wsService2.elementAt(i);
   }

   /**
    * <code>
    * Name=WS-SERVICE-2;
    * </code>
    */
   public void setWsService2(int i, WsService2 value)
   {
       wsService2.setElementAt(value, i);
   }

   /**
    * <code>
    * Name=WS-SERVICE-2;
    * </code>
    */
   public void addWsService2(WsService2 value)
   {
       wsService2.addElement(value);
   }

   /**
    * <code>
    * Name=WS-SERVICE-2;
    * </code>
    */
   public void removeWsService2(WsService2 value)
   {
       wsService2.removeElement(value);
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
         int maxIndex = 15;
         int index = 0;
         java.util.Enumeration objects = wsService1.elements(); 
         while (objects.hasMoreElements()) {
            if (index >= maxIndex) break; // write no more than max
            WsService1 toWrite = (WsService1) objects.nextElement();
            toWrite.write(out);
            index++;
         }
      }
      {
         int maxIndex = 15;
         int index = 0;
         java.util.Enumeration objects = wsService2.elements(); 
         while (objects.hasMoreElements()) {
            if (index >= maxIndex) break; // write no more than max
            WsService2 toWrite = (WsService2) objects.nextElement();
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
      {
         int maxIndex = 15;
         int index = 0;
       wsService1 = new java.util.Vector();
         while (index < maxIndex) {
            WsService1 toRead = new WsService1();
            toRead.read(in);
            addWsService1(toRead); 
            index++;
         }
      }
      {
         int maxIndex = 15;
         int index = 0;
       wsService2 = new java.util.Vector();
         while (index < maxIndex) {
            WsService2 toRead = new WsService2();
            toRead.read(in);
            addWsService2(toRead); 
            index++;
         }
      }
   } 
}
