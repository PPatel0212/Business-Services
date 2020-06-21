package be.e1.bssv.J564800.valueobject;

import java.io.Serializable;

import java.util.Date;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class WOMPSTag_D5648007 extends ValueObject implements Serializable
{
  /**
   * Document (Order No, Invoice, etc.)
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: true <br>
   * EnterpriseOne Alias: DOCO <br>
   * EnterpriseOne field length:  8 <br>
   * EnterpriseOne decimal places: 0 <br>
   */
  private MathNumeric mnWONumber_DOCO = null;

  /**
   * Order Type
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: DCTO <br>
   * EnterpriseOne field length:  2 <br>
   * EnterpriseOne User Defined Code: 00/DT <br>
   */
  private String szWOType_DCTO = null;

  /**
   * Indicators 08
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: ET08 <br>
   * EnterpriseOne field length:  1 <br>
   */
  private String cFlags008_ET08 = null;

  /**
   * Assembly Quantity Change Indicator
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: Z56AQCI <br>
   * EnterpriseOne field length:  1 <br>
   */
  private String cAsmblyQtyChgInd_Z56AQCI = null;

  /**
   * SO Change Indicator
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: Z56SOCI <br>
   * EnterpriseOne field length:  1 <br>
   */
  private String cSoChgInd_Z56SOCI = null;

  /**
   * Request Date Change Indicator
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: Z56RDCI <br>
   * EnterpriseOne field length:  1 <br>
   */
  private String cReqDateChgInd_Z56RDCI = null;

  /**
   * Cancel Date Change Indicator
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: Z56CDCI <br>
   * EnterpriseOne field length:  1 <br>
   */
  private String cCncllDateChgInd_Z56CDI = null;

  /**
   * Pick Date Change Indicator
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: Z56PDCI <br>
   * EnterpriseOne field length:  1 <br>
   */
  private String cPickDateChgInd_Z56PDCI = null;

  /**
   * Next Status Change Indicator
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: Z56NSCI <br>
   * EnterpriseOne field length:  1 <br>
   */
  private String cSONxtStChgInd_Z56NSCI = null;

  /**
   * Pick Date Request Indicator
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: Z56PDI <br>
   * EnterpriseOne field length:  1 <br>
   */
  private String cPickDateReqInd_Z56PDI = null;

  /**
   * Error Code
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: ERRC <br>
   * EnterpriseOne field length:  1 <br>
   */
  private String cErrorCode_ERRC = null;

  /**
   * Workflow Transport Data
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: TRANDATA <br>
   * EnterpriseOne field length:  1024 <br>
   */
  private String szErrorMessage_TRANDATA = null;

  /**
   * Description 10
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: DL010 <br>
   * EnterpriseOne field length:  50 <br>
   */
  private String szBSSVRequestID_DL010 = null;

  /**
   * Program ID
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: PID <br>
   * EnterpriseOne field length:  10 <br>
   * EnterpriseOne Edit Rule:CHKOBJ <br>
   */
  private String szProgramId_PID = null;

  /**
   * Work Station ID
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: JOBN <br>
   * EnterpriseOne field length:  10 <br>
   */
  private String szWorkStationId_JOBN = null;

  /**
   * User ID
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: USER <br>
   * EnterpriseOne field length:  10 <br>
   */
  private String szUserId_USER = null;

  /**
   * Date - Updated
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: UPMJ <br>
   * EnterpriseOne field length:  6 <br>
   */
  private Date jdDateUpdated_UPMJ = null;

  /**
   * Time - Last Updated
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: UPMT <br>
   * EnterpriseOne field length:  6 <br>
   * EnterpriseOne decimal places: 0 <br>
   */
  private MathNumeric mnTimeLastUpdated_UPMT = null;

  public void setMnWONumber_DOCO(MathNumeric mnWONumber_DOCO)
  {
    this.mnWONumber_DOCO = mnWONumber_DOCO;
  }

  public MathNumeric getMnWONumber_DOCO()
  {
    return mnWONumber_DOCO;
  }

  public void setSzWOType_DCTO(String szWOType_DCTO)
  {
    this.szWOType_DCTO = szWOType_DCTO;
  }

  public String getSzWOType_DCTO()
  {
    return szWOType_DCTO;
  }

  public void setCFlags008_ET08(String cFlags008_ET08)
  {
    this.cFlags008_ET08 = cFlags008_ET08;
  }

  public String getCFlags008_ET08()
  {
    return cFlags008_ET08;
  }

  public void setCAsmblyQtyChgInd_Z56AQCI(String cAsmblyQtyChgInd_Z56AQCI)
  {
    this.cAsmblyQtyChgInd_Z56AQCI = cAsmblyQtyChgInd_Z56AQCI;
  }

  public String getCAsmblyQtyChgInd_Z56AQCI()
  {
    return cAsmblyQtyChgInd_Z56AQCI;
  }

  public void setCSoChgInd_Z56SOCI(String cSoChgInd_Z56SOCI)
  {
    this.cSoChgInd_Z56SOCI = cSoChgInd_Z56SOCI;
  }

  public String getCSoChgInd_Z56SOCI()
  {
    return cSoChgInd_Z56SOCI;
  }

  public void setCReqDateChgInd_Z56RDCI(String cReqDateChgInd_Z56RDCI)
  {
    this.cReqDateChgInd_Z56RDCI = cReqDateChgInd_Z56RDCI;
  }

  public String getCReqDateChgInd_Z56RDCI()
  {
    return cReqDateChgInd_Z56RDCI;
  }

  public void setCCncllDateChgInd_Z56CDI(String cCncllDateChgInd_Z56CDI)
  {
    this.cCncllDateChgInd_Z56CDI = cCncllDateChgInd_Z56CDI;
  }

  public String getCCncllDateChgInd_Z56CDI()
  {
    return cCncllDateChgInd_Z56CDI;
  }

  public void setCPickDateChgInd_Z56PDCI(String cPickDateChgInd_Z56PDCI)
  {
    this.cPickDateChgInd_Z56PDCI = cPickDateChgInd_Z56PDCI;
  }

  public String getCPickDateChgInd_Z56PDCI()
  {
    return cPickDateChgInd_Z56PDCI;
  }

  public void setCSONxtStChgInd_Z56NSCI(String cSONxtStChgInd_Z56NSCI)
  {
    this.cSONxtStChgInd_Z56NSCI = cSONxtStChgInd_Z56NSCI;
  }

  public String getCSONxtStChgInd_Z56NSCI()
  {
    return cSONxtStChgInd_Z56NSCI;
  }

  public void setCPickDateReqInd_Z56PDI(String cPickDateReqInd_Z56PDI)
  {
    this.cPickDateReqInd_Z56PDI = cPickDateReqInd_Z56PDI;
  }

  public String getCPickDateReqInd_Z56PDI()
  {
    return cPickDateReqInd_Z56PDI;
  }

  public void setCErrorCode_ERRC(String cErrorCode_ERRC)
  {
    this.cErrorCode_ERRC = cErrorCode_ERRC;
  }

  public String getCErrorCode_ERRC()
  {
    return cErrorCode_ERRC;
  }

  public void setSzErrorMessage_TRANDATA(String szErrorMessage_TRANDATA)
  {
    this.szErrorMessage_TRANDATA = szErrorMessage_TRANDATA;
  }

  public String getSzErrorMessage_TRANDATA()
  {
    return szErrorMessage_TRANDATA;
  }

  public void setSzBSSVRequestID_DL010(String szBSSVRequestID_DL010)
  {
    this.szBSSVRequestID_DL010 = szBSSVRequestID_DL010;
  }

  public String getSzBSSVRequestID_DL010()
  {
    return szBSSVRequestID_DL010;
  }

  public void setSzProgramId_PID(String szProgramId_PID)
  {
    this.szProgramId_PID = szProgramId_PID;
  }

  public String getSzProgramId_PID()
  {
    return szProgramId_PID;
  }

  public void setSzWorkStationId_JOBN(String szWorkStationId_JOBN)
  {
    this.szWorkStationId_JOBN = szWorkStationId_JOBN;
  }

  public String getSzWorkStationId_JOBN()
  {
    return szWorkStationId_JOBN;
  }

  public void setSzUserId_USER(String szUserId_USER)
  {
    this.szUserId_USER = szUserId_USER;
  }

  public String getSzUserId_USER()
  {
    return szUserId_USER;
  }

  public void setJdDateUpdated_UPMJ(Date jdDateUpdated_UPMJ)
  {
    this.jdDateUpdated_UPMJ = jdDateUpdated_UPMJ;
  }

  public Date getJdDateUpdated_UPMJ()
  {
    return jdDateUpdated_UPMJ;
  }

  public void setMnTimeLastUpdated_UPMT(MathNumeric mnTimeLastUpdated_UPMT)
  {
    this.mnTimeLastUpdated_UPMT = mnTimeLastUpdated_UPMT;
  }

  public MathNumeric getMnTimeLastUpdated_UPMT()
  {
    return mnTimeLastUpdated_UPMT;
  }
}
