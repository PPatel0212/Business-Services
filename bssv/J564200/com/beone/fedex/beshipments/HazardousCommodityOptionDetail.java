/**
 * Generated from schema type t=HazardousCommodityOptionDetail@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

public class HazardousCommodityOptionDetail implements java.io.Serializable {

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.HazardousCommodityLabelTextOptionType labelTextOption;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.HazardousCommodityLabelTextOptionType getLabelTextOption() {
    return this.labelTextOption;
  }

  public void setLabelTextOption(be.e1.bssv.J564200.com.beone.fedex.beshipments.HazardousCommodityLabelTextOptionType labelTextOption) {
    this.labelTextOption = labelTextOption;
  }

  private java.lang.String customerSuppliedLabelText;

  public java.lang.String getCustomerSuppliedLabelText() {
    return this.customerSuppliedLabelText;
  }

  public void setCustomerSuppliedLabelText(java.lang.String customerSuppliedLabelText) {
    this.customerSuppliedLabelText = customerSuppliedLabelText;
  }

}
