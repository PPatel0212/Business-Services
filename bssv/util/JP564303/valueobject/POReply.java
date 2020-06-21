 package be.e1.bssv.util.JP564303.valueobject;

import be.e1.bssv.util.J564303.valueobject.LaunchPO_D5643001A;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.MessageValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class POReply extends MessageValueObject  implements Serializable
{
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
   * Workflow Transport Data
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: TRANDATA <br>
   * EnterpriseOne field length:  1024 <br>
   */
  private String Link = null;

  /**
   * Print Queue
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: PRTQ <br>
   * EnterpriseOne field length:  10 <br>
   */
  private String printQueue = null;

  /**
   * Description
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: DS01 <br>
   * EnterpriseOne field length:  80 <br>
   */
  private String errordescription = null;
  
  /**
   * J.D. EnterpriseOne Event Point 01
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: EV01 <br>
   * EnterpriseOne field length:  1 <br>
   */
  private String RunAsynch = null;

  /**
   * TODO: Default public constructor for instantiating: POReply
   */
  public POReply()
  {
  }

  public POReply(LaunchPO_D5643001A vo)
  {
    setErrorCode(vo.getCErrorFlag());
    seterrordescription(vo.getSzErrorMessage());
    setDescription(vo.getSzOutputFileName());
    setPrintQueue(vo.getSzPrintQueue());
    setRunAsynch(vo.getCRunAsynchronous());
    setLink(vo.getSzOutputFileLink());
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

  public void setLink(String workflowTransportData)
  {
    this.Link = workflowTransportData;
  }

  public String getWorkflowTransportData()
  {
    return Link;
  }

  public void setPrintQueue(String printQueue)
  {
    this.printQueue = printQueue;
  }

  public String getPrintQueue()
  {
    return printQueue;
  }

  public void seterrordescription(String description)
  {
    this.errordescription = description;
  }

  public String geterrorDescription()
  {
    return errordescription;
  }

  public void setRunAsynch(String jDEnterpriseOneEventPoint01) {
      this.RunAsynch = jDEnterpriseOneEventPoint01;
  }

  public String getRunAsynch() {
      return RunAsynch;
  }
  }


