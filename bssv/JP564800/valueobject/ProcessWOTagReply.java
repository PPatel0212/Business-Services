package be.e1.bssv.JP564800.valueobject;

import be.e1.bssv.J564800.valueobject.WOMPSTag_D5648007;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.MessageValueObject;
import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class ProcessWOTagReply extends MessageValueObject implements Serializable
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
   * Error Code
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: ERRC <br>
   * EnterpriseOne field length:  1 <br>
   */
  private String errorFlag = null;

  /**
   * Workflow Transport Data
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: TRANDATA <br>
   * EnterpriseOne field length:  1024 <br>
   */
  private String errorMessage = null;

  /**
   * TODO: Default public constructor for instantiating: ProcessWOTagReply
   */
  public ProcessWOTagReply()
  {
  }
  
  public ProcessWOTagReply(WOMPSTag_D5648007 inData)
  {
    this.workOrderNumber = inData.getMnWONumber_DOCO().intValue();
    this.errorFlag = inData.getCErrorCode_ERRC();
    this.errorMessage = inData.getSzErrorMessage_TRANDATA();
  }

  public void setWorkOrderNumber(Integer workOrderNumber)
  {
    this.workOrderNumber = workOrderNumber;
  }

  public Integer getWorkOrderNumber()
  {
    return workOrderNumber;
  }

  public void setErrorFlag(String errorFlag)
  {
    this.errorFlag = errorFlag;
  }

  public String getErrorFlag()
  {
    return errorFlag;
  }

  public void setErrorMessage(String errorMessage)
  {
    this.errorMessage = errorMessage;
  }

  public String getErrorMessage()
  {
    return errorMessage;
  }
}
