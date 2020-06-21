package be.e1.bssv.J563106.valueobject;

import java.io.Serializable;

import java.util.ArrayList;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class InternalGetSerialNo extends ValueObject implements Serializable {
  /**
   * 2nd Item Number
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: LITM <br>
   * EnterpriseOne field length:  25 <br>
   */
  private String F4801_LITM = null;

  /**
   * Production Number
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: PMPN <br>
   * EnterpriseOne field length:  30 <br>
   */
  private String F4801T_PMPN = null;
  private ArrayList queryResults = null;

  public void setF4801_LITM(String F4801_LITM) {
    this.F4801_LITM = F4801_LITM;
  }

  public String getF4801_LITM() {
    return F4801_LITM;
  }

  public void setF4801T_PMPN(String F4801T_PMPN) {
    this.F4801T_PMPN = F4801T_PMPN;
  }

  public String getF4801T_PMPN() {
    return F4801T_PMPN;
  }

  public void setQueryResults(ArrayList queryResults) {
    this.queryResults = queryResults;
  }

  public ArrayList getQueryResults() {
    return queryResults;
  }
public InternalShowSerialNo getQueryResults(int i) {
    return (InternalShowSerialNo)queryResults.get(i);
  }
}
