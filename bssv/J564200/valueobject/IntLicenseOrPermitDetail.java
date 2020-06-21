package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.LicenseOrPermitDetail;

import java.io.Serializable;

import java.util.Calendar;
import java.util.Date;

import oracle.e1.bssvfoundation.base.ValueObject;

public class IntLicenseOrPermitDetail extends ValueObject implements Serializable
{
  private String number = null;
  private Date effectiveDate = null;
  private Date expirationDate = null;

  public void setNumber(String number)
  {
    this.number = number;
  }

  public String getNumber()
  {
    return number;
  }

  public void setEffectiveDate(Date effectiveDate)
  {
    this.effectiveDate = effectiveDate;
  }

  public Date getEffectiveDate()
  {
    return effectiveDate;
  }

  public void setExpirationDate(Date expirationDate)
  {
    this.expirationDate = expirationDate;
  }

  public Date getExpirationDate()
  {
    return expirationDate;
  }
  
  public static IntLicenseOrPermitDetail createFromLicenseOrPermitDetail(LicenseOrPermitDetail inData)
  {
    IntLicenseOrPermitDetail lopd = null;
    if(inData != null)
    {
      Calendar cal = inData.getEffectiveDate();
      if(cal != null)
      {
        lopd.effectiveDate = cal.getTime();
      }
      cal = inData.getExpirationDate();
      if(cal != null)
      {
        lopd.expirationDate = cal.getTime();
      }
      lopd.setNumber(inData.getNumber());
    }
    return lopd;
  }
}
