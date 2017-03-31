/*
 * @(#)Afs.java
 * Created by CSL Studio (definition-schema) on 18/08/2016 05:17:02 PM
 */
package csl.globalpay.ipm.msgptdf53req.msgptdf53;
import java.io.IOException;

import com.comforte.csl.cslapi.CSLInputStream;
import com.comforte.csl.cslapi.CSLOutputStream;
import com.comforte.csl.xmlutils.CSLTypes;

/** <code>Afs</code>
 *  
 */
public class	Afs implements com.comforte.csl.cslapi.CSLStreamable
{
   /* Members */
   protected String srvMode;

   /** <code>Afs</code>
    * Constructor
    * @param characterEncoding this is for setting strings with CSLBaseData
    * here we do not use it!
    */
   public Afs(String characterEncoding)
   {
      setSrvMode(new String());
   }

   /** <code>Afs</code>
    *  Constructor
    */ 
   public Afs()
   {
      this(null);
   }
   /* getter and setter */

   /**
    * <code>
    * SrvMode is a text String of1 bytes.
    * </code>
    */
   public String getSrvMode()
   {
      return srvMode;
   }

   /**
    * <code>
    * SrvMode is a text String of1 bytes.
    * </code>
    */
   public void setSrvMode(String theSrvMode)
   {
       srvMode = theSrvMode;
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
      out.writeString(getSrvMode(),1, CSLTypes.PICX);
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
      setSrvMode(in.readString(1));
   } 
}
