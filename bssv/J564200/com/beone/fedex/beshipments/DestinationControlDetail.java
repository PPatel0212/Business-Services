/**
 * Generated from schema type t=DestinationControlDetail@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

public class DestinationControlDetail implements java.io.Serializable {

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.DestinationControlStatementType[] statementTypes;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.DestinationControlStatementType[] getStatementTypes() {
    return this.statementTypes;
  }

  public void setStatementTypes(be.e1.bssv.J564200.com.beone.fedex.beshipments.DestinationControlStatementType[] statementTypes) {
    this.statementTypes = statementTypes;
  }

  private java.lang.String destinationCountries;

  public java.lang.String getDestinationCountries() {
    return this.destinationCountries;
  }

  public void setDestinationCountries(java.lang.String destinationCountries) {
    this.destinationCountries = destinationCountries;
  }

  private java.lang.String endUser;

  public java.lang.String getEndUser() {
    return this.endUser;
  }

  public void setEndUser(java.lang.String endUser) {
    this.endUser = endUser;
  }

}
