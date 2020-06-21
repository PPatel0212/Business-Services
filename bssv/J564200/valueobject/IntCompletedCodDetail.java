package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.CompletedCodDetail;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntCompletedCodDetail extends ValueObject implements Serializable
{
  private IntMoney collectionAmount = null;
  private IntCodAdjustmentType adjustmentType = null;

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
  
  public static IntCompletedCodDetail createFromCompletedCodDetail(CompletedCodDetail inData)
  {
    IntCompletedCodDetail ccd = null;
    if(inData != null)
    {
      ccd = new IntCompletedCodDetail();
      ccd.setAdjustmentType(IntCodAdjustmentType.createFromCodAdjustmentType(inData.getAdjustmentType()));
      ccd.setCollectionAmount(IntMoney.createFromMoney(inData.getCollectionAmount()));
    }
    return ccd;
  }
}
