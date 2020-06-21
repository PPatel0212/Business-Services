package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocument;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocumentPart;

import java.io.Serializable;

import java.math.BigInteger;

import oracle.e1.bssvfoundation.base.ValueObject;

public class IntShippingDocument extends ValueObject implements Serializable
{
  private IntReturnedShippingDocumentType type = null;
  private IntShippingDocumentGroupingType grouping = null;
  private IntShippingDocumentDispositionType shippingDocumentDisposition = null;
  private String accessReference = null;
  private IntShippingDocumentImageType imageType = null;
  private Integer resolution = null;
  private Integer copiesToPrint = null;
  private IntShippingDocumentPart[] parts = null;

  public void setType(IntReturnedShippingDocumentType type)
  {
    this.type = type;
  }

  public IntReturnedShippingDocumentType getType()
  {
    return type;
  }

  public void setGrouping(IntShippingDocumentGroupingType grouping)
  {
    this.grouping = grouping;
  }

  public IntShippingDocumentGroupingType getGrouping()
  {
    return grouping;
  }

  public void setShippingDocumentDisposition(IntShippingDocumentDispositionType shippingDocumentDisposition)
  {
    this.shippingDocumentDisposition = shippingDocumentDisposition;
  }

  public IntShippingDocumentDispositionType getShippingDocumentDisposition()
  {
    return shippingDocumentDisposition;
  }

  public void setAccessReference(String accessReference)
  {
    this.accessReference = accessReference;
  }

  public String getAccessReference()
  {
    return accessReference;
  }

  public void setImageType(IntShippingDocumentImageType imageType)
  {
    this.imageType = imageType;
  }

  public IntShippingDocumentImageType getImageType()
  {
    return imageType;
  }

  public void setResolution(Integer resolution)
  {
    this.resolution = resolution;
  }

  public Integer getResolution()
  {
    return resolution;
  }

  public void setCopiesToPrint(Integer copiesToPrint)
  {
    this.copiesToPrint = copiesToPrint;
  }

  public Integer getCopiesToPrint()
  {
    return copiesToPrint;
  }

  public void setParts(IntShippingDocumentPart[] parts)
  {
    this.parts = parts;
  }

  public IntShippingDocumentPart[] getParts()
  {
    return parts;
  }
  
  public static IntShippingDocument createFromShippingDocument(ShippingDocument inData)
  {
    IntShippingDocument shipDoc = null;
    if(inData != null)
    {
      shipDoc = new IntShippingDocument();
      
      shipDoc.setAccessReference(inData.getAccessReference());
      
      BigInteger val = inData.getCopiesToPrint();
      if(val != null)
      {
        shipDoc.setCopiesToPrint(new Integer(val.intValue()));
      }
      
      val = inData.getResolution();
      if(val != null)
      {
        shipDoc.setResolution(new Integer(val.intValue()));
      }
      
      shipDoc.setGrouping(IntShippingDocumentGroupingType.createFromShippingDocumentGroupingType(inData.getGrouping()));
      shipDoc.setImageType(IntShippingDocumentImageType.createFromShippingDocumentImageType(inData.getImageType()));
      shipDoc.setShippingDocumentDisposition(IntShippingDocumentDispositionType.createFromShippingDocumentDispositionType(inData.getShippingDocumentDisposition()));
      shipDoc.setType(IntReturnedShippingDocumentType.createFromReturnedShippingDocumentType(inData.getType()));
      
      ShippingDocumentPart[] shipDocPartArr = inData.getParts();
      if(shipDocPartArr != null)
      {
        IntShippingDocumentPart[] iShipDocPartArr = new IntShippingDocumentPart[shipDocPartArr.length];
        for(int x=0; x<shipDocPartArr.length; x++)
        {
          iShipDocPartArr[x] = IntShippingDocumentPart.createFromShippingDocumentPart(shipDocPartArr[x]);
        }
        shipDoc.setParts(iShipDocPartArr);
      }
    }
    return shipDoc;
  }
}
