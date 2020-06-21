package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.becloseshipments.CloseShipmentRequest;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class IntWebAuthenticationDetail
    extends ValueObject
    implements Serializable
{
    private IntWebAuthenticationCredential userCredential = null;

    public void setUserCredential(IntWebAuthenticationCredential userCredential)
    {
        this.userCredential = userCredential;
    }

    public IntWebAuthenticationCredential getUserCredential()
    {
        return userCredential;
    }

    public void copyToWebAuthenticationDetail(be.e1.bssv.J564200.com.beone.fedex.beuploadimage.WebAuthenticationDetail outData)
    {
        if (outData != null && this.userCredential != null)
        {
            be.e1.bssv.J564200.com.beone.fedex.beuploadimage.WebAuthenticationCredential webAuthCred =
                new be.e1.bssv.J564200.com.beone.fedex.beuploadimage.WebAuthenticationCredential();
            this.userCredential.copyToWebAuthenticationCredential(webAuthCred);
            outData.setUserCredential(webAuthCred);
        }
    }

    public void copyToWebAuthenticationDetail(be.e1.bssv.J564200.com.beone.fedex.beshipments.WebAuthenticationDetail outData)
    {
        if (outData != null && this.userCredential != null)
        {
            be.e1.bssv.J564200.com.beone.fedex.beshipments.WebAuthenticationCredential webAuthCred =
                new be.e1.bssv.J564200.com.beone.fedex.beshipments.WebAuthenticationCredential();
            this.userCredential.copyToWebAuthenticationCredential(webAuthCred);
            outData.setUserCredential(webAuthCred);
        }
    }

    public void copyToWebAuthenticationDetail(CloseShipmentRequest.WebAuthenticationDetail outData)
    {
        if (outData != null && this.userCredential != null)
        {
            CloseShipmentRequest.WebAuthenticationDetail.UserCredential userCred =
                new CloseShipmentRequest.WebAuthenticationDetail.UserCredential();
            this.userCredential.copyToWebAuthenticationCredential(userCred);
            outData.setUserCredential(userCred);
        }
    }
}
