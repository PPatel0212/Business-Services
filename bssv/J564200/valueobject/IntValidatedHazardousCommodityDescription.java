package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.HazardousCommodityAttributeType;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.ValidatedHazardousCommodityDescription;

import java.io.Serializable;

import java.math.BigInteger;

import oracle.e1.bssvfoundation.base.ValueObject;

public class IntValidatedHazardousCommodityDescription extends ValueObject implements Serializable
{
  private Integer sequenceNumber = null;
  private IntHazardousCommodityPackingGroupType packingGroup = null;
  private String packingInstructions = null;
  private String properShippingName = null;
  private String properShippingNameAndDescription = null;
  private String technicalName = null;
  private String hazardClass = null;
  private String[] subsidiaryClasses = null;
  private String symbols = null;
  private String tunnelRestrictionCode = null;
  private String specialProvisions = null;
  private IntHazardousCommodityAttributeType[] attributes = null;
  private String authorization = null;
  private String labelText = null;

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

  public void setPackingInstructions(String packingInstructions)
  {
    this.packingInstructions = packingInstructions;
  }

  public String getPackingInstructions()
  {
    return packingInstructions;
  }

  public void setProperShippingName(String properShippingName)
  {
    this.properShippingName = properShippingName;
  }

  public String getProperShippingName()
  {
    return properShippingName;
  }

  public void setProperShippingNameAndDescription(String properShippingNameAndDescription)
  {
    this.properShippingNameAndDescription = properShippingNameAndDescription;
  }

  public String getProperShippingNameAndDescription()
  {
    return properShippingNameAndDescription;
  }

  public void setTechnicalName(String technicalName)
  {
    this.technicalName = technicalName;
  }

  public String getTechnicalName()
  {
    return technicalName;
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

  public void setSymbols(String symbols)
  {
    this.symbols = symbols;
  }

  public String getSymbols()
  {
    return symbols;
  }

  public void setTunnelRestrictionCode(String tunnelRestrictionCode)
  {
    this.tunnelRestrictionCode = tunnelRestrictionCode;
  }

  public String getTunnelRestrictionCode()
  {
    return tunnelRestrictionCode;
  }

  public void setSpecialProvisions(String specialProvisions)
  {
    this.specialProvisions = specialProvisions;
  }

  public String getSpecialProvisions()
  {
    return specialProvisions;
  }

  public void setAuthorization(String authorization)
  {
    this.authorization = authorization;
  }

  public String getAuthorization()
  {
    return authorization;
  }

  public void setLabelText(String labelText)
  {
    this.labelText = labelText;
  }

  public String getLabelText()
  {
    return labelText;
  }

  public void setAttributes(IntHazardousCommodityAttributeType[] attributes)
  {
    this.attributes = attributes;
  }

  public IntHazardousCommodityAttributeType[] getAttributes()
  {
    return attributes;
  }

  public static IntValidatedHazardousCommodityDescription createFromValidatedHazardousCommodityDescription(ValidatedHazardousCommodityDescription inData)
  {
    IntValidatedHazardousCommodityDescription vhcd = null;
    if(inData != null)
    {
      vhcd = new IntValidatedHazardousCommodityDescription();
      
      HazardousCommodityAttributeType[] hcatArr = inData.getAttributes(); 
      if(hcatArr != null)
      {
        IntHazardousCommodityAttributeType[] iHcatArr = new IntHazardousCommodityAttributeType[hcatArr.length];
        for(int x=0; x<hcatArr.length; x++)
        {
          iHcatArr[x] = IntHazardousCommodityAttributeType.createFromHazardousCommodityAttributeType(hcatArr[x]);
        }
        vhcd.setAttributes(iHcatArr);
      }
      
      vhcd.setAuthorization(inData.getAuthorization());
      vhcd.setHazardClass(inData.getHazardClass());
      vhcd.setLabelText(inData.getLabelText());
      
      vhcd.packingGroup = IntHazardousCommodityPackingGroupType.createFromHazardousCommodityPackingGroupType(inData.getPackingGroup());
      
      vhcd.setPackingInstructions(inData.getPackingInstructions());
      vhcd.setProperShippingName(inData.getProperShippingName());
      vhcd.setProperShippingNameAndDescription(inData.getProperShippingNameAndDescription());
      
      BigInteger val = inData.getSequenceNumber();
      if(val != null)
      {
        vhcd.setSequenceNumber(val.intValue());
      }
      
      vhcd.setSpecialProvisions(inData.getSpecialProvisions());
      vhcd.setSymbols(inData.getSymbols());
      vhcd.setTechnicalName(inData.getTechnicalName());
      vhcd.setTunnelRestrictionCode(inData.getTunnelRestrictionCode());
      
      String[] sClass = inData.getSubsidiaryClasses();
      if(sClass != null)
      {
        vhcd.subsidiaryClasses = new String[sClass.length];
        for(int x=0; x<sClass.length; x++)
        {
          vhcd.subsidiaryClasses[x] = sClass[x];
        }
      }
    }
    return vhcd;
  }
}
