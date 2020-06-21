package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomLabelDetail;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.DocTabContent;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.FreightAddressLabelDetail;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.PageQuadrantType;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.RelativeVerticalPositionType;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocumentFormat;

import java.io.Serializable;

import java.math.BigInteger;

import oracle.e1.bssvfoundation.base.ValueObject;

public class IntFreightAddressLabelDetail extends ValueObject implements Serializable
{
  private IntShippingDocumentFormat format = null;
  private Integer copies = null;
  private IntPageQuadrantType startingPosition = null;
  private IntDocTabContent docTabContent = null;
  private IntRelativeVerticalPositionType customContentPosition = null;
  private IntCustomLabelDetail customContent = null;

  public void setFormat(IntShippingDocumentFormat format)
  {
    this.format = format;
  }

  public IntShippingDocumentFormat getFormat()
  {
    return format;
  }

  public void setCopies(Integer copies)
  {
    this.copies = copies;
  }

  public Integer getCopies()
  {
    return copies;
  }

  public void setStartingPosition(IntPageQuadrantType startingPosition)
  {
    this.startingPosition = startingPosition;
  }

  public IntPageQuadrantType getStartingPosition()
  {
    return startingPosition;
  }

  public void setDocTabContent(IntDocTabContent docTabContent)
  {
    this.docTabContent = docTabContent;
  }

  public IntDocTabContent getDocTabContent()
  {
    return docTabContent;
  }

  public void setCustomContentPosition(IntRelativeVerticalPositionType customContentPosition)
  {
    this.customContentPosition = customContentPosition;
  }

  public IntRelativeVerticalPositionType getCustomContentPosition()
  {
    return customContentPosition;
  }

  public void setCustomContent(IntCustomLabelDetail customContent)
  {
    this.customContent = customContent;
  }

  public IntCustomLabelDetail getCustomContent()
  {
    return customContent;
  }
  
  public void copyToFreightAddressLabelDetail(FreightAddressLabelDetail outData)
  {
    if(outData != null)
    {
      if(this.copies != null)
      {
        outData.setCopies(BigInteger.valueOf(this.copies.longValue()));
      }
      
      if(this.customContent != null)
      {
        CustomLabelDetail cld = new CustomLabelDetail();
        this.customContent.copyToCustomLabelDetail(cld);
        outData.setCustomContent(cld);
      }
      
      if(this.customContentPosition != null)
      {
        RelativeVerticalPositionType rvpt = RelativeVerticalPositionType.fromString(this.customContentPosition.getValue());
        outData.setCustomContentPosition(rvpt);
      }
      
      if(this.docTabContent != null)
      {
        DocTabContent dtc = new DocTabContent();
        this.docTabContent.copyToDocTabContent(dtc);
        outData.setDocTabContent(dtc);
      }
      
      if(this.format != null)
      {
        ShippingDocumentFormat sdf = new ShippingDocumentFormat();
        this.format.copyToShippingDocumentFormat(sdf);
        outData.setFormat(sdf);
      }
      
      if(this.startingPosition != null)
      {
        PageQuadrantType pqt = PageQuadrantType.fromString(this.startingPosition.getValue());
        outData.setStartingPosition(pqt);
      }
    }
  }
}
