package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.ReturnAssociationDetail;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.ReturnEMailDetail;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.ReturnShipmentDetail;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.ReturnType;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.Rma;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntReturnShipmentDetail extends ValueObject implements Serializable
{
  private IntReturnType returnType = null;
  private IntRma rma = null;
  private IntReturnEMailDetail returnEmailDetail = null;
  private IntReturnAssociationDetail returnAssociationDetail = null;

  public void setReturnType(IntReturnType returnType)
  {
    this.returnType = returnType;
  }

  public IntReturnType getReturnType()
  {
    return returnType;
  }

  public void setRma(IntRma rma)
  {
    this.rma = rma;
  }

  public IntRma getRma()
  {
    return rma;
  }

  public void setReturnEmailDetail(IntReturnEMailDetail returnEmailDetail)
  {
    this.returnEmailDetail = returnEmailDetail;
  }

  public IntReturnEMailDetail getReturnEmailDetail()
  {
    return returnEmailDetail;
  }

  public void setReturnAssociationDetail(IntReturnAssociationDetail returnAssociationDetail)
  {
    this.returnAssociationDetail = returnAssociationDetail;
  }

  public IntReturnAssociationDetail getReturnAssociationDetail()
  {
    return returnAssociationDetail;
  }
  
  public void copyToReturnShipmentDetail(ReturnShipmentDetail outData)
  {
    if(outData != null)
    {
      if(this.returnType != null)
      {
        ReturnType rt = ReturnType.fromString(this.returnType.getValue());
        outData.setReturnType(rt);
      }
      
      if(this.rma != null)
      {
        Rma rma = new Rma();
        this.rma.copyToRma(rma);
        outData.setRma(rma);
      }
      
      if(this.returnEmailDetail != null)
      {
        ReturnEMailDetail emailDetail = new ReturnEMailDetail();
        this.returnEmailDetail.copyToReturnEMailDetail(emailDetail);
        outData.setReturnEMailDetail(emailDetail);
      }
      
      if(this.returnAssociationDetail != null)
      {
        ReturnAssociationDetail assocDetail = new ReturnAssociationDetail();
        this.returnAssociationDetail.copyToReturnAssociationDetail(assocDetail);
        outData.setReturnAssociation(assocDetail);
      }
    }
  }
}
