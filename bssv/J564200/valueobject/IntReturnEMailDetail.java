package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.ReturnEMailAllowedSpecialServiceType;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.ReturnEMailDetail;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntReturnEMailDetail extends ValueObject implements Serializable
{
  private String merchantPhoneNumber = null;
  private IntReturnEMailAllowedSpecialServiceType[] allowedSpecialServices = null;

  public void setMerchantPhoneNumber(String merchantPhoneNumber)
  {
    this.merchantPhoneNumber = merchantPhoneNumber;
  }

  public String getMerchantPhoneNumber()
  {
    return merchantPhoneNumber;
  }

  public void setAllowedSpecialServices(IntReturnEMailAllowedSpecialServiceType[] allowedSpecialServices)
  {
    this.allowedSpecialServices = allowedSpecialServices;
  }

  public IntReturnEMailAllowedSpecialServiceType[] getAllowedSpecialServices()
  {
    return allowedSpecialServices;
  }
  
  public void copyToReturnEMailDetail(ReturnEMailDetail outData)
  {
    if(outData != null)
    {
      outData.setMerchantPhoneNumber(this.merchantPhoneNumber);
      if(this.allowedSpecialServices != null)
      {
        ReturnEMailAllowedSpecialServiceType[] svcTypeArr = new ReturnEMailAllowedSpecialServiceType[this.allowedSpecialServices.length];
        for(int x=0; x<this.allowedSpecialServices.length; x++)
        {
          svcTypeArr[x] = ReturnEMailAllowedSpecialServiceType.fromString(this.allowedSpecialServices[x].getValue());
        }
        outData.setAllowedSpecialServices(svcTypeArr);
      }
    }
  }
}
