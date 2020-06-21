package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.HazardousCommodityInnerReceptacleDetail;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.HazardousCommodityQuantityDetail;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntHazardousCommodityInnerReceptacleDetail extends ValueObject implements Serializable
{
  private IntHazardousCommodityQuantityDetail quantity = null;

  public void setQuantity(IntHazardousCommodityQuantityDetail quantity)
  {
    this.quantity = quantity;
  }

  public IntHazardousCommodityQuantityDetail getQuantity()
  {
    return quantity;
  }
  
  public void copyToHazardousCommodityInnerReceptacleDetail(HazardousCommodityInnerReceptacleDetail outData)
  {
    if(outData != null)
    {
      HazardousCommodityQuantityDetail hcqd = new HazardousCommodityQuantityDetail();
      this.quantity.copyToHazardousCommodityQuantityDetail(hcqd);
      outData.setQuantity(hcqd);
    }
  }
}
