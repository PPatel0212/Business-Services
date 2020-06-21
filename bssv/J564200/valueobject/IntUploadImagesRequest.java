package be.e1.bssv.J564200.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class IntUploadImagesRequest extends ValueObject implements Serializable
{
  private IntClientDetail clientDetail = null;
  private IntUploadImageDetail[] images = null;
  private IntTransactionDetail transactionDetail = null;
  private IntVersionId version = null;
  private IntWebAuthenticationDetail webAuthenticationDetail = null;

    public void setClientDetail(IntClientDetail clientDetail) {
        this.clientDetail = clientDetail;
    }

    public IntClientDetail getClientDetail() {
        return clientDetail;
    }

    public void setImages(IntUploadImageDetail[] images) {
        this.images = images;
    }

    public IntUploadImageDetail[] getImages() {
        return images;
    }

    public void setTransactionDetail(IntTransactionDetail transactionDetail) {
        this.transactionDetail = transactionDetail;
    }

    public IntTransactionDetail getTransactionDetail() {
        return transactionDetail;
    }

    public void setVersion(IntVersionId version) {
        this.version = version;
    }

    public IntVersionId getVersion() {
        return version;
    }

    public void setWebAuthenticationDetail(IntWebAuthenticationDetail webAuthenticationDetail) {
        this.webAuthenticationDetail = webAuthenticationDetail;
    }

    public IntWebAuthenticationDetail getWebAuthenticationDetail() {
        return webAuthenticationDetail;
    }
}
