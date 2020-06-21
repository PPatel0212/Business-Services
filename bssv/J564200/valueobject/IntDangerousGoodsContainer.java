package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.DangerousGoodsContainer;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.HazardousCommodityContent;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.HazardousContainerPackingType;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.RadioactiveContainerClassType;

import java.io.Serializable;

import java.math.BigInteger;

import oracle.e1.bssvfoundation.base.ValueObject;

public class IntDangerousGoodsContainer extends ValueObject implements Serializable
{
  private IntHazardousContainerPackingType packingType = null;
  private String containerType = null;
  private IntRadioactiveContainerClassType radioactiveContainerClass = null;
  private Integer numberOfContainers = null;
  private IntHazardousCommodityContent[] hazardousCommodities = null;

  public void setPackingType(IntHazardousContainerPackingType packingType)
  {
    this.packingType = packingType;
  }

  public IntHazardousContainerPackingType getPackingType()
  {
    return packingType;
  }

  public void setContainerType(String containerType)
  {
    this.containerType = containerType;
  }

  public String getContainerType()
  {
    return containerType;
  }

  public void setRadioactiveContainerClass(IntRadioactiveContainerClassType radioactiveContainerClass)
  {
    this.radioactiveContainerClass = radioactiveContainerClass;
  }

  public IntRadioactiveContainerClassType getRadioactiveContainerClass()
  {
    return radioactiveContainerClass;
  }

  public void setNumberOfContainers(Integer numberOfContainers)
  {
    this.numberOfContainers = numberOfContainers;
  }

  public Integer getNumberOfContainers()
  {
    return numberOfContainers;
  }

  public void setHazardousCommodities(IntHazardousCommodityContent[] hazardousCommodities)
  {
    this.hazardousCommodities = hazardousCommodities;
  }

  public IntHazardousCommodityContent[] getHazardousCommodities()
  {
    return hazardousCommodities;
  }
  
  public void copyToDangerousGoodsContainer(DangerousGoodsContainer outData)
  {
    if(outData != null)
    {
      outData.setContainerType(this.containerType);
      if(this.hazardousCommodities != null)
      {
        HazardousCommodityContent[] hccArr = new HazardousCommodityContent[this.hazardousCommodities.length];
        for(int x=0; x<this.hazardousCommodities.length; x++)
        {
          hccArr[x] = new HazardousCommodityContent();
          this.hazardousCommodities[x].copyToHazardousCommodityContent(hccArr[x]);
        }
        outData.setHazardousCommodities(hccArr);
      }
      
      if(this.numberOfContainers != null)
      {
        outData.setNumberOfContainers(BigInteger.valueOf(this.numberOfContainers.intValue()));
      }
      
      if(this.packingType != null)
      {
        HazardousContainerPackingType hcpt = HazardousContainerPackingType.fromString(this.packingType.getValue());
        outData.setPackingType(hcpt);
      }
      
      if(this.radioactiveContainerClass != null)
      {
        RadioactiveContainerClassType racct = RadioactiveContainerClassType.fromString(this.radioactiveContainerClass.getValue());
        outData.setRadioactiveContainerClass(racct);
      }
    }
  }
}
