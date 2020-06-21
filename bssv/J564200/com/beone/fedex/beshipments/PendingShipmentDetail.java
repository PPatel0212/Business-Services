/**
 * Generated from schema type t=PendingShipmentDetail@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

public class PendingShipmentDetail implements java.io.Serializable {

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.PendingShipmentType type;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.PendingShipmentType getType() {
    return this.type;
  }

  public void setType(be.e1.bssv.J564200.com.beone.fedex.beshipments.PendingShipmentType type) {
    this.type = type;
  }

  private java.util.Calendar expirationDate;

  public java.util.Calendar getExpirationDate() {
    return this.expirationDate;
  }

  public void setExpirationDate(java.util.Calendar expirationDate) {
    this.expirationDate = expirationDate;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.EMailLabelDetail emailLabelDetail;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.EMailLabelDetail getEmailLabelDetail() {
    return this.emailLabelDetail;
  }

  public void setEmailLabelDetail(be.e1.bssv.J564200.com.beone.fedex.beshipments.EMailLabelDetail emailLabelDetail) {
    this.emailLabelDetail = emailLabelDetail;
  }

}
