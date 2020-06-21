package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.AdrLicenseDetail;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.LicenseOrPermitDetail;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntAdrLicenseDetail extends ValueObject implements Serializable
{
  private IntLicenseOrPermitDetail licenseOrPermitDetail = null;

  public void setLicenseOrPermitDetail(IntLicenseOrPermitDetail licenseOrPermitDetail)
  {
    this.licenseOrPermitDetail = licenseOrPermitDetail;
  }

  public IntLicenseOrPermitDetail getLicenseOrPermitDetail()
  {
    return licenseOrPermitDetail;
  }
  
  public static IntAdrLicenseDetail createFromAdrLicenseDetail(AdrLicenseDetail inData)
  {
    IntAdrLicenseDetail ald = null;
    if(inData != null)
    {
      ald = new IntAdrLicenseDetail();
      ald.setLicenseOrPermitDetail(IntLicenseOrPermitDetail.createFromLicenseOrPermitDetail(inData.getLicenseOrPermitDetail()));
    }
    return ald;
  }
}
