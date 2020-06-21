package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.becloseshipments.CloseShipmentRequest;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class IntClientDetail
    extends ValueObject
    implements Serializable
{
    private String accountNumber = null;
    private String meterNumber = null;
    private String integratorId = null;
    private IntLocalization localization = null;

    public void setAccountNumber(String accountNumber)
    {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber()
    {
        return accountNumber;
    }

    public void setMeterNumber(String meterNumber)
    {
        this.meterNumber = meterNumber;
    }

    public String getMeterNumber()
    {
        return meterNumber;
    }

    public void setIntegratorId(String integratorId)
    {
        this.integratorId = integratorId;
    }

    public String getIntegratorId()
    {
        return integratorId;
    }

    public void setLocalization(IntLocalization localization)
    {
        this.localization = localization;
    }

    public IntLocalization getLocalization()
    {
        return localization;
    }

    public void copyToClientDetail(be.e1.bssv.J564200.com.beone.fedex.beuploadimage.ClientDetail outData)
    {
        if (outData != null)
        {
            outData.setAccountNumber(this.accountNumber);
            outData.setMeterNumber(this.meterNumber);
            outData.setIntegratorId(this.integratorId);

            be.e1.bssv.J564200.com.beone.fedex.beuploadimage.Localization locale =
                new be.e1.bssv.J564200.com.beone.fedex.beuploadimage.Localization();
            if (this.localization != null)
            {
                this.localization.copyToLocalization(locale);
                outData.setLocalization(locale);
            }
        }
    }

    public void copyToClientDetail(be.e1.bssv.J564200.com.beone.fedex.beshipments.ClientDetail outData)
    {
        if (outData != null)
        {
            outData.setAccountNumber(this.accountNumber);
            outData.setMeterNumber(this.meterNumber);
            outData.setIntegratorId(this.integratorId);

            be.e1.bssv.J564200.com.beone.fedex.beshipments.Localization locale =
                new be.e1.bssv.J564200.com.beone.fedex.beshipments.Localization();
            if (this.localization != null)
            {
                this.localization.copyToLocalization(locale);
                outData.setLocalization(locale);
            }
        }
    }

    public void copyToClientDetail(CloseShipmentRequest.ClientDetail outData)
    {
        if (outData != null)
        {
            outData.setAccountNumber(this.accountNumber);
            outData.setMeterNumber(this.meterNumber);
            outData.setIntegratorId(this.integratorId);

            CloseShipmentRequest.ClientDetail.Localization locale =
                new CloseShipmentRequest.ClientDetail.Localization();
            if (this.localization != null)
            {
                this.localization.copyToLocalization(locale);
                outData.setLocalization(locale);
            }
        }
    }
}
