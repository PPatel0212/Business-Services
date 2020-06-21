/**
 * Generated from schema type t=PriorityAlertDetail@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

public class PriorityAlertDetail implements java.io.Serializable {

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.PriorityAlertEnhancementType[] enhancementTypes;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.PriorityAlertEnhancementType[] getEnhancementTypes() {
    return this.enhancementTypes;
  }

  public void setEnhancementTypes(be.e1.bssv.J564200.com.beone.fedex.beshipments.PriorityAlertEnhancementType[] enhancementTypes) {
    this.enhancementTypes = enhancementTypes;
  }

  private java.lang.String[] content;

  public java.lang.String[] getContent() {
    return this.content;
  }

  public void setContent(java.lang.String[] content) {
    this.content = content;
  }

}
