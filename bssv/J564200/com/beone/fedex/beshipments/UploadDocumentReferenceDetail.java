/**
 * Generated from schema type t=UploadDocumentReferenceDetail@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

public class UploadDocumentReferenceDetail implements java.io.Serializable {

  private java.math.BigInteger lineNumber;

  public java.math.BigInteger getLineNumber() {
    return this.lineNumber;
  }

  public void setLineNumber(java.math.BigInteger lineNumber) {
    this.lineNumber = lineNumber;
  }

  private java.lang.String customerReference;

  public java.lang.String getCustomerReference() {
    return this.customerReference;
  }

  public void setCustomerReference(java.lang.String customerReference) {
    this.customerReference = customerReference;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.UploadDocumentProducerType documentProducer;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.UploadDocumentProducerType getDocumentProducer() {
    return this.documentProducer;
  }

  public void setDocumentProducer(be.e1.bssv.J564200.com.beone.fedex.beshipments.UploadDocumentProducerType documentProducer) {
    this.documentProducer = documentProducer;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.UploadDocumentType documentType;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.UploadDocumentType getDocumentType() {
    return this.documentType;
  }

  public void setDocumentType(be.e1.bssv.J564200.com.beone.fedex.beshipments.UploadDocumentType documentType) {
    this.documentType = documentType;
  }

  private java.lang.String documentId;

  public java.lang.String getDocumentId() {
    return this.documentId;
  }

  public void setDocumentId(java.lang.String documentId) {
    this.documentId = documentId;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.UploadDocumentIdProducer documentIdProducer;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.UploadDocumentIdProducer getDocumentIdProducer() {
    return this.documentIdProducer;
  }

  public void setDocumentIdProducer(be.e1.bssv.J564200.com.beone.fedex.beshipments.UploadDocumentIdProducer documentIdProducer) {
    this.documentIdProducer = documentIdProducer;
  }

}
