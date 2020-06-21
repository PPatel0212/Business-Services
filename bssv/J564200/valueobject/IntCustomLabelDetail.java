package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomLabelBarcodeEntry;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomLabelBoxEntry;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomLabelCoordinateUnits;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomLabelDetail;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomLabelGraphicEntry;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomLabelTextEntry;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntCustomLabelDetail extends ValueObject implements Serializable
{
  private IntCustomLabelCoordinateUnits coordinateUnits = null;
  private IntCustomLabelTextEntry[] textEntries = null;
  private IntCustomLabelGraphicEntry[] graphicEntries = null;
  private IntCustomLabelBoxEntry[] boxEntries = null;
  private IntCustomLabelBarcodeEntry[] barcodeEntries = null;

  public void setCoordinateUnits(IntCustomLabelCoordinateUnits coordinateUnits)
  {
    this.coordinateUnits = coordinateUnits;
  }

  public IntCustomLabelCoordinateUnits getCoordinateUnits()
  {
    return coordinateUnits;
  }

  public void setTextEntries(IntCustomLabelTextEntry[] textEntries)
  {
    this.textEntries = textEntries;
  }

  public IntCustomLabelTextEntry[] getTextEntries()
  {
    return textEntries;
  }

  public void setGraphicEntries(IntCustomLabelGraphicEntry[] graphicEntries)
  {
    this.graphicEntries = graphicEntries;
  }

  public IntCustomLabelGraphicEntry[] getGraphicEntries()
  {
    return graphicEntries;
  }

  public void setBoxEntries(IntCustomLabelBoxEntry[] boxEntries)
  {
    this.boxEntries = boxEntries;
  }

  public IntCustomLabelBoxEntry[] getBoxEntries()
  {
    return boxEntries;
  }

  public void setBarcodeEntries(IntCustomLabelBarcodeEntry[] barcodeEntries)
  {
    this.barcodeEntries = barcodeEntries;
  }

  public IntCustomLabelBarcodeEntry[] getBarcodeEntries()
  {
    return barcodeEntries;
  }
  
  public void copyToCustomLabelDetail(CustomLabelDetail outData)
  {
    if(outData != null)
    {
      if(this.barcodeEntries != null)
      {
        CustomLabelBarcodeEntry[] barcodeArr = new CustomLabelBarcodeEntry[this.barcodeEntries.length];
        for(int x=0; x<this.barcodeEntries.length; x++)
        {
          barcodeArr[x] = new CustomLabelBarcodeEntry();
          this.barcodeEntries[x].copyToCustomLabelBarcodeEntry(barcodeArr[x]);
        }
        outData.setBarcodeEntries(barcodeArr);
      }
      
      if(this.boxEntries != null)
      {
        CustomLabelBoxEntry[] boxEntryArr = new CustomLabelBoxEntry[this.boxEntries.length];
        for(int x=0; x<this.boxEntries.length; x++)
        {
          boxEntryArr[x] = new CustomLabelBoxEntry();
          this.boxEntries[x].copyToCustomLabelBoxEntry(boxEntryArr[x]);
        }
        outData.setBoxEntries(boxEntryArr);
      }
      
      if(this.coordinateUnits != null)
      {
        CustomLabelCoordinateUnits coordinateArr = CustomLabelCoordinateUnits.fromString(this.coordinateUnits.getValue());
        outData.setCoordinateUnits(coordinateArr);
      }
      
      if(this.graphicEntries != null)
      {
        CustomLabelGraphicEntry[] graphArr = new CustomLabelGraphicEntry[this.graphicEntries.length];
        for(int x=0; x<this.graphicEntries.length; x++)
        {
          graphArr[x] = new CustomLabelGraphicEntry();
          this.graphicEntries[x].copyToCustomLabelGraphicEntry(graphArr[x]);
        }
        outData.setGraphicEntries(graphArr);
      }
      
      if(this.textEntries != null)
      {
        CustomLabelTextEntry[] cltArr = new CustomLabelTextEntry[this.textEntries.length];
        for(int x=0; x<this.textEntries.length; x++)
        {
          cltArr[x] = new CustomLabelTextEntry();
          this.textEntries[x].copyToCustomLabelTextEntry(cltArr[x]);
        }
        outData.setTextEntries(cltArr);
      }
    }
  }
}
