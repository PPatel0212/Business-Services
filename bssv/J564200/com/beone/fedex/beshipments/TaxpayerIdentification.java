/**
 * Generated from schema type t=TaxpayerIdentification@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

public class TaxpayerIdentification implements java.io.Serializable {

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.TinType tinType;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.TinType getTinType() {
    return this.tinType;
  }

  public void setTinType(be.e1.bssv.J564200.com.beone.fedex.beshipments.TinType tinType) {
    this.tinType = tinType;
  }

  private java.lang.String number;

  public java.lang.String getNumber() {
    return this.number;
  }

  public void setNumber(java.lang.String number) {
    this.number = number;
  }

  private java.lang.String usage;

  public java.lang.String getUsage() {
    return this.usage;
  }

  public void setUsage(java.lang.String usage) {
    this.usage = usage;
  }

}
