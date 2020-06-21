/**
 * Generated from schema type t=CustomerSpecifiedLabelDetail@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

public class CustomerSpecifiedLabelDetail implements java.io.Serializable {

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.DocTabContent docTabContent;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.DocTabContent getDocTabContent() {
    return this.docTabContent;
  }

  public void setDocTabContent(be.e1.bssv.J564200.com.beone.fedex.beshipments.DocTabContent docTabContent) {
    this.docTabContent = docTabContent;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.RelativeVerticalPositionType customContentPosition;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.RelativeVerticalPositionType getCustomContentPosition() {
    return this.customContentPosition;
  }

  public void setCustomContentPosition(be.e1.bssv.J564200.com.beone.fedex.beshipments.RelativeVerticalPositionType customContentPosition) {
    this.customContentPosition = customContentPosition;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomLabelDetail customContent;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomLabelDetail getCustomContent() {
    return this.customContent;
  }

  public void setCustomContent(be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomLabelDetail customContent) {
    this.customContent = customContent;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.ConfigurableLabelReferenceEntry[] configurableReferenceEntries;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.ConfigurableLabelReferenceEntry[] getConfigurableReferenceEntries() {
    return this.configurableReferenceEntries;
  }

  public void setConfigurableReferenceEntries(be.e1.bssv.J564200.com.beone.fedex.beshipments.ConfigurableLabelReferenceEntry[] configurableReferenceEntries) {
    this.configurableReferenceEntries = configurableReferenceEntries;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.LabelMaskableDataType[] maskedData;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.LabelMaskableDataType[] getMaskedData() {
    return this.maskedData;
  }

  public void setMaskedData(be.e1.bssv.J564200.com.beone.fedex.beshipments.LabelMaskableDataType[] maskedData) {
    this.maskedData = maskedData;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.SecondaryBarcodeType secondaryBarcode;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.SecondaryBarcodeType getSecondaryBarcode() {
    return this.secondaryBarcode;
  }

  public void setSecondaryBarcode(be.e1.bssv.J564200.com.beone.fedex.beshipments.SecondaryBarcodeType secondaryBarcode) {
    this.secondaryBarcode = secondaryBarcode;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.Localization termsAndConditionsLocalization;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.Localization getTermsAndConditionsLocalization() {
    return this.termsAndConditionsLocalization;
  }

  public void setTermsAndConditionsLocalization(be.e1.bssv.J564200.com.beone.fedex.beshipments.Localization termsAndConditionsLocalization) {
    this.termsAndConditionsLocalization = termsAndConditionsLocalization;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.AdditionalLabelsDetail[] additionalLabels;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.AdditionalLabelsDetail[] getAdditionalLabels() {
    return this.additionalLabels;
  }

  public void setAdditionalLabels(be.e1.bssv.J564200.com.beone.fedex.beshipments.AdditionalLabelsDetail[] additionalLabels) {
    this.additionalLabels = additionalLabels;
  }

  private java.math.BigInteger airWaybillSuppressionCount;

  public java.math.BigInteger getAirWaybillSuppressionCount() {
    return this.airWaybillSuppressionCount;
  }

  public void setAirWaybillSuppressionCount(java.math.BigInteger airWaybillSuppressionCount) {
    this.airWaybillSuppressionCount = airWaybillSuppressionCount;
  }

}
