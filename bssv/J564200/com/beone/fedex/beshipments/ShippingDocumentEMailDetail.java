/**
 * Generated from schema type t=ShippingDocumentEMailDetail@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

public class ShippingDocumentEMailDetail implements java.io.Serializable {

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocumentEMailRecipient[] eMailRecipients;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocumentEMailRecipient[] getEMailRecipients() {
    return this.eMailRecipients;
  }

  public void setEMailRecipients(be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocumentEMailRecipient[] eMailRecipients) {
    this.eMailRecipients = eMailRecipients;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocumentEMailGroupingType grouping;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocumentEMailGroupingType getGrouping() {
    return this.grouping;
  }

  public void setGrouping(be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocumentEMailGroupingType grouping) {
    this.grouping = grouping;
  }

}
