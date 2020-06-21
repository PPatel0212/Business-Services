package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.becloseshipments.CloseShipmentReply;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;

public class IntCloseTransactionDetail
    extends ValueObject
    implements Serializable
{
    private String customerTransactionId = null;
    private String wsa = null;
    private String ns = null;

    public void setCustomerTransactionId(String customerTransactionId)
    {
        this.customerTransactionId = customerTransactionId;
    }

    public String getCustomerTransactionId()
    {
        return customerTransactionId;
    }

    public void setWsa(String wsa)
    {
        this.wsa = wsa;
    }

    public String getWsa()
    {
        return wsa;
    }

    public void setNs(String ns)
    {
        this.ns = ns;
    }

    public String getNs()
    {
        return ns;
    }

    public static IntCloseTransactionDetail createFromCloseTransactionDetail(CloseShipmentReply.TransactionDetail inData)
    {
        IntCloseTransactionDetail ctd = null;
        if (inData != null)
        {
            ctd = new IntCloseTransactionDetail();
            ctd.setCustomerTransactionId(inData.getCustomerTransactionId());
            ctd.setNs(inData.getNs());
            ctd.setWsa(inData.getWsa());
        }
        return ctd;
    }
}
