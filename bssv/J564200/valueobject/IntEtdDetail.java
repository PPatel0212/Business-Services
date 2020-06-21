package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.EtdDetail;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.RequestedShippingDocumentType;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.UploadDocumentReferenceDetail;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntEtdDetail extends ValueObject implements Serializable
{
  private IntRequestedShippingDocumentType[] requestedDocumentCopies = null;
  private IntUploadDocumentReferenceDetail[] documentReferences = null;

  public void setRequestedDocumentCopies(IntRequestedShippingDocumentType[] requestedDocumentCopies)
  {
    this.requestedDocumentCopies = requestedDocumentCopies;
  }

  public IntRequestedShippingDocumentType[] getRequestedDocumentCopies()
  {
    return requestedDocumentCopies;
  }

  public void setDocumentReferences(IntUploadDocumentReferenceDetail[] documentReferences)
  {
    this.documentReferences = documentReferences;
  }

  public IntUploadDocumentReferenceDetail[] getDocumentReferences()
  {
    return documentReferences;
  }
  
  public void copyToEtdDetail(EtdDetail outData)
  {
    if(outData != null)
    {
      if(this.requestedDocumentCopies != null)
      {
        RequestedShippingDocumentType[] docTypeArr = new RequestedShippingDocumentType[this.requestedDocumentCopies.length];
        for(int x=0; x<this.requestedDocumentCopies.length; x++)
        {
          docTypeArr[x] = RequestedShippingDocumentType.fromString(this.requestedDocumentCopies[x].getValue());
        }
        outData.setRequestedDocumentCopies(docTypeArr);
      }
      
      if(this.documentReferences != null)
      {
        UploadDocumentReferenceDetail[] docRefArr = new UploadDocumentReferenceDetail[this.documentReferences.length];
        for(int x=0; x<this.documentReferences.length; x++)
        {
          docRefArr[x] = new UploadDocumentReferenceDetail();
          this.documentReferences[x].copyToUploadDocumentReferenceDetail(docRefArr[x]);
        }
        outData.setDocumentReferences(docRefArr);
      }
    }
  }
}
