/**
 * Generated from schema type t=NaftaCertificateOfOriginDetail@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

public class NaftaCertificateOfOriginDetail implements java.io.Serializable {

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocumentFormat format;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocumentFormat getFormat() {
    return this.format;
  }

  public void setFormat(be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocumentFormat format) {
    this.format = format;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.DateRange blanketPeriod;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.DateRange getBlanketPeriod() {
    return this.blanketPeriod;
  }

  public void setBlanketPeriod(be.e1.bssv.J564200.com.beone.fedex.beshipments.DateRange blanketPeriod) {
    this.blanketPeriod = blanketPeriod;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.NaftaImporterSpecificationType importerSpecification;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.NaftaImporterSpecificationType getImporterSpecification() {
    return this.importerSpecification;
  }

  public void setImporterSpecification(be.e1.bssv.J564200.com.beone.fedex.beshipments.NaftaImporterSpecificationType importerSpecification) {
    this.importerSpecification = importerSpecification;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.Contact signatureContact;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.Contact getSignatureContact() {
    return this.signatureContact;
  }

  public void setSignatureContact(be.e1.bssv.J564200.com.beone.fedex.beshipments.Contact signatureContact) {
    this.signatureContact = signatureContact;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.NaftaProducerSpecificationType producerSpecification;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.NaftaProducerSpecificationType getProducerSpecification() {
    return this.producerSpecification;
  }

  public void setProducerSpecification(be.e1.bssv.J564200.com.beone.fedex.beshipments.NaftaProducerSpecificationType producerSpecification) {
    this.producerSpecification = producerSpecification;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.NaftaProducer[] producers;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.NaftaProducer[] getProducers() {
    return this.producers;
  }

  public void setProducers(be.e1.bssv.J564200.com.beone.fedex.beshipments.NaftaProducer[] producers) {
    this.producers = producers;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomerImageUsage[] customerImageUsages;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomerImageUsage[] getCustomerImageUsages() {
    return this.customerImageUsages;
  }

  public void setCustomerImageUsages(be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomerImageUsage[] customerImageUsages) {
    this.customerImageUsages = customerImageUsages;
  }

}
