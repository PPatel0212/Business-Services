/**
 * Generated from schema type t|e=TransactionLine|t|e=TransactionRequest|t|e=CompliantScreeningRequest|d=CompliantScreeningRequest@http://www.beav.com/kewill/compliancescreening
 */
package be.e1.bssv.J564203.com.beav.kewill.compliancescreening;

public class TransactionLine implements java.io.Serializable {

  private be.e1.bssv.J564203.com.beav.kewill.compliancescreening.Product product;

  public be.e1.bssv.J564203.com.beav.kewill.compliancescreening.Product getProduct() {
    return this.product;
  }

  public void setProduct(be.e1.bssv.J564203.com.beav.kewill.compliancescreening.Product product) {
    this.product = product;
  }

  private java.lang.String userDefined;

  public java.lang.String getUserDefined() {
    return this.userDefined;
  }

  public void setUserDefined(java.lang.String userDefined) {
    this.userDefined = userDefined;
  }

  private be.e1.bssv.J564203.com.beav.kewill.compliancescreening.Party_Element1 party;

  public be.e1.bssv.J564203.com.beav.kewill.compliancescreening.Party_Element1 getParty() {
    return this.party;
  }

  public void setParty(be.e1.bssv.J564203.com.beav.kewill.compliancescreening.Party_Element1 party) {
    this.party = party;
  }

}
