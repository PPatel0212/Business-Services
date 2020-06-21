package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.AssociatedShipmentDetail;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.CompletedPackageDetail;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.CompletedShipmentDetail;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocument;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntCompletedShipmentDetail extends ValueObject implements Serializable
{
  private String usDomestic = null;
  private IntCarrierCodeType carrierCode = null;
  private IntTrackingId masterTrackingId = null;
  private String serviceTypeDescription = null;
  private String packagingDescription = null;
  private IntShipmentOperationalDetail operationalDetail = null;
  private IntPendingShipmentAccessDetail accessDetail= null;
  private IntCompletedTagDetail tagDetail = null;
  private IntCompletedSmartPostDetail smartPostDetail = null;
  private IntCompletedHazardousShipmentDetail hazardousShipmentDetail = null;
  private IntShipmentRating shipmentRating = null;
  private IntCompletedHoldAtLocationDetail completedHoldAtLocationDetail = null;
  private String exportComplianceStatement = null;
  private IntCompletedEtdDetail completedEtdDetail = null;
  private IntShippingDocument[] shipmentDocuments = null;
  private IntAssociatedShipmentDetail[] associatedShipments = null;
  private IntCompletedCodDetail completedCodDetail = null;
  private IntCompletedPackageDetail[] completedPackageDetails = null;

  public void setCarrierCode(IntCarrierCodeType carrierCode)
  {
    this.carrierCode = carrierCode;
  }

  public IntCarrierCodeType getCarrierCode()
  {
    return carrierCode;
  }

  public void setMasterTrackingId(IntTrackingId masterTrackingId)
  {
    this.masterTrackingId = masterTrackingId;
  }

  public IntTrackingId getMasterTrackingId()
  {
    return masterTrackingId;
  }

  public void setServiceTypeDescription(String serviceTypeDescription)
  {
    this.serviceTypeDescription = serviceTypeDescription;
  }

  public String getServiceTypeDescription()
  {
    return serviceTypeDescription;
  }

  public void setPackagingDescription(String packagingDescription)
  {
    this.packagingDescription = packagingDescription;
  }

  public String getPackagingDescription()
  {
    return packagingDescription;
  }

  public void setOperationalDetail(IntShipmentOperationalDetail operationalDetail)
  {
    this.operationalDetail = operationalDetail;
  }

  public IntShipmentOperationalDetail getOperationalDetail()
  {
    return operationalDetail;
  }

  public void setAccessDetail(IntPendingShipmentAccessDetail accessDetail)
  {
    this.accessDetail = accessDetail;
  }

  public IntPendingShipmentAccessDetail getAccessDetail()
  {
    return accessDetail;
  }

  public void setTagDetail(IntCompletedTagDetail tagDetail)
  {
    this.tagDetail = tagDetail;
  }

  public IntCompletedTagDetail getTagDetail()
  {
    return tagDetail;
  }

  public void setSmartPostDetail(IntCompletedSmartPostDetail smartPostDetail)
  {
    this.smartPostDetail = smartPostDetail;
  }

  public IntCompletedSmartPostDetail getSmartPostDetail()
  {
    return smartPostDetail;
  }

  public void setHazardousShipmentDetail(IntCompletedHazardousShipmentDetail hazardousShipmentDetail)
  {
    this.hazardousShipmentDetail = hazardousShipmentDetail;
  }

  public IntCompletedHazardousShipmentDetail getHazardousShipmentDetail()
  {
    return hazardousShipmentDetail;
  }

  public void setShipmentRating(IntShipmentRating shipmentRating)
  {
    this.shipmentRating = shipmentRating;
  }

  public IntShipmentRating getShipmentRating()
  {
    return shipmentRating;
  }

  public void setCompletedHoldAtLocationDetail(IntCompletedHoldAtLocationDetail completedHoldAtLocationDetail)
  {
    this.completedHoldAtLocationDetail = completedHoldAtLocationDetail;
  }

  public IntCompletedHoldAtLocationDetail getCompletedHoldAtLocationDetail()
  {
    return completedHoldAtLocationDetail;
  }

  public void setExportComplianceStatement(String exportComplianceStatement)
  {
    this.exportComplianceStatement = exportComplianceStatement;
  }

  public String getExportComplianceStatement()
  {
    return exportComplianceStatement;
  }

  public void setCompletedEtdDetail(IntCompletedEtdDetail completedEtdDetail)
  {
    this.completedEtdDetail = completedEtdDetail;
  }

  public IntCompletedEtdDetail getCompletedEtdDetail()
  {
    return completedEtdDetail;
  }

  public void setShipmentDocuments(IntShippingDocument[] shipmentDocuments)
  {
    this.shipmentDocuments = shipmentDocuments;
  }

  public IntShippingDocument[] getShipmentDocuments()
  {
    return shipmentDocuments;
  }

  public void setAssociatedShipments(IntAssociatedShipmentDetail[] associatedShipments)
  {
    this.associatedShipments = associatedShipments;
  }

  public IntAssociatedShipmentDetail[] getAssociatedShipments()
  {
    return associatedShipments;
  }

  public void setCompletedCodDetail(IntCompletedCodDetail completedCodDetail)
  {
    this.completedCodDetail = completedCodDetail;
  }

  public IntCompletedCodDetail getCompletedCodDetail()
  {
    return completedCodDetail;
  }

  public void setUsDomestic(String usDomestic)
  {
    this.usDomestic = usDomestic;
  }

  public String getUsDomestic()
  {
    return usDomestic;
  }

  public void setCompletedPackageDetails(IntCompletedPackageDetail[] completedPackageDetails)
  {
    this.completedPackageDetails = completedPackageDetails;
  }

  public IntCompletedPackageDetail[] getCompletedPackageDetails()
  {
    return completedPackageDetails;
  }
  
  public static IntCompletedShipmentDetail createFromCompletedShipmentDetail(CompletedShipmentDetail inData)
  {
    IntCompletedShipmentDetail compShipDetail = null;
    if(inData != null)
    {
      compShipDetail = new IntCompletedShipmentDetail();
      
      compShipDetail.setExportComplianceStatement(inData.getExportComplianceStatement());
      compShipDetail.setPackagingDescription(inData.getPackagingDescription());
      compShipDetail.setServiceTypeDescription(inData.getServiceTypeDescription());
      
      compShipDetail.setUsDomestic("N");
      if(inData.getUsDomestic() != null && inData.getUsDomestic() == true)
        compShipDetail.setUsDomestic("Y");
      
      compShipDetail.setAccessDetail(IntPendingShipmentAccessDetail.createFromPendingShipmentAccessDetail(inData.getAccessDetail()));
      compShipDetail.setCarrierCode(IntCarrierCodeType.createFromCarrierCodeType(inData.getCarrierCode()));
      compShipDetail.setCompletedCodDetail(IntCompletedCodDetail.createFromCompletedCodDetail(inData.getCompletedCodDetail()));
      compShipDetail.setCompletedEtdDetail(IntCompletedEtdDetail.createFromCompletedEtdDetail(inData.getCompletedEtdDetail()));
      compShipDetail.setCompletedHoldAtLocationDetail(IntCompletedHoldAtLocationDetail.createFromCompletedHoldAtLocationDetail(inData.getCompletedHoldAtLocationDetail()));
      compShipDetail.setHazardousShipmentDetail(IntCompletedHazardousShipmentDetail.createFromCompletedHazardousShipmentDetail(inData.getHazardousShipmentDetail()));
      compShipDetail.setMasterTrackingId(IntTrackingId.createFromTrackingId(inData.getMasterTrackingId()));
      compShipDetail.setOperationalDetail(IntShipmentOperationalDetail.createFromShipmentOperationalDetail(inData.getOperationalDetail()));
      compShipDetail.setShipmentRating(IntShipmentRating.createFromShipmentRating(inData.getShipmentRating()));
      compShipDetail.setSmartPostDetail(IntCompletedSmartPostDetail.createFromCompletedSmartPostDetail(inData.getSmartPostDetail()));
      compShipDetail.setTagDetail(IntCompletedTagDetail.createFromCompletedTagDetail(inData.getTagDetail()));
      
      AssociatedShipmentDetail[] assShipDetailArr = inData.getAssociatedShipments();
      if(assShipDetailArr != null)
      {
        IntAssociatedShipmentDetail[] iAssShipDetailArr = new IntAssociatedShipmentDetail[assShipDetailArr.length];
        for(int x=0; x<assShipDetailArr.length; x++)
        {
          iAssShipDetailArr[x] = IntAssociatedShipmentDetail.createFromAssociatedShipmentDetail(assShipDetailArr[x]);
        }
        compShipDetail.setAssociatedShipments(iAssShipDetailArr);
      }
      
      CompletedPackageDetail[] compPkgDetailArr = inData.getCompletedPackageDetails();
      if(compPkgDetailArr != null)
      {
        IntCompletedPackageDetail[] iCompPkgDetailArr = new IntCompletedPackageDetail[compPkgDetailArr.length];
        for(int x=0; x<compPkgDetailArr.length; x++)
        {
          iCompPkgDetailArr[x] = IntCompletedPackageDetail.createFromCompletedPackageDetail(compPkgDetailArr[x]);
        }
        compShipDetail.setCompletedPackageDetails(iCompPkgDetailArr);
      }
      
      ShippingDocument[] shipDocArr = inData.getShipmentDocuments();
      if(shipDocArr != null)
      {
        IntShippingDocument[] iShipDocArr = new IntShippingDocument[shipDocArr.length];
        for(int x=0; x<shipDocArr.length; x++)
        {
          iShipDocArr[x] = IntShippingDocument.createFromShippingDocument(shipDocArr[x]);
        }
        compShipDetail.setShipmentDocuments(iShipDocArr);
      }
    }
    return compShipDetail;
  }
}
