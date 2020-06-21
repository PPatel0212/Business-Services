package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.ValidatedHazardousCommodityContent;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.ValidatedHazardousContainer;

import java.io.Serializable;

import java.math.BigDecimal;

import oracle.e1.bssvfoundation.base.ValueObject;

import oracle.e1.bssvfoundation.util.MathNumeric;

import weblogic.wtc.jatmi.Decimal;

public class IntValidatedHazardousContainer extends ValueObject implements Serializable
{
  private MathNumeric qValue = null;
  private IntValidatedHazardousCommodityContent[] HazardousCommodities = null;


  public void setHazardousCommodities(IntValidatedHazardousCommodityContent[] HazardousCommodities)
  {
    this.HazardousCommodities = HazardousCommodities;
  }

  public IntValidatedHazardousCommodityContent[] getHazardousCommodities()
  {
    return HazardousCommodities;
  }

  public void setQValue(MathNumeric qValue)
  {
    this.qValue = qValue;
  }

  public MathNumeric getQValue()
  {
    return qValue;
  }
  
  public static IntValidatedHazardousContainer createFromValidatedHazardousContainer(ValidatedHazardousContainer inData)
  {
    IntValidatedHazardousContainer vhc = null;
    if(inData != null)
    {
      vhc = new IntValidatedHazardousContainer();
      
      BigDecimal val = inData.getQValue();
      if(val != null)
      {
        vhc.setQValue(new MathNumeric(val));
      }
      
      ValidatedHazardousCommodityContent[] vhccArr = inData.getHazardousCommodities();
      if(vhccArr != null)
      {
        IntValidatedHazardousCommodityContent[] iVhccArr = new IntValidatedHazardousCommodityContent[vhccArr.length];
        for(int x=0; x<vhccArr.length; x++)
        {
          iVhccArr[x] = IntValidatedHazardousCommodityContent.createFromValidatedHazardousCommodityContent(vhccArr[x]);
        }
        vhc.setHazardousCommodities(iVhccArr);
      }
    }
    return vhc;
  }
}
