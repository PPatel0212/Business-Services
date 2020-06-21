package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.becloseshipments.CloseShipmentRequest;
import be.e1.bssv.J564200.com.beone.fedex.becloseshipments.CloseShipmentReply;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class IntFedexCloseProcess
    extends ValueObject
    implements Serializable
{
    private IntCloseShipmentRequest request = null;
    private IntCloseShipmentReply reply = null;
    private IntBssvErrors error = null;

    public void setRequest(IntCloseShipmentRequest request)
    {
        this.request = request;
    }

    public IntCloseShipmentRequest getRequest()
    {
        return request;
    }

    public void setReply(IntCloseShipmentReply reply)
    {
        this.reply = reply;
    }

    public IntCloseShipmentReply getReply()
    {
        return reply;
    }

    public void setError(IntBssvErrors error)
    {
        this.error = error;
    }

    public IntBssvErrors getError()
    {
        return error;
    }

    public void copyToCloseShipmentRequest(CloseShipmentRequest outData)
    {
        if (outData != null)
        {
            this.request.copyToCloseShipmentRequest(outData);
        }
    }

    public void loadReplyData(CloseShipmentReply inData)
    {
        if (inData != null)
        {
            this.reply = IntCloseShipmentReply.createFromCloseShipmentReply(inData);
        }
    }
}
