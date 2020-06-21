package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.ClientDetail;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.DeleteShipmentRequest;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.DeletionControlType;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.TrackingId;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.TransactionDetail;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.VersionId;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.WebAuthenticationDetail;

import java.io.Serializable;

import java.util.Calendar;

import java.util.Date;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

public class IntDeleteShipmentRequest extends ValueObject implements Serializable
{
  private IntWebAuthenticationDetail webAuthenticationDetail;
  private IntClientDetail clientDetail;
  private IntTransactionDetail transactionDetail;
  private IntVersionId version;
  private Date shipDateStamp;
  private MathNumeric shipTimeStamp;
  private IntTrackingId trackingId;
  private IntDeletionControlType deletionControl;

  public void setWebAuthenticationDetail(IntWebAuthenticationDetail webAuthenticationDetail)
  {
    this.webAuthenticationDetail = webAuthenticationDetail;
  }

  public IntWebAuthenticationDetail getWebAuthenticationDetail()
  {
    return webAuthenticationDetail;
  }

  public void setClientDetail(IntClientDetail clientDetail)
  {
    this.clientDetail = clientDetail;
  }

  public IntClientDetail getClientDetail()
  {
    return clientDetail;
  }

  public void setTransactionDetail(IntTransactionDetail transactionDetail)
  {
    this.transactionDetail = transactionDetail;
  }

  public IntTransactionDetail getTransactionDetail()
  {
    return transactionDetail;
  }

  public void setVersion(IntVersionId version)
  {
    this.version = version;
  }

  public IntVersionId getVersion()
  {
    return version;
  }

  public void setTrackingId(IntTrackingId trackingId)
  {
    this.trackingId = trackingId;
  }

  public IntTrackingId getTrackingId()
  {
    return trackingId;
  }

  public void setDeletionControl(IntDeletionControlType deletionControl)
  {
    this.deletionControl = deletionControl;
  }

  public IntDeletionControlType getDeletionControl()
  {
    return deletionControl;
  }

  public void setShipDateStamp(Date shipDateStamp)
  {
    this.shipDateStamp = shipDateStamp;
  }

  public Date getShipDateStamp()
  {
    return shipDateStamp;
  }

  public void setShipTimeStamp(MathNumeric shipTimeStamp)
  {
    this.shipTimeStamp = shipTimeStamp;
  }

  public MathNumeric getShipTimeStamp()
  {
    return shipTimeStamp;
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
  
  public void copyToDeleteShipmentRequest(DeleteShipmentRequest outData)
  {
    if(outData != null)
    {
      if(this.clientDetail != null)
      {
        ClientDetail cld = new ClientDetail();
        this.clientDetail.copyToClientDetail(cld);
        outData.setClientDetail(cld);
      }
      
      if(this.deletionControl != null)
      {
        DeletionControlType dct = DeletionControlType.fromValue(this.deletionControl.getValue());
        outData.setDeletionControl(dct);
      }
      
      Calendar tsCal = null;
      if(this.shipTimeStamp != null)
      {
        tsCal = convertMathNumericToTime(this.shipTimeStamp);
      }
      if(this.shipDateStamp != null)
      {
        if(tsCal == null)
          tsCal = Calendar.getInstance();
        tsCal.setTime(this.shipDateStamp);
      }
      if(tsCal != null)
        outData.setShipTimestamp(tsCal);
      
      if(this.trackingId != null)
      {
        TrackingId tid = new TrackingId();
        this.trackingId.copyToTrackingId(tid);
        outData.setTrackingId(tid);
      }
      
      if(this.transactionDetail != null)
      {
        TransactionDetail txnDtl = new TransactionDetail();
        this.transactionDetail.copyToTransactionDetail(txnDtl);
        outData.setTransactionDetail(txnDtl);
      }
      
      if(this.version != null)
      {
        VersionId vers = new VersionId();
        this.version.copyToVersionId(vers);
        outData.setVersion(vers);
      }
      
      if(this.webAuthenticationDetail != null)
      {
        WebAuthenticationDetail wad = new WebAuthenticationDetail();
        this.webAuthenticationDetail.copyToWebAuthenticationDetail(wad);
        outData.setWebAuthenticationDetail(wad);
      }
    }
  }
}
