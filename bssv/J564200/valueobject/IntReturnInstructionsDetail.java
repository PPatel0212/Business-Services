package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.ReturnInstructionsDetail;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocumentFormat;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntReturnInstructionsDetail extends ValueObject implements Serializable
{
  private IntShippingDocumentFormat format = null;
  private String customText = null;

  public void setFormat(IntShippingDocumentFormat format)
  {
    this.format = format;
  }

  public IntShippingDocumentFormat getFormat()
  {
    return format;
  }

  public void setCustomText(String customText)
  {
    this.customText = customText;
  }

  public String getCustomText()
  {
    return customText;
  }
  
  public void copyToReturnInstructionsDetail(ReturnInstructionsDetail outData)
  {
    if(outData != null)
    {
      outData.setCustomText(this.customText);
      if(this.format != null)
      {
        ShippingDocumentFormat sdf = new ShippingDocumentFormat();
        this.format.copyToShippingDocumentFormat(sdf);
        outData.setFormat(sdf);
      }
    }
  }
}
