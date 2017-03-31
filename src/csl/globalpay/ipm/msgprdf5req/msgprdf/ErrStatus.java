/*
 * @(#)ErrStatus.java
 * Created by CSL Studio (definition-schema) on 24/08/2016 10:54:42 AM
 */
package csl.globalpay.ipm.msgprdf5req.msgprdf;
import java.io.IOException;

import com.comforte.csl.cslapi.CSLInputStream;
import com.comforte.csl.cslapi.CSLOutputStream;

/** <code>ErrStatus</code>
 *  
 */
public class	ErrStatus implements com.comforte.csl.cslapi.CSLStreamable
{
   /* Members */
   protected Short errCde;
   protected Short errSubCde;

   /** <code>ErrStatus</code>
    * Constructor
    * @param characterEncoding this is for setting strings with CSLBaseData
    * here we do not use it!
    */
   public ErrStatus(String characterEncoding)
   {
      setErrCde(new Short((short)0));
      setErrSubCde(new Short((short)0));
   }

   /** <code>ErrStatus</code>
    *  Constructor
    */ 
   public ErrStatus()
   {
      this(null);
   }
   /* getter and setter */

   /**
    * <code>
    * Name=ERR-CDE;CSL Type=cslShort;
    * </code>
    */
   public Short getErrCde()
   {
      return errCde;
   }

   /**
    * <code>
    * Name=ERR-CDE;CSL Type=cslShort;
    * </code>
    */
   public void setErrCde(Short theErrCde)
   {
       errCde = theErrCde;
   }

   /**
    * <code>
    * Name=ERR-SUB-CDE;CSL Type=cslShort;
    * </code>
    */
   public Short getErrSubCde()
   {
      return errSubCde;
   }

   /**
    * <code>
    * Name=ERR-SUB-CDE;CSL Type=cslShort;
    * </code>
    */
   public void setErrSubCde(Short theErrSubCde)
   {
       errSubCde = theErrSubCde;
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
      out.writeShort(getErrCde().shortValue());
      out.writeShort(getErrSubCde().shortValue());
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
      setErrCde(new Short(in.readShort()));
      setErrSubCde(new Short(in.readShort()));
   } 
}
