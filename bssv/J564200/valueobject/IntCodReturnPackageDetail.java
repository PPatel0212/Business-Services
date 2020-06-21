package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.CodReturnPackageDetail;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntCodReturnPackageDetail extends ValueObject implements Serializable
{
  private IntMoney collectionAmount = null;
  private IntCodAdjustmentType adjustmentType = null;
  private String electronic = null;
  private IntPackageBarcodes barcodes = null;
  private IntShippingDocument label = null;

  public void setCollectionAmount(IntMoney collectionAmount)
  {
    this.collectionAmount = collectionAmount;
  }

  public IntMoney getCollectionAmount()
  {
    return collectionAmount;
  }

  public void setAdjustmentType(IntCodAdjustmentType adjustmentType)
  {
    this.adjustmentType = adjustmentType;
  }

  public IntCodAdjustmentType getAdjustmentType()
  {
    return adjustmentType;
  }

  public void setBarcodes(IntPackageBarcodes barcodes)
  {
    this.barcodes = barcodes;
  }

  public IntPackageBarcodes getBarcodes()
  {
    return barcodes;
  }

  public void setLabel(IntShippingDocument label)
  {
    this.label = label;
  }

  public IntShippingDocument getLabel()
  {
    return label;
  }

  public void setElectronic(String electronic)
  {
    this.electronic = electronic;
  }

  public String getElectronic()
  {
    return electronic;
  }
  
  public static IntCodReturnPackageDetail createFromCodReturnPackageDetail(CodReturnPackageDetail inData)
  {
    IntCodReturnPackageDetail crpd = null;
    if(inData != null)
    {
      crpd = new IntCodReturnPackageDetail();
      crpd.adjustmentType = IntCodAdjustmentType.createFromCodAdjustmentType(inData.getAdjustmentType());
      crpd.barcodes = IntPackageBarcodes.createFromPackageBarcodes(inData.getBarcodes());
      crpd.collectionAmount = IntMoney.createFromMoney(inData.getCollectionAmount());
      crpd.label = IntShippingDocument.createFromShippingDocument(inData.getLabel());
      
      crpd.setElectronic("N");
      if(inData.getElectronic())
      {
        crpd.setElectronic("Y");
      }
    }
    return crpd;
  }
}
