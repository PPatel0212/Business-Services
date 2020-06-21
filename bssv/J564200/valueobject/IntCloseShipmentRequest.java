package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.becloseshipments.CloseShipmentRequest;

import java.io.Serializable;

import java.util.Calendar;
import java.util.Date;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class IntCloseShipmentRequest
    extends ValueObject
    implements Serializable
{
    private IntWebAuthenticationDetail webAuthenticationDetail = null;
    private IntClientDetail clientDetail = null;
    private IntTransactionDetail transactionDetail = null;
    private IntVersionId version = null;
    private Date shipDateStamp = null;

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
    private MathNumeric shipTimeStamp = null;

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

    public static Calendar createCalendarFromDateTime(Date dt, int time)
    {
        int hour = (time / 10000) % 24;
        int minute = ((time - (hour * 10000)) / 100) % 60;
        int second = (time - ((hour * 10000) + (minute * 100)));

        Calendar cal = Calendar.getInstance();
        cal.setTime(dt);

        Calendar cal2 = Calendar.getInstance();
        cal2.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DATE), hour, minute, second);

        return cal2;
    }

    public static XMLGregorianCalendar createCalendarFromDateTimeXml(Date dt, int time)
    {
        XMLGregorianCalendar xmlCalendar = null;
        Calendar cal = createCalendarFromDateTime(dt, time);
        try
        {
            DatatypeFactory dtf = DatatypeFactory.newInstance();
            xmlCalendar = dtf.newXMLGregorianCalendar();
            xmlCalendar.setYear(cal.get(Calendar.YEAR));
            xmlCalendar.setDay(cal.get(Calendar.DAY_OF_MONTH));
            xmlCalendar.setMonth(cal.get(Calendar.MONTH)+ 1);
            xmlCalendar.setHour(cal.get(Calendar.HOUR_OF_DAY));
            xmlCalendar.setMinute(cal.get(Calendar.MINUTE));
            xmlCalendar.setSecond(cal.get(Calendar.SECOND));
            xmlCalendar.setMillisecond(cal.get(Calendar.MILLISECOND));
            int offsetInMinutes = (cal.get(Calendar.ZONE_OFFSET) + cal.get(Calendar.DST_OFFSET)) / (60 * 1000);
            xmlCalendar.setTimezone(offsetInMinutes);        
        }
        catch (Exception e) 
        {
           e.printStackTrace();
        }
        return xmlCalendar;        
    }
    
    public void copyToCloseShipmentRequest(CloseShipmentRequest outData)
    {
        if (outData != null)
        {
            if(this.webAuthenticationDetail != null)
            {
                CloseShipmentRequest.WebAuthenticationDetail webAuthDetail = new CloseShipmentRequest.WebAuthenticationDetail();
                this.webAuthenticationDetail.copyToWebAuthenticationDetail(webAuthDetail);
                outData.setWebAuthenticationDetail(webAuthDetail);
            }
            
            if(this.clientDetail != null)
            {
                CloseShipmentRequest.ClientDetail cltDetail = new CloseShipmentRequest.ClientDetail();
                this.clientDetail.copyToClientDetail(cltDetail);
                outData.setClientDetail(cltDetail);
            }
            
            if(this.transactionDetail != null)
            {
                CloseShipmentRequest.TransactionDetail txnDetail = new CloseShipmentRequest.TransactionDetail();
                this.transactionDetail.copyToTransactionDetail(txnDetail);
                outData.setTransactionDetail(txnDetail);
            }
            
            if(this.version != null)
            {
                CloseShipmentRequest.Version vers = new CloseShipmentRequest.Version();
                this.version.copyToVersionId(vers);
                outData.setVersion(vers);
            }
            
            outData.setTimeShipmentClosed(createCalendarFromDateTimeXml(this.shipDateStamp, this.shipTimeStamp.intValue()));
        }
    }
}
