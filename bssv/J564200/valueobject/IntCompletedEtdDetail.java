package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.CompletedEtdDetail;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.UploadDocumentReferenceDetail;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntCompletedEtdDetail extends ValueObject implements Serializable
{
  private String folderId = null;
  private IntUploadDocumentReferenceDetail[] uploadDocumentReferenceDetails=null;

  public void setFolderId(String folderId)
  {
    this.folderId = folderId;
  }

  public String getFolderId()
  {
    return folderId;
  }

  public void setUploadDocumentReferenceDetails(IntUploadDocumentReferenceDetail[] uploadDocumentReferenceDetails)
  {
    this.uploadDocumentReferenceDetails = uploadDocumentReferenceDetails;
  }

  public IntUploadDocumentReferenceDetail[] getUploadDocumentReferenceDetails()
  {
    return uploadDocumentReferenceDetails;
  }
  
  public static IntCompletedEtdDetail createFromCompletedEtdDetail(CompletedEtdDetail inData)
  {
    IntCompletedEtdDetail ced = null;
    if(inData != null)
    {
      ced = new IntCompletedEtdDetail();
      ced.setFolderId(inData.getFolderId());
      
      UploadDocumentReferenceDetail[] udrdArr = inData.getUploadDocumentReferenceDetails();
      if(udrdArr != null)
      {
        IntUploadDocumentReferenceDetail[] iUdrdArr = new IntUploadDocumentReferenceDetail[udrdArr.length];  
        for(int x=0; x<udrdArr.length; x++)
        {
          iUdrdArr[x] = IntUploadDocumentReferenceDetail.createFromUploadDocumentReferenceDetail(udrdArr[x]);
        }
        ced.setUploadDocumentReferenceDetails(iUdrdArr);
      }
    }
    return ced;
  }
}
