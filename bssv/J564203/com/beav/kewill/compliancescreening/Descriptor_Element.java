/**
 * Generated from schema type t|e=descriptor|t|e=TransactionRequest|t|e=CompliantScreeningRequest|d=CompliantScreeningRequest@http://www.beav.com/kewill/compliancescreening
 */
package be.e1.bssv.J564203.com.beav.kewill.compliancescreening;

public class Descriptor_Element implements java.io.Serializable {

  private java.lang.String type;

  public java.lang.String getType() {
    return this.type;
  }

  public void setType(java.lang.String type) {
    this.type = type;
  }

  private be.e1.bssv.J564203.com.beav.kewill.compliancescreening.Attribute_Element[] attribute;

  public be.e1.bssv.J564203.com.beav.kewill.compliancescreening.Attribute_Element[] getAttribute() {
    return this.attribute;
  }

  public void setAttribute(be.e1.bssv.J564203.com.beav.kewill.compliancescreening.Attribute_Element[] attribute) {
    this.attribute = attribute;
  }

}
