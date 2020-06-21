package be.e1.bssv.J563106.valueobject;

import java.io.Serializable;

import java.util.ArrayList;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class InternalGetSalesDetails extends ValueObject implements Serializable {
  /**
   * Document (Order No, Invoice, etc.)
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: true <br>
   * EnterpriseOne Alias: DOCO <br>
   * EnterpriseOne field length:  8 <br>
   * EnterpriseOne decimal places: 0 <br>
   */
  private MathNumeric F4211_DOCO = null;

  /**
   * Order Type
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: true <br>
   * EnterpriseOne Alias: DCTO <br>
   * EnterpriseOne field length:  2 <br>
   * EnterpriseOne User Defined Code: 00/DT <br>
   */
  private String F4211_DCTO = null;

  /**
   * Business Unit
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: true <br>
   * EnterpriseOne Alias: MCU <br>
   * EnterpriseOne field length:  12 <br>
   */
  private String F4211_MCU = null;

  /**
   * Production Number
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: PMPN <br>
   * EnterpriseOne field length:  30 <br>
   */
  private String F4211_PMPN = null;

  /**
   * 2nd Item Number
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: true <br>
   * EnterpriseOne Alias: LITM <br>
   * EnterpriseOne field length:  25 <br>
   */
  private String F4211_LITM = null;
  
  private ArrayList queryResults = null;

  public void setF4211_DOCO(MathNumeric F4211_DOCO) {
    this.F4211_DOCO = F4211_DOCO;
  }

  public MathNumeric getF4211_DOCO() {
    return F4211_DOCO;
  }

  public void setF4211_DCTO(String F4211_DCTO) {
    this.F4211_DCTO = F4211_DCTO;
  }

  public String getF4211_DCTO() {
    return F4211_DCTO;
  }

  public void setF4211_MCU(String F4211_MCU) {
    this.F4211_MCU = F4211_MCU;
  }

  public String getF4211_MCU() {
    return F4211_MCU;
  }

  public void setF4211_PMPN(String F4211_PMPN) {
    this.F4211_PMPN = F4211_PMPN;
  }

  public String getF4211_PMPN() {
    return F4211_PMPN;
  }

  public void setF4211_LITM(String F4211_LITM) {
    this.F4211_LITM = F4211_LITM;
  }

  public String getF4211_LITM() {
    return F4211_LITM;
  }

  public void setQueryResults(ArrayList queryResults) {
    this.queryResults = queryResults;
  }

  public ArrayList getQueryResults() {
    return queryResults;
  }
public InternalShowSalesDetails getQueryResults(int i) {
    return (InternalShowSalesDetails)queryResults.get(i);
  }
}
