package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.becloseshipments.CloseShipmentReply;
import be.e1.bssv.J564200.com.beone.fedex.becloseshipments.CloseShipmentRequest;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class IntLocalization
    extends ValueObject
    implements Serializable
{
    private String languageCode = null;
    private String localeCode = null;

    public void setLanguageCode(String languageCode)
    {
        this.languageCode = languageCode;
    }

    public String getLanguageCode()
    {
        return languageCode;
    }

    public void setLocaleCode(String localeCode)
    {
        this.localeCode = localeCode;
    }

    public String getLocaleCode()
    {
        return localeCode;
    }

    public void copyToLocalization(be.e1.bssv.J564200.com.beone.fedex.beuploadimage.Localization outData)
    {
        if (outData != null)
        {
            outData.setLanguageCode(this.languageCode);
            outData.setLocaleCode(this.localeCode);
        }
    }

    public void copyToLocalization(be.e1.bssv.J564200.com.beone.fedex.beshipments.Localization outData)
    {
        if (outData != null)
        {
            outData.setLanguageCode(this.languageCode);
            outData.setLocaleCode(this.localeCode);
        }
    }

    public void copyToLocalization(CloseShipmentRequest.ClientDetail.Localization outData)
    {
        if (outData != null)
        {
            outData.setLanguageCode(this.languageCode);
            outData.setLocaleCode(this.localeCode);
        }
    }

    public void copyToLocalization(CloseShipmentRequest.TransactionDetail.Localization outData)
    {
        if (outData != null)
        {
            outData.setLanguageCode(this.languageCode);
            outData.setLocaleCode(this.localeCode);
        }
    }

    public static IntLocalization createFromLocalization(be.e1.bssv.J564200.com.beone.fedex.beuploadimage.Localization inData)
    {
        IntLocalization iLocale = null;
        if (inData != null)
        {
            iLocale = new IntLocalization();
            iLocale.setLanguageCode(inData.getLanguageCode());
            iLocale.setLocaleCode(inData.getLocaleCode());
        }
        return iLocale;
    }

    public static IntLocalization createFromLocalization(be.e1.bssv.J564200.com.beone.fedex.beshipments.Localization inData)
    {
        IntLocalization iLocale = null;
        if (inData != null)
        {
            iLocale = new IntLocalization();
            iLocale.setLanguageCode(inData.getLanguageCode());
            iLocale.setLocaleCode(inData.getLocaleCode());
        }
        return iLocale;
    }
}
