package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.CompletedHazardousSummaryDetail;

import java.io.Serializable;

import java.math.BigInteger;

import oracle.e1.bssvfoundation.base.ValueObject;

public class IntCompletedHazardousSummaryDetail extends ValueObject implements Serializable
{
  private Integer smallQuantityExceptionPackageCount = null;

  public void setSmallQuantityExceptionPackageCount(Integer smallQuantityExceptionPackageCount)
  {
    this.smallQuantityExceptionPackageCount = smallQuantityExceptionPackageCount;
  }

  public Integer getSmallQuantityExceptionPackageCount()
  {
    return smallQuantityExceptionPackageCount;
  }
  
  public static IntCompletedHazardousSummaryDetail createFromCompletedHazardousSummaryDetail(CompletedHazardousSummaryDetail inData)
  {
    IntCompletedHazardousSummaryDetail chsd = null;
    if(inData != null)
    {
      chsd = new IntCompletedHazardousSummaryDetail();
      BigInteger val = inData.getSmallQuantityExceptionPackageCount();
      if(val != null)
      {
        chsd.setSmallQuantityExceptionPackageCount(val.intValue());
      }
    }
    return chsd;
  }
}
