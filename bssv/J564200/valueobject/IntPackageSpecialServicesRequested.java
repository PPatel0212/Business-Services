package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.CodDetail;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.DangerousGoodsDetail;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.PackageSpecialServiceType;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.PackageSpecialServicesRequested;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.PriorityAlertDetail;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.SignatureOptionDetail;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.Weight;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntPackageSpecialServicesRequested extends ValueObject implements Serializable
{
  private IntCodDetail codDetail = null;
  private IntWeight dryIceWeight = null;
  private IntPriorityAlertDetail priorityAlertDetail = null;
  private IntDangerousGoodsDetail dangerousGoodsDetail = null;
  private IntSignatureOptionDetail signatureOptionDetail = null;
  private IntPackageSpecialServiceType[] specialServiceTypes = null;

  public void setCodDetail(IntCodDetail codDetail)
  {
    this.codDetail = codDetail;
  }

  public IntCodDetail getCodDetail()
  {
    return codDetail;
  }

  public void setDryIceWeight(IntWeight dryIceWeight)
  {
    this.dryIceWeight = dryIceWeight;
  }

  public IntWeight getDryIceWeight()
  {
    return dryIceWeight;
  }

  public void setPriorityAlertDetail(IntPriorityAlertDetail priorityAlertDetail)
  {
    this.priorityAlertDetail = priorityAlertDetail;
  }

  public IntPriorityAlertDetail getPriorityAlertDetail()
  {
    return priorityAlertDetail;
  }

  public void setDangerousGoodsDetail(IntDangerousGoodsDetail dangerousGoodsDetail)
  {
    this.dangerousGoodsDetail = dangerousGoodsDetail;
  }

  public IntDangerousGoodsDetail getDangerousGoodsDetail()
  {
    return dangerousGoodsDetail;
  }

  public void setSignatureOptionDetail(IntSignatureOptionDetail signatureOptionDetail)
  {
    this.signatureOptionDetail = signatureOptionDetail;
  }

  public IntSignatureOptionDetail getSignatureOptionDetail()
  {
    return signatureOptionDetail;
  }

  public void setSpecialServiceTypes(IntPackageSpecialServiceType[] specialServiceTypes)
  {
    this.specialServiceTypes = specialServiceTypes;
  }

  public IntPackageSpecialServiceType[] getSpecialServiceTypes()
  {
    return specialServiceTypes;
  }
  
  public void copyToPackageSpecialServicesRequested(PackageSpecialServicesRequested outData)
  {
    if(outData != null)
    {
      if(this.codDetail != null)
      {
        CodDetail cd = new CodDetail();
        this.codDetail.copyToCodDetail(cd);
        outData.setCodDetail(cd);
      }
      
      if(this.dangerousGoodsDetail != null)
      {
        DangerousGoodsDetail dgd = new DangerousGoodsDetail();
        this.dangerousGoodsDetail.copyToDangerousGoodsDetail(dgd);
        outData.setDangerousGoodsDetail(dgd);
      }
      
      if(this.dryIceWeight != null)
      {
        Weight wgt = new Weight();
        this.dryIceWeight.copyToWeight(wgt);
        outData.setDryIceWeight(wgt);
      }
      
      if(this.priorityAlertDetail != null)
      {
        PriorityAlertDetail pad = new PriorityAlertDetail();
        this.priorityAlertDetail.copyToPriorityAlertDetail(pad);
        outData.setPriorityAlertDetail(pad);
      }
      
      if(this.signatureOptionDetail != null)
      {
        SignatureOptionDetail sod = new SignatureOptionDetail();
        this.signatureOptionDetail.copyToSignatureOptionDetail(sod);
        outData.setSignatureOptionDetail(sod);
      }
      
      if(this.specialServiceTypes != null)
      {
        PackageSpecialServiceType[] psstArr = new PackageSpecialServiceType[this.specialServiceTypes.length];
        for(int x=0; x<this.specialServiceTypes.length; x++)
        {
          psstArr[x] = PackageSpecialServiceType.fromString(this.specialServiceTypes[x].getValue());
        }
        outData.setSpecialServiceTypes(psstArr);
      }
    }
  } 
}
