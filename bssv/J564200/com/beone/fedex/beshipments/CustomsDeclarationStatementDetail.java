/**
 * Generated from schema type t=CustomsDeclarationStatementDetail@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

public class CustomsDeclarationStatementDetail implements java.io.Serializable {

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomsDeclarationStatementType[] types;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomsDeclarationStatementType[] getTypes() {
    return this.types;
  }

  public void setTypes(be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomsDeclarationStatementType[] types) {
    this.types = types;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.NaftaLowValueStatementDetail naftaLowValueStatementDetail;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.NaftaLowValueStatementDetail getNaftaLowValueStatementDetail() {
    return this.naftaLowValueStatementDetail;
  }

  public void setNaftaLowValueStatementDetail(be.e1.bssv.J564200.com.beone.fedex.beshipments.NaftaLowValueStatementDetail naftaLowValueStatementDetail) {
    this.naftaLowValueStatementDetail = naftaLowValueStatementDetail;
  }

}
