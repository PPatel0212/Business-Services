package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.ExpressFreightDetail;

import java.io.Serializable;

import java.math.BigInteger;

import oracle.e1.bssvfoundation.base.ValueObject;

public class IntExpressFreightDetail extends ValueObject implements Serializable
{
  private String packingListEnclosed = null;
  private Integer shippersLoadAndCount = null;
  private String bookingConfirmationNumber = null;

  public void setPackingListEnclosed(String packingListEnclosed)
  {
    this.packingListEnclosed = packingListEnclosed;
  }

  public String getPackingListEnclosed()
  {
    return packingListEnclosed;
  }

  public void setShippersLoadAndCount(Integer shippersLoadAndCount)
  {
    this.shippersLoadAndCount = shippersLoadAndCount;
  }

  public Integer getShippersLoadAndCount()
  {
    return shippersLoadAndCount;
  }

  public void setBookingConfirmationNumber(String bookingConfirmationNumber)
  {
    this.bookingConfirmationNumber = bookingConfirmationNumber;
  }

  public String getBookingConfirmationNumber()
  {
    return bookingConfirmationNumber;
  }
  
  public void copyToExpressFreightDetail(ExpressFreightDetail outData)
  {
    if(outData != null)
    {
      outData.setBookingConfirmationNumber(this.bookingConfirmationNumber);
      if(this.shippersLoadAndCount != null)
        outData.setShippersLoadAndCount(BigInteger.valueOf(this.shippersLoadAndCount.intValue()));
      outData.setPackingListEnclosed(false);
      if(this.packingListEnclosed.compareToIgnoreCase("Y") == 0)
        outData.setPackingListEnclosed(true);
    }
  }
}
