package be.e1.bssv.JP564336.valueobject;

import be.e1.bssv.J564335.valueobject.LaunchBSPCatchUpaPIInternal;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.MessageValueObject;
import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class LaunchBSPCatchUpAPIReply extends MessageValueObject implements Serializable {

  
  private String successFlag = null;

  /**
   * TODO: Default public constructor for instantiating: LaunchBSPCatchUpAPIReply
   */
  public LaunchBSPCatchUpAPIReply(LaunchBSPCatchUpaPIInternal inData) {
    this.successFlag = inData.getSuccessFlag();
  }

  public void setSuccessFlag(String successFlag) {
    this.successFlag = successFlag;
  }

  public String getSuccessFlag() {
    return successFlag;
  }
}
