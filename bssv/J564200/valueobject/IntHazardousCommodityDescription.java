package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.HazardousCommodityDescription;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.HazardousCommodityDescriptionProcessingOptionType;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.HazardousCommodityPackingDetail;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.HazardousCommodityPackingGroupType;

import java.io.Serializable;

import java.math.BigDecimal;
import java.math.BigInteger;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

public class IntHazardousCommodityDescription extends ValueObject implements Serializable
{
  private String id = null;
  private Integer sequenceNumber = null;
  private IntHazardousCommodityPackingGroupType packingGroup = null;
  private IntHazardousCommodityPackingDetail packingDetails = null;
  private String reportableQuantity = null;
  private String properShippingName = null;
  private String technicalName = null;
  private MathNumeric percentage = null;
  private String hazardClass = null;
  private String[] subsidiaryClasses = null;
  private String labelText = null;
  private IntHazardousCommodityDescriptionProcessingOptionType[] processingOptions = null;
  private String authorization = null;

  public void setId(String id)
  {
    this.id = id;
  }

  public String getId()
  {
    return id;
  }

  public void setSequenceNumber(Integer sequenceNumber)
  {
    this.sequenceNumber = sequenceNumber;
  }

  public Integer getSequenceNumber()
  {
    return sequenceNumber;
  }

  public void setPackingGroup(IntHazardousCommodityPackingGroupType packingGroup)
  {
    this.packingGroup = packingGroup;
  }

  public IntHazardousCommodityPackingGroupType getPackingGroup()
  {
    return packingGroup;
  }

  public void setPackingDetails(IntHazardousCommodityPackingDetail packingDetails)
  {
    this.packingDetails = packingDetails;
  }

  public IntHazardousCommodityPackingDetail getPackingDetails()
  {
    return packingDetails;
  }

  public void setReportableQuantity(String reportableQuantity)
  {
    this.reportableQuantity = reportableQuantity;
  }

  public String getReportableQuantity()
  {
    return reportableQuantity;
  }

  public void setProperShippingName(String properShippingName)
  {
    this.properShippingName = properShippingName;
  }

  public String getProperShippingName()
  {
    return properShippingName;
  }

  public void setTechnicalName(String technicalName)
  {
    this.technicalName = technicalName;
  }

  public String getTechnicalName()
  {
    return technicalName;
  }

  public void setPercentage(MathNumeric percentage)
  {
    this.percentage = percentage;
  }

  public MathNumeric getPercentage()
  {
    return percentage;
  }

  public void setHazardClass(String hazardClass)
  {
    this.hazardClass = hazardClass;
  }

  public String getHazardClass()
  {
    return hazardClass;
  }

  public void setSubsidiaryClasses(String[] subsidiaryClasses)
  {
    this.subsidiaryClasses = subsidiaryClasses;
  }

  public String[] getSubsidiaryClasses()
  {
    return subsidiaryClasses;
  }

  public void setLabelText(String labelText)
  {
    this.labelText = labelText;
  }

  public String getLabelText()
  {
    return labelText;
  }

  public void setProcessingOptions(IntHazardousCommodityDescriptionProcessingOptionType[] processingOptions)
  {
    this.processingOptions = processingOptions;
  }

  public IntHazardousCommodityDescriptionProcessingOptionType[] getProcessingOptions()
  {
    return processingOptions;
  }

  public void setAuthorization(String authorization)
  {
    this.authorization = authorization;
  }

  public String getAuthorization()
  {
    return authorization;
  }
  
  public void copyToHazardousCommodityDescription(HazardousCommodityDescription outData)
  {
    if(outData != null)
    {
      outData.setId(this.id);
      outData.setProperShippingName(this.properShippingName);
      outData.setTechnicalName(this.technicalName);
      outData.setHazardClass(this.hazardClass);
      outData.setSubsidiaryClasses(this.subsidiaryClasses);
      outData.setLabelText(this.labelText);
      outData.setAuthorization(this.authorization);
      
      if(this.sequenceNumber != null)
        outData.setSequenceNumber(BigInteger.valueOf(this.sequenceNumber));
      
      if(this.packingGroup != null)
      {
        HazardousCommodityPackingGroupType hcpgt = HazardousCommodityPackingGroupType.fromString(this.packingGroup.getValue());
        outData.setPackingGroup(hcpgt);
      }
      
      if(this.processingOptions != null)
      {
        HazardousCommodityDescriptionProcessingOptionType[] poType = new HazardousCommodityDescriptionProcessingOptionType[this.processingOptions.length];
        for(int x=0; x<this.processingOptions.length; x++)
        {
          poType[x] = HazardousCommodityDescriptionProcessingOptionType.fromString(this.processingOptions[x].getValue());
        }
      }
      
      if(this.packingDetails != null)
      {
        HazardousCommodityPackingDetail hcpd = new HazardousCommodityPackingDetail();
        this.packingDetails.copyToHazardousCommodityPackingDetail(hcpd);
        outData.setPackingDetails(hcpd);
      }
      
      if(this.percentage != null)
        outData.setPercentage(this.percentage.asBigDecimal());
      
      outData.setReportableQuantity(false);
      if(this.reportableQuantity != null)
      {
        if(this.reportableQuantity.compareToIgnoreCase("Y") == 0)
          outData.setReportableQuantity(true);
      }
    }
  }
}
