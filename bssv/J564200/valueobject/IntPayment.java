package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.Payment;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.PaymentType;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.Payor;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntPayment extends ValueObject implements Serializable
{
  private IntPaymentType paymentType = null;
  private IntPayor payor = null;

  public void setPaymentType(IntPaymentType paymentType)
  {
    this.paymentType = paymentType;
  }

  public IntPaymentType getPaymentType()
  {
    return paymentType;
  }

  public void setPayor(IntPayor payor)
  {
    this.payor = payor;
  }

  public IntPayor getPayor()
  {
    return payor;
  }
  
  public void copyToPayment(Payment outData)
  {
    if(outData != null)
    {
      if(this.paymentType != null)
      {
        PaymentType pt = PaymentType.fromString(this.paymentType.getValue());
        outData.setPaymentType(pt);
      }
      
      if(this.payor != null)
      {
        Payor pyr = new Payor();
        this.payor.copyToPayor(pyr);
        outData.setPayor(pyr);
      }
    }
  }
}
