/*
 * @(#)TermCitySt.java
 * Created by CSL Studio (definition-schema) on 18/08/2016 05:17:02 PM
 */
package csl.globalpay.ipm.msgptdf53req.msgptdf53;
import java.io.IOException;

import com.comforte.csl.cslapi.CSLInputStream;
import com.comforte.csl.cslapi.CSLOutputStream;
import com.comforte.csl.xmlutils.CSLTypes;

/** <code>TermCitySt</code>
 *  
 */
public class	TermCitySt implements com.comforte.csl.cslapi.CSLStreamable
{
   /* Members */
   protected String city;
   protected String st;

   /** <code>TermCitySt</code>
    * Constructor
    * @param characterEncoding this is for setting strings with CSLBaseData
    * here we do not use it!
    */
   public TermCitySt(String characterEncoding)
   {
      setCity(new String());
      setSt(new String());
   }

   /** <code>TermCitySt</code>
    *  Constructor
    */ 
   public TermCitySt()
   {
      this(null);
   }
   /* getter and setter */

   /**
    * <code>
    * City is a text String of13 bytes.
    * </code>
    */
   public String getCity()
   {
      return city;
   }

   /**
    * <code>
    * City is a text String of13 bytes.
    * </code>
    */
   public void setCity(String theCity)
   {
       city = theCity;
   }

   /**
    * <code>
    * St is a text String of3 bytes.
    * </code>
    */
   public String getSt()
   {
      return st;
   }

   /**
    * <code>
    * St is a text String of3 bytes.
    * </code>
    */
   public void setSt(String theSt)
   {
       st = theSt;
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
      out.writeString(getCity(),13, CSLTypes.PICX);
      out.writeString(getSt(),3, CSLTypes.PICX);
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
      setCity(in.readString(13));
      setSt(in.readString(3));
   } 
}
