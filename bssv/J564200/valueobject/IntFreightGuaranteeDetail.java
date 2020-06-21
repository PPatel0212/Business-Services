package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.FreightGuaranteeDetail;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.FreightGuaranteeType;

import java.io.Serializable;

import java.util.Calendar;
import java.util.Date;

import oracle.e1.bssvfoundation.base.ValueObject;

public class IntFreightGuaranteeDetail extends ValueObject implements Serializable
{
  private IntFreightGuaranteeType type = null;
  private Date date = null;

  public void setType(IntFreightGuaranteeType type)
  {
    this.type = type;
  }

  public IntFreightGuaranteeType getType()
  {
    return type;
  }

  public void setDate(Date date)
  {
    this.date = date;
  }

  public Date getDate()
  {
    return date;
  }
  
  public void copyToFreightGuaranteeDetail(FreightGuaranteeDetail outData)
  {
    if(outData != null)
    {
      if(this.date != null)
      {
        Calendar cal = Calendar.getInstance();
        cal.setTime(this.date);
        outData.setDate(cal);
      }
      
      if(this.type != null)
      {
        FreightGuaranteeType fgt = FreightGuaranteeType.fromString(this.type.getValue());
        outData.setType(fgt);
      }
    }
  }
}
