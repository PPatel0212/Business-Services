package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.DateRange;

import java.io.Serializable;

import java.util.Calendar;
import java.util.Date;

import oracle.e1.bssvfoundation.base.ValueObject;

public class IntDateRange extends ValueObject implements Serializable
{
  private Date begins = null;
  private Date ends = null;

  public void setBegins(Date begins)
  {
    this.begins = begins;
  }

  public Date getBegins()
  {
    return begins;
  }

  public void setEnds(Date ends)
  {
    this.ends = ends;
  }

  public Date getEnds()
  {
    return ends;
  }
  
  public void copyToDateRange(DateRange outData)
  {
    if(outData != null)
    {
      if(this.begins != null)
      {
        Calendar cal = Calendar.getInstance();
        cal.setTime(this.begins);
        outData.setBegins(cal);
      }
      
      if(this.ends != null)
      {
        Calendar cal = Calendar.getInstance();
        cal.setTime(this.ends);
        outData.setEnds(cal);
      }
    }
  }
}
