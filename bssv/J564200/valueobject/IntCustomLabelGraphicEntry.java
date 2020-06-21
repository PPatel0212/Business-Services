package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomLabelGraphicEntry;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomLabelPosition;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntCustomLabelGraphicEntry extends ValueObject implements Serializable
{
  private IntCustomLabelPosition position = null;
  private String printerGraphicId = null;
  private String fileGraphicFullName = null;

  public void setPosition(IntCustomLabelPosition position)
  {
    this.position = position;
  }

  public IntCustomLabelPosition getPosition()
  {
    return position;
  }

  public void setPrinterGraphicId(String printerGraphicId)
  {
    this.printerGraphicId = printerGraphicId;
  }

  public String getPrinterGraphicId()
  {
    return printerGraphicId;
  }

  public void setFileGraphicFullName(String fileGraphicFullName)
  {
    this.fileGraphicFullName = fileGraphicFullName;
  }

  public String getFileGraphicFullName()
  {
    return fileGraphicFullName;
  }
  
  public void copyToCustomLabelGraphicEntry(CustomLabelGraphicEntry outData)
  {
    if(outData != null)
    {
      outData.setPrinterGraphicId(this.printerGraphicId);
      outData.setFileGraphicFullName(this.fileGraphicFullName);
      if(this.position != null)
      {
        CustomLabelPosition clp = new CustomLabelPosition();
        this.position.copyToCustomLabelPosition(clp);
        outData.setPosition(clp);
      }
    }
  }
}
