package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.InternationalTrafficInArmsRegulationsDetail;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntInternationalTrafficInArmsRegulationsDetail extends ValueObject implements Serializable
{
  private String licenseOrExemptionNumber = null;

  public void setLicenseOrExemptionNumber(String licenseOrExemptionNumber)
  {
    this.licenseOrExemptionNumber = licenseOrExemptionNumber;
  }

  public String getLicenseOrExemptionNumber()
  {
    return licenseOrExemptionNumber;
  }
  
  public void copyToInternationalTrafficInArmsRegulationsDetail(InternationalTrafficInArmsRegulationsDetail outData)
  {
    if(outData != null)
    {
      outData.setLicenseOrExemptionNumber(this.licenseOrExemptionNumber);
    }
  }
}
