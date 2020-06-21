package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.BarcodeSymbologyType;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomLabelBarcodeEntry;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomLabelPosition;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntCustomLabelBarcodeEntry extends ValueObject implements Serializable
{
  private IntCustomLabelPosition position = null;
  private String format = null;
  private String[] dataFields = null;
  private Integer barHeight = null;
  private Integer thinBarWidth = null;
  private IntBarcodeSymbologyType barcodeSymbology = null;

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

  public void setBarHeight(Integer barHeight)
  {
    this.barHeight = barHeight;
  }

  public Integer getBarHeight()
  {
    return barHeight;
  }

  public void setThinBarWidth(Integer thinBarWidth)
  {
    this.thinBarWidth = thinBarWidth;
  }

  public Integer getThinBarWidth()
  {
    return thinBarWidth;
  }

  public void setBarcodeSymbology(IntBarcodeSymbologyType barcodeSymbology)
  {
    this.barcodeSymbology = barcodeSymbology;
  }

  public IntBarcodeSymbologyType getBarcodeSymbology()
  {
    return barcodeSymbology;
  }

  public void copyToCustomLabelBarcodeEntry(CustomLabelBarcodeEntry outData)
  {
    if(outData != null)
    {
      outData.setFormat(this.format);
      outData.setDataFields(this.dataFields);
      outData.setBarHeight(this.barHeight);
      outData.setThinBarWidth(this.thinBarWidth);
      
      if(this.position != null)
      {
        CustomLabelPosition clp = new CustomLabelPosition();
        this.position.copyToCustomLabelPosition(clp);
        outData.setPosition(clp);
      }
      
      if(this.barcodeSymbology != null)
      {
        BarcodeSymbologyType bst = BarcodeSymbologyType.fromString(this.barcodeSymbology.getValue());
        outData.setBarcodeSymbology(bst);
      }
    }
  }
}
