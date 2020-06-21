package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.CertificateOfOriginDetail;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.CommercialInvoiceDetail;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomDocumentDetail;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.DangerousGoodsShippersDeclarationDetail;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.ExportDeclarationDetail;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.FreightAddressLabelDetail;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.GeneralAgencyAgreementDetail;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.NaftaCertificateOfOriginDetail;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.Op900Detail;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.RequestedShippingDocumentType;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.ReturnInstructionsDetail;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocumentSpecification;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntShippingDocumentSpecification extends ValueObject implements Serializable
{
  private IntRequestedShippingDocumentType[] shippingDocumentTypes = null;
  private IntCertificateOfOriginDetail certificateOfOrigin = null;
  private IntCommercialInvoiceDetail commercialInvoiceDetail = null;
  private IntCustomDocumentDetail[] customPackageDocumentDetails = null;
  private IntCustomDocumentDetail[] customShipmentDocumentDetails = null;
  private IntExportDeclarationDetail exportDeclarationDetail = null;
  private IntGeneralAgencyAgreementDetail generalAgencyAgreementDetail = null;
  private IntNaftaCertificateOfOriginDetail naftaCertificateOfOriginDetail = null;
  private IntOp900Detail op900Detail = null;
  private IntDangerousGoodsShippersDeclarationDetail dangerousGoodsShippersDeclarationDetail = null;
  private IntFreightAddressLabelDetail freightAddressLabelDetail = null;
  private IntReturnInstructionsDetail returnInstructionsDetail = null;

  public void setShippingDocumentTypes(IntRequestedShippingDocumentType[] shippingDocumentTypes)
  {
    this.shippingDocumentTypes = shippingDocumentTypes;
  }

  public IntRequestedShippingDocumentType[] getShippingDocumentTypes()
  {
    return shippingDocumentTypes;
  }

  public void setCertificateOfOrigin(IntCertificateOfOriginDetail certificateOfOrigin)
  {
    this.certificateOfOrigin = certificateOfOrigin;
  }

  public IntCertificateOfOriginDetail getCertificateOfOrigin()
  {
    return certificateOfOrigin;
  }

  public void setCommercialInvoiceDetail(IntCommercialInvoiceDetail commercialInvoiceDetail)
  {
    this.commercialInvoiceDetail = commercialInvoiceDetail;
  }

  public IntCommercialInvoiceDetail getCommercialInvoiceDetail()
  {
    return commercialInvoiceDetail;
  }

  public void setCustomPackageDocumentDetails(IntCustomDocumentDetail[] customPackageDocumentDetails)
  {
    this.customPackageDocumentDetails = customPackageDocumentDetails;
  }

  public IntCustomDocumentDetail[] getCustomPackageDocumentDetails()
  {
    return customPackageDocumentDetails;
  }

  public void setCustomShipmentDocumentDetails(IntCustomDocumentDetail[] customShipmentDocumentDetails)
  {
    this.customShipmentDocumentDetails = customShipmentDocumentDetails;
  }

  public IntCustomDocumentDetail[] getCustomShipmentDocumentDetails()
  {
    return customShipmentDocumentDetails;
  }

  public void setExportDeclarationDetail(IntExportDeclarationDetail exportDeclarationDetail)
  {
    this.exportDeclarationDetail = exportDeclarationDetail;
  }

  public IntExportDeclarationDetail getExportDeclarationDetail()
  {
    return exportDeclarationDetail;
  }

  public void setGeneralAgencyAgreementDetail(IntGeneralAgencyAgreementDetail generalAgencyAgreementDetail)
  {
    this.generalAgencyAgreementDetail = generalAgencyAgreementDetail;
  }

  public IntGeneralAgencyAgreementDetail getGeneralAgencyAgreementDetail()
  {
    return generalAgencyAgreementDetail;
  }

  public void setNaftaCertificateOfOriginDetail(IntNaftaCertificateOfOriginDetail naftaCertificateOfOriginDetail)
  {
    this.naftaCertificateOfOriginDetail = naftaCertificateOfOriginDetail;
  }

  public IntNaftaCertificateOfOriginDetail getNaftaCertificateOfOriginDetail()
  {
    return naftaCertificateOfOriginDetail;
  }

  public void setOp900Detail(IntOp900Detail op900Detail)
  {
    this.op900Detail = op900Detail;
  }

  public IntOp900Detail getOp900Detail()
  {
    return op900Detail;
  }

  public void setDangerousGoodsShippersDeclarationDetail(IntDangerousGoodsShippersDeclarationDetail dangerousGoodsShippersDeclarationDetail)
  {
    this.dangerousGoodsShippersDeclarationDetail = dangerousGoodsShippersDeclarationDetail;
  }

  public IntDangerousGoodsShippersDeclarationDetail getDangerousGoodsShippersDeclarationDetail()
  {
    return dangerousGoodsShippersDeclarationDetail;
  }

  public void setFreightAddressLabelDetail(IntFreightAddressLabelDetail freightAddressLabelDetail)
  {
    this.freightAddressLabelDetail = freightAddressLabelDetail;
  }

  public IntFreightAddressLabelDetail getFreightAddressLabelDetail()
  {
    return freightAddressLabelDetail;
  }

  public void setReturnInstructionsDetail(IntReturnInstructionsDetail returnInstructionsDetail)
  {
    this.returnInstructionsDetail = returnInstructionsDetail;
  }

  public IntReturnInstructionsDetail getReturnInstructionsDetail()
  {
    return returnInstructionsDetail;
  }
  
  public void copyToShippingDocumentSpecification(ShippingDocumentSpecification outData)
  {
    if(outData != null)
    {
      if(this.certificateOfOrigin != null)
      {
        CertificateOfOriginDetail cood = new CertificateOfOriginDetail();
        this.certificateOfOrigin.copyToCertificateOfOriginDetail(cood);
        outData.setCertificateOfOrigin(cood);
      }
      
      if(this.commercialInvoiceDetail != null)
      {
        CommercialInvoiceDetail cid = new CommercialInvoiceDetail();
        this.commercialInvoiceDetail.copyToCommercialInvoiceDetail(cid);
        outData.setCommercialInvoiceDetail(cid);
      }
      
      if(this.customPackageDocumentDetails != null)
      {
        CustomDocumentDetail[] cddArr = new CustomDocumentDetail[this.customPackageDocumentDetails.length];
        for(int x=0; x<this.customPackageDocumentDetails.length; x++)
        {
          cddArr[x] = new CustomDocumentDetail();
          this.customPackageDocumentDetails[x].copyToCustomDocumentDetail(cddArr[x]);
        }
        outData.setCustomPackageDocumentDetail(cddArr);
      }
      
      if(this.customShipmentDocumentDetails  != null)
      {
        CustomDocumentDetail[] cddArr = new CustomDocumentDetail[this.customShipmentDocumentDetails.length];
        for(int x=0; x<this.customShipmentDocumentDetails.length; x++)
        {
          cddArr[x] = new CustomDocumentDetail();
          this.customShipmentDocumentDetails[x].copyToCustomDocumentDetail(cddArr[x]);
        }
        outData.setCustomShipmentDocumentDetail(cddArr);        
      }
      
      if(this.dangerousGoodsShippersDeclarationDetail != null)
      {
        DangerousGoodsShippersDeclarationDetail dgsdd = new DangerousGoodsShippersDeclarationDetail();
        this.dangerousGoodsShippersDeclarationDetail.copyToDangerousGoodsShippersDeclarationDetail(dgsdd);
        outData.setDangerousGoodsShippersDeclarationDetail(dgsdd);
      }
      
      if(this.exportDeclarationDetail != null)
      {
        ExportDeclarationDetail edd = new ExportDeclarationDetail();
        this.exportDeclarationDetail.copyToExportDeclarationDetail(edd);
        outData.setExportDeclarationDetail(edd);
      }
      
      if(this.freightAddressLabelDetail != null)
      {
        FreightAddressLabelDetail fald = new FreightAddressLabelDetail();
        this.freightAddressLabelDetail.copyToFreightAddressLabelDetail(fald);
        outData.setFreightAddressLabelDetail(fald);
      }
      
      if(this.generalAgencyAgreementDetail != null)
      {
        GeneralAgencyAgreementDetail gaad = new GeneralAgencyAgreementDetail();
        this.generalAgencyAgreementDetail.copyToGeneralAgencyAgreementDetail(gaad);
        outData.setGeneralAgencyAgreementDetail(gaad);
      }
      
      if(this.naftaCertificateOfOriginDetail != null)
      {
        NaftaCertificateOfOriginDetail ncood = new NaftaCertificateOfOriginDetail();
        this.naftaCertificateOfOriginDetail.copyToNaftaCertificateOfOriginDetail(ncood);
        outData.setNaftaCertificateOfOriginDetail(ncood);
      }
      
      if(this.op900Detail != null)
      {
        Op900Detail opDetail = new Op900Detail();
        this.op900Detail.copyToOp900Detail(opDetail);
        outData.setOp900Detail(opDetail);
      }
      
      if(this.returnInstructionsDetail != null)
      {
        ReturnInstructionsDetail rid = new ReturnInstructionsDetail();
        this.returnInstructionsDetail.copyToReturnInstructionsDetail(rid);
        outData.setReturnInstructionsDetail(rid);
      }
      
      if(this.shippingDocumentTypes != null)
      {
        RequestedShippingDocumentType[] rsdtArr = new RequestedShippingDocumentType[this.shippingDocumentTypes.length];
        for(int x=0; x<this.shippingDocumentTypes.length; x++)
        {
          rsdtArr[x] = RequestedShippingDocumentType.fromString(this.shippingDocumentTypes[x].getValue());
        }
        outData.setShippingDocumentTypes(rsdtArr);
      }
    }
  }
}
