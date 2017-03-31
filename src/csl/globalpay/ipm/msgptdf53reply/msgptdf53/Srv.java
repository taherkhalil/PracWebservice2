/*
 * @(#)Srv.java
 * Created by CSL Studio (definition-schema) on 18/08/2016 05:17:03 PM
 */
package csl.globalpay.ipm.msgptdf53reply.msgptdf53;
import java.io.IOException;

import com.comforte.csl.cslapi.CSLInputStream;
import com.comforte.csl.cslapi.CSLOutputStream;
import com.comforte.csl.xmlutils.CSLTypes;

/** <code>Srv</code>
 *  
 */
public class	Srv implements com.comforte.csl.cslapi.CSLStreamable
{
   /* Members */
   protected String typ;
   protected Integer npFlrLmt;
   protected Integer caFlrLmt;
   protected Integer moFlrLmt;
   protected Integer tranLmt;
   protected String tranProfile;
   protected String elecFollowup;

   /** <code>Srv</code>
    * Constructor
    * @param characterEncoding this is for setting strings with CSLBaseData
    * here we do not use it!
    */
   public Srv(String characterEncoding)
   {
      setTyp(new String());
      setNpFlrLmt(new Integer(0));
      setCaFlrLmt(new Integer(0));
      setMoFlrLmt(new Integer(0));
      setTranLmt(new Integer(0));
      setTranProfile(new String());
      setElecFollowup(new String());
   }

   /** <code>Srv</code>
    *  Constructor
    */ 
   public Srv()
   {
      this(null);
   }
   /* getter and setter */

   /**
    * <code>
    * Typ is a text String of2 bytes.
    * </code>
    */
   public String getTyp()
   {
      return typ;
   }

   /**
    * <code>
    * Typ is a text String of2 bytes.
    * </code>
    */
   public void setTyp(String theTyp)
   {
       typ = theTyp;
   }

   /**
    * <code>
    * Name=NP-FLR-LMT;CSL Type=cslInteger;
    * </code>
    */
   public Integer getNpFlrLmt()
   {
      return npFlrLmt;
   }

   /**
    * <code>
    * Name=NP-FLR-LMT;CSL Type=cslInteger;
    * </code>
    */
   public void setNpFlrLmt(Integer theNpFlrLmt)
   {
       npFlrLmt = theNpFlrLmt;
   }

   /**
    * <code>
    * Name=CA-FLR-LMT;CSL Type=cslInteger;
    * </code>
    */
   public Integer getCaFlrLmt()
   {
      return caFlrLmt;
   }

   /**
    * <code>
    * Name=CA-FLR-LMT;CSL Type=cslInteger;
    * </code>
    */
   public void setCaFlrLmt(Integer theCaFlrLmt)
   {
       caFlrLmt = theCaFlrLmt;
   }

   /**
    * <code>
    * Name=MO-FLR-LMT;CSL Type=cslInteger;
    * </code>
    */
   public Integer getMoFlrLmt()
   {
      return moFlrLmt;
   }

   /**
    * <code>
    * Name=MO-FLR-LMT;CSL Type=cslInteger;
    * </code>
    */
   public void setMoFlrLmt(Integer theMoFlrLmt)
   {
       moFlrLmt = theMoFlrLmt;
   }

   /**
    * <code>
    * Name=TRAN-LMT;CSL Type=cslInteger;
    * </code>
    */
   public Integer getTranLmt()
   {
      return tranLmt;
   }

   /**
    * <code>
    * Name=TRAN-LMT;CSL Type=cslInteger;
    * </code>
    */
   public void setTranLmt(Integer theTranLmt)
   {
       tranLmt = theTranLmt;
   }

   /**
    * <code>
    * TranProfile is a text String of1 bytes.
    * </code>
    */
   public String getTranProfile()
   {
      return tranProfile;
   }

   /**
    * <code>
    * TranProfile is a text String of1 bytes.
    * </code>
    */
   public void setTranProfile(String theTranProfile)
   {
       tranProfile = theTranProfile;
   }

   /**
    * <code>
    * ElecFollowup is a text String of1 bytes.
    * </code>
    */
   public String getElecFollowup()
   {
      return elecFollowup;
   }

   /**
    * <code>
    * ElecFollowup is a text String of1 bytes.
    * </code>
    */
   public void setElecFollowup(String theElecFollowup)
   {
       elecFollowup = theElecFollowup;
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
      out.writeString(getTyp(),2, CSLTypes.PICX);
      out.writeInt(getNpFlrLmt().intValue());
      out.writeInt(getCaFlrLmt().intValue());
      out.writeInt(getMoFlrLmt().intValue());
      out.writeInt(getTranLmt().intValue());
      out.writeString(getTranProfile(),1, CSLTypes.PICX);
      out.writeString(getElecFollowup(),1, CSLTypes.PICX);
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
      setTyp(in.readString(2));
      setNpFlrLmt(new Integer(in.readInt()));
      setCaFlrLmt(new Integer(in.readInt()));
      setMoFlrLmt(new Integer(in.readInt()));
      setTranLmt(new Integer(in.readInt()));
      setTranProfile(in.readString(1));
      setElecFollowup(in.readString(1));
   } 
}
