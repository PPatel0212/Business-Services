package be.e1.bssv.util.J560000.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class SupDataF4211_D5600007C extends ValueObject implements Serializable
{
  /**
   * J.D. EnterpriseOne Event Point 01
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: EV01 <br>
   * EnterpriseOne field length:  1 <br>
   */
  private String cActionCode = null;

  /**
   * Order Company (Order Number)
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: KCOO <br>
   * EnterpriseOne field length:  5 <br>
   */
  private String szOrderCompanySO = null;

  /**
   * Document (Order No, Invoice, etc.)
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: DOCO <br>
   * EnterpriseOne field length:  8 <br>
   * EnterpriseOne decimal places: 0 <br>
   */
  private MathNumeric mnOrderNumberSO = null;

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
  private String szOrderTypeSO = null;

  /**
   * Line Number
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: LNID <br>
   * EnterpriseOne field length:  6 <br>
   * EnterpriseOne decimal places: 3 <br>
   */
  private MathNumeric mnOrderLineSO = null;

  /**
   * User ID
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: USER <br>
   * EnterpriseOne field length:  10 <br>
   */
  private String szAuditUser = null;

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
  private String szAuditProgram = null;

  /**
   * Error Code
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: ERRC <br>
   * EnterpriseOne field length:  1 <br>
   */
  private String cErrorFlag = null;

  /**
   * Description
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: DS01 <br>
   * EnterpriseOne field length:  80 <br>
   */
  private String szErrorMessage = null;

  /**
   * Item Revision Level
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: MERL <br>
   * EnterpriseOne field length:  3 <br>
   */
  private String szRevisionLevel = null;

  public void setCActionCode(String cActionCode)
  {
    this.cActionCode = cActionCode;
  }

  public String getCActionCode()
  {
    return cActionCode;
  }

  public void setSzOrderCompanySO(String szOrderCompanySO)
  {
    this.szOrderCompanySO = szOrderCompanySO;
  }

  public String getSzOrderCompanySO()
  {
    return szOrderCompanySO;
  }

  public void setMnOrderNumberSO(MathNumeric mnOrderNumberSO)
  {
    this.mnOrderNumberSO = mnOrderNumberSO;
  }

  public MathNumeric getMnOrderNumberSO()
  {
    return mnOrderNumberSO;
  }

  public void setSzOrderTypeSO(String szOrderTypeSO)
  {
    this.szOrderTypeSO = szOrderTypeSO;
  }

  public String getSzOrderTypeSO()
  {
    return szOrderTypeSO;
  }

  public void setMnOrderLineSO(MathNumeric mnOrderLineSO)
  {
    this.mnOrderLineSO = mnOrderLineSO;
  }

  public MathNumeric getMnOrderLineSO()
  {
    return mnOrderLineSO;
  }

  public void setSzAuditUser(String szAuditUser)
  {
    this.szAuditUser = szAuditUser;
  }

  public String getSzAuditUser()
  {
    return szAuditUser;
  }

  public void setSzAuditProgram(String szAuditProgram)
  {
    this.szAuditProgram = szAuditProgram;
  }

  public String getSzAuditProgram()
  {
    return szAuditProgram;
  }

  public void setCErrorFlag(String cErrorFlag)
  {
    this.cErrorFlag = cErrorFlag;
  }

  public String getCErrorFlag()
  {
    return cErrorFlag;
  }

  public void setSzErrorMessage(String szErrorMessage)
  {
    this.szErrorMessage = szErrorMessage;
  }

  public String getSzErrorMessage()
  {
    return szErrorMessage;
  }

  public void setSzRevisionLevel(String szRevisionLevel)
  {
    this.szRevisionLevel = szRevisionLevel;
  }

  public String getSzRevisionLevel()
  {
    return szRevisionLevel;
  }
}
