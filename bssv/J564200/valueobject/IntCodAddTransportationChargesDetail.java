package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.ChargeBasisLevelType;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.CodAddTransportationChargeBasisType;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.CodAddTransportationChargesDetail;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.RateTypeBasisType;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntCodAddTransportationChargesDetail extends ValueObject implements Serializable
{
  private IntRateTypeBasisType rateTypeBasis = null;
  private IntCodAddTransportationChargeBasisType chargeBasis = null;
  private IntChargeBasisLevelType chargeBasisLevel = null;

  public void setRateTypeBasis(IntRateTypeBasisType rateTypeBasis)
  {
    this.rateTypeBasis = rateTypeBasis;
  }

  public IntRateTypeBasisType getRateTypeBasis()
  {
    return rateTypeBasis;
  }

  public void setChargeBasis(IntCodAddTransportationChargeBasisType chargeBasis)
  {
    this.chargeBasis = chargeBasis;
  }

  public IntCodAddTransportationChargeBasisType getChargeBasis()
  {
    return chargeBasis;
  }

  public void setChargeBasisLevel(IntChargeBasisLevelType chargeBasisLevel)
  {
    this.chargeBasisLevel = chargeBasisLevel;
  }

  public IntChargeBasisLevelType getChargeBasisLevel()
  {
    return chargeBasisLevel;
  }
  
  public void copyToCodAddTransportationChargesDetail(CodAddTransportationChargesDetail outData)
  {
    if(outData != null)
    {
      if(this.chargeBasis != null)
      {
        CodAddTransportationChargeBasisType type = CodAddTransportationChargeBasisType.fromString(this.chargeBasis.getValue());
        outData.setChargeBasis(type);
      }
      
      if(this.chargeBasisLevel != null)
      {
        ChargeBasisLevelType level = ChargeBasisLevelType.fromString(this.chargeBasisLevel.getValue());
        outData.setChargeBasisLevel(level);
      }
      
      if(this.rateTypeBasis != null)
      {
        RateTypeBasisType rtbt = RateTypeBasisType.fromString(this.rateTypeBasis.getValue());
        outData.setRateTypeBasis(rtbt);
      }
    }
  }
}
