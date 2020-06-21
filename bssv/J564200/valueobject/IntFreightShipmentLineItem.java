package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.Dimensions;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.FreightClassType;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.FreightShipmentLineItem;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.HazardousCommodityOptionType;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.PhysicalPackagingType;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.Volume;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.Weight;

import java.io.Serializable;

import java.math.BigInteger;

import oracle.e1.bssvfoundation.base.ValueObject;

public class IntFreightShipmentLineItem extends ValueObject implements Serializable
{
  public IntFreightClassType freightClass = null;
  public String classProvidedByCustomer = null;
  public Integer handlingUnits = null;
  public IntPhysicalPackagingType packaging = null;
  public Integer pieces = null;
  public String nmfcCode = null;
  public IntHazardousCommodityOptionType hazardousMaterials = null;
  public String purchaseOrderNumber = null;
  public String description = null;
  public IntWeight weight = null;
  public IntDimensions dimensions = null;
  public IntVolume volume = null;

  public void setFreightClass(IntFreightClassType freightClass)
  {
    this.freightClass = freightClass;
  }

  public IntFreightClassType getFreightClass()
  {
    return freightClass;
  }

  public void setClassProvidedByCustomer(String classProvidedByCustomer)
  {
    this.classProvidedByCustomer = classProvidedByCustomer;
  }

  public String getClassProvidedByCustomer()
  {
    return classProvidedByCustomer;
  }

  public void setHandlingUnits(Integer handlingUnits)
  {
    this.handlingUnits = handlingUnits;
  }

  public Integer getHandlingUnits()
  {
    return handlingUnits;
  }

  public void setPackaging(IntPhysicalPackagingType packaging)
  {
    this.packaging = packaging;
  }

  public IntPhysicalPackagingType getPackaging()
  {
    return packaging;
  }

  public void setPieces(Integer pieces)
  {
    this.pieces = pieces;
  }

  public Integer getPieces()
  {
    return pieces;
  }

  public void setNmfcCode(String nmfcCode)
  {
    this.nmfcCode = nmfcCode;
  }

  public String getNmfcCode()
  {
    return nmfcCode;
  }

  public void setHazardousMaterials(IntHazardousCommodityOptionType hazardousMaterials)
  {
    this.hazardousMaterials = hazardousMaterials;
  }

  public IntHazardousCommodityOptionType getHazardousMaterials()
  {
    return hazardousMaterials;
  }

  public void setPurchaseOrderNumber(String purchaseOrderNumber)
  {
    this.purchaseOrderNumber = purchaseOrderNumber;
  }

  public String getPurchaseOrderNumber()
  {
    return purchaseOrderNumber;
  }

  public void setDescription(String description)
  {
    this.description = description;
  }

  public String getDescription()
  {
    return description;
  }

  public void setWeight(IntWeight weight)
  {
    this.weight = weight;
  }

  public IntWeight getWeight()
  {
    return weight;
  }

  public void setDimensions(IntDimensions dimensions)
  {
    this.dimensions = dimensions;
  }

  public IntDimensions getDimensions()
  {
    return dimensions;
  }

  public void setVolume(IntVolume volume)
  {
    this.volume = volume;
  }

  public IntVolume getVolume()
  {
    return volume;
  }
  
  public void copyToFreightShipmentLineItem(FreightShipmentLineItem outData)
  {
    if(outData != null)
    {
      if(this.freightClass != null)
      {
        FreightClassType fct = FreightClassType.fromString(this.freightClass.getValue());
        outData.setFreightClass(fct);
      }
      
      outData.setClassProvidedByCustomer(false);
      if(this.classProvidedByCustomer != null)
      {
        if(this.classProvidedByCustomer.compareToIgnoreCase("Y") == 0)
          outData.setClassProvidedByCustomer(true);
      }
      
      if(this.handlingUnits != null)
        outData.setHandlingUnits(BigInteger.valueOf(this.handlingUnits.intValue()));
      
      if(this.packaging != null)
      {
        PhysicalPackagingType ppt = PhysicalPackagingType.fromString(this.packaging.getValue());
        outData.setPackaging(ppt);
      }
      
      if(this.pieces != null)
        outData.setPieces(BigInteger.valueOf(this.pieces.intValue()));
      
      outData.setNmfcCode(this.nmfcCode);
      outData.setPurchaseOrderNumber(this.purchaseOrderNumber);
      outData.setDescription(this.description);
      
      if(this.hazardousMaterials != null)
      {
        HazardousCommodityOptionType hcot = HazardousCommodityOptionType.fromString(this.hazardousMaterials.getValue());
        outData.setHazardousMaterials(hcot);
      }
      
      if(this.weight != null)
      {
        Weight wgt = new Weight();
        this.weight.copyToWeight(wgt);
        outData.setWeight(wgt);
      }
      
      if(this.dimensions != null)
      {
        Dimensions dim = new Dimensions();
        this.dimensions.copyToDimensions(dim);
        outData.setDimensions(dim);
      }
      
      if(this.volume != null)
      {
        Volume vol = new Volume();
        this.volume.copyToVolume(vol);
        outData.setVolume(vol);
      }
    }
  }
}
