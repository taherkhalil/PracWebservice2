/*
 * @(#)Akey.java
 * Created by CSL Studio (definition-schema) on 24/08/2016 10:54:43 AM
 */
package csl.globalpay.ipm.msgprdf5req.msgprdf;
import java.io.IOException;

import com.comforte.csl.cslapi.CSLInputStream;
import com.comforte.csl.cslapi.CSLOutputStream;
import com.comforte.csl.xmlutils.CSLTypes;

/** <code>Akey</code>
 *  
 */
public class	Akey implements com.comforte.csl.cslapi.CSLStreamable
{
   /* Members */
   protected String grp;
   protected String regn;

   /** <code>Akey</code>
    * Constructor
    * @param characterEncoding this is for setting strings with CSLBaseData
    * here we do not use it!
    */
   public Akey(String characterEncoding)
   {
      setGrp(new String());
      setRegn(new String());
   }

   /** <code>Akey</code>
    *  Constructor
    */ 
   public Akey()
   {
      this(null);
   }
   /* getter and setter */

   /**
    * <code>
    * Grp is a text String of4 bytes.
    * </code>
    */
   public String getGrp()
   {
      return grp;
   }

   /**
    * <code>
    * Grp is a text String of4 bytes.
    * </code>
    */
   public void setGrp(String theGrp)
   {
       grp = theGrp;
   }

   /**
    * <code>
    * Regn is a text String of4 bytes.
    * </code>
    */
   public String getRegn()
   {
      return regn;
   }

   /**
    * <code>
    * Regn is a text String of4 bytes.
    * </code>
    */
   public void setRegn(String theRegn)
   {
       regn = theRegn;
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
      out.writeString(getGrp(),4, CSLTypes.PICX);
      out.writeString(getRegn(),4, CSLTypes.PICX);
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
      setGrp(in.readString(4));
      setRegn(in.readString(4));
   } 
}
