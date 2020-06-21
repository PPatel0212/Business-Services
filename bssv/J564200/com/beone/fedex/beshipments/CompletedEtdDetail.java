/**
 * Generated from schema type t=CompletedEtdDetail@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

public class CompletedEtdDetail implements java.io.Serializable {

  private java.lang.String folderId;

  public java.lang.String getFolderId() {
    return this.folderId;
  }

  public void setFolderId(java.lang.String folderId) {
    this.folderId = folderId;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.UploadDocumentReferenceDetail[] uploadDocumentReferenceDetails;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.UploadDocumentReferenceDetail[] getUploadDocumentReferenceDetails() {
    return this.uploadDocumentReferenceDetails;
  }

  public void setUploadDocumentReferenceDetails(be.e1.bssv.J564200.com.beone.fedex.beshipments.UploadDocumentReferenceDetail[] uploadDocumentReferenceDetails) {
    this.uploadDocumentReferenceDetails = uploadDocumentReferenceDetails;
  }

}
