package be.e1.bssv.J563106.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class InternalGetStockingType extends ValueObject implements Serializable {
  /**
   * Suppress Error Message
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: SUPPS <br>
   * EnterpriseOne field length:  1 <br>
   */
  private String cSuppressErrorMessage = null;

  /**
   * Error Code
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: ERRC <br>
   * EnterpriseOne field length:  1 <br>
   */
  private String cErrorCode = null;

  /**
   * Item Number - Short
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: ITM <br>
   * EnterpriseOne field length:  8 <br>
   * EnterpriseOne decimal places: 0 <br>
   */
  private MathNumeric mnIdentifierShortItem = null;

  /**
   * Business Unit
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: MCU <br>
   * EnterpriseOne field length:  12 <br>
   */
  private String szCostCenter = null;

  /**
   * Stocking Type
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: STKT <br>
   * EnterpriseOne field length:  1 <br>
   * EnterpriseOne User Defined Code: 41/I <br>
   */
  private String cStockingType = null;
  /**
   * Serial No Required YN
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: SRNR <br>
   * EnterpriseOne field length:  1 <br>
   *
   */
  
  private String cSerialNoRequiredYN = null;

  public void setCSuppressErrorMessage(String cSuppressErrorMessage) {
    this.cSuppressErrorMessage = cSuppressErrorMessage;
  }

  public String getCSuppressErrorMessage() {
    return cSuppressErrorMessage;
  }

  public void setCErrorCode(String cErrorCode) {
    this.cErrorCode = cErrorCode;
  }

  public String getCErrorCode() {
    return cErrorCode;
  }

  public void setMnIdentifierShortItem(MathNumeric mnIdentifierShortItem) {
    this.mnIdentifierShortItem = mnIdentifierShortItem;
  }

  public MathNumeric getMnIdentifierShortItem() {
    return mnIdentifierShortItem;
  }

  public void setSzCostCenter(String szCostCenter) {
    this.szCostCenter = szCostCenter;
  }

  public String getSzCostCenter() {
    return szCostCenter;
  }

  public void setCStockingType(String cStockingType) {
    this.cStockingType = cStockingType;
  }

  public String getCStockingType() {
    return cStockingType;
  }

  public void setCSerialNoRequiredYN(String cSerialNoRequiredYN) {
    this.cSerialNoRequiredYN = cSerialNoRequiredYN;
  }

  public String getCSerialNoRequiredYN() {
    return cSerialNoRequiredYN;
  }
}
