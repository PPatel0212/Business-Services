package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomLabelPosition;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomLabelTextEntry;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.RotationType;

import java.io.Serializable;

import java.math.BigInteger;

import oracle.e1.bssvfoundation.base.ValueObject;

public class IntCustomLabelTextEntry extends ValueObject implements Serializable
{
  private IntCustomLabelPosition position = null;
  private String format = null;
  private String[] dataFields = null;
  private String thermalFontId = null;
  private String fontName = null;
  private Integer fontSize = null;
  private IntRotationType rotation = null;

  public void setPosition(IntCustomLabelPosition position)
  {
    this.position = position;
  }

  public IntCustomLabelPosition getPosition()
  {
    return position;
  }

  public void setFormat(String format)
  {
    this.format = format;
  }

  public String getFormat()
  {
    return format;
  }

  public void setDataFields(String[] dataFields)
  {
    this.dataFields = dataFields;
  }

  public String[] getDataFields()
  {
    return dataFields;
  }

  public void setThermalFontId(String thermalFontId)
  {
    this.thermalFontId = thermalFontId;
  }

  public String getThermalFontId()
  {
    return thermalFontId;
  }

  public void setFontName(String fontName)
  {
    this.fontName = fontName;
  }

  public String getFontName()
  {
    return fontName;
  }

  public void setFontSize(Integer fontSize)
  {
    this.fontSize = fontSize;
  }

  public Integer getFontSize()
  {
    return fontSize;
  }

  public void setRotation(IntRotationType rotation)
  {
    this.rotation = rotation;
  }

  public IntRotationType getRotation()
  {
    return rotation;
  }
  
  public void copyToCustomLabelTextEntry(CustomLabelTextEntry outData)
  {
    if(outData != null)
    {
      outData.setFormat(this.format);
      outData.setDataFields(this.dataFields);
      outData.setFontName(this.fontName);
      outData.setThermalFontId(this.thermalFontId);
      
      outData.setFontSize(BigInteger.valueOf(this.fontSize.intValue()));
      if(this.position != null)
      {
        CustomLabelPosition clp = new CustomLabelPosition();
        this.position.copyToCustomLabelPosition(clp);
        outData.setPosition(clp);
      }
      
      if(this.rotation != null)
      {
        RotationType rt = RotationType.fromString(this.rotation.getValue());
        outData.setRotation(rt);
      }
    }
  }
}
