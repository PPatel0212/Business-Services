package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.HazardousCommodityLabelTextOptionType;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.HazardousCommodityOptionDetail;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntHazardousCommodityOptionDetail extends ValueObject implements Serializable
{
  private String customerSuppliedLabelText = null;
  private IntHazardousCommodityLabelTextOptionType labelTextOption = null;

  public void setCustomerSuppliedLabelText(String customerSuppliedLabelText)
  {
    this.customerSuppliedLabelText = customerSuppliedLabelText;
  }

  public String getCustomerSuppliedLabelText()
  {
    return customerSuppliedLabelText;
  }

  public void setLabelTextOption(IntHazardousCommodityLabelTextOptionType labelTextOption)
  {
    this.labelTextOption = labelTextOption;
  }

  public IntHazardousCommodityLabelTextOptionType getLabelTextOption()
  {
    return labelTextOption;
  }
  
  public void copyToHazardousCommodityOptionDetail(HazardousCommodityOptionDetail outData)
  {
    if(outData != null)
    {
      outData.setCustomerSuppliedLabelText(this.customerSuppliedLabelText);
      if(this.labelTextOption != null)
      {
        HazardousCommodityLabelTextOptionType hcltot = HazardousCommodityLabelTextOptionType.fromString(this.labelTextOption.getValue());
        outData.setLabelTextOption(hcltot);
      }
    }
  }
  
  public static IntHazardousCommodityOptionDetail createFromHazardousCommodityOptionDetail(HazardousCommodityOptionDetail inData)
  {
    IntHazardousCommodityOptionDetail hcod = null;
    if(hcod != null)
    {
      hcod = new IntHazardousCommodityOptionDetail();
      hcod.setCustomerSuppliedLabelText(inData.getCustomerSuppliedLabelText());
      hcod.labelTextOption = IntHazardousCommodityLabelTextOptionType.createFromHazardousCommodityLabelTextOptionType(inData.getLabelTextOption());
    }
    return hcod;
  }
}
