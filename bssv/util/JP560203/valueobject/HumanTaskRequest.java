package be.e1.bssv.util.JP560203.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class HumanTaskRequest extends ValueObject implements Serializable
{
  /**
   * Workflow Type
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: true <br>
   * EnterpriseOne Alias: Z56WFTP <br>
   * EnterpriseOne field length:  20 <br>
   */
  private String workflowType = null;

  /**
   * Business Unit
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: true <br>
   * EnterpriseOne Alias: MCU <br>
   * EnterpriseOne field length:  12 <br>
   */
  private String workflowBranch = null;

  /**
   * Long Address Number
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: true <br>
   * EnterpriseOne Alias: ALKY <br>
   * EnterpriseOne field length:  20 <br>
   */
  private String alternateKey1 = null;

  /**
   * Long Address Number
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: true <br>
   * EnterpriseOne Alias: ALKY1 <br>
   * EnterpriseOne field length:  20 <br>
   */
  private String alternateKey2 = null;

  /**
   * Long Address Number 3
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: true <br>
   * EnterpriseOne Alias: Z56ALKY3 <br>
   * EnterpriseOne field length:  20 <br>
   */
  private String alternateKey3 = null;

  /**
   * Long Address Number 4
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: true <br>
   * EnterpriseOne Alias: Z56ALKY4 <br>
   * EnterpriseOne field length:  20 <br>
   */
  private String alternateKey4 = null;

  /**
   * Long Address Number 5
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: true <br>
   * EnterpriseOne Alias: Z56ALKY5 <br>
   * EnterpriseOne field length:  20 <br>
   */
  private String alternateKey5 = null;

  /**
   * Long Address Number 6
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: true <br>
   * EnterpriseOne Alias: Z56ALKY6 <br>
   * EnterpriseOne field length:  20 <br>
   */
  private String alternateKey6 = null;

  /**
   * Long Address Number 7
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: true <br>
   * EnterpriseOne Alias: Z56ALKY7 <br>
   * EnterpriseOne field length:  20 <br>
   */
  private String alternateKey7 = null;

  /**
   * Long Address Number 8
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: true <br>
   * EnterpriseOne Alias: Z56ALKY8 <br>
   * EnterpriseOne field length:  20 <br>
   */
  private String alternateKey8 = null;
  
  /**
   * Service Level Custom Function
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: true <br>
   * EnterpriseOne Alias: SLCUSTFN <br>
   * EnterpriseOne field length:  32 <br>
   */
  private String workflowLevel = null;

  /**
   * Group
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: true <br>
   * EnterpriseOne Alias: GROUP <br>
   * EnterpriseOne field length:  10 <br>
   */
  private String workflowGroup = null;

  /**
   * TODO: Default public constructor for instantiating: HumanTaskRequest
   */
  public HumanTaskRequest()
  {
  }

  public void setWorkflowType(String workflowType)
  {
    this.workflowType = workflowType;
  }

  public String getWorkflowType()
  {
    return workflowType;
  }

  public void setWorkflowBranch(String workflowBranch)
  {
    this.workflowBranch = workflowBranch;
  }

  public String getWorkflowBranch()
  {
    return workflowBranch;
  }

  public void setAlternateKey1(String alternateKey1)
  {
    this.alternateKey1 = alternateKey1;
  }

  public String getAlternateKey1()
  {
    return alternateKey1;
  }

  public void setAlternateKey2(String alternateKey2)
  {
    this.alternateKey2 = alternateKey2;
  }

  public String getAlternateKey2()
  {
    return alternateKey2;
  }

  public void setWorkflowLevel(String workflowLevel)
  {
    this.workflowLevel = workflowLevel;
  }

  public String getWorkflowLevel()
  {
    return workflowLevel;
  }

  public void setAlternateKey3(String alternateKey3)
  {
    this.alternateKey3 = alternateKey3;
  }

  public String getAlternateKey3()
  {
    return alternateKey3;
  }

  public void setAlternateKey4(String alternateKey4)
  {
    this.alternateKey4 = alternateKey4;
  }

  public String getAlternateKey4()
  {
    return alternateKey4;
  }

  public void setAlternateKey5(String alternateKey5)
  {
    this.alternateKey5 = alternateKey5;
  }

  public String getAlternateKey5()
  {
    return alternateKey5;
  }
  public void setAlternateKey6(String alternateKey6)
  {
    this.alternateKey6 = alternateKey6;
  }

  public String getAlternateKey6()
  {
    return alternateKey6;
  }
  public void setAlternateKey7(String alternateKey7)
  {
    this.alternateKey7 = alternateKey7;
  }

  public String getAlternateKey7()
  {
    return alternateKey7;
  }
  public void setAlternateKey8(String alternateKey8)
  {
    this.alternateKey8 = alternateKey8;
  }

  public String getAlternateKey8()
  {
    return alternateKey8;
  }


  public void setWorkflowGroup(String workflowGroup)
  {
    this.workflowGroup = workflowGroup;
  }

  public String getWorkflowGroup()
  {
    return workflowGroup;
  }
}
