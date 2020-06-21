package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.UploadDocumentIdProducer;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.UploadDocumentProducerType;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.UploadDocumentReferenceDetail;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.UploadDocumentType;

import java.io.Serializable;

import java.math.BigInteger;

import oracle.e1.bssvfoundation.base.ValueObject;

public class IntUploadDocumentReferenceDetail extends ValueObject implements Serializable
{
  private Integer lineNumber = null;
  private String customerReference = null;
  private IntUploadDocumentProducerType documentProducer = null;
  private IntUploadDocumentType documentType = null;
  private String documentId = null;
  private IntUploadDocumentIdProducer documentIdProducer = null;

  public void setLineNumber(Integer lineNumber)
  {
    this.lineNumber = lineNumber;
  }

  public Integer getLineNumber()
  {
    return lineNumber;
  }

  public void setCustomerReference(String customerReference)
  {
    this.customerReference = customerReference;
  }

  public String getCustomerReference()
  {
    return customerReference;
  }

  public void setDocumentProducer(IntUploadDocumentProducerType documentProducer)
  {
    this.documentProducer = documentProducer;
  }

  public IntUploadDocumentProducerType getDocumentProducer()
  {
    return documentProducer;
  }

  public void setDocumentType(IntUploadDocumentType documentType)
  {
    this.documentType = documentType;
  }

  public IntUploadDocumentType getDocumentType()
  {
    return documentType;
  }

  public void setDocumentId(String documentId)
  {
    this.documentId = documentId;
  }

  public String getDocumentId()
  {
    return documentId;
  }

  public void setUploadDocumentIdProducer(IntUploadDocumentIdProducer uploadDocumentIdProducer)
  {
    this.documentIdProducer = uploadDocumentIdProducer;
  }

  public IntUploadDocumentIdProducer getUploadDocumentIdProducer()
  {
    return documentIdProducer;
  }
  
  public void copyToUploadDocumentReferenceDetail(UploadDocumentReferenceDetail outData)
  {
    if(outData != null)
    {
      outData.setCustomerReference(this.customerReference);
      outData.setDocumentId(this.documentId);
      
      if(this.documentProducer != null)
      {
        UploadDocumentProducerType docProdType = UploadDocumentProducerType.fromString(this.documentProducer.getValue());
        outData.setDocumentProducer(docProdType);
      }
      
      if(this.documentType != null)
      {
        UploadDocumentType udt = UploadDocumentType.fromString(this.documentType.getValue());
        outData.setDocumentType(udt);
      }
      
      if(this.lineNumber != null)
      {
        outData.setLineNumber(BigInteger.valueOf(this.lineNumber.intValue()));
      }
      
      if(this.documentIdProducer != null)
      {
        UploadDocumentIdProducer docProd = UploadDocumentIdProducer.fromString(this.documentIdProducer.getValue());
        outData.setDocumentIdProducer(docProd);
      }
    }
  }
  
  public static IntUploadDocumentReferenceDetail createFromUploadDocumentReferenceDetail(UploadDocumentReferenceDetail inData)
  {
    IntUploadDocumentReferenceDetail udrd = null;
    if(inData != null)
    {
      udrd = new IntUploadDocumentReferenceDetail();
      udrd.setCustomerReference(inData.getCustomerReference());
      udrd.setDocumentId(inData.getDocumentId());
    
      BigInteger val = inData.getLineNumber();
      if(val != null)
      {
        udrd.setLineNumber(new Integer(val.intValue()));
      }
      
      udrd.setUploadDocumentIdProducer(IntUploadDocumentIdProducer.createFromUploadDocumentIdProducer(inData.getDocumentIdProducer()));
      udrd.setDocumentType(IntUploadDocumentType.createFromUploadDocumentType(inData.getDocumentType()));
      udrd.setDocumentProducer(IntUploadDocumentProducerType.createFromUploadDocumentProducerType(inData.getDocumentProducer()));
    }
    return udrd;
  }
}
