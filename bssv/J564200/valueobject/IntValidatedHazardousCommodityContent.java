package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.ValidatedHazardousCommodityContent;

import java.io.Serializable;

import java.math.BigDecimal;

import oracle.e1.bssvfoundation.base.ValueObject;

import oracle.e1.bssvfoundation.util.MathNumeric;

import weblogic.wtc.jatmi.Decimal;

public class IntValidatedHazardousCommodityContent extends ValueObject implements Serializable
{
  private IntValidatedHazardousCommodityDescription description = null;
  private IntHazardousCommodityQuantityDetail qantity = null;
  private MathNumeric massPoints = null;
  private IntHazardousCommodityOptionDetail options = null;

  public void setDescription(IntValidatedHazardousCommodityDescription description)
  {
    this.description = description;
  }

  public IntValidatedHazardousCommodityDescription getDescription()
  {
    return description;
  }

  public void setQantity(IntHazardousCommodityQuantityDetail qantity)
  {
    this.qantity = qantity;
  }

  public IntHazardousCommodityQuantityDetail getQantity()
  {
    return qantity;
  }

  public void setOptions(IntHazardousCommodityOptionDetail options)
  {
    this.options = options;
  }

  public IntHazardousCommodityOptionDetail getOptions()
  {
    return options;
  }

  public void setMassPoints(MathNumeric massPoints)
  {
    this.massPoints = massPoints;
  }

  public MathNumeric getMassPoints()
  {
    return massPoints;
  }
  
  public static IntValidatedHazardousCommodityContent createFromValidatedHazardousCommodityContent(ValidatedHazardousCommodityContent inData)
  {
    IntValidatedHazardousCommodityContent vhcc = null;
    if(inData != null)
    {
      vhcc = new IntValidatedHazardousCommodityContent();
      
      vhcc.description = IntValidatedHazardousCommodityDescription.createFromValidatedHazardousCommodityDescription(inData.getDescription());
      vhcc.options = IntHazardousCommodityOptionDetail.createFromHazardousCommodityOptionDetail(inData.getOptions());
      vhcc.qantity = IntHazardousCommodityQuantityDetail.createFromHazardousCommodityQuantityDetail(inData.getQuantity());
      
      BigDecimal val = inData.getMassPoints();
      if(val != null)
      {
        vhcc.setMassPoints(new MathNumeric(val));
      }
    }
    return vhcc;
  }
}
