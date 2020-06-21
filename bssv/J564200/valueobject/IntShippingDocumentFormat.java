package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.LinearMeasure;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.Localization;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocumentDispositionDetail;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocumentFormat;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocumentImageType;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocumentStockType;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntShippingDocumentFormat extends ValueObject implements Serializable
{
  private IntShippingDocumentDispositionDetail[] dispositions = null;
  private IntLinearMeasure topOfPageOffset = null;
  private IntShippingDocumentImageType imageType = null;
  private IntShippingDocumentStockType stockType = null;
  private IntLocalization localization = null;
  private String customDocumentIdentifier = null;

  public void setDispositions(IntShippingDocumentDispositionDetail[] dispositions)
  {
    this.dispositions = dispositions;
  }

  public IntShippingDocumentDispositionDetail[] getDispositions()
  {
    return dispositions;
  }

  public void setTopOfPageOffset(IntLinearMeasure topOfPageOffset)
  {
    this.topOfPageOffset = topOfPageOffset;
  }

  public IntLinearMeasure getTopOfPageOffset()
  {
    return topOfPageOffset;
  }

  public void setImageType(IntShippingDocumentImageType imageType)
  {
    this.imageType = imageType;
  }

  public IntShippingDocumentImageType getImageType()
  {
    return imageType;
  }

  public void setStockType(IntShippingDocumentStockType stockType)
  {
    this.stockType = stockType;
  }

  public IntShippingDocumentStockType getStockType()
  {
    return stockType;
  }

  public void setLocalization(IntLocalization localization)
  {
    this.localization = localization;
  }

  public IntLocalization getLocalization()
  {
    return localization;
  }

  public void setCustomDocumentIdentifier(String customDocumentIdentifier)
  {
    this.customDocumentIdentifier = customDocumentIdentifier;
  }

  public String getCustomDocumentIdentifier()
  {
    return customDocumentIdentifier;
  }
  
  public void copyToShippingDocumentFormat(ShippingDocumentFormat outData)
  {
    if(outData != null)
    {
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
      
      if(this.topOfPageOffset != null)
      {
        LinearMeasure lm = new LinearMeasure();
        this.topOfPageOffset.copyToLinearMeasure(lm);
        outData.setTopOfPageOffset(lm);
      }
      
      if(this.imageType != null)
      {
        ShippingDocumentImageType sdit = ShippingDocumentImageType.fromString(this.imageType.getValue());
        outData.setImageType(sdit);
      }
      
      if(this.stockType != null)
      {
        ShippingDocumentStockType sdst = ShippingDocumentStockType.fromString(this.stockType.getValue());
        outData.setStockType(sdst);
      }
      
      if(this.localization != null)
      {
        Localization locale = new Localization();
        this.localization.copyToLocalization(locale);
        outData.setLocalization(locale);
      }
      
      outData.setCustomDocumentIdentifier(this.customDocumentIdentifier);
    }
  }
}
