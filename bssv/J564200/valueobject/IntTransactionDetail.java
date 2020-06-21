package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.becloseshipments.CloseShipmentReply;
import be.e1.bssv.J564200.com.beone.fedex.becloseshipments.CloseShipmentRequest;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class IntTransactionDetail
    extends ValueObject
    implements Serializable
{
    private String customerTransactionId = null;
    private IntLocalization localization = null;

    public void setCustomerTransactionId(String customerTransactionId)
    {
        this.customerTransactionId = customerTransactionId;
    }

    public String getCustomerTransactionId()
    {
        return customerTransactionId;
    }

    public void setLocalization(IntLocalization localization)
    {
        this.localization = localization;
    }

    public IntLocalization getLocalization()
    {
        return localization;
    }

    public void copyToTransactionDetail(be.e1.bssv.J564200.com.beone.fedex.beuploadimage.TransactionDetail outData)
    {
        if (outData != null)
        {
            outData.setCustomerTransactionId(this.customerTransactionId);
            be.e1.bssv.J564200.com.beone.fedex.beuploadimage.Localization locale =
                new be.e1.bssv.J564200.com.beone.fedex.beuploadimage.Localization();
            if (this.localization != null)
            {
                this.localization.copyToLocalization(locale);
                outData.setLocalization(locale);
            }
        }
    }

    public void copyToTransactionDetail(be.e1.bssv.J564200.com.beone.fedex.beshipments.TransactionDetail outData)
    {
        if (outData != null)
        {
            outData.setCustomerTransactionId(this.customerTransactionId);
            be.e1.bssv.J564200.com.beone.fedex.beshipments.Localization locale =
                new be.e1.bssv.J564200.com.beone.fedex.beshipments.Localization();
            if (this.localization != null)
            {
                this.localization.copyToLocalization(locale);
                outData.setLocalization(locale);
            }
        }
    }

    public void copyToTransactionDetail(CloseShipmentRequest.TransactionDetail outData)
    {
        if (outData != null)
        {
            outData.setCustomerTransactionId(this.customerTransactionId);
            CloseShipmentRequest.TransactionDetail.Localization locale =
                new CloseShipmentRequest.TransactionDetail.Localization();
            if (this.localization != null)
            {
                this.localization.copyToLocalization(locale);
                outData.setLocalization(locale);
            }
        }
    }

    public static IntTransactionDetail createFromTransactionDetail(be.e1.bssv.J564200.com.beone.fedex.beuploadimage.TransactionDetail inData)
    {
        IntTransactionDetail iTxnDetail = null;
        if (inData != null)
        {
            iTxnDetail = new IntTransactionDetail();
            iTxnDetail.setCustomerTransactionId(inData.getCustomerTransactionId());
            iTxnDetail.setLocalization(IntLocalization.createFromLocalization(inData.getLocalization()));
        }
        return iTxnDetail;
    }

    public static IntTransactionDetail createFromTransactionDetail(be.e1.bssv.J564200.com.beone.fedex.beshipments.TransactionDetail inData)
    {
        IntTransactionDetail iTxnDetail = null;
        if (inData != null)
        {
            iTxnDetail = new IntTransactionDetail();
            iTxnDetail.setCustomerTransactionId(inData.getCustomerTransactionId());
            iTxnDetail.setLocalization(IntLocalization.createFromLocalization(inData.getLocalization()));
        }
        return iTxnDetail;
    }
}
