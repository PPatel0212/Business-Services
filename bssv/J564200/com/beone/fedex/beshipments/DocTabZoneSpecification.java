/**
 * Generated from schema type t=DocTabZoneSpecification@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

public class DocTabZoneSpecification implements java.io.Serializable {

  private java.math.BigInteger zoneNumber;

  public java.math.BigInteger getZoneNumber() {
    return this.zoneNumber;
  }

  public void setZoneNumber(java.math.BigInteger zoneNumber) {
    this.zoneNumber = zoneNumber;
  }

  private java.lang.String header;

  public java.lang.String getHeader() {
    return this.header;
  }

  public void setHeader(java.lang.String header) {
    this.header = header;
  }

  private java.lang.String dataField;

  public java.lang.String getDataField() {
    return this.dataField;
  }

  public void setDataField(java.lang.String dataField) {
    this.dataField = dataField;
  }

  private java.lang.String literalValue;

  public java.lang.String getLiteralValue() {
    return this.literalValue;
  }

  public void setLiteralValue(java.lang.String literalValue) {
    this.literalValue = literalValue;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.DocTabZoneJustificationType justification;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.DocTabZoneJustificationType getJustification() {
    return this.justification;
  }

  public void setJustification(be.e1.bssv.J564200.com.beone.fedex.beshipments.DocTabZoneJustificationType justification) {
    this.justification = justification;
  }

}
