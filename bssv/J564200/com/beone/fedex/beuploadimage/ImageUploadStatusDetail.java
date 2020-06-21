/**
 * Generated from schema type t=ImageUploadStatusDetail@http://www.beone.com/fedex/beuploadimage
 */
package be.e1.bssv.J564200.com.beone.fedex.beuploadimage;

public class ImageUploadStatusDetail implements java.io.Serializable {

  private be.e1.bssv.J564200.com.beone.fedex.beuploadimage.ImageId id;

  public be.e1.bssv.J564200.com.beone.fedex.beuploadimage.ImageId getId() {
    return this.id;
  }

  public void setId(be.e1.bssv.J564200.com.beone.fedex.beuploadimage.ImageId id) {
    this.id = id;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beuploadimage.UploadImageStatusType status;

  public be.e1.bssv.J564200.com.beone.fedex.beuploadimage.UploadImageStatusType getStatus() {
    return this.status;
  }

  public void setStatus(be.e1.bssv.J564200.com.beone.fedex.beuploadimage.UploadImageStatusType status) {
    this.status = status;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beuploadimage.UploadImageStatusInfoType statusInfo;

  public be.e1.bssv.J564200.com.beone.fedex.beuploadimage.UploadImageStatusInfoType getStatusInfo() {
    return this.statusInfo;
  }

  public void setStatusInfo(be.e1.bssv.J564200.com.beone.fedex.beuploadimage.UploadImageStatusInfoType statusInfo) {
    this.statusInfo = statusInfo;
  }

  private java.lang.String message;

  public java.lang.String getMessage() {
    return this.message;
  }

  public void setMessage(java.lang.String message) {
    this.message = message;
  }

}
