package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.SmartPostAncillaryEndorsementType;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.SmartPostIndiciaType;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.SmartPostShipmentDetail;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class IntSmartPostShipmentDetail extends ValueObject implements Serializable
{
  private IntSmartPostIndiciaType indicia = null;
  private IntSmartPostAncillaryEndorsementType ancillaryEndorsement = null;
  private String hubId = null;
  private String customerManifestId = null;

  public void setIndicia(IntSmartPostIndiciaType indicia)
  {
    this.indicia = indicia;
  }

  public IntSmartPostIndiciaType getIndicia()
  {
    return indicia;
  }

  public void setAncillaryEndorsement(IntSmartPostAncillaryEndorsementType ancillaryEndorsement)
  {
    this.ancillaryEndorsement = ancillaryEndorsement;
  }

  public IntSmartPostAncillaryEndorsementType getAncillaryEndorsement()
  {
    return ancillaryEndorsement;
  }

  public void setHubId(String hubId)
  {
    this.hubId = hubId;
  }

  public String getHubId()
  {
    return hubId;
  }

  public void setCustomerManifestId(String customerManifestId)
  {
    this.customerManifestId = customerManifestId;
  }

  public String getCustomerManifestId()
  {
    return customerManifestId;
  }
  
  public void copyToSmartPostShipmentDetail(SmartPostShipmentDetail outData)
  {
    if(outData != null)
    {
      outData.setHubId(this.hubId);
      outData.setCustomerManifestId(this.customerManifestId);
      if(this.indicia != null)
      {
        SmartPostIndiciaType spit = SmartPostIndiciaType.fromString(this.indicia.getValue());
        outData.setIndicia(spit);
      }
      if(this.ancillaryEndorsement != null)
      {
        SmartPostAncillaryEndorsementType spaet = SmartPostAncillaryEndorsementType.fromString(this.ancillaryEndorsement.getValue());
        outData.setAncillaryEndorsement(spaet);
      }
    }
  }
}
