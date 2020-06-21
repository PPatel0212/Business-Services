package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.becloseshipments.CloseShipmentRequest;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class IntWebAuthenticationCredential
    extends ValueObject
    implements Serializable
{
    private String key = null;
    private String password = null;

    public void setKey(String key)
    {
        this.key = key;
    }

    public String getKey()
    {
        return key;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getPassword()
    {
        return password;
    }

    public void copyToWebAuthenticationCredential(be.e1.bssv.J564200.com.beone.fedex.beuploadimage.WebAuthenticationCredential outData)
    {
        if (outData != null)
        {
            outData.setKey(this.key);
            outData.setPassword(this.password);
        }
    }

    public void copyToWebAuthenticationCredential(be.e1.bssv.J564200.com.beone.fedex.beshipments.WebAuthenticationCredential outData)
    {
        if (outData != null)
        {
            outData.setKey(this.key);
            outData.setPassword(this.password);
        }
    }

    public void copyToWebAuthenticationCredential(CloseShipmentRequest.WebAuthenticationDetail.UserCredential outData)
    {
        if (outData != null)
        {
            outData.setKey(this.key);
            outData.setPassword(this.password);
        }
    }
}
