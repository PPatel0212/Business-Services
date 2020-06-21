package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocumentPart;

import java.io.Serializable;

import java.math.BigInteger;

import oracle.e1.bssvfoundation.base.ValueObject;

public class IntShippingDocumentPart extends ValueObject implements Serializable
{
  private Integer documentPartSequenceNumber = null;
  private String image = null;

  public void setDocumentPartSequenceNumber(Integer documentPartSequenceNumber)
  {
    this.documentPartSequenceNumber = documentPartSequenceNumber;
  }

  public Integer getDocumentPartSequenceNumber()
  {
    return documentPartSequenceNumber;
  }

  public void setImage(String image)
  {
    this.image = image;
  }

  public String getImage()
  {
    return image;
  }
  
  public static IntShippingDocumentPart createFromShippingDocumentPart(ShippingDocumentPart inData)
  {
    IntShippingDocumentPart shipDocPart = null;
    if(inData != null)
    {
      shipDocPart = new IntShippingDocumentPart();
      shipDocPart.setImage(inData.getImage());
      
      BigInteger val = inData.getDocumentPartSequenceNumber();
      if(val != null)
      {
        shipDocPart.setDocumentPartSequenceNumber(new Integer(val.intValue()));
      }
    }
    return shipDocPart;
  }
}
