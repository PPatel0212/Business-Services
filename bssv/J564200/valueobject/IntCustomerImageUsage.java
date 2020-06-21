package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomerImageUsage;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomerImageUsageType;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.ImageId;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntCustomerImageUsage extends ValueObject implements Serializable
{
  private IntCustomerImageUsageType type = null;
  private IntImageId id = null;

  public void setType(IntCustomerImageUsageType type)
  {
    this.type = type;
  }

  public IntCustomerImageUsageType getType()
  {
    return type;
  }

  public void setId(IntImageId id)
  {
    this.id = id;
  }

  public IntImageId getId()
  {
    return id;
  }
  
  public void copyToCustomerImageUsage(CustomerImageUsage outData)
  {
    if(outData != null)
    {
      if(this.type != null)
      {
        CustomerImageUsageType custImgType = CustomerImageUsageType.fromString(this.type.getValue());
        outData.setType(custImgType);
      }
      
      if(this.id != null)
      {
        ImageId imgId = ImageId.fromString(this.id.getValue());
        outData.setId(imgId);
      }
    }
  }
}
