package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomerReference;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomerReferenceType;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntCustomerReference extends ValueObject implements Serializable
{
  private IntCustomerReferenceType customerReferenceType = null;
  private String value = null;

  public void setCustomerReferenceType(IntCustomerReferenceType customerReferenceType)
  {
    this.customerReferenceType = customerReferenceType;
  }

  public IntCustomerReferenceType getCustomerReferenceType()
  {
    return customerReferenceType;
  }

  public void setValue(String value)
  {
    this.value = value;
  }

  public String getValue()
  {
    return value;
  }
  
  public void copyToCustomerReference(CustomerReference outData)
  {
    if(outData != null)
    {
      outData.setValue(this.value);
      if(this.customerReferenceType != null)
      {
        CustomerReferenceType crt = CustomerReferenceType.fromString(this.customerReferenceType.getValue());
        outData.setCustomerReferenceType(crt);
      }
    }
  }
}
