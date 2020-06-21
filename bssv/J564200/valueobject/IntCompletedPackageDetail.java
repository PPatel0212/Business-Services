package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.CompletedPackageDetail;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocument;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.TrackingId;

import java.io.Serializable;

import java.math.BigInteger;

import oracle.e1.bssvfoundation.base.ValueObject;

public class IntCompletedPackageDetail extends ValueObject implements Serializable
{
  private Integer sequenceNumber = null;
  private IntTrackingId[] trackingIds = null;
  private Integer groupNumber = null;
  private IntOversizeClassType oversizeClass = null;
  private IntPackageRating packageRating = null;
  private IntPackageOperationalDetail operationalDetail = null;
  private IntShippingDocument label = null;
  private IntShippingDocument[] packageDocuments = null;
  private IntCodReturnPackageDetail codReturnDetail = null;
  private IntSignatureOptionType signatureOption = null;
  private IntWeight dryIceWeight = null;
  private IntCompletedHazardousPackageDetail hazardousPackageDetail = null;

  public void setSequenceNumber(Integer sequenceNumber)
  {
    this.sequenceNumber = sequenceNumber;
  }

  public Integer getSequenceNumber()
  {
    return sequenceNumber;
  }

  public void setTrackingIds(IntTrackingId[] trackingIds)
  {
    this.trackingIds = trackingIds;
  }

  public IntTrackingId[] getTrackingIds()
  {
    return trackingIds;
  }

  public void setGroupNumber(Integer groupNumber)
  {
    this.groupNumber = groupNumber;
  }

  public Integer getGroupNumber()
  {
    return groupNumber;
  }

  public void setOversizeClass(IntOversizeClassType oversizeClass)
  {
    this.oversizeClass = oversizeClass;
  }

  public IntOversizeClassType getOversizeClass()
  {
    return oversizeClass;
  }

  public void setPackageRating(IntPackageRating packageRating)
  {
    this.packageRating = packageRating;
  }

  public IntPackageRating getPackageRating()
  {
    return packageRating;
  }

  public void setOperationalDetail(IntPackageOperationalDetail operationalDetail)
  {
    this.operationalDetail = operationalDetail;
  }

  public IntPackageOperationalDetail getOperationalDetail()
  {
    return operationalDetail;
  }

  public void setLabel(IntShippingDocument label)
  {
    this.label = label;
  }

  public IntShippingDocument getLabel()
  {
    return label;
  }

  public void setCodReturnDetail(IntCodReturnPackageDetail codReturnDetail)
  {
    this.codReturnDetail = codReturnDetail;
  }

  public IntCodReturnPackageDetail getCodReturnDetail()
  {
    return codReturnDetail;
  }

  public void setSignatureOption(IntSignatureOptionType signatureOption)
  {
    this.signatureOption = signatureOption;
  }

  public IntSignatureOptionType getSignatureOption()
  {
    return signatureOption;
  }

  public void setDryIceWeight(IntWeight dryIceWeight)
  {
    this.dryIceWeight = dryIceWeight;
  }

  public IntWeight getDryIceWeight()
  {
    return dryIceWeight;
  }

  public void setHazardousPackageDetail(IntCompletedHazardousPackageDetail hazardousPackageDetail)
  {
    this.hazardousPackageDetail = hazardousPackageDetail;
  }

  public IntCompletedHazardousPackageDetail getHazardousPackageDetail()
  {
    return hazardousPackageDetail;
  }

  public void setPackageDocuments(IntShippingDocument[] packageDocuments)
  {
    this.packageDocuments = packageDocuments;
  }

  public IntShippingDocument[] getPackageDocuments()
  {
    return packageDocuments;
  }
  
  public static IntCompletedPackageDetail createFromCompletedPackageDetail(CompletedPackageDetail inData)
  {
    IntCompletedPackageDetail cpd = null;
    if(inData != null)
    {
      cpd = new IntCompletedPackageDetail();
      
      cpd.codReturnDetail = IntCodReturnPackageDetail.createFromCodReturnPackageDetail(inData.getCodReturnDetail());
      cpd.dryIceWeight = IntWeight.createFromWeight(inData.getDryIceWeight());
      cpd.hazardousPackageDetail = IntCompletedHazardousPackageDetail.createFromCompletedHazardousPackageDetail(inData.getHazardousPackageDetail());
      cpd.label = IntShippingDocument.createFromShippingDocument(inData.getLabel());
      cpd.operationalDetail = IntPackageOperationalDetail.createFromPackageOperationalDetail(inData.getOperationalDetail());
      cpd.oversizeClass = IntOversizeClassType.createFromOversizeClassType(inData.getOversizeClass());
      cpd.packageRating = IntPackageRating.createFromPackageRating(inData.getPackageRating());
      cpd.signatureOption = IntSignatureOptionType.createFromSignatureOptionType(inData.getSignatureOption());
      
      ShippingDocument[] shipDocArr = inData.getPackageDocuments();
      if(shipDocArr != null)
      {
        IntShippingDocument[] iShipDocArr = new IntShippingDocument[shipDocArr.length];
        for(int x=0; x<shipDocArr.length; x++)
        {
          iShipDocArr[x] = IntShippingDocument.createFromShippingDocument(shipDocArr[x]);
        }
        cpd.setPackageDocuments(iShipDocArr);
      }
      
      TrackingId[] trackIdArr = inData.getTrackingIds();
      if(trackIdArr != null)
      {
        IntTrackingId[] iTrackIdArr = new IntTrackingId[trackIdArr.length];
        for(int x=0; x<trackIdArr.length; x++)
        {
          iTrackIdArr[x] = IntTrackingId.createFromTrackingId(trackIdArr[x]);
        }
        cpd.setTrackingIds(iTrackIdArr);
      }
      
      BigInteger val = inData.getGroupNumber();
      if(val != null)
      {
        cpd.setGroupNumber(new Integer(val.intValue()));
      }
      
      val = inData.getSequenceNumber();
      if(val != null)
      {
        cpd.setSequenceNumber(new Integer(val.intValue()));
      }
    }
    return cpd;
  }
}
