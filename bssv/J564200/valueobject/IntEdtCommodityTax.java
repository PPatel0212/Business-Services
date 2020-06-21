package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.EdtCommodityTax;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.EdtTaxDetail;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntEdtCommodityTax extends ValueObject implements Serializable
{
  private String harmonizedCode = null;
  private IntEdtTaxDetail[] taxes = null;

  public void setHarmonizedCode(String harmonizedCode)
  {
    this.harmonizedCode = harmonizedCode;
  }

  public String getHarmonizedCode()
  {
    return harmonizedCode;
  }

  public void setTaxes(IntEdtTaxDetail[] taxes)
  {
    this.taxes = taxes;
  }

  public IntEdtTaxDetail[] getTaxes()
  {
    return taxes;
  }
  
  public static IntEdtCommodityTax createFromEdtCommodityTax(EdtCommodityTax inData)
  {
    IntEdtCommodityTax ect = null;
    if(inData != null)
    {
      ect = new IntEdtCommodityTax();
      
      ect.setHarmonizedCode(inData.getHarmonizedCode());
      
      EdtTaxDetail[] etdArr = inData.getTaxes();
      if(etdArr != null)
      {
        IntEdtTaxDetail[] iEtdArr = new IntEdtTaxDetail[etdArr.length];
        for(int x=0; x<etdArr.length; x++)
        {
          iEtdArr[x] = IntEdtTaxDetail.createFromEdtTaxDetail(etdArr[x]);
        }
        ect.setTaxes(iEtdArr);
      }
    }
    return ect;
  }
}
