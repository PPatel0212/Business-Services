package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.InternationalControlledExportDetail;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.InternationalControlledExportType;

import java.io.Serializable;

import java.util.Calendar;
import java.util.Date;

import oracle.e1.bssvfoundation.base.ValueObject;

public class IntInternationalControlledExportDetail extends ValueObject implements Serializable
{
  private IntInternationalControlledExportType type = null;
  private String foreignTradeZoneCode = null;
  private String entryNumber = null;
  private String licenseOrPermitNumber = null;
  private Date licenseOrPermitExpirationDate = null;

  public void setType(IntInternationalControlledExportType type)
  {
    this.type = type;
  }

  public IntInternationalControlledExportType getType()
  {
    return type;
  }

  public void setForeignTradeZoneCode(String foreignTradeZoneCode)
  {
    this.foreignTradeZoneCode = foreignTradeZoneCode;
  }

  public String getForeignTradeZoneCode()
  {
    return foreignTradeZoneCode;
  }

  public void setEntryNumber(String entryNumber)
  {
    this.entryNumber = entryNumber;
  }

  public String getEntryNumber()
  {
    return entryNumber;
  }

  public void setLicenseOrPermitNumber(String licenseOrPermitNumber)
  {
    this.licenseOrPermitNumber = licenseOrPermitNumber;
  }

  public String getLicenseOrPermitNumber()
  {
    return licenseOrPermitNumber;
  }

  public void setLicenseOrPermitExpirationDate(Date licenseOrPermitExpirationDate)
  {
    this.licenseOrPermitExpirationDate = licenseOrPermitExpirationDate;
  }

  public Date getLicenseOrPermitExpirationDate()
  {
    return licenseOrPermitExpirationDate;
  }
  
  public void copyToInternationalControlledExportDetail(InternationalControlledExportDetail outData)
  {
    if(outData != null)
    {
      outData.setForeignTradeZoneCode(this.foreignTradeZoneCode);
      outData.setEntryNumber(this.entryNumber);
      outData.setLicenseOrPermitNumber(this.licenseOrPermitNumber);
      
      if(this.licenseOrPermitExpirationDate != null)
      {
        Calendar cal = Calendar.getInstance();
        cal.setTime(this.licenseOrPermitExpirationDate);
        outData.setLicenseOrPermitExpirationDate(cal);
      }
      
      if(this.type != null)
      {
        InternationalControlledExportType icet = InternationalControlledExportType.fromString(this.type.getValue());
        outData.setType(icet);
      }
    }
  }
}
