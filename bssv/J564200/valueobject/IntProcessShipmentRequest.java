package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.ClientDetail;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.ProcessShipmentRequest;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.RequestedShipment;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.TransactionDetail;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.VersionId;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.WebAuthenticationDetail;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntProcessShipmentRequest extends ValueObject implements Serializable
{
  private IntWebAuthenticationDetail webAuthenticationDetail = null;
  private IntClientDetail clientDetail = null;
  private IntTransactionDetail transactionDetail = null;
  private IntVersionId version = null;
  private IntRequestedShipment requestedShipment = null;

  public void setWebAuthenticationDetail(IntWebAuthenticationDetail webAuthenticationDetail)
  {
    this.webAuthenticationDetail = webAuthenticationDetail;
  }

  public IntWebAuthenticationDetail getWebAuthenticationDetail()
  {
    return webAuthenticationDetail;
  }

  public void setClientDetail(IntClientDetail clientDetail)
  {
    this.clientDetail = clientDetail;
  }

  public IntClientDetail getClientDetail()
  {
    return clientDetail;
  }

  public void setTransactionDetail(IntTransactionDetail transactionDetail)
  {
    this.transactionDetail = transactionDetail;
  }

  public IntTransactionDetail getTransactionDetail()
  {
    return transactionDetail;
  }

  public void setVersion(IntVersionId version)
  {
    this.version = version;
  }

  public IntVersionId getVersion()
  {
    return version;
  }

  public void setRequestedShipment(IntRequestedShipment requestedShipment)
  {
    this.requestedShipment = requestedShipment;
  }

  public IntRequestedShipment getRequestedShipment()
  {
    return requestedShipment;
  }
  
  public void copyToProcessShipmentRequest(ProcessShipmentRequest outData)
  {
    if(outData != null)
    {
      if(this.clientDetail != null)
      {
        ClientDetail cltDetail = new ClientDetail();
        this.clientDetail.copyToClientDetail(cltDetail);
        outData.setClientDetail(cltDetail);
      }
      
      if(this.requestedShipment != null)
      {
        RequestedShipment shipReq = new RequestedShipment();
        this.requestedShipment.copyToRequestedShipment(shipReq);
        outData.setRequestedShipment(shipReq);
      }
      
      if(this.transactionDetail != null)
      {
        TransactionDetail txnDetail = new TransactionDetail();
        this.transactionDetail.copyToTransactionDetail(txnDetail);
        outData.setTransactionDetail(txnDetail);
      }
      
      if(this.version != null)
      {
        VersionId vers = new VersionId();
        this.version.copyToVersionId(vers);
        outData.setVersion(vers);
      }
      
      if(this.webAuthenticationDetail != null)
      {
        WebAuthenticationDetail webDetail = new WebAuthenticationDetail();
        this.webAuthenticationDetail.copyToWebAuthenticationDetail(webDetail);
        outData.setWebAuthenticationDetail(webDetail);
      }
    }
  }
}
