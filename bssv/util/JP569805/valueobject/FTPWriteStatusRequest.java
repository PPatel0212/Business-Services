package be.e1.bssv.util.JP569805.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class FTPWriteStatusRequest extends ValueObject implements Serializable {
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
  private Integer uniqueKeyIDInternal = null;

  /**
   * Status
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: STATUS <br>
   * EnterpriseOne field length:  1 <br>
   */
  private String status = null;

  /**
   * Data Field 1
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: DTA1 <br>
   * EnterpriseOne field length:  256 <br>
   */
  private String fmwErrorMessage = null;

  /**
   * Description
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: DL01 <br>
   * EnterpriseOne field length:  30 <br>
   */
  private String sourceSystem = null;

  /**
   * TODO: Default public constructor for instantiating: FTPWriteStatusRequest
   */
  public FTPWriteStatusRequest() {
  }

  public void setUniqueKeyIDInternal(Integer uniqueKeyIDInternal) {
    this.uniqueKeyIDInternal = uniqueKeyIDInternal;
  }

  public void setUniqueKeyIDInternal(MathNumeric uniqueKeyIDInternal) {
    if (uniqueKeyIDInternal!=null)
    this.uniqueKeyIDInternal = uniqueKeyIDInternal.intValue();
  }
  
  public Integer getUniqueKeyIDInternal() {
    return uniqueKeyIDInternal;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getStatus() {
    return status;
  }


  public void setFmwErrorMessage(String fmwErrorMessage) {
    this.fmwErrorMessage = fmwErrorMessage;
  }

  public String getFmwErrorMessage() {
    return fmwErrorMessage;
  }

  public void setSourceSystem(String sourceSystem) {
    this.sourceSystem = sourceSystem;
  }

  public String getSourceSystem() {
    return sourceSystem;
  }
}
