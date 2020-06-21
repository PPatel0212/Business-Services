package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.Money;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.RateElementBasisType;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.RateTypeBasisType;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.VariableHandlingChargeDetail;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

public class IntVariableHandlingChargeDetail extends ValueObject implements Serializable
{
  private IntMoney fixedValue = null;
  private MathNumeric percentValue = null;
  private IntRateElementBasisType rateElementBasis = null;
  private IntRateTypeBasisType rateTypeBasis = null;

  public void setFixedValue(IntMoney fixedValue)
  {
    this.fixedValue = fixedValue;
  }

  public IntMoney getFixedValue()
  {
    return fixedValue;
  }

  public void setPercentValue(MathNumeric percentValue)
  {
    this.percentValue = percentValue;
  }

  public MathNumeric getPercentValue()
  {
    return percentValue;
  }

  public void setRateElementBasis(IntRateElementBasisType rateElementBasis)
  {
    this.rateElementBasis = rateElementBasis;
  }

  public IntRateElementBasisType getRateElementBasis()
  {
    return rateElementBasis;
  }

  public void setRateTypeBasis(IntRateTypeBasisType rateTypeBasis)
  {
    this.rateTypeBasis = rateTypeBasis;
  }

  public IntRateTypeBasisType getRateTypeBasis()
  {
    return rateTypeBasis;
  }
  
  public void copyToVariableHandlingChargeDetail(VariableHandlingChargeDetail outData)
  {
    if(outData != null)
    {
      if(this.fixedValue != null)
      {
        Money mny = new Money();
        this.fixedValue.copyToMoney(mny);
        outData.setFixedValue(mny);
      }
      
      if(this.percentValue != null)
        outData.setPercentValue(this.percentValue.asBigDecimal());
      
      if(this.rateElementBasis != null)
      {
        RateElementBasisType rebt = RateElementBasisType.fromString(this.rateElementBasis.getValue());
        outData.setRateElementBasis(rebt);
      }
      
      if(this.rateTypeBasis != null)
      {
        RateTypeBasisType rtbt = RateTypeBasisType.fromString(this.rateTypeBasis.getValue());
        outData.setRateTypeBasis(rtbt);
      }
    }
  }
}
