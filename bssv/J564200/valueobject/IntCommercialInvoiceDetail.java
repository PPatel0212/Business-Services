package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.CommercialInvoiceDetail;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomerImageUsage;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocumentFormat;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntCommercialInvoiceDetail extends ValueObject implements Serializable
{
  private IntShippingDocumentFormat format = null;
  private IntCustomerImageUsage[] customerImageUsages = null;

  public void setFormat(IntShippingDocumentFormat format)
  {
    this.format = format;
  }

  public IntShippingDocumentFormat getFormat()
  {
    return format;
  }

  public void setCustomerImageUsages(IntCustomerImageUsage[] customerImageUsages)
  {
    this.customerImageUsages = customerImageUsages;
  }

  public IntCustomerImageUsage[] getCustomerImageUsages()
  {
    return customerImageUsages;
  }
  
  public void copyToCommercialInvoiceDetail(CommercialInvoiceDetail outData)
  {
    if(outData != null)
    {
      if(this.format != null)
      {
        ShippingDocumentFormat sdf = new ShippingDocumentFormat();
        this.format.copyToShippingDocumentFormat(sdf);
        outData.setFormat(sdf);
      }
      
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
    }
  }
}
