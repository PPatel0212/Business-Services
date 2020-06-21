package be.e1.bssv.JP560010.valueobject;

import be.e1.bssv.J560010.valueobject.InternalGetNextItemNumber;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.MessageValueObject;
import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class ShowNextItemNumber extends MessageValueObject implements Serializable {
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
  private Integer itemNumberShort = null;

  /**
   * TODO: Default public constructor for instantiating: ShowNextItemNumber
   */
  public ShowNextItemNumber() {
  }

  public ShowNextItemNumber(InternalGetNextItemNumber internalVO) {
  this.setItemNumberShort(internalVO.getMnIdentifiershortitem());
  }

  public void setItemNumberShort(Integer itemNumberShort) {
    this.itemNumberShort = itemNumberShort;
  }

  public void setItemNumberShort(MathNumeric itemNumberShort) {
    if(itemNumberShort!=null)
    this.itemNumberShort = itemNumberShort.intValue();
    else
    this.itemNumberShort = 0;
  }
  public Integer getItemNumberShort() {
    return itemNumberShort;
  }
}
