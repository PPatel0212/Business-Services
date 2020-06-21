package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocumentPrintDetail;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntShippingDocumentPrintDetail extends ValueObject implements Serializable
{
  private String printerId = null;

  public void setPrinterId(String printerId)
  {
    this.printerId = printerId;
  }

  public String getPrinterId()
  {
    return printerId;
  }
  
  public void copyToShippingDocumentPrintDetail(ShippingDocumentPrintDetail outData)
  {
    if(outData != null)
    {
      outData.setPrinterId(this.printerId);
    }
  }
}
