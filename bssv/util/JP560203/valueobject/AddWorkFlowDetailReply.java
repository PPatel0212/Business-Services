package be.e1.bssv.util.JP560203.valueobject;

import be.e1.bssv.util.J560203.valueobject.BE_AddWorkFlowDetail_D5602000C;
import java.io.Serializable;

import oracle.e1.bssvfoundation.base.MessageValueObject;
import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class AddWorkFlowDetailReply
  extends MessageValueObject
  implements Serializable
{
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
   * Error Code
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: ERRC <br>
   * EnterpriseOne field length:  1 <br>
   */
  private String errorCode = null;

  /**
   * Description
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: DS01 <br>
   * EnterpriseOne field length:  80 <br>
   */
  private String description = null;

  /**
   * TODO: Default public constructor for instantiating: AddWorkFlowDetailReply
   */
  public AddWorkFlowDetailReply()
  {
    
  }
    public AddWorkFlowDetailReply (BE_AddWorkFlowDetail_D5602000C vo) 
  {
      setErrorCode(vo.getCErrorFlag());
      setDescription(vo.getSzErrorMessage());
  }
  

  public void setProgramID(String programID)
  {
    this.programID = programID;
  }

  public String getProgramID()
  {
    return programID;
  }

  public void setErrorCode(String errorCode)
  {
    this.errorCode = errorCode;
  }

  public String getErrorCode()
  {
    return errorCode;
  }

  public void setDescription(String description)
  {
    this.description = description;
  }

  public String getDescription()
  {
    return description;
  }
}
