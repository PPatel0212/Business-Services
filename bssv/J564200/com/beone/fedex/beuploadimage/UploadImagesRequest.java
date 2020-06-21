/**
 * Generated from schema type t=UploadImagesRequest@http://www.beone.com/fedex/beuploadimage
 */
package be.e1.bssv.J564200.com.beone.fedex.beuploadimage;

public class UploadImagesRequest implements java.io.Serializable {

  private be.e1.bssv.J564200.com.beone.fedex.beuploadimage.WebAuthenticationDetail webAuthenticationDetail;

  public be.e1.bssv.J564200.com.beone.fedex.beuploadimage.WebAuthenticationDetail getWebAuthenticationDetail() {
    return this.webAuthenticationDetail;
  }

  public void setWebAuthenticationDetail(be.e1.bssv.J564200.com.beone.fedex.beuploadimage.WebAuthenticationDetail webAuthenticationDetail) {
    this.webAuthenticationDetail = webAuthenticationDetail;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beuploadimage.ClientDetail clientDetail;

  public be.e1.bssv.J564200.com.beone.fedex.beuploadimage.ClientDetail getClientDetail() {
    return this.clientDetail;
  }

  public void setClientDetail(be.e1.bssv.J564200.com.beone.fedex.beuploadimage.ClientDetail clientDetail) {
    this.clientDetail = clientDetail;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beuploadimage.TransactionDetail transactionDetail;

  public be.e1.bssv.J564200.com.beone.fedex.beuploadimage.TransactionDetail getTransactionDetail() {
    return this.transactionDetail;
  }

  public void setTransactionDetail(be.e1.bssv.J564200.com.beone.fedex.beuploadimage.TransactionDetail transactionDetail) {
    this.transactionDetail = transactionDetail;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beuploadimage.VersionId version;

  public be.e1.bssv.J564200.com.beone.fedex.beuploadimage.VersionId getVersion() {
    return this.version;
  }

  public void setVersion(be.e1.bssv.J564200.com.beone.fedex.beuploadimage.VersionId version) {
    this.version = version;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beuploadimage.UploadImageDetail[] images;

  public be.e1.bssv.J564200.com.beone.fedex.beuploadimage.UploadImageDetail[] getImages() {
    return this.images;
  }

  public void setImages(be.e1.bssv.J564200.com.beone.fedex.beuploadimage.UploadImageDetail[] images) {
    this.images = images;
  }

}
