package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.AdditionalLabelsDetail;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.ConfigurableLabelReferenceEntry;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomLabelDetail;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomerSpecifiedLabelDetail;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.DocTabContent;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.LabelMaskableDataType;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.Localization;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.RelativeVerticalPositionType;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.SecondaryBarcodeType;

import java.io.Serializable;

import java.math.BigInteger;

import oracle.e1.bssvfoundation.base.ValueObject;

public class IntCustomerSpecifiedLabelDetail extends ValueObject implements Serializable
{
  private IntDocTabContent docTabContent = null;
  private IntRelativeVerticalPositionType customContentPosition = null;
  private IntCustomLabelDetail customContent = null;
  private IntConfigurableLabelReferenceEntry[] configurableReferenceEntries = null;
  private IntLabelMaskableDataType[] maskedData = null;
  private IntSecondaryBarcodeType secondaryBarcode = null;
  private IntLocalization termsAndConditionsLocalization = null;
  private IntAdditionalLabelsDetail[] additionalLabels = null;
  private Integer airWaybillSuppressionCount = null;

  public void setDocTabContent(IntDocTabContent docTabContent)
  {
    this.docTabContent = docTabContent;
  }

  public IntDocTabContent getDocTabContent()
  {
    return docTabContent;
  }

  public void setCustomContentPosition(IntRelativeVerticalPositionType customContentPosition)
  {
    this.customContentPosition = customContentPosition;
  }

  public IntRelativeVerticalPositionType getCustomContentPosition()
  {
    return customContentPosition;
  }

  public void setCustomContent(IntCustomLabelDetail customContent)
  {
    this.customContent = customContent;
  }

  public IntCustomLabelDetail getCustomContent()
  {
    return customContent;
  }

  public void setConfigurableReferenceEntries(IntConfigurableLabelReferenceEntry[] configurableReferenceEntries)
  {
    this.configurableReferenceEntries = configurableReferenceEntries;
  }

  public IntConfigurableLabelReferenceEntry[] getConfigurableReferenceEntries()
  {
    return configurableReferenceEntries;
  }

  public void setMaskedData(IntLabelMaskableDataType[] maskedData)
  {
    this.maskedData = maskedData;
  }

  public IntLabelMaskableDataType[] getMaskedData()
  {
    return maskedData;
  }

  public void setSecondaryBarcode(IntSecondaryBarcodeType secondaryBarcode)
  {
    this.secondaryBarcode = secondaryBarcode;
  }

  public IntSecondaryBarcodeType getSecondaryBarcode()
  {
    return secondaryBarcode;
  }

  public void setTermsAndConditionsLocalization(IntLocalization termsAndConditionsLocalization)
  {
    this.termsAndConditionsLocalization = termsAndConditionsLocalization;
  }

  public IntLocalization getTermsAndConditionsLocalization()
  {
    return termsAndConditionsLocalization;
  }

  public void setAdditionalLabels(IntAdditionalLabelsDetail[] additionalLabels)
  {
    this.additionalLabels = additionalLabels;
  }

  public IntAdditionalLabelsDetail[] getAdditionalLabels()
  {
    return additionalLabels;
  }

  public void setAirWaybillSuppressionCount(Integer airWaybillSuppressionCount)
  {
    this.airWaybillSuppressionCount = airWaybillSuppressionCount;
  }

  public Integer getAirWaybillSuppressionCount()
  {
    return airWaybillSuppressionCount;
  }
  
  public void copyToCustomerSpecifiedLabelDetail(CustomerSpecifiedLabelDetail outData)
  {
    if(outData != null)
    {
      if(this.additionalLabels != null)
      {
        AdditionalLabelsDetail[] detailArr = new AdditionalLabelsDetail[this.additionalLabels.length];
        for(int x=0; x<this.additionalLabels.length; x++)
        {
          detailArr[x] = new AdditionalLabelsDetail();
          this.additionalLabels[x].copyToAdditionalLabelsDetail(detailArr[x]);
        }
        outData.setAdditionalLabels(detailArr);
      }
      
      if(this.airWaybillSuppressionCount != null)
      {
        outData.setAirWaybillSuppressionCount(BigInteger.valueOf(this.airWaybillSuppressionCount.intValue()));
      }
      
      if(this.configurableReferenceEntries != null)
      {
        ConfigurableLabelReferenceEntry[] cfgEntryArr = new ConfigurableLabelReferenceEntry[this.configurableReferenceEntries.length];
        for(int x=0; x<this.configurableReferenceEntries.length; x++)
        {
          cfgEntryArr[x] = new ConfigurableLabelReferenceEntry();
          this.configurableReferenceEntries[x].copyToConfigurableLabelReferenceEntry(cfgEntryArr[x]);            
        }
        outData.setConfigurableReferenceEntries(cfgEntryArr);
      }
      
      if(this.customContent != null)
      {
        CustomLabelDetail cld = new CustomLabelDetail();
        this.customContent.copyToCustomLabelDetail(cld);
        outData.setCustomContent(cld);
      }
      
      if(this.customContentPosition != null)
      {
        RelativeVerticalPositionType vertPos = RelativeVerticalPositionType.fromString(this.customContentPosition.getValue());
        outData.setCustomContentPosition(vertPos);
      }
      
      if(this.docTabContent != null)
      {
        DocTabContent dtc = new DocTabContent();
        this.docTabContent.copyToDocTabContent(dtc);
        outData.setDocTabContent(dtc);
      }
      
      if(this.maskedData != null)
      {
        LabelMaskableDataType[] maskTypeArr = new LabelMaskableDataType[this.maskedData.length];
        for(int x=0; x<this.maskedData.length; x++)
        {
          maskTypeArr[x] = LabelMaskableDataType.fromString(this.maskedData[x].getValue());
        }
        outData.setMaskedData(maskTypeArr);
      }
      
      if(this.secondaryBarcode != null)
      {
        SecondaryBarcodeType sbt = SecondaryBarcodeType.fromString(this.secondaryBarcode.getValue());
        outData.setSecondaryBarcode(sbt);
      }
      
      if(this.termsAndConditionsLocalization != null)
      {
        Localization locale = new Localization();
        this.termsAndConditionsLocalization.copyToLocalization(locale);
        outData.setTermsAndConditionsLocalization(locale);
      }
    }
  }
}
