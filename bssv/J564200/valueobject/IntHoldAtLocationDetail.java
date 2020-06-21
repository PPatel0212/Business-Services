package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.ContactAndAddress;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.FedExLocationType;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.HoldAtLocationDetail;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntHoldAtLocationDetail extends ValueObject implements Serializable
{
  private String phoneNumber = null;
  private IntContactAndAddress locationContactAndAddress = null;
  private IntFedExLocationType locationType = null;

  public void setPhoneNumber(String phoneNumber)
  {
    this.phoneNumber = phoneNumber;
  }

  public String getPhoneNumber()
  {
    return phoneNumber;
  }

  public void setLocationContactAndAddress(IntContactAndAddress locationContactAndAddress)
  {
    this.locationContactAndAddress = locationContactAndAddress;
  }

  public IntContactAndAddress getLocationContactAndAddress()
  {
    return locationContactAndAddress;
  }

  public void setLocationType(IntFedExLocationType locationType)
  {
    this.locationType = locationType;
  }

  public IntFedExLocationType getLocationType()
  {
    return locationType;
  }
  
  public void copyToHoldAtLocationDetail(HoldAtLocationDetail outData)
  {
    if(outData != null)
    {
      if(this.locationContactAndAddress != null)
      {
        ContactAndAddress cta = new ContactAndAddress();
        this.locationContactAndAddress.copyToContactAndAddress(cta);
        outData.setLocationContactAndAddress(cta);
      }
      if(this.locationType != null)
      {
        FedExLocationType fedType = FedExLocationType.fromString(this.locationType.getValue());
        outData.setLocationType(fedType);
      }
      outData.setPhoneNumber(this.phoneNumber);
    }
  }
}
