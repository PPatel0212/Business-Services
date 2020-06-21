package be.e1.bssv.J564203.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class InternalNonCompliantOrders
  extends ValueObject
  implements Serializable
{
  /**
   * Unique Key ID (Internal)
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: UKID <br>
   * EnterpriseOne field length:  15 <br>
   * EnterpriseOne decimal places: 0 <br>
   */
  private MathNumeric mnTransactionID = null;

  /**
   * Order Company (Order Number)
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: KCOO <br>
   * EnterpriseOne field length:  5 <br>
   */
  private String szOrderCompany = null;

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
  private MathNumeric mnOrderNumber = null;

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
  private String szOrderType = null;

  /**
   * Message Center Detail
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: MCDTL <br>
   * EnterpriseOne field length:  500 <br>
   */
  private String szStatusMessage = null;
  
  private String cProcessedFlag = null;

  public void setMnTransactionID(MathNumeric mnTransactionID)
  {
    this.mnTransactionID = mnTransactionID;
  }

  public MathNumeric getMnTransactionID()
  {
    return mnTransactionID;
  }

  public void setSzOrderCompany(String szOrderCompany)
  {
    this.szOrderCompany = szOrderCompany;
  }

  public String getSzOrderCompany()
  {
    return szOrderCompany;
  }

  public void setMnOrderNumber(MathNumeric mnOrderNumber)
  {
    this.mnOrderNumber = mnOrderNumber;
  }

  public MathNumeric getMnOrderNumber()
  {
    return mnOrderNumber;
  }

  public void setSzOrderType(String szOrderType)
  {
    this.szOrderType = szOrderType;
  }

  public String getSzOrderType()
  {
    return szOrderType;
  }

  public void setSzStatusMessage(String szStatusMessage)
  {
    this.szStatusMessage = szStatusMessage;
  }

  public String getSzStatusMessage()
  {
    return szStatusMessage;
  }

    public void setCProcessedFlag(String cProcessedFlag) {
        this.cProcessedFlag = cProcessedFlag;
    }

    public String getCProcessedFlag() {
        return cProcessedFlag;
    }
}
