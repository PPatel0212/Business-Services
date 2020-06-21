/**
 * Generated from schema type t=ReturnShipmentDetail@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

public class ReturnShipmentDetail implements java.io.Serializable {

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.ReturnType returnType;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.ReturnType getReturnType() {
    return this.returnType;
  }

  public void setReturnType(be.e1.bssv.J564200.com.beone.fedex.beshipments.ReturnType returnType) {
    this.returnType = returnType;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.Rma rma;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.Rma getRma() {
    return this.rma;
  }

  public void setRma(be.e1.bssv.J564200.com.beone.fedex.beshipments.Rma rma) {
    this.rma = rma;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.ReturnEMailDetail returnEMailDetail;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.ReturnEMailDetail getReturnEMailDetail() {
    return this.returnEMailDetail;
  }

  public void setReturnEMailDetail(be.e1.bssv.J564200.com.beone.fedex.beshipments.ReturnEMailDetail returnEMailDetail) {
    this.returnEMailDetail = returnEMailDetail;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.ReturnAssociationDetail returnAssociation;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.ReturnAssociationDetail getReturnAssociation() {
    return this.returnAssociation;
  }

  public void setReturnAssociation(be.e1.bssv.J564200.com.beone.fedex.beshipments.ReturnAssociationDetail returnAssociation) {
    this.returnAssociation = returnAssociation;
  }

}
