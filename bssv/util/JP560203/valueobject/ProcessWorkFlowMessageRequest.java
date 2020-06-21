package be.e1.bssv.util.JP560203.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class ProcessWorkFlowMessageRequest
  extends ValueObject
  implements Serializable
{
  /**
   * Group Number
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: GRPID <br>
   * EnterpriseOne field length:  15 <br>
   * EnterpriseOne decimal places: 0 <br>
   */
  private Integer groupNumber = null;

  /**
   * J.D. EnterpriseOne Event Point 01
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: EV01 <br>
   * EnterpriseOne field length:  1 <br>
   */
  private String CWriteXmlToFile = null;

  /**
   * TODO: Default public constructor for instantiating: ProcessWorkFlowMessageRequest
   */
  public ProcessWorkFlowMessageRequest()
  {
  }

  public void setGroupNumber(Integer groupNumber)
  {
    this.groupNumber = groupNumber;
  }

  public Integer getGroupNumber()
  {
    return groupNumber;
  }

  public void setCWriteXmlToFile(String CWriteXmlToFile)
  {
    this.CWriteXmlToFile = CWriteXmlToFile;
  }

  public String getJDEnterpriseOneEventPoint01()
  {
    return CWriteXmlToFile;
  }
}
