package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.CompletedHazardousShipmentDetail;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntCompletedHazardousShipmentDetail extends ValueObject implements Serializable
{
  private IntCompletedHazardousSummaryDetail hazardousSummaryDetail = null;
  private IntShipmentDryIceDetail dryIceDetail = null;
  private IntAdrLicenseDetail adrLicense = null;

  public void setHazardousSummaryDetail(IntCompletedHazardousSummaryDetail hazardousSummaryDetail)
  {
    this.hazardousSummaryDetail = hazardousSummaryDetail;
  }

  public IntCompletedHazardousSummaryDetail getHazardousSummaryDetail()
  {
    return hazardousSummaryDetail;
  }

  public void setDryIceDetail(IntShipmentDryIceDetail dryIceDetail)
  {
    this.dryIceDetail = dryIceDetail;
  }

  public IntShipmentDryIceDetail getDryIceDetail()
  {
    return dryIceDetail;
  }

  public void setAdrLicense(IntAdrLicenseDetail adrLicense)
  {
    this.adrLicense = adrLicense;
  }

  public IntAdrLicenseDetail getAdrLicense()
  {
    return adrLicense;
  }
  
  public static IntCompletedHazardousShipmentDetail createFromCompletedHazardousShipmentDetail(CompletedHazardousShipmentDetail inData)
  {
    IntCompletedHazardousShipmentDetail chsd = null;
    if(inData != null)
    {
      chsd = new IntCompletedHazardousShipmentDetail();
      chsd.setAdrLicense(IntAdrLicenseDetail.createFromAdrLicenseDetail(inData.getAdrLicense()));
      chsd.setDryIceDetail(IntShipmentDryIceDetail.createFromShipmentDryIceDetail(inData.getDryIceDetail()));
      chsd.setHazardousSummaryDetail(IntCompletedHazardousSummaryDetail.createFromCompletedHazardousSummaryDetail(inData.getHazardousSummaryDetail()));
    }
    return chsd;
  }
}
