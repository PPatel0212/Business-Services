package be.e1.bssv.JP563107.valueobject;

import be.e1.bssv.J563107.valueobject.InternalGetSumBOMDetails;

import be.e1.bssv.J563107.valueobject.InternalShowSumBOMDetails;

import oracle.e1.bssvfoundation.base.MessageValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class ShowSumBOMDetails extends MessageValueObject {
  /**
   * Array of WorkOrder Serial No arrays returned from query.
   */
  private SumBOMDetails[] sumBOMDetails;

  /**
   * TODO: Default public constructor for instantiating: ShowWorkOrderSerialNo
   */
  public ShowSumBOMDetails() {
  }

  public ShowSumBOMDetails(InternalGetSumBOMDetails internalVO) {
    if (internalVO.getQueryResults() != null) {
      this.sumBOMDetails =
          new SumBOMDetails[internalVO.getQueryResults().size()];
      for (int i = 0; i < internalVO.getQueryResults().size(); i++) {
        SumBOMDetails sumBOMDetails =
          new SumBOMDetails(internalVO.getQueryResults(i));
        this.setSumBOMDetails(i, sumBOMDetails);
      }
    }
  }

  public void setSumBOMDetails(SumBOMDetails[] sumBOMDetails) {
    this.sumBOMDetails = sumBOMDetails;
  }

  public void setSumBOMDetails(int i, SumBOMDetails sumBOMDetails) {
    this.sumBOMDetails[i] = sumBOMDetails;
  }

  public SumBOMDetails[] getSumBOMDetails() {
    return sumBOMDetails;
  }

  public SumBOMDetails[] getSumBOMDetails(int i) {
    if (i > 0 && i < sumBOMDetails.length)
      return sumBOMDetails;
    return null;
  }
}
