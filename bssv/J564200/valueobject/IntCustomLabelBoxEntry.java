package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomLabelBoxEntry;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomLabelPosition;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntCustomLabelBoxEntry extends ValueObject implements Serializable
{
  private IntCustomLabelPosition topLeftCorner = null;
  private IntCustomLabelPosition bottomRightCorner = null;

  public void setTopLeftCorner(IntCustomLabelPosition topLeftCorner)
  {
    this.topLeftCorner = topLeftCorner;
  }

  public IntCustomLabelPosition getTopLeftCorner()
  {
    return topLeftCorner;
  }

  public void setBottomRightCorner(IntCustomLabelPosition bottomRightCorner)
  {
    this.bottomRightCorner = bottomRightCorner;
  }

  public IntCustomLabelPosition getBottomRightCorner()
  {
    return bottomRightCorner;
  }
  
  public void copyToCustomLabelBoxEntry(CustomLabelBoxEntry outData)
  {
    if(outData != null)
    {
      CustomLabelPosition clp = null;
      if(this.topLeftCorner != null)
      {
        clp = new CustomLabelPosition();
        this.topLeftCorner.copyToCustomLabelPosition(clp);
        outData.setTopLeftCorner(clp);
      }
      if(this.bottomRightCorner != null)
      {
        clp = new CustomLabelPosition();
        this.bottomRightCorner.copyToCustomLabelPosition(clp);
        outData.setBottomRightCorner(clp);
      }
    }
  }
}
