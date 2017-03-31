/*
 * @(#)MsgHeader.java
 * Created by CSL Studio (definition-schema) on 18/08/2016 05:17:03 PM
 */
package csl.globalpay.ipm.msgptdf53reply.msgptdf53;
import java.io.IOException;

import com.comforte.csl.cslapi.CSLInputStream;
import com.comforte.csl.cslapi.CSLOutputStream;
import com.comforte.csl.xmlutils.CSLTypes;

/** <code>MsgHeader</code>
 *  
 */
public class	MsgHeader implements com.comforte.csl.cslapi.CSLStreamable
{
   /* Members */
   protected Short replCde;
   protected String applCde;
   protected String tranCde;
   protected String termId;
   protected String omfAudit;
   protected String frmtCde;
   protected ErrStatus errStatus;
   protected String lconfName;
   protected String filler;
   protected UserData userData;
   protected String siteProdInd;
   protected String errNum;
   protected String errTxt;

   /** <code>MsgHeader</code>
    * Constructor
    * @param characterEncoding this is for setting strings with CSLBaseData
    * here we do not use it!
    */
   public MsgHeader(String characterEncoding)
   {
      setReplCde(new Short((short)0));
      setApplCde(new String());
      setTranCde(new String());
      setTermId(new String());
      setOmfAudit(new String());
      setFrmtCde(new String());
      setErrStatus(new ErrStatus());
      setLconfName(new String());
      setFiller(new String());
      setUserData(new UserData());
      setSiteProdInd(new String());
      setErrNum(new String());
      setErrTxt(new String());
   }

   /** <code>MsgHeader</code>
    *  Constructor
    */ 
   public MsgHeader()
   {
      this(null);
   }
   /* getter and setter */

   /**
    * <code>
    * Name=REPL-CDE;CSL Type=cslShort;
    * </code>
    */
   public Short getReplCde()
   {
      return replCde;
   }

   /**
    * <code>
    * Name=REPL-CDE;CSL Type=cslShort;
    * </code>
    */
   public void setReplCde(Short theReplCde)
   {
       replCde = theReplCde;
   }

   /**
    * <code>
    * ApplCde is a text String of2 bytes.
    * </code>
    */
   public String getApplCde()
   {
      return applCde;
   }

   /**
    * <code>
    * ApplCde is a text String of2 bytes.
    * </code>
    */
   public void setApplCde(String theApplCde)
   {
       applCde = theApplCde;
   }

   /**
    * <code>
    * TranCde is a numeric String of
							2 digits with 0 decimal places.
    * </code>
    */
   public String getTranCde()
   {
      return tranCde;
   }

   /**
    * <code>
    * TranCde is a numeric String of
							2 digits with 0 decimal places.
    * </code>
    */
   public void setTranCde(String theTranCde)
   {
       tranCde = theTranCde;
   }

   /**
    * <code>
    * TermId is a text String of24 bytes.
    * </code>
    */
   public String getTermId()
   {
      return termId;
   }

   /**
    * <code>
    * TermId is a text String of24 bytes.
    * </code>
    */
   public void setTermId(String theTermId)
   {
       termId = theTermId;
   }

   /**
    * <code>
    * OmfAudit is a text String of1 bytes.
    * </code>
    */
   public String getOmfAudit()
   {
      return omfAudit;
   }

   /**
    * <code>
    * OmfAudit is a text String of1 bytes.
    * </code>
    */
   public void setOmfAudit(String theOmfAudit)
   {
       omfAudit = theOmfAudit;
   }

   /**
    * <code>
    * FrmtCde is a text String of1 bytes.
    * </code>
    */
   public String getFrmtCde()
   {
      return frmtCde;
   }

   /**
    * <code>
    * FrmtCde is a text String of1 bytes.
    * </code>
    */
   public void setFrmtCde(String theFrmtCde)
   {
       frmtCde = theFrmtCde;
   }

   /**
    * <code>
    * Name=ERR-STATUS;
    * </code>
    */
   public ErrStatus getErrStatus()
   {
      return errStatus;
   }

   /**
    * <code>
    * Name=ERR-STATUS;
    * </code>
    */
   public void setErrStatus(ErrStatus theErrStatus)
   {
       errStatus = theErrStatus;
   }

   /**
    * <code>
    * LconfName is a text String of35 bytes.
    * </code>
    */
   public String getLconfName()
   {
      return lconfName;
   }

   /**
    * <code>
    * LconfName is a text String of35 bytes.
    * </code>
    */
   public void setLconfName(String theLconfName)
   {
       lconfName = theLconfName;
   }

   /**
    * <code>
    * Name=FILLER;CSL Type=cslString;
    * </code>
    */
   public String getFiller()
   {
      return filler;
   }

   /**
    * <code>
    * Name=FILLER;CSL Type=cslString;
    * </code>
    */
   public void setFiller(String theFiller)
   {
       filler = theFiller;
   }

   /**
    * <code>
    * Name=USER-DATA;
    * </code>
    */
   public UserData getUserData()
   {
      return userData;
   }

   /**
    * <code>
    * Name=USER-DATA;
    * </code>
    */
   public void setUserData(UserData theUserData)
   {
       userData = theUserData;
   }

   /**
    * <code>
    * SiteProdInd is a text String of32 bytes.
    * </code>
    */
   public String getSiteProdInd()
   {
      return siteProdInd;
   }

   /**
    * <code>
    * SiteProdInd is a text String of32 bytes.
    * </code>
    */
   public void setSiteProdInd(String theSiteProdInd)
   {
       siteProdInd = theSiteProdInd;
   }

   /**
    * <code>
    * ErrNum is a text String of4 bytes.
    * </code>
    */
   public String getErrNum()
   {
      return errNum;
   }

   /**
    * <code>
    * ErrNum is a text String of4 bytes.
    * </code>
    */
   public void setErrNum(String theErrNum)
   {
       errNum = theErrNum;
   }

   /**
    * <code>
    * ErrTxt is a text String of70 bytes.
    * </code>
    */
   public String getErrTxt()
   {
      return errTxt;
   }

   /**
    * <code>
    * ErrTxt is a text String of70 bytes.
    * </code>
    */
   public void setErrTxt(String theErrTxt)
   {
       errTxt = theErrTxt;
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
      out.writeShort(getReplCde().shortValue());
      out.writeString(getApplCde(),2, CSLTypes.PICX);
      help1 =
        com.comforte.csl.model.Util.convertNumStringFromDisplayToTransferFormat(getTranCde(), 2, 0, 0);
      out.writeString(help1, help1.length());
      out.writeString(getTermId(),24, CSLTypes.PICX);
      out.writeString(getOmfAudit(),1, CSLTypes.PICX);
      out.writeString(getFrmtCde(),1, CSLTypes.PICX);
      getErrStatus().write(out);
      out.writeString(getLconfName(),35, CSLTypes.PICX);
      out.writeString(getFiller(),1, CSLTypes.PICX);
      getUserData().write(out);
      out.writeString(getSiteProdInd(),32, CSLTypes.PICX);
      out.writeString(getErrNum(),4, CSLTypes.PICX);
      out.writeString(getErrTxt(),70, CSLTypes.PICX);
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
      setReplCde(new Short(in.readShort()));
      setApplCde(in.readString(2));
      help1 = in.readString(2);
      help2 =
         com.comforte.csl.model.Util.convertNumStringFromTransferToDisplayFormat(help1, 2, 0, 0);
      setTranCde(help2);
      setTermId(in.readString(24));
      setOmfAudit(in.readString(1));
      setFrmtCde(in.readString(1));
      getErrStatus().read(in);
      setLconfName(in.readString(35));
      setFiller(in.readString(1));
      getUserData().read(in);
      setSiteProdInd(in.readString(32));
      setErrNum(in.readString(4));
      setErrTxt(in.readString(70));
   } 
}
