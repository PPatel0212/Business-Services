package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beuploadimage.ClientDetail;
import be.e1.bssv.J564200.com.beone.fedex.beuploadimage.NotificationSeverityType;
import be.e1.bssv.J564200.com.beone.fedex.beuploadimage.TransactionDetail;
import be.e1.bssv.J564200.com.beone.fedex.beuploadimage.UploadImageDetail;
import be.e1.bssv.J564200.com.beone.fedex.beuploadimage.UploadImagesReply;
import be.e1.bssv.J564200.com.beone.fedex.beuploadimage.UploadImagesRequest;

import be.e1.bssv.J564200.com.beone.fedex.beuploadimage.VersionId;

import be.e1.bssv.J564200.com.beone.fedex.beuploadimage.WebAuthenticationDetail;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class IntFedexDocumentUpload extends ValueObject implements Serializable
{
  private IntUploadImagesRequest request = null;
  private IntUploadImagesReply reply = null;
  private IntBssvErrors error = null;

  public void setRequest(IntUploadImagesRequest request)
  {
    this.request = request;
  }

  public IntUploadImagesRequest getRequest()
  {
    return request;
  }

  public void setReply(IntUploadImagesReply reply)
  {
    this.reply = reply;
  }

  public IntUploadImagesReply getReply()
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

  public void copyToUploadImagesRequest(UploadImagesRequest outData)
  {
    if (request != null && outData != null)
    {
      /* Load ClientDetail */
      IntClientDetail iClientDetail = request.getClientDetail();
      if(iClientDetail != null)
      {
        ClientDetail clientDetail = new ClientDetail();
        iClientDetail.copyToClientDetail(clientDetail);
        outData.setClientDetail(clientDetail);
      }

      /* Load UploadImageDetail array */
      IntUploadImageDetail[] iImageDetailArr = request.getImages();
      if (iImageDetailArr != null && iImageDetailArr.length > 0)
      {
        UploadImageDetail[] imageDetailArr = new UploadImageDetail[iImageDetailArr.length];
        for (int idx = 0; idx < iImageDetailArr.length; idx++)
        {
          imageDetailArr[idx] = new UploadImageDetail();
          iImageDetailArr[idx].copyToUploadImageDetail(imageDetailArr[idx]);
        }
        outData.setImages(imageDetailArr);
      }

      /* Load TransactionDetail */
      IntTransactionDetail iTxnDetail = request.getTransactionDetail();
      if(iTxnDetail != null)
      {
        TransactionDetail txnDetail = new TransactionDetail();
        iTxnDetail.copyToTransactionDetail(txnDetail);
        outData.setTransactionDetail(txnDetail);
      }

      /* Load VersionId */
      IntVersionId iVersion = request.getVersion();
      if(iVersion != null)
      {
        VersionId version = new VersionId();
        iVersion.copyToVersionId(version);
        outData.setVersion(version);
      }

      /* Load WebAuthenticationDetail */
      IntWebAuthenticationDetail iWebAuthDetail = request.getWebAuthenticationDetail();
      if(iWebAuthDetail != null)
      {
        WebAuthenticationDetail webAuthDetail = new WebAuthenticationDetail();
        iWebAuthDetail.copyToWebAuthenticationDetail(webAuthDetail);
        outData.setWebAuthenticationDetail(webAuthDetail);
      }
    }
  }
  
  public void loadReplyData(UploadImagesReply inData)
  {
    this.reply = IntUploadImagesReply.createFromUploadImagesReply(inData);
  }
}
