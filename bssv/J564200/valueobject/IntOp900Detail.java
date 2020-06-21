package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomerImageUsage;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomerReferenceType;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.Op900Detail;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocumentFormat;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntOp900Detail extends ValueObject implements Serializable
{
  private IntShippingDocumentFormat format = null;
  private IntCustomerReferenceType reference = null;
  private IntCustomerImageUsage[] customerImageUsages = null;
  private String signatureName = null;

  public void setFormat(IntShippingDocumentFormat format)
  {
    this.format = format;
  }

  public IntShippingDocumentFormat getFormat()
  {
    return format;
  }

  public void setReference(IntCustomerReferenceType reference)
  {
    this.reference = reference;
  }

  public IntCustomerReferenceType getReference()
  {
    return reference;
  }

  public void setCustomerImageUsages(IntCustomerImageUsage[] customerImageUsages)
  {
    this.customerImageUsages = customerImageUsages;
  }

  public IntCustomerImageUsage[] getCustomerImageUsages()
  {
    return customerImageUsages;
  }

  public void setSignatureName(String signatureName)
  {
    this.signatureName = signatureName;
  }

  public String getSignatureName()
  {
    return signatureName;
  }
  
  public void copyToOp900Detail(Op900Detail outData)
  {
    if(outData != null)
    {
      if(this.customerImageUsages != null)
      {
        CustomerImageUsage[] ciuArr = new CustomerImageUsage[this.customerImageUsages.length];
        for(int x=0; x<this.customerImageUsages.length; x++)
        {
          ciuArr[x] = new CustomerImageUsage();
          this.customerImageUsages[x].copyToCustomerImageUsage(ciuArr[x]);
        }
        outData.setCustomerImageUsages(ciuArr);
      }
      
      if(this.format != null)
      {
        ShippingDocumentFormat sdf = new ShippingDocumentFormat();
        this.format.copyToShippingDocumentFormat(sdf);
        outData.setFormat(sdf);
      }
      
      if(this.reference != null)
      {
        CustomerReferenceType crt = CustomerReferenceType.fromString(this.reference.getValue());
        outData.setReference(crt);
      }
      
      outData.setSignatureName(this.signatureName);
    }
  }
}
