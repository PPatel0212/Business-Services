package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.LiabilityCoverageDetail;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.LiabilityCoverageType;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.Money;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

public class IntLiabilityCoverageDetail extends ValueObject implements Serializable
{
  private IntLiabilityCoverageType coverageType = null;
  private IntMoney coverageAmount = null;

  public void setCoverageType(IntLiabilityCoverageType coverageType)
  {
    this.coverageType = coverageType;
  }

  public IntLiabilityCoverageType getCoverageType()
  {
    return coverageType;
  }

  public void setCoverageAmount(IntMoney coverageAmount)
  {
    this.coverageAmount = coverageAmount;
  }

  public IntMoney getCoverageAmount()
  {
    return coverageAmount;
  }

  public void copyToLiabilityCoverageDetail(LiabilityCoverageDetail outData)
  {
    if(outData != null)
    {
      if(this.coverageType != null)
      {
        LiabilityCoverageType lct = LiabilityCoverageType.fromString(this.coverageType.getValue());
        outData.setCoverageType(lct);
      }
      if(this.coverageAmount != null)
      {
        Money mny = new Money();
        this.coverageAmount.copyToMoney(mny);
        outData.setCoverageAmount(mny);
      }
    }
  }
}
