package be.e1.bssv.J560010.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class InternalGetNextItemNumber extends ValueObject implements Serializable {
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
  private MathNumeric mnIdentifiershortitem = null;

  public void setMnIdentifiershortitem(MathNumeric mnIdentifiershortitem) {
    this.mnIdentifiershortitem = mnIdentifiershortitem;
  }

  public MathNumeric getMnIdentifiershortitem() {
    return mnIdentifiershortitem;
  }
}
