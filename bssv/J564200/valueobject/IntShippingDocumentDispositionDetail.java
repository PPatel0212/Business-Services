package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocumentDispositionDetail;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocumentDispositionType;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocumentEMailDetail;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocumentGroupingType;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocumentPrintDetail;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntShippingDocumentDispositionDetail extends ValueObject implements Serializable
{
  private IntShippingDocumentDispositionType dispositionType = null;
  private IntShippingDocumentGroupingType grouping = null;
  private IntShippingDocumentEMailDetail emailDetail = null;
  private IntShippingDocumentPrintDetail printDetail = null;

  public void setDispositionType(IntShippingDocumentDispositionType dispositionType)
  {
    this.dispositionType = dispositionType;
  }

  public IntShippingDocumentDispositionType getDispositionType()
  {
    return dispositionType;
  }

  public void setGrouping(IntShippingDocumentGroupingType grouping)
  {
    this.grouping = grouping;
  }

  public IntShippingDocumentGroupingType getGrouping()
  {
    return grouping;
  }

  public void setEmailDetail(IntShippingDocumentEMailDetail emailDetail)
  {
    this.emailDetail = emailDetail;
  }

  public IntShippingDocumentEMailDetail getEmailDetail()
  {
    return emailDetail;
  }

  public void setPrintDetail(IntShippingDocumentPrintDetail printDetail)
  {
    this.printDetail = printDetail;
  }

  public IntShippingDocumentPrintDetail getPrintDetail()
  {
    return printDetail;
  }
  
  public void copyToShippingDocumentDispositionDetail(ShippingDocumentDispositionDetail outData)
  {
    if(outData != null)
    {
      if(this.dispositionType != null)
      {
        ShippingDocumentDispositionType sddt = ShippingDocumentDispositionType.fromString(this.dispositionType.getValue());
        outData.setDispositionType(sddt);
      }
      
      if(this.emailDetail != null)
      {
        ShippingDocumentEMailDetail emDetail = new ShippingDocumentEMailDetail();
        this.emailDetail.copyToShippingDocumentEMailDetail(emDetail);
        outData.setEMailDetail(emDetail);
      }
      
      if(this.grouping != null)
      {
        ShippingDocumentGroupingType sdgt = ShippingDocumentGroupingType.fromString(this.grouping.getValue());
        outData.setGrouping(sdgt);
      }
      
      if(this.printDetail != null)
      {
        ShippingDocumentPrintDetail sdpd = new ShippingDocumentPrintDetail();
        this.printDetail.copyToShippingDocumentPrintDetail(sdpd);
        outData.setPrintDetail(sdpd);
      }
    }
  }
}
