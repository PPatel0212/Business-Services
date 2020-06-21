/**
 * Generated from schema type t=ContentRecord@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

public class ContentRecord implements java.io.Serializable {

  private java.lang.String partNumber;

  public java.lang.String getPartNumber() {
    return this.partNumber;
  }

  public void setPartNumber(java.lang.String partNumber) {
    this.partNumber = partNumber;
  }

  private java.lang.String itemNumber;

  public java.lang.String getItemNumber() {
    return this.itemNumber;
  }

  public void setItemNumber(java.lang.String itemNumber) {
    this.itemNumber = itemNumber;
  }

  private java.math.BigInteger receivedQuantity;

  public java.math.BigInteger getReceivedQuantity() {
    return this.receivedQuantity;
  }

  public void setReceivedQuantity(java.math.BigInteger receivedQuantity) {
    this.receivedQuantity = receivedQuantity;
  }

  private java.lang.String description;

  public java.lang.String getDescription() {
    return this.description;
  }

  public void setDescription(java.lang.String description) {
    this.description = description;
  }

}
