package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.DocTabZoneJustificationType;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.DocTabZoneSpecification;

import java.io.Serializable;

import java.math.BigInteger;

import oracle.e1.bssvfoundation.base.ValueObject;

public class IntDocTabZoneSpecification extends ValueObject implements Serializable
{
  private Integer zoneNumber = null;
  private String header = null;
  private String dataField = null;
  private String literalValue = null;
  private IntDocTabZoneJustificationType justification = null;

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

  public void setLiteralValue(String literalValue)
  {
    this.literalValue = literalValue;
  }

  public String getLiteralValue()
  {
    return literalValue;
  }

  public void setJustification(IntDocTabZoneJustificationType justification)
  {
    this.justification = justification;
  }

  public IntDocTabZoneJustificationType getJustification()
  {
    return justification;
  }
  
  public void copyToDocTabZoneSpecification(DocTabZoneSpecification outData)
  {
    if(outData != null)
    {
      outData.setHeader(this.header);
      outData.setDataField(this.dataField);
      outData.setLiteralValue(this.literalValue);
      
      if(this.zoneNumber != null)
        outData.setZoneNumber(BigInteger.valueOf(this.zoneNumber.intValue()));
      
      if(this.justification != null)
      {
        DocTabZoneJustificationType justify = DocTabZoneJustificationType.fromString(this.justification.getValue());
        outData.setJustification(justify);
      }
    }
  }
}