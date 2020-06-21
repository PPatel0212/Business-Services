package be.e1.bssv.JP563107.valueobject;

import be.e1.bssv.J563107.valueobject.InternalShowSerial;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class WorkOrderDetails extends ValueObject implements Serializable {
  /**
   * TODO: Default public constructor for instantiating: WorkOrderDetails
   */
  public WorkOrderDetails() {
  }
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
  private Integer woOrderNo = null;

  /**
   * Order Type
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: DCTO <br>
   * EnterpriseOne field length:  2 <br>
   */
  private String woOrderType = null;

  /**
   * Serial Number 1
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: SRL1 <br>
   * EnterpriseOne field length:  30 <br>
   */
  private String serialNumber1 = null;

  public WorkOrderDetails(InternalShowSerial internalShowVO) {
    this.setSerialNumber1(internalShowVO.getF4220_SRL1());
    this.setWoOrderType(internalShowVO.getF4801_DCTO());
    this.setWoOrderNo(internalShowVO.getF4801_DOCO());
  }
  
  public void setWoOrderNo(Integer woOrderNo) {
    this.woOrderNo = woOrderNo;
  }

  public void setWoOrderNo(MathNumeric woOrderNo) {
    if (woOrderNo!=null){
    this.woOrderNo = new Integer(woOrderNo.intValue());
    }
    else {
      this.woOrderNo = new Integer(0);
    }
  }
  
  public Integer getWoOrderNo() {
    return woOrderNo;
  }

  public void setWoOrderType(String woOrderType) {
    this.woOrderType = woOrderType;
  }

  public String getWoOrderType() {
    return woOrderType;
  }

  public void setSerialNumber1(String serialNumber1) {
    this.serialNumber1 = serialNumber1;
  }

  public String getSerialNumber1() {
    return serialNumber1;
  }
}
