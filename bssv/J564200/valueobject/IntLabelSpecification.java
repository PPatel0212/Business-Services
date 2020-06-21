package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.ContactAndAddress;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomerSpecifiedLabelDetail;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.LabelFormatType;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.LabelPrintingOrientationType;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.LabelSpecification;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.LabelStockType;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocumentDispositionDetail;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocumentImageType;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntLabelSpecification extends ValueObject implements Serializable
{
  private IntShippingDocumentDispositionDetail[] dispositions = null;
  private IntLabelFormatType labelFormatType = null;
  private IntShippingDocumentImageType imageType = null;
  private IntLabelStockType labelStock = null;
  private IntLabelPrintingOrientationType labelPrintingOrientation = null;
  private IntContactAndAddress printedLabelOrigin = null;
  private IntCustomerSpecifiedLabelDetail customerSpecifiedDetail = null;

  public void setDispositions(IntShippingDocumentDispositionDetail[] dispositions)
  {
    this.dispositions = dispositions;
  }

  public IntShippingDocumentDispositionDetail[] getDispositions()
  {
    return dispositions;
  }

  public void setLabelFormatType(IntLabelFormatType labelFormatType)
  {
    this.labelFormatType = labelFormatType;
  }

  public IntLabelFormatType getLabelFormatType()
  {
    return labelFormatType;
  }

  public void setImageType(IntShippingDocumentImageType imageType)
  {
    this.imageType = imageType;
  }

  public IntShippingDocumentImageType getImageType()
  {
    return imageType;
  }

  public void setLabelStock(IntLabelStockType labelStock)
  {
    this.labelStock = labelStock;
  }

  public IntLabelStockType getLabelStock()
  {
    return labelStock;
  }

  public void setLabelPrintingOrientation(IntLabelPrintingOrientationType labelPrintingOrientation)
  {
    this.labelPrintingOrientation = labelPrintingOrientation;
  }

  public IntLabelPrintingOrientationType getLabelPrintingOrientation()
  {
    return labelPrintingOrientation;
  }

  public void setPrintedLabelOrigin(IntContactAndAddress printedLabelOrigin)
  {
    this.printedLabelOrigin = printedLabelOrigin;
  }

  public IntContactAndAddress getPrintedLabelOrigin()
  {
    return printedLabelOrigin;
  }

  public void setCustomerSpecifiedDetail(IntCustomerSpecifiedLabelDetail customerSpecifiedDetail)
  {
    this.customerSpecifiedDetail = customerSpecifiedDetail;
  }

  public IntCustomerSpecifiedLabelDetail getCustomerSpecifiedDetail()
  {
    return customerSpecifiedDetail;
  }

  public void copyToLabelSpecification(LabelSpecification outData)
  {
    if(outData != null)
    {
      if(this.customerSpecifiedDetail != null)
      {
        CustomerSpecifiedLabelDetail labelDetail = new CustomerSpecifiedLabelDetail();
        this.customerSpecifiedDetail.copyToCustomerSpecifiedLabelDetail(labelDetail);
        outData.setCustomerSpecifiedDetail(labelDetail);
      }
      
      if(this.dispositions != null)
      {
        ShippingDocumentDispositionDetail[] sdddArr = new ShippingDocumentDispositionDetail[this.dispositions.length];
        for(int x=0; x<this.dispositions.length; x++)
        {
          sdddArr[x] = new ShippingDocumentDispositionDetail();
          this.dispositions[x].copyToShippingDocumentDispositionDetail(sdddArr[x]);
        }
        outData.setDispositions(sdddArr);
      }
      
      if(this.imageType != null)
      {
        ShippingDocumentImageType sdit = ShippingDocumentImageType.fromString(this.imageType.getValue());
        outData.setImageType(sdit);
      }
      
      if(this.labelFormatType != null)
      {
        LabelFormatType lft = LabelFormatType.fromString(this.labelFormatType.getValue());
        outData.setLabelFormatType(lft);
      }
      
      if(this.labelPrintingOrientation != null)
      {
        LabelPrintingOrientationType lpot = LabelPrintingOrientationType.fromString(this.labelPrintingOrientation.getValue());
        outData.setLabelPrintingOrientation(lpot);
      }
      
      if(this.labelStock != null)
      {
        LabelStockType lst = LabelStockType.fromString(this.labelStock.getValue());
        outData.setLabelStockType(lst);
      }
      
      if(this.printedLabelOrigin != null)
      {
        ContactAndAddress cta = new ContactAndAddress();
        this.printedLabelOrigin.copyToContactAndAddress(cta);
        outData.setPrintedLabelOrigin(cta);
      }
    }
  }
}
