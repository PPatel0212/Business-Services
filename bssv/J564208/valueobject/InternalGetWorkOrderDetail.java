package be.e1.bssv.J564208.valueobject;

import java.io.Serializable;

import java.util.ArrayList;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class InternalGetWorkOrderDetail extends ValueObject implements Serializable {
  /**
   * Item Number - Short
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: ITM <br>
   * EnterpriseOne field length:  8 <br>
   * EnterpriseOne decimal places: 0 <br>
   */
  private MathNumeric F4801_ITM = null;

  /**
   * Production Number Short
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: PNS <br>
   * EnterpriseOne field length:  10 <br>
   * EnterpriseOne decimal places: 0 <br>
   */
  private MathNumeric F4801T_PNS = null;

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

  public void setF4801_ITM(MathNumeric F4801_ITM) {
    this.F4801_ITM = F4801_ITM;
  }

  public MathNumeric getF4801_ITM() {
    return F4801_ITM;
  }

  public void setF4801T_PNS(MathNumeric F4801T_PNS) {
    this.F4801T_PNS = F4801T_PNS;
  }

  public MathNumeric getF4801T_PNS() {
    return F4801T_PNS;
  }

  public void setF4801T_PMPN(String F4801T_PMPN) {
    this.F4801T_PMPN = F4801T_PMPN;
  }

  public String getF4801T_PMPN() {
    return F4801T_PMPN;
  }

  public void setQueryResults(ArrayList queryResults) {
    if (queryResults != null)
      this.queryResults = queryResults;
  }

  public ArrayList getQueryResults() {
    return queryResults;
  }

  public InternalShowWorkOrderDetail getQueryResults(int i) {
    if (this.getQueryResults() != null && this.getQueryResults().size() > 0) {
      return (InternalShowWorkOrderDetail)queryResults.get(i);
    } else {
      return null;
    }
  }
}
