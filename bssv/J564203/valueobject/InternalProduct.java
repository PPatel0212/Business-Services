package be.e1.bssv.J564203.valueobject;

import java.io.Serializable;

import java.util.Date;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class InternalProduct extends ValueObject implements Serializable
{
  private java.lang.String productId;
  private InternalCountry countryOrigin;
  private java.lang.String value;
  private java.lang.String endUseType;
  private InternalClassify classifier;
  private java.lang.String licenseException;
  private java.lang.String encryption;

  public void setProductId(String productId)
  {
    this.productId = productId;
  }

  public String getProductId()
  {
    return productId;
  }

  public void setCountryOrigin(InternalCountry countryOrigin)
  {
    this.countryOrigin = countryOrigin;
  }

  public InternalCountry getCountryOrigin()
  {
    return countryOrigin;
  }

  public void setValue(String value)
  {
    this.value = value;
  }

  public String getValue()
  {
    return value;
  }

  public void setEndUseType(String endUseType)
  {
    this.endUseType = endUseType;
  }

  public String getEndUseType()
  {
    return endUseType;
  }

  public void setClassifier(InternalClassify classifier)
  {
    this.classifier = classifier;
  }

  public InternalClassify getClassifier()
  {
    return classifier;
  }

  public void setLicenseException(String licenseException)
  {
    this.licenseException = licenseException;
  }

  public String getLicenseException()
  {
    return licenseException;
  }

  public void setEncryption(String encryption)
  {
    this.encryption = encryption;
  }

  public String getEncryption()
  {
    return encryption;
  }
}
