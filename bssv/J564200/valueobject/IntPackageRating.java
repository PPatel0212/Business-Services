package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.PackageRateDetail;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.PackageRating;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntPackageRating extends ValueObject implements Serializable
{
  private IntReturnedRateType actualRateType = null;
  private IntMoney effectiveNetDiscount = null;
  private IntPackageRateDetail[] packageRateDetails = null;

  public void setEffectiveNetDiscount(IntMoney effectiveNetDiscount)
  {
    this.effectiveNetDiscount = effectiveNetDiscount;
  }

  public IntMoney getEffectiveNetDiscount()
  {
    return effectiveNetDiscount;
  }

  public void setActualRateType(IntReturnedRateType actualRateType)
  {
    this.actualRateType = actualRateType;
  }

  public IntReturnedRateType getActualRateType()
  {
    return actualRateType;
  }

  public void setPackageRateDetails(IntPackageRateDetail[] packageRateDetails)
  {
    this.packageRateDetails = packageRateDetails;
  }

  public IntPackageRateDetail[] getPackageRateDetails()
  {
    return packageRateDetails;
  }
  
  public static IntPackageRating createFromPackageRating(PackageRating inData)
  {
    IntPackageRating packRate = null;
    if(inData != null)
    {
      packRate = new IntPackageRating();
      packRate.actualRateType = IntReturnedRateType.createFromReturnedRateType(inData.getActualRateType());
      packRate.effectiveNetDiscount = IntMoney.createFromMoney(inData.getEffectiveNetDiscount());
      
      PackageRateDetail[] prdArr = inData.getPackageRateDetails();
      if(prdArr != null)
      {
        IntPackageRateDetail[] iPrdArr = new IntPackageRateDetail[prdArr.length];
        for(int x=0; x<prdArr.length; x++)
        {
          iPrdArr[x] = IntPackageRateDetail.createFromPackageRateDetail(prdArr[x]);
        }
        packRate.setPackageRateDetails(iPrdArr);
      }
    }
    return packRate;
  }
}
