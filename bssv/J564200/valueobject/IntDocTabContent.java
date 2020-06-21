package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.DocTabContent;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.DocTabContentBarcoded;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.DocTabContentType;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.DocTabContentZone001;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntDocTabContent extends ValueObject implements Serializable
{
  private IntDocTabContentType docTabContentType = null;
  private IntDocTabContentZone001 zone001 = null;
  private IntDocTabContentBarcoded barcoded = null;

  public void setDocTabContentType(IntDocTabContentType docTabContentType)
  {
    this.docTabContentType = docTabContentType;
  }

  public IntDocTabContentType getDocTabContentType()
  {
    return docTabContentType;
  }

  public void setZone001(IntDocTabContentZone001 zone001)
  {
    this.zone001 = zone001;
  }

  public IntDocTabContentZone001 getZone001()
  {
    return zone001;
  }

  public void setBarcoded(IntDocTabContentBarcoded barcoded)
  {
    this.barcoded = barcoded;
  }

  public IntDocTabContentBarcoded getBarcoded()
  {
    return barcoded;
  }
  
  public void copyToDocTabContent(DocTabContent outData)
  {
    if(outData != null)
    {
      if(this.barcoded != null)
      {
        DocTabContentBarcoded contentBarcode = new DocTabContentBarcoded();
        this.barcoded.copyToDocTabContentBarcoded(contentBarcode);
        outData.setBarcoded(contentBarcode);
      }
      
      if(this.docTabContentType != null)
      {
        DocTabContentType contentType = DocTabContentType.fromString(this.docTabContentType.getValue());
        outData.setDocTabContentType(contentType);
      }
      
      if(this.zone001 != null)
      {
        DocTabContentZone001 zone = new DocTabContentZone001();
        this.zone001.copyToDocTabContentZone001(zone);
        outData.setZone001(zone);
      }
    }
  }
}
