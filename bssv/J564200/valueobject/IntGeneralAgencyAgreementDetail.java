package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.GeneralAgencyAgreementDetail;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocumentFormat;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntGeneralAgencyAgreementDetail extends ValueObject implements Serializable
{
  private IntShippingDocumentFormat format = null;

  public void setFormat(IntShippingDocumentFormat format)
  {
    this.format = format;
  }

  public IntShippingDocumentFormat getFormat()
  {
    return format;
  }
  
  public void copyToGeneralAgencyAgreementDetail(GeneralAgencyAgreementDetail outData)
  {
    if(outData != null)
    {
      if(this.format != null)
      {
        ShippingDocumentFormat sdf = new ShippingDocumentFormat();
        this.format.copyToShippingDocumentFormat(sdf);
        outData.setFormat(sdf);
      }
    }
  }
}
