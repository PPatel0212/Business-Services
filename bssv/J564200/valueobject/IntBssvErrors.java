package be.e1.bssv.J564200.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class IntBssvErrors extends ValueObject implements Serializable
{
  private String errorCode = null;
  private String errorSource = null;
  private String errorSeverity = null;
  private String[] errorMessages = null;
  private Integer count = 0;

  
  public void appendErrorMessage(String msg)
  {
    if(msg != null)
    {
      int index = count.intValue();
      if(errorMessages == null)
      {
        errorMessages = new String [10];
        errorMessages[index++] = msg;
      }
      else
      {
        if(index >= errorMessages.length)
        {
          String[] tmpArr = new String [index*2];
          for(int idx=0; idx<index; idx++)
          {
            tmpArr[idx] = errorMessages[idx];
          }
          errorMessages = tmpArr;
        }
        errorMessages[index++] = msg;
      }
      count = new Integer(index);
    }
  }

  public void setErrorMessages(String[] errorMessages)
  {
    this.errorMessages = errorMessages;
  }

  public String[] getErrorMessages()
  {
    return errorMessages;
  }

  public void setCount(Integer count)
  {
    this.count = count;
  }

  public Integer getCount()
  {
    return count;
  }

  public void setErrorCode(String errorCode)
  {
    this.errorCode = errorCode;
  }

  public String getErrorCode()
  {
    return errorCode;
  }

  public void setErrorSource(String errorSource)
  {
    this.errorSource = errorSource;
  }

  public String getErrorSource()
  {
    return errorSource;
  }

  public void setErrorSeverity(String errorSeverity)
  {
    this.errorSeverity = errorSeverity;
  }

  public String getErrorSeverity()
  {
    return errorSeverity;
  }
}
