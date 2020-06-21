/**
 * Generated from schema type t=EtdDetail@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

public class EtdDetail implements java.io.Serializable {

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.RequestedShippingDocumentType[] requestedDocumentCopies;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.RequestedShippingDocumentType[] getRequestedDocumentCopies() {
    return this.requestedDocumentCopies;
  }

  public void setRequestedDocumentCopies(be.e1.bssv.J564200.com.beone.fedex.beshipments.RequestedShippingDocumentType[] requestedDocumentCopies) {
    this.requestedDocumentCopies = requestedDocumentCopies;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.UploadDocumentReferenceDetail[] documentReferences;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.UploadDocumentReferenceDetail[] getDocumentReferences() {
    return this.documentReferences;
  }

  public void setDocumentReferences(be.e1.bssv.J564200.com.beone.fedex.beshipments.UploadDocumentReferenceDetail[] documentReferences) {
    this.documentReferences = documentReferences;
  }

}
