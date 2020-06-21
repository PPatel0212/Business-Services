package be.e1.bssv.util.JP560203.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.MessageValueObject;
import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class HumanTaskReply extends MessageValueObject implements Serializable
{
  /**
   * Array to hold the results returned by the query
   */
  private HumanTaskData[] humanTaskInfo = null;
  
  /**
   * Flag is set to 1 if an error occurs otherwise has a value of 0
   */
  private String errorFlag = null;
  
  /**
   * Field is set to a string describing the error.
   * This field is only set if the errorFlag is set to 1.
   */
  private String errorMessage = null;

  /**
   * TODO: Default public constructor for instantiating: HumanTaskReply
   */
  public HumanTaskReply()
  {
  }

  public void setHumanTaskInfo(HumanTaskData[] humanTaskInfo)
  {
    this.humanTaskInfo = humanTaskInfo;
  }

  public HumanTaskData[] getHumanTaskInfo()
  {
    return humanTaskInfo;
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
