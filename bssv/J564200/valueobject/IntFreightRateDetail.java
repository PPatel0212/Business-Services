package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.FreightBaseCharge;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.FreightRateDetail;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.FreightRateNotation;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntFreightRateDetail extends ValueObject implements Serializable
{
  private String quoteNumber = null;
  private IntFreightRateQuoteType freightRateQuoteType = null;
  private IntFreightBaseChargeCalculationType baseChargeCalculation = null;
  private IntFreightBaseCharge[] baseCharges = null;
  private IntFreightRateNotation[] notations = null;

  public void setQuoteNumber(String quoteNumber)
  {
    this.quoteNumber = quoteNumber;
  }

  public String getQuoteNumber()
  {
    return quoteNumber;
  }

  public void setFreightRateQuoteType(IntFreightRateQuoteType freightRateQuoteType)
  {
    this.freightRateQuoteType = freightRateQuoteType;
  }

  public IntFreightRateQuoteType getFreightRateQuoteType()
  {
    return freightRateQuoteType;
  }

  public void setBaseChargeCalculation(IntFreightBaseChargeCalculationType baseChargeCalculation)
  {
    this.baseChargeCalculation = baseChargeCalculation;
  }

  public IntFreightBaseChargeCalculationType getBaseChargeCalculation()
  {
    return baseChargeCalculation;
  }

  public void setBaseCharges(IntFreightBaseCharge[] baseCharges)
  {
    this.baseCharges = baseCharges;
  }

  public IntFreightBaseCharge[] getBaseCharges()
  {
    return baseCharges;
  }

  public void setNotations(IntFreightRateNotation[] notations)
  {
    this.notations = notations;
  }

  public IntFreightRateNotation[] getNotations()
  {
    return notations;
  }
  
  public static IntFreightRateDetail createFromFreightRateDetail(FreightRateDetail inData)
  {
    IntFreightRateDetail frd = null;
    if(inData != null)
    {
      frd = new IntFreightRateDetail();
      
      frd.baseChargeCalculation = IntFreightBaseChargeCalculationType.createFromFreightBaseChargeCalculationType(inData.getBaseChargeCalculation());
      frd.setQuoteNumber(inData.getQuoteNumber());
      frd.freightRateQuoteType = IntFreightRateQuoteType.createFromFreightRateQuoteType(inData.getQuoteType());
      
      FreightBaseCharge[] fbcArr = inData.getBaseCharges();
      if(fbcArr != null)
      {
        IntFreightBaseCharge[] iFbcArr = new IntFreightBaseCharge[fbcArr.length];
        for(int x=0; x<fbcArr.length; x++)
        {
          iFbcArr[x] = IntFreightBaseCharge.createFromFreightBaseCharge(fbcArr[x]);
        }
        frd.setBaseCharges(iFbcArr);
      }
      
      FreightRateNotation[] frnArr = inData.getNotations();
      if(frnArr != null)
      {
        IntFreightRateNotation[] iFrnArr = new IntFreightRateNotation[frnArr.length];
        for(int x=0; x<frnArr.length; x++)
        {
          iFrnArr[x] = IntFreightRateNotation.createFromFreightRateNotation(frnArr[x]);
        }
        frd.setNotations(iFrnArr);
      }
                                                                                                                                                       
    }
    return frd;
  }
}
