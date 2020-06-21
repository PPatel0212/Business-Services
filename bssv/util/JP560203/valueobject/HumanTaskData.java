package be.e1.bssv.util.JP560203.valueobject;

import be.e1.bssv.util.J560203.valueobject.BE_HumanTaskResult;

import java.io.Serializable;

import java.math.BigDecimal;

import java.util.Calendar;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class HumanTaskData extends ValueObject implements Serializable
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
   * Workflow Type Desciption
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: Z56WTDS <br>
   * EnterpriseOne field length:  50 <br>
   */
  private String workflowTypeDescription = null;

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
  private String workflowStage = null;

  /**
   * Group
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: true <br>
   * EnterpriseOne Alias: GROUP <br>
   * EnterpriseOne field length:  10 <br>
   */
  private String group = null;

  /**
   * Current User ID
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: CUID <br>
   * EnterpriseOne field length:  10 <br>
   */
  private String user = null;

  /**
   * Subscriber Group
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: SUBGRP <br>
   * EnterpriseOne field length:  64 <br>
   */
  private String groupDescription = null;

  /**
   * Foreign - Threshold 1
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: FTH1 <br>
   * EnterpriseOne field length:  15 <br>
   * EnterpriseOne decimal places: 0 <br>
   */
  private BigDecimal threshold1 = null;

  /**
   * Foreign - Threshold 2
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: FTH2 <br>
   * EnterpriseOne field length:  15 <br>
   * EnterpriseOne decimal places: 0 <br>
   */
  private BigDecimal threshold2 = null;

  /**
   * Formatted Start Time
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: FMTST <br>
   * EnterpriseOne field length:  10 <br>
   */
  private String escalationTime = null;

  /**
   * Configuration Group Code
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: CFGGC <br>
   * EnterpriseOne field length:  10 <br>
   */
  private String escalationGroup = null;

  /**
   * Group Name (related words)
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: GRPNAME <br>
   * EnterpriseOne field length:  30 <br>
   */
  private String escalationGroupDescription = null;

  /**
   * Formatted End Time
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: FMTET <br>
   * EnterpriseOne field length:  10 <br>
   */
  private String reminderTime = null;

  /**
   * Reviewer ID
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: RVID <br>
   * EnterpriseOne field length:  10 <br>
   */
  private String reviewerGroup = null;

  /**
   * Work Group Name
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: WGNA <br>
   * EnterpriseOne field length:  30 <br>
   */
  private String reviewerGroupDescription = null;

  /**
   * User Reserved Code
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: URCD <br>
   * EnterpriseOne field length:  2 <br>
   */
  private String userReservedCode = null;

  /**
   * User Reserved Date
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: URDT <br>
   * EnterpriseOne field length:  6 <br>
   */
  private Calendar userReservedDate = null;

  /**
   * User Reserved Amount
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: URAT <br>
   * EnterpriseOne field length:  15 <br>
   * EnterpriseOne decimal places: 2 <br>
   */
  private BigDecimal userReservedAmount = null;

  /**
   * User Reserved Number
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: URAB <br>
   * EnterpriseOne field length:  8 <br>
   * EnterpriseOne decimal places: 0 <br>
   */
  private Integer userReservedNumber = null;

  /**
   * User Reserved Reference
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: URRF <br>
   * EnterpriseOne field length:  15 <br>
   */
  private String userReservedReference = null;

  /**
   * TODO: Default public constructor for instantiating: HumanTaskData
   */
  public HumanTaskData()
  {
  }
  
  public HumanTaskData(BE_HumanTaskResult inData)
  {
    this.workflowType = inData.getF560205_Z56WFTP();
    this.workflowTypeDescription = inData.getF560205_Z56WTDS();
    this.workflowBranch = inData.getF560205_MCU();
    this.workflowStage = inData.getF560205_SLCUSTFN();
    this.alternateKey1 = inData.getF560205_ALKY();
    this.alternateKey2 = inData.getF560205_ALKY1();
    this.alternateKey3 = inData.getF560205_Z56ALKY3();
    this.alternateKey4 = inData.getF560205_Z56ALKY4();
    this.alternateKey5 = inData.getF560205_Z56ALKY5();
    this.alternateKey6 = inData.getF560205_Z56ALKY6();
    this.alternateKey7 = inData.getF560205_Z56ALKY7();
    this.alternateKey8 = inData.getF560205_Z56ALKY8();
    this.escalationGroup = inData.getF560205_CFGGC();
    this.escalationGroupDescription = inData.getF560205_GRPNAME();
    this.escalationTime = inData.getF560205_FMTST();
    this.group = inData.getF560205_GROUP();
    this.groupDescription = inData.getF560205_SUBGRP();
    this.reminderTime = inData.getF560205_FMTET();
    this.reviewerGroup = inData.getF560205_RVID();
    this.reviewerGroupDescription = inData.getF560205_WGNA();
    this.user = inData.getF560205_CUID();
    this.userReservedCode = inData.getF560205_URCD();
    this.userReservedReference = inData.getF560205_URRF();

    if(inData.getF560205_FTH1() != null)
    {
      this.threshold1 = inData.getF560205_FTH1().asBigDecimal();
    }
    if(inData.getF560205_FTH2() != null)
    {
      this.threshold2 = inData.getF560205_FTH2().asBigDecimal();
    }
    if(inData.getF560205_URAT() != null)
    {
      this.userReservedAmount = inData.getF560205_URAT().asBigDecimal();
    }
    if(inData.getF560205_URAB() != null)
    {
      this.userReservedNumber = inData.getF560205_URAB().intValue();
    }
    if(inData.getF560205_URDT() != null)
    {
      this.userReservedDate = Calendar.getInstance();
      this.userReservedDate.setTime(inData.getF560205_URDT());
    }
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

  public void setWorkflowStage(String workflowStage)
  {
    this.workflowStage = workflowStage;
  }

  public String getWorkflowStage()
  {
    return workflowStage;
  }

  public void setUser(String user)
  {
    this.user = user;
  }

  public String getUser()
  {
    return user;
  }

  public void setGroup(String group)
  {
    this.group = group;
  }

  public String getGroup()
  {
    return group;
  }

  public void setEscalationTime(String escalationTime)
  {
    this.escalationTime = escalationTime;
  }

  public String getEscalationTime()
  {
    return escalationTime;
  }

  public void setEscalationGroup(String escalationGroup)
  {
    this.escalationGroup = escalationGroup;
  }

  public String getEscalationGroup()
  {
    return escalationGroup;
  }

  public void setReminderTime(String reminderTime)
  {
    this.reminderTime = reminderTime;
  }

  public String getReminderTime()
  {
    return reminderTime;
  }

  public void setReviewerGroup(String reviewerGroup)
  {
    this.reviewerGroup = reviewerGroup;
  }

  public String getReviewerGroup()
  {
    return reviewerGroup;
  }

  public void setThreshold1(BigDecimal threshold1)
  {
    this.threshold1 = threshold1;
  }

  public BigDecimal getThreshold1()
  {
    return threshold1;
  }

  public void setThreshold2(BigDecimal threshold2)
  {
    this.threshold2 = threshold2;
  }

  public BigDecimal getThreshold2()
  {
    return threshold2;
  }

  public void setWorkflowTypeDescription(String workflowTypeDescription)
  {
    this.workflowTypeDescription = workflowTypeDescription;
  }

  public String getWorkflowTypeDescription()
  {
    return workflowTypeDescription;
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

  public void setGroupDescription(String groupDescription)
  {
    this.groupDescription = groupDescription;
  }

  public String getGroupDescription()
  {
    return groupDescription;
  }

  public void setEscalationGroupDescription(String escalationGroupDescription)
  {
    this.escalationGroupDescription = escalationGroupDescription;
  }

  public String getEscalationGroupDescription()
  {
    return escalationGroupDescription;
  }

  public void setReviewerGroupDescription(String reviewerGroupDescription)
  {
    this.reviewerGroupDescription = reviewerGroupDescription;
  }

  public String getReviewerGroupDescription()
  {
    return reviewerGroupDescription;
  }

  public void setUserReservedCode(String userReservedCode)
  {
    this.userReservedCode = userReservedCode;
  }

  public String getUserReservedCode()
  {
    return userReservedCode;
  }

  public void setUserReservedDate(Calendar userReservedDate)
  {
    this.userReservedDate = userReservedDate;
  }

  public Calendar getUserReservedDate()
  {
    return userReservedDate;
  }

  public void setUserReservedAmount(BigDecimal userReservedAmount)
  {
    this.userReservedAmount = userReservedAmount;
  }

  public BigDecimal getUserReservedAmount()
  {
    return userReservedAmount;
  }

  public void setUserReservedNumber(Integer userReservedNumber)
  {
    this.userReservedNumber = userReservedNumber;
  }

  public Integer getUserReservedNumber()
  {
    return userReservedNumber;
  }

  public void setUserReservedReference(String userReservedReference)
  {
    this.userReservedReference = userReservedReference;
  }

  public String getUserReservedReference()
  {
    return userReservedReference;
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
}
