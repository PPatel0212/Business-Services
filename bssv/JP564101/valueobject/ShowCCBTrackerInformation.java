package be.e1.bssv.JP564101.valueobject;

import be.e1.bssv.J564101.valueobject.InternalGetCCBTrackerInfo;


import java.io.Serializable;

import oracle.e1.bssvfoundation.base.MessageValueObject;
import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class ShowCCBTrackerInformation extends MessageValueObject implements Serializable {
  
  /**
   * Array of WorkOrder Serial No arrays returned from query.
   */
  private CCBTrackerInformation cCBTrackerInformation[];
  /**
   * TODO: Default public constructor for instantiating: ShowCCBTrackerInformation
   */
  public ShowCCBTrackerInformation() {
  }
 
  public ShowCCBTrackerInformation (InternalGetCCBTrackerInfo internalVO) {
      if (internalVO.getQueryResults() != null) {

          this.cCBTrackerInformation =
                  new CCBTrackerInformation[internalVO.getQueryResults().size()];
          for (int i = 0; i < internalVO.getQueryResults().size(); i++) {

            CCBTrackerInformation cCBTrackerInformation  = new CCBTrackerInformation(internalVO.getQueryResults(i));

              this.setCCBTrackerInformation(i, cCBTrackerInformation);
          }
      
      }

  }


  public void setCCBTrackerInformation(CCBTrackerInformation[] cCBTrackerInformation) {
    this.cCBTrackerInformation = cCBTrackerInformation;
  }

  public CCBTrackerInformation[] getCCBTrackerInformation() {
    return cCBTrackerInformation;
  }
  public void setCCBTrackerInformation(int i,CCBTrackerInformation cCBTrackerInformation) {
    this.cCBTrackerInformation[i] = cCBTrackerInformation;
  }

  public CCBTrackerInformation getCCBTrackerInformation(int i) {
    return cCBTrackerInformation[i];
  }

}
