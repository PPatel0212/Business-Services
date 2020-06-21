package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomDeliveryWindowDetail;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomDeliveryWindowType;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.DateRange;

import java.io.Serializable;

import java.util.Calendar;
import java.util.Date;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

public class IntCustomDeliveryWindowDetail extends ValueObject implements Serializable
{
  private IntCustomDeliveryWindowType type = null;
  private MathNumeric requestTime = null;
  private IntDateRange requestRange = null;
  private Date requestDate = null;

  public void setRequestTime(MathNumeric requestTime)
  {
    this.requestTime = requestTime;
  }

  public MathNumeric getRequestTime()
  {
    return requestTime;
  }

  public void setRequestRange(IntDateRange requestRange)
  {
    this.requestRange = requestRange;
  }

  public IntDateRange getRequestRange()
  {
    return requestRange;
  }

  public void setRequestDate(Date requestDate)
  {
    this.requestDate = requestDate;
  }

  public Date getRequestDate()
  {
    return requestDate;
  }
  
  public Calendar convertMathNumericToTime(MathNumeric time)
  {
    Calendar cal = Calendar.getInstance();
    if(time != null)
    {
      int iTime = time.intValue();
      int hour = (iTime/10000)%24;
      int minute = ((iTime - (hour * 10000))/100)%60;
      int second = (iTime - ((hour * 10000)+(minute * 100)));
      cal.set(0, 0, 0, hour, minute, second);
    }
    return cal;
  }
  
  public void copyToCustomDeliveryWindowDetail(CustomDeliveryWindowDetail outData)
  {
    if(outData != null)
    {
      if(this.requestDate != null)
      {
        Calendar cal = Calendar.getInstance();
        cal.setTime(this.requestDate);
        outData.setRequestDate(cal);
      }
      
      if(this.requestRange != null)
      {
        DateRange dr = new DateRange();
        this.requestRange.copyToDateRange(dr);
        outData.setRequestRange(dr);
      }
      
      if(this.requestTime != null)
      {
        outData.setRequestTime(convertMathNumericToTime(this.requestTime));
      }
      
      if(this.type != null)
      {
        CustomDeliveryWindowType cdwt = CustomDeliveryWindowType.fromString(this.type.getValue());
        outData.setType(cdwt);
      }
    }
  }

  public void setType(IntCustomDeliveryWindowType type)
  {
    this.type = type;
  }

  public IntCustomDeliveryWindowType getType()
  {
    return type;
  }
}
