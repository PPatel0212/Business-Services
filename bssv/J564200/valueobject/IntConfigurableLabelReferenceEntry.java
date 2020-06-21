package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.ConfigurableLabelReferenceEntry;

import java.io.Serializable;

import java.math.BigInteger;

import oracle.e1.bssvfoundation.base.ValueObject;

public class IntConfigurableLabelReferenceEntry extends ValueObject implements Serializable
{
  private Integer zoneNumber = null;
  private String header = null;
  private String dataField = null;
  private String literalValue = null;

  public void setZoneNumber(Integer zoneNumber)
  {
    this.zoneNumber = zoneNumber;
  }

  public Integer getZoneNumber()
  {
    return zoneNumber;
  }

  public void setHeader(String header)
  {
    this.header = header;
  }

  public String getHeader()
  {
    return header;
  }

  public void setDataField(String dataField)
  {
    this.dataField = dataField;
  }

  public String getDataField()
  {
    return dataField;
  }

  public void setLiteralView(String literalValue)
  {
    this.literalValue = literalValue;
  }

  public String getLiteralValue()
  {
    return literalValue;
  }
  
  public void copyToConfigurableLabelReferenceEntry(ConfigurableLabelReferenceEntry outData)
  {
    if(outData != null)
    {
      outData.setDataField(this.dataField);
      outData.setHeader(this.header);
      outData.setLiteralValue(this.literalValue);
      outData.setZoneNumber(BigInteger.valueOf(this.zoneNumber.intValue()));
    }
  }
}
