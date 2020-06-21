package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.ContentRecord;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomerReference;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.Dimensions;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.Money;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.PackageSpecialServicesRequested;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.PhysicalPackagingType;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.RequestedPackageLineItem;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.VariableHandlingChargeDetail;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.Weight;

import java.io.Serializable;

import java.math.BigInteger;

import oracle.e1.bssvfoundation.base.ValueObject;

public class IntRequestedPackageLineItem extends ValueObject implements Serializable
{
  private Integer sequenceNumber = null;
  private Integer groupNumber = null;
  private Integer groupPackageCount = null;
  private IntVariableHandlingChargeDetail variableHandlingChargeDetail = null;
  private IntMoney insuredValue = null;
  private IntWeight weight = null;
  private IntDimensions dimensions = null;
  private IntPhysicalPackagingType physicalPackaging = null;
  private String itemDescription = null;
  private IntCustomerReference[] customerReferences = null;
  private IntPackageSpecialServicesRequested specialServicesRequested = null;
  private IntContentRecord[] contentRecord = null;

  public void setSequenceNumber(Integer sequenceNumber)
  {
    this.sequenceNumber = sequenceNumber;
  }

  public Integer getSequenceNumber()
  {
    return sequenceNumber;
  }

  public void setGroupNumber(Integer groupNumber)
  {
    this.groupNumber = groupNumber;
  }

  public Integer getGroupNumber()
  {
    return groupNumber;
  }

  public void setGroupPackageCount(Integer groupPackageCount)
  {
    this.groupPackageCount = groupPackageCount;
  }

  public Integer getGroupPackageCount()
  {
    return groupPackageCount;
  }

  public void setVariableHandlingChargeDetail(IntVariableHandlingChargeDetail variableHandlingChargeDetail)
  {
    this.variableHandlingChargeDetail = variableHandlingChargeDetail;
  }

  public IntVariableHandlingChargeDetail getVariableHandlingChargeDetail()
  {
    return variableHandlingChargeDetail;
  }

  public void setInsuredValue(IntMoney insuredValue)
  {
    this.insuredValue = insuredValue;
  }

  public IntMoney getInsuredValue()
  {
    return insuredValue;
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

  public void setPhysicalPackaging(IntPhysicalPackagingType physicalPackaging)
  {
    this.physicalPackaging = physicalPackaging;
  }

  public IntPhysicalPackagingType getPhysicalPackaging()
  {
    return physicalPackaging;
  }

  public void setItemDescription(String itemDescription)
  {
    this.itemDescription = itemDescription;
  }

  public String getItemDescription()
  {
    return itemDescription;
  }

  public void setCustomerReferences(IntCustomerReference[] customerReferences)
  {
    this.customerReferences = customerReferences;
  }

  public IntCustomerReference[] getCustomerReferences()
  {
    return customerReferences;
  }

  public void setSpecialServicesRequested(IntPackageSpecialServicesRequested specialServicesRequested)
  {
    this.specialServicesRequested = specialServicesRequested;
  }

  public IntPackageSpecialServicesRequested getSpecialServicesRequested()
  {
    return specialServicesRequested;
  }

  public void setContentRecord(IntContentRecord[] contentRecord)
  {
    this.contentRecord = contentRecord;
  }

  public IntContentRecord[] getContentRecord()
  {
    return contentRecord;
  }
  
  public void copyToRequestedPackageLineItem(RequestedPackageLineItem outData)
  {
    if(outData != null)
    {
      if(this.contentRecord != null)
      {
        ContentRecord[] ctrArr = new ContentRecord[this.contentRecord.length];
        for(int x=0; x<this.contentRecord.length; x++)
        {
          ctrArr[x] = new ContentRecord();
          this.contentRecord[x].copyToContentRecord(ctrArr[x]);
        }
        outData.setContentRecords(ctrArr);
      }
      
      if(this.customerReferences != null)
      {
        CustomerReference[] custRefArr = new CustomerReference[this.customerReferences.length];
        for(int x=0; x<this.customerReferences.length; x++)
        {
          custRefArr[x] = new CustomerReference();
          this.customerReferences[x].copyToCustomerReference(custRefArr[x]);
        }
        outData.setCustomerReferences(custRefArr);
      }
      
      if(this.dimensions != null)
      {
        Dimensions dim = new Dimensions();
        this.dimensions.copyToDimensions(dim);
        outData.setDimensions(dim);
      }
      
      if(this.groupNumber != null)
      {
        outData.setGroupNumber(BigInteger.valueOf(this.groupNumber.intValue()));
      }
      
      if(this.groupPackageCount != null)
      {
        outData.setGroupPackageCount(BigInteger.valueOf(this.groupPackageCount.intValue()));
      }
      
      if(this.insuredValue != null)
      {
        Money mny = new Money();
        this.insuredValue.copyToMoney(mny);
        outData.setInsuredValue(mny);
      }
      
      outData.setItemDescription(this.itemDescription);
      
      if(this.physicalPackaging != null)
      {
        PhysicalPackagingType ppt = PhysicalPackagingType.fromString(this.physicalPackaging.getValue());
        outData.setPhysicalPackaging(ppt);
      }
      
      if(this.sequenceNumber != null)
      {
        outData.setSequenceNumber(BigInteger.valueOf(this.sequenceNumber.intValue()));
      }
      
      if(this.specialServicesRequested != null)
      {
        PackageSpecialServicesRequested pssr = new PackageSpecialServicesRequested();
        this.specialServicesRequested.copyToPackageSpecialServicesRequested(pssr);
        outData.setSpecialServicesRequested(pssr);
      }
      
      if(this.variableHandlingChargeDetail != null)
      {
        VariableHandlingChargeDetail chargeDetail = new VariableHandlingChargeDetail();
        this.variableHandlingChargeDetail.copyToVariableHandlingChargeDetail(chargeDetail);
        outData.setVariableHandlingChargeDetail(chargeDetail);
      }
      
      if(this.weight != null)
      {
        Weight wgt = new Weight();
        this.weight.copyToWeight(wgt);
        outData.setWeight(wgt);
      }
    }
  }
}
