/**
 * Generated from schema type t=FreightBaseCharge@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

public class FreightBaseCharge implements java.io.Serializable {

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.FreightClassType freightClass;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.FreightClassType getFreightClass() {
    return this.freightClass;
  }

  public void setFreightClass(be.e1.bssv.J564200.com.beone.fedex.beshipments.FreightClassType freightClass) {
    this.freightClass = freightClass;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.FreightClassType ratedAsClass;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.FreightClassType getRatedAsClass() {
    return this.ratedAsClass;
  }

  public void setRatedAsClass(be.e1.bssv.J564200.com.beone.fedex.beshipments.FreightClassType ratedAsClass) {
    this.ratedAsClass = ratedAsClass;
  }

  private java.lang.String nmfcCode;

  public java.lang.String getNmfcCode() {
    return this.nmfcCode;
  }

  public void setNmfcCode(java.lang.String nmfcCode) {
    this.nmfcCode = nmfcCode;
  }

  private java.lang.String description;

  public java.lang.String getDescription() {
    return this.description;
  }

  public void setDescription(java.lang.String description) {
    this.description = description;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.Weight weight;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.Weight getWeight() {
    return this.weight;
  }

  public void setWeight(be.e1.bssv.J564200.com.beone.fedex.beshipments.Weight weight) {
    this.weight = weight;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.Money chargeRate;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.Money getChargeRate() {
    return this.chargeRate;
  }

  public void setChargeRate(be.e1.bssv.J564200.com.beone.fedex.beshipments.Money chargeRate) {
    this.chargeRate = chargeRate;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.FreightChargeBasisType chargeBasis;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.FreightChargeBasisType getChargeBasis() {
    return this.chargeBasis;
  }

  public void setChargeBasis(be.e1.bssv.J564200.com.beone.fedex.beshipments.FreightChargeBasisType chargeBasis) {
    this.chargeBasis = chargeBasis;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.Money extendedAmount;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.Money getExtendedAmount() {
    return this.extendedAmount;
  }

  public void setExtendedAmount(be.e1.bssv.J564200.com.beone.fedex.beshipments.Money extendedAmount) {
    this.extendedAmount = extendedAmount;
  }

}
