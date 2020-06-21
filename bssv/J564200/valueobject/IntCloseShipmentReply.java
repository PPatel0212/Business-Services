package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.becloseshipments.CloseShipmentReply;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class IntCloseShipmentReply
    extends ValueObject
    implements Serializable
{
    private String highestSeverity = null;
    private IntNotifications notifications = null;
    private IntCloseTransactionDetail transactionDetail = null;
    private IntVersionId version = null;
    private IntStatus status = null;
    private IntGroundCloseReply groundCloseReply = null;

    public void setHighestSeverity(String highestSeverity)
    {
        this.highestSeverity = highestSeverity;
    }

    public String getHighestSeverity()
    {
        return highestSeverity;
    }

    public void setNotifications(IntNotifications notifications)
    {
        this.notifications = notifications;
    }

    public IntNotifications getNotifications()
    {
        return notifications;
    }

    public void setTransactionDetail(IntCloseTransactionDetail transactionDetail)
    {
        this.transactionDetail = transactionDetail;
    }

    public IntCloseTransactionDetail getTransactionDetail()
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

    public void setStatus(IntStatus status)
    {
        this.status = status;
    }

    public IntStatus getStatus()
    {
        return status;
    }

    public void setGroundCloseReply(IntGroundCloseReply groundCloseReply)
    {
        this.groundCloseReply = groundCloseReply;
    }

    public IntGroundCloseReply getGroundCloseReply()
    {
        return groundCloseReply;
    }

    public static IntCloseShipmentReply createFromCloseShipmentReply(CloseShipmentReply inData)
    {
        IntCloseShipmentReply icsr = null;
        if (inData != null)
        {
            icsr = new IntCloseShipmentReply();

            icsr.setHighestSeverity(inData.getHighestSeverity());
            icsr.setGroundCloseReply(IntGroundCloseReply.createFromGroundCloseReply(inData.getGroundCloseReply()));
            icsr.setNotifications(IntNotifications.createFromNotifications(inData.getNotifications()));
            icsr.setStatus(IntStatus.createFromStatus(inData.getStatus()));
            icsr.setVersion(IntVersionId.createFromVersionId(inData.getVersion()));
            icsr.setTransactionDetail(IntCloseTransactionDetail.createFromCloseTransactionDetail(inData.getTransactionDetail()));
        }
        return icsr;
    }
}
