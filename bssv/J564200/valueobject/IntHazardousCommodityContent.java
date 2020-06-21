package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.HazardousCommodityContent;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.HazardousCommodityDescription;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.HazardousCommodityInnerReceptacleDetail;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.HazardousCommodityOptionDetail;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.HazardousCommodityQuantityDetail;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.RadionuclideDetail;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntHazardousCommodityContent extends ValueObject implements Serializable
{
  private IntHazardousCommodityDescription description = null;
  private IntHazardousCommodityQuantityDetail quantity = null;
  private IntHazardousCommodityInnerReceptacleDetail[] innerReceptacles = null;
  private IntHazardousCommodityOptionDetail options = null;
  private IntRadionuclideDetail radionuclideDetail = null;

  public void setDescription(IntHazardousCommodityDescription description)
  {
    this.description = description;
  }

  public IntHazardousCommodityDescription getDescription()
  {
    return description;
  }

  public void setQuantity(IntHazardousCommodityQuantityDetail quantity)
  {
    this.quantity = quantity;
  }

  public IntHazardousCommodityQuantityDetail getQuantity()
  {
    return quantity;
  }

  public void setInnerReceptacles(IntHazardousCommodityInnerReceptacleDetail[] innerReceptacles)
  {
    this.innerReceptacles = innerReceptacles;
  }

  public IntHazardousCommodityInnerReceptacleDetail[] getInnerReceptacles()
  {
    return innerReceptacles;
  }

  public void setOptions(IntHazardousCommodityOptionDetail options)
  {
    this.options = options;
  }

  public IntHazardousCommodityOptionDetail getOptions()
  {
    return options;
  }

  public void setRadionuclideDetail(IntRadionuclideDetail radionuclideDetail)
  {
    this.radionuclideDetail = radionuclideDetail;
  }

  public IntRadionuclideDetail getRadionuclideDetail()
  {
    return radionuclideDetail;
  }
  
  public void copyToHazardousCommodityContent(HazardousCommodityContent outData)
  {
    if(outData != null)
    {
      if(this.description != null)
      {
        HazardousCommodityDescription desc = new HazardousCommodityDescription();
        this.description.copyToHazardousCommodityDescription(desc);
        outData.setDescription(desc);
      }
      
      if(this.innerReceptacles != null)
      {
        HazardousCommodityInnerReceptacleDetail[] receptacleArr = new HazardousCommodityInnerReceptacleDetail[this.innerReceptacles.length];
        for(int x=0; x<this.innerReceptacles.length; x++)
        {
          receptacleArr[x] = new HazardousCommodityInnerReceptacleDetail();
          this.innerReceptacles[x].copyToHazardousCommodityInnerReceptacleDetail(receptacleArr[x]);
        }
        outData.setInnerReceptacles(receptacleArr);
      }
      
      if(this.options != null)
      {
        HazardousCommodityOptionDetail optDetail = new HazardousCommodityOptionDetail();
        this.options.copyToHazardousCommodityOptionDetail(optDetail);
        outData.setOptions(optDetail);
      }
      
      if(this.quantity != null)
      {
        HazardousCommodityQuantityDetail qtyDetail = new HazardousCommodityQuantityDetail();
        this.quantity.copyToHazardousCommodityQuantityDetail(qtyDetail);
        outData.setQuantity(qtyDetail);
      }
      
      if(this.radionuclideDetail != null)
      {
        RadionuclideDetail radDetail = new RadionuclideDetail();
        this.radionuclideDetail.copyToRadionuclideDetail(radDetail);
        outData.setRadionuclideDetail(radDetail);
      }
    }
  }
}
