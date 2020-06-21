package be.e1.bssv.JP564800.valueobject;

import be.e1.bssv.J564800.valueobject.WOMPSTag_D5648007;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class ProcessWOTagRequest extends ValueObject implements Serializable
{
  /**
   * Document (Order No, Invoice, etc.)
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: true <br>
   * EnterpriseOne Alias: DOCO <br>
   * EnterpriseOne field length:  8 <br>
   * EnterpriseOne decimal places: 0 <br>
   */
  private Integer workOrderNumber = null;

  /**
   * Order Type
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: DCTO <br>
   * EnterpriseOne field length:  2 <br>
   */
  private String workOrderType = null;

  /**
   * Indicators 08
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: ET08 <br>
   * EnterpriseOne field length:  1 <br>
   */
  private String mpsWorkOrderQtyChangedFlag = null;

  /**
   * Assembly Quantity Change Indicator
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: Z56AQCI <br>
   * EnterpriseOne field length:  1 <br>
   */
  private String assemblyQuantityChangeFlag = null;

  /**
   * SO Change Indicator
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: Z56SOCI <br>
   * EnterpriseOne field length:  1 <br>
   */
  private String salesOrderChangeFlag = null;

  /**
   * Request Date Change Indicator
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: Z56RDCI <br>
   * EnterpriseOne field length:  1 <br>
   */
  private String requestDateChangeFlag = null;

  /**
   * Cancel Date Change Indicator
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: Z56CDCI <br>
   * EnterpriseOne field length:  1 <br>
   */
  private String cancelDateChangeFlag = null;

  /**
   * Pick Date Change Indicator
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: Z56PDCI <br>
   * EnterpriseOne field length:  1 <br>
   */
  private String pickDateChangeFlag = null;

  /**
   * Next Status Change Indicator
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: Z56NSCI <br>
   * EnterpriseOne field length:  1 <br>
   */
  private String nextStatusChangeFlag = null;

  /**
   * Pick Date Request Indicator
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: Z56PDI <br>
   * EnterpriseOne field length:  1 <br>
   */
  private String pickDateRequestFlag = null;

  /**
   * Program ID
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: PID <br>
   * EnterpriseOne field length:  10 <br>
   */
  private String programID = null;

  /**
   * User ID
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: USER <br>
   * EnterpriseOne field length:  10 <br>
   */
  private String userID = null;

  /**
   * TODO: Default public constructor for instantiating: ProcessWOTagRequest
   */
  public ProcessWOTagRequest()
  {
  }
  
  public void copyToInternalValueObject(WOMPSTag_D5648007 inData)
  {
    inData.setMnWONumber_DOCO(new MathNumeric(this.workOrderNumber));
    inData.setSzWOType_DCTO(this.workOrderType);
    inData.setCFlags008_ET08(this.mpsWorkOrderQtyChangedFlag);
    inData.setCAsmblyQtyChgInd_Z56AQCI(this.assemblyQuantityChangeFlag);
    inData.setCSoChgInd_Z56SOCI(this.salesOrderChangeFlag);
    inData.setCReqDateChgInd_Z56RDCI(this.requestDateChangeFlag);
    inData.setCCncllDateChgInd_Z56CDI(this.cancelDateChangeFlag);
    inData.setCPickDateChgInd_Z56PDCI(this.pickDateChangeFlag);
    inData.setCPickDateReqInd_Z56PDI(this.pickDateRequestFlag);
    inData.setCSONxtStChgInd_Z56NSCI(this.nextStatusChangeFlag);
    inData.setSzProgramId_PID(this.programID);
    inData.setSzUserId_USER(this.userID);
  }

  public void setWorkOrderNumber(Integer workOrderNumber)
  {
    this.workOrderNumber = workOrderNumber;
  }

  public Integer getWorkOrderNumber()
  {
    return workOrderNumber;
  }

  public void setWorkOrderType(String workOrderType)
  {
    this.workOrderType = workOrderType;
  }

  public String getWorkOrderType()
  {
    return workOrderType;
  }

  public void setMpsWorkOrderQtyChangedFlag(String mpsWorkOrderQtyChangedFlag)
  {
    this.mpsWorkOrderQtyChangedFlag = mpsWorkOrderQtyChangedFlag;
  }

  public String getMpsWorkOrderQtyChangedFlag()
  {
    return mpsWorkOrderQtyChangedFlag;
  }

  public void setAssemblyQuantityChangeFlag(String assemblyQuantityChangeFlag)
  {
    this.assemblyQuantityChangeFlag = assemblyQuantityChangeFlag;
  }

  public String getAssemblyQuantityChangeFlag()
  {
    return assemblyQuantityChangeFlag;
  }

  public void setSalesOrderChangeFlag(String salesOrderChangeFlag)
  {
    this.salesOrderChangeFlag = salesOrderChangeFlag;
  }

  public String getSalesOrderChangeFlag()
  {
    return salesOrderChangeFlag;
  }

  public void setRequestDateChangeFlag(String requestDateChangeFlag)
  {
    this.requestDateChangeFlag = requestDateChangeFlag;
  }

  public String getRequestDateChangeFlag()
  {
    return requestDateChangeFlag;
  }

  public void setCancelDateChangeFlag(String cancelDateChangeFlag)
  {
    this.cancelDateChangeFlag = cancelDateChangeFlag;
  }

  public String getCancelDateChangeFlag()
  {
    return cancelDateChangeFlag;
  }

  public void setPickDateChangeFlag(String pickDateChangeFlag)
  {
    this.pickDateChangeFlag = pickDateChangeFlag;
  }

  public String getPickDateChangeFlag()
  {
    return pickDateChangeFlag;
  }

  public void setNextStatusChangeFlag(String nextStatusChangeFlag)
  {
    this.nextStatusChangeFlag = nextStatusChangeFlag;
  }

  public String getNextStatusChangeFlag()
  {
    return nextStatusChangeFlag;
  }

  public void setPickDateRequestFlag(String pickDateRequestFlag)
  {
    this.pickDateRequestFlag = pickDateRequestFlag;
  }

  public String getPickDateRequestFlag()
  {
    return pickDateRequestFlag;
  }

  public void setProgramID(String programID)
  {
    this.programID = programID;
  }

  public String getProgramID()
  {
    return programID;
  }

  public void setUserID(String userID)
  {
    this.userID = userID;
  }

  public String getUserID()
  {
    return userID;
  }
}
