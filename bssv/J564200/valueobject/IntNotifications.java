package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.becloseshipments.CloseShipmentReply;

import java.io.Serializable;

import java.math.BigInteger;
import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class IntNotifications
    extends ValueObject
    implements Serializable
{
    private String severity = null;
    private String source = null;
    private Integer code = null;
    private String message = null;
    private String localizedMessage = null;

    public void setSeverity(String severity)
    {
        this.severity = severity;
    }

    public String getSeverity()
    {
        return severity;
    }

    public void setSource(String source)
    {
        this.source = source;
    }

    public String getSource()
    {
        return source;
    }

    public void setCode(Integer code)
    {
        this.code = code;
    }

    public Integer getCode()
    {
        return code;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }

    public String getMessage()
    {
        return message;
    }

    public void setLocalizedMessage(String localizedMessage)
    {
        this.localizedMessage = localizedMessage;
    }

    public String getLocalizedMessage()
    {
        return localizedMessage;
    }

    public static IntNotifications createFromNotifications(CloseShipmentReply.Notifications inData)
    {
        IntNotifications iNotify = null;
        if (inData != null)
        {
            iNotify = new IntNotifications();

            iNotify.setSeverity(inData.getSeverity());
            iNotify.setSource(inData.getSource());
            iNotify.setMessage(inData.getMessage());
            iNotify.setLocalizedMessage(inData.getLocalizedMessage());

            BigInteger num = inData.getCode();
            if (num != null)
            {
                iNotify.setCode(new Integer(num.intValue()));
            }
        }
        return iNotify;
    }
}
