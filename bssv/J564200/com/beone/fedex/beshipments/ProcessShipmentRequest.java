/**
 * Generated from schema type t=ProcessShipmentRequest@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

public class ProcessShipmentRequest implements java.io.Serializable {

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.WebAuthenticationDetail webAuthenticationDetail;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.WebAuthenticationDetail getWebAuthenticationDetail() {
    return this.webAuthenticationDetail;
  }

  public void setWebAuthenticationDetail(be.e1.bssv.J564200.com.beone.fedex.beshipments.WebAuthenticationDetail webAuthenticationDetail) {
    this.webAuthenticationDetail = webAuthenticationDetail;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.ClientDetail clientDetail;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.ClientDetail getClientDetail() {
    return this.clientDetail;
  }

  public void setClientDetail(be.e1.bssv.J564200.com.beone.fedex.beshipments.ClientDetail clientDetail) {
    this.clientDetail = clientDetail;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.TransactionDetail transactionDetail;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.TransactionDetail getTransactionDetail() {
    return this.transactionDetail;
  }

  public void setTransactionDetail(be.e1.bssv.J564200.com.beone.fedex.beshipments.TransactionDetail transactionDetail) {
    this.transactionDetail = transactionDetail;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.VersionId version;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.VersionId getVersion() {
    return this.version;
  }

  public void setVersion(be.e1.bssv.J564200.com.beone.fedex.beshipments.VersionId version) {
    this.version = version;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.RequestedShipment requestedShipment;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.RequestedShipment getRequestedShipment() {
    return this.requestedShipment;
  }

  public void setRequestedShipment(be.e1.bssv.J564200.com.beone.fedex.beshipments.RequestedShipment requestedShipment) {
    this.requestedShipment = requestedShipment;
  }

}
