package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.EMailLabelDetail;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.PendingShipmentDetail;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.PendingShipmentType;

import java.io.Serializable;

import java.util.Calendar;
import java.util.Date;

import oracle.e1.bssvfoundation.base.ValueObject;

public class IntPendingShipmentDetail extends ValueObject implements Serializable
{
  private IntPendingShipmentType type = null;
  private Date expirationDate = null;
  private IntEmailLabelDetail emailLabelDetail = null;

  public void setType(IntPendingShipmentType type)
  {
    this.type = type;
  }

  public IntPendingShipmentType getType()
  {
    return type;
  }

  public void setExpirationDate(Date expirationDate)
  {
    this.expirationDate = expirationDate;
  }

  public Date getExpirationDate()
  {
    return expirationDate;
  }

  public void setEmailLabelDetail(IntEmailLabelDetail emailLabelDetail)
  {
    this.emailLabelDetail = emailLabelDetail;
  }

  public IntEmailLabelDetail getEmailLabelDetail()
  {
    return emailLabelDetail;
  }
  
  public void copyToPendingShipmentDetail(PendingShipmentDetail outData)
  {
    if(outData != null)
    {
      if(this.emailLabelDetail != null)
      {
        EMailLabelDetail eld = new EMailLabelDetail();
        this.emailLabelDetail.copyToEmailLabelDetail(eld);
        outData.setEmailLabelDetail(eld);
      }
      
      if(this.expirationDate != null)
      {
        Calendar cal = Calendar.getInstance();
        cal.setTime(this.expirationDate);
        outData.setExpirationDate(cal);
      }
      
      if(this.type != null)
      {
        PendingShipmentType pst = PendingShipmentType.fromString(this.type.getValue());
        outData.setType(pst);
      }
    }
  }
}
