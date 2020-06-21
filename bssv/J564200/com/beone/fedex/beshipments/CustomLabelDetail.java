/**
 * Generated from schema type t=CustomLabelDetail@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

public class CustomLabelDetail implements java.io.Serializable {

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomLabelCoordinateUnits coordinateUnits;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomLabelCoordinateUnits getCoordinateUnits() {
    return this.coordinateUnits;
  }

  public void setCoordinateUnits(be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomLabelCoordinateUnits coordinateUnits) {
    this.coordinateUnits = coordinateUnits;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomLabelTextEntry[] textEntries;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomLabelTextEntry[] getTextEntries() {
    return this.textEntries;
  }

  public void setTextEntries(be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomLabelTextEntry[] textEntries) {
    this.textEntries = textEntries;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomLabelGraphicEntry[] graphicEntries;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomLabelGraphicEntry[] getGraphicEntries() {
    return this.graphicEntries;
  }

  public void setGraphicEntries(be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomLabelGraphicEntry[] graphicEntries) {
    this.graphicEntries = graphicEntries;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomLabelBoxEntry[] boxEntries;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomLabelBoxEntry[] getBoxEntries() {
    return this.boxEntries;
  }

  public void setBoxEntries(be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomLabelBoxEntry[] boxEntries) {
    this.boxEntries = boxEntries;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomLabelBarcodeEntry[] barcodeEntries;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomLabelBarcodeEntry[] getBarcodeEntries() {
    return this.barcodeEntries;
  }

  public void setBarcodeEntries(be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomLabelBarcodeEntry[] barcodeEntries) {
    this.barcodeEntries = barcodeEntries;
  }

}
