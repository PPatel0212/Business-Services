package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.Contact;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.DangerousGoodsAccessibilityType;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.DangerousGoodsContainer;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.DangerousGoodsDetail;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.DangerousGoodsPackingOptionType;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.DangerousGoodsSignatory;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.HazardousCommodityOptionType;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.HazardousCommodityPackagingDetail;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.HazardousCommodityRegulationType;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.RadioactivityDetail;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntDangerousGoodsDetail extends ValueObject implements Serializable
{
  private IntHazardousCommodityRegulationType regulation = null;
  private IntDangerousGoodsAccessibilityType accessibility = null;
  private String cargoAircraftOnly = null;
  private IntHazardousCommodityOptionType[] options = null;
  private IntDangerousGoodsPackingOptionType packingOption = null;
  private String referenceId = null;
  private IntDangerousGoodsContainer[] containers = null;
  private IntHazardousCommodityPackagingDetail packaging = null;
  private IntDangerousGoodsSignatory signatory = null;
  private String emergencyContactNumber = null;
  private String offeror = null;
  private IntContact infectiousSubstanceResponsibleContact = null;
  private String additionalHandling = null;
  private IntRadioactivityDetail radioactivityDetail = null;

  public void setRegulation(IntHazardousCommodityRegulationType regulation)
  {
    this.regulation = regulation;
  }

  public IntHazardousCommodityRegulationType getRegulation()
  {
    return regulation;
  }

  public void setAccessibility(IntDangerousGoodsAccessibilityType accessibility)
  {
    this.accessibility = accessibility;
  }

  public IntDangerousGoodsAccessibilityType getAccessibility()
  {
    return accessibility;
  }

  public void setCargoAircraftOnly(String cargoAircraftOnly)
  {
    this.cargoAircraftOnly = cargoAircraftOnly;
  }

  public String getCargoAircraftOnly()
  {
    return cargoAircraftOnly;
  }

  public void setOptions(IntHazardousCommodityOptionType[] options)
  {
    this.options = options;
  }

  public IntHazardousCommodityOptionType[] getOptions()
  {
    return options;
  }

  public void setPackingOption(IntDangerousGoodsPackingOptionType packingOption)
  {
    this.packingOption = packingOption;
  }

  public IntDangerousGoodsPackingOptionType getPackingOption()
  {
    return packingOption;
  }

  public void setReferenceId(String referenceId)
  {
    this.referenceId = referenceId;
  }

  public String getReferenceId()
  {
    return referenceId;
  }

  public void setContainers(IntDangerousGoodsContainer[] containers)
  {
    this.containers = containers;
  }

  public IntDangerousGoodsContainer[] getContainers()
  {
    return containers;
  }

  public void setPackaging(IntHazardousCommodityPackagingDetail packaging)
  {
    this.packaging = packaging;
  }

  public IntHazardousCommodityPackagingDetail getPackaging()
  {
    return packaging;
  }

  public void setSignatory(IntDangerousGoodsSignatory signatory)
  {
    this.signatory = signatory;
  }

  public IntDangerousGoodsSignatory getSignatory()
  {
    return signatory;
  }

  public void setEmergencyContactNumber(String emergencyContactNumber)
  {
    this.emergencyContactNumber = emergencyContactNumber;
  }

  public String getEmergencyContactNumber()
  {
    return emergencyContactNumber;
  }

  public void setOfferor(String offeror)
  {
    this.offeror = offeror;
  }

  public String getOfferor()
  {
    return offeror;
  }

  public void setInfectiousSubstanceResponsibleContact(IntContact infectiousSubstanceResponsibleContact)
  {
    this.infectiousSubstanceResponsibleContact = infectiousSubstanceResponsibleContact;
  }

  public IntContact getInfectiousSubstanceResponsibleContact()
  {
    return infectiousSubstanceResponsibleContact;
  }

  public void setAdditionalHandling(String additionalHandling)
  {
    this.additionalHandling = additionalHandling;
  }

  public String getAdditionalHandling()
  {
    return additionalHandling;
  }

  public void setRadioactivityDetail(IntRadioactivityDetail radioactivityDetail)
  {
    this.radioactivityDetail = radioactivityDetail;
  }

  public IntRadioactivityDetail getRadioactivityDetail()
  {
    return radioactivityDetail;
  }
  
  public void copyToDangerousGoodsDetail(DangerousGoodsDetail outData)
  {
    if(outData != null)
    {
      if(this.accessibility != null)
      {
        DangerousGoodsAccessibilityType access = DangerousGoodsAccessibilityType.fromString(this.accessibility.getValue());
        outData.setAccessibility(access);
      }
      
      outData.setAdditionalHandling(this.additionalHandling);
      outData.setEmergencyContactNumber(this.emergencyContactNumber);
      outData.setOfferor(this.offeror);
      outData.setReferenceId(this.referenceId);
      
      outData.setCargoAircraftOnly(false);
      if(this.cargoAircraftOnly != null)
      {
        if(this.cargoAircraftOnly.compareToIgnoreCase("Y") == 0)
          outData.setCargoAircraftOnly(true);
      }
      
      if(this.containers != null)
      {
        DangerousGoodsContainer[] cntArr = new DangerousGoodsContainer[this.containers.length];
        for(int x=0; x<this.containers.length; x++)
        {
          cntArr[x] = new DangerousGoodsContainer();
          this.containers[x].copyToDangerousGoodsContainer(cntArr[x]);
        }
        outData.setContainers(cntArr);
      }
      
      if(this.infectiousSubstanceResponsibleContact != null)
      {
        Contact cnt = new Contact();
        this.infectiousSubstanceResponsibleContact.copyToContact(cnt);
        outData.setInfectiousSubstanceResponsibleContact(cnt);
      }
      
      if(this.options != null)
      {
        HazardousCommodityOptionType[] optArr = new HazardousCommodityOptionType[this.options.length];
        for(int x=0; x<this.options.length; x++)
        {
          optArr[x] = HazardousCommodityOptionType.fromString(this.options[x].getValue());
        }
        outData.setOptions(optArr);
      }
      
      if(this.packaging != null)
      {
        HazardousCommodityPackagingDetail hcpd = new HazardousCommodityPackagingDetail();
        this.packaging.copyToContentRecord(hcpd);
        outData.setPackaging(hcpd);
      }
      
      if(this.packingOption != null)
      {
        DangerousGoodsPackingOptionType option = DangerousGoodsPackingOptionType.fromString(this.packingOption.getValue());
        outData.setPackingOption(option);
      }
      
      if(this.radioactivityDetail != null)
      {
        RadioactivityDetail radDetail = new RadioactivityDetail();
        this.radioactivityDetail.copyToRadioactivityDetail(radDetail);
        outData.setRadioactivityDetail(radDetail);
      }
      
      if(this.regulation != null)
      {
        HazardousCommodityRegulationType hcrt = HazardousCommodityRegulationType.fromString(this.regulation.getValue());
        outData.setRegulation(hcrt);
      }
      
      if(this.signatory != null)
      {
        DangerousGoodsSignatory dgs = new DangerousGoodsSignatory();
        this.signatory.copyToContentRecord(dgs);
        outData.setSignatory(dgs);
      }
    }
  }
}
