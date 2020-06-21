/**
 * Generated from schema type t|e=classifier|t|e=TransactionRequest|t|e=CompliantScreeningRequest|d=CompliantScreeningRequest@http://www.beav.com/kewill/compliancescreening
 */
package be.e1.bssv.J564203.com.beav.kewill.compliancescreening;

public class Classifier_Element implements java.io.Serializable {

  private java.lang.String type;

  public java.lang.String getType() {
    return this.type;
  }

  public void setType(java.lang.String type) {
    this.type = type;
  }

  private java.lang.String label;

  public java.lang.String getLabel() {
    return this.label;
  }

  public void setLabel(java.lang.String label) {
    this.label = label;
  }

  private be.e1.bssv.J564203.com.beav.kewill.compliancescreening.Classification_Element classification;

  public be.e1.bssv.J564203.com.beav.kewill.compliancescreening.Classification_Element getClassification() {
    return this.classification;
  }

  public void setClassification(be.e1.bssv.J564203.com.beav.kewill.compliancescreening.Classification_Element classification) {
    this.classification = classification;
  }

}
