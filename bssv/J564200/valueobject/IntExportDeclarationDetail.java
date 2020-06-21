package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomerImageUsage;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.ExportDeclarationDetail;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocumentFormat;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntExportDeclarationDetail extends ValueObject implements Serializable
{
  IntShippingDocumentFormat documentFormat = null;
  IntCustomerImageUsage[] customerImageUsages = null;

  public void setDocumentFormat(IntShippingDocumentFormat documentFormat)
  {
    this.documentFormat = documentFormat;
  }

  public IntShippingDocumentFormat getDocumentFormat()
  {
    return documentFormat;
  }

  public void setCustomerImageUsages(IntCustomerImageUsage[] customerImageUsages)
  {
    this.customerImageUsages = customerImageUsages;
  }

  public IntCustomerImageUsage[] getCustomerImageUsages()
  {
    return customerImageUsages;
  }
  
  public void copyToExportDeclarationDetail(ExportDeclarationDetail outData)
  {
    if(outData != null)
    {
      if(this.documentFormat != null)
      {
        ShippingDocumentFormat sdf = new ShippingDocumentFormat();
        this.documentFormat.copyToShippingDocumentFormat(sdf);
        outData.setDocumentFormat(sdf);
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
