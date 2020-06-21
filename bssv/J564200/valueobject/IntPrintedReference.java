package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.PrintedReference;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.PrintedReferenceType;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntPrintedReference extends ValueObject implements Serializable
{
  private IntPrintedReferenceType type = null;
  private String value = null;

  public void setValue(String value)
  {
    this.value = value;
  }

  public String getValue()
  {
    return value;
  }
  
  public void copyToPrintedReference(PrintedReference outData)
  {
    if(outData != null)
    {
      outData.setValue(this.value);
      if(this.type != null)
      {
        PrintedReferenceType prt = PrintedReferenceType.fromString(this.type.getValue());
        outData.setType(prt);
      }
    }
  }

  public void setType(IntPrintedReferenceType type)
  {
    this.type = type;
  }

  public IntPrintedReferenceType getType()
  {
    return type;
  }
}
